package UI;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.TreeMap;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;

import Logica.AnalizadorLexico;
import Logica.ParseException;
import Logica.StringTools;
import Logica.SymbolTable;
import Logica.TokenMgrError;
import compilator.ModelFactory;
import compilator.domain.Domain;
import compilator.domain.expression.expressionmodel.Element;
import compilator.domain.expression.expressionmodel.ExpressionModel;
import compilator.domain.expression.expressionmodel.containercomponent.Container;
import compilator.domain.shapes.Component;
import compilator.domain.shapes.Shapes;
import compilator.ui.ComponentsContainer;
import compilator.ui.ExpressionContainer;
import compilator.ui.StyleAssigmentContainer;
import compilator.ui.StylesConainer;
import compilator.ui.UI;
import compilator.ui.UiFactory;
import generator.Generator;
import generator.gendataform.DataFormDiagramGenerator;
import generator.gendataform.DataFormModelGenerator;
import generator.genmodel.GenModel;
import styles.ModelFactoryStyles;
import styles.domain.Characteristic;
import styles.domain.CharacteristicFactory;
import styles.domain.DomainFactory;
import styles.domain.Propertie;
import styles.domain.StyleFactory;
import styles.domain.Style;
import tooldataform.TooldataformFactory;
import tooldataform.core.CoreFactory;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.containers.GraphicalContainer;

import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;

public class Principal3 extends ViewPart {

	public static final String ID = "UI.Principal"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	ModelFactoryModel modelFactoryModel = ModelFactoryModel.getInstance();
	
	private tooldataform.ModelFactory mfToolDataform;
	private tooldataform.core.Project project;
	
	private ModelFactory mfComponents;
	private Domain domainComponents;
	private UI uiComponents;
	private ComponentsContainer componentsContainer;
	
	private ModelFactory mfExpressions;
	private Domain domainExpressions;
	private UI uiExpressions;
	private ExpressionContainer expressionContainer;
	
	private ModelFactoryStyles mfStyles;

	private Text txtExpresion;
	private Text txtResultado;
	private Text txtEstilosComp;
	private Table table;

	private TreeMap<String, String> tokens; 
	private TreeMap<String, Component> components;
	public TreeMap<String, styles.domain.Style> styles;
	public TreeMap<String, styles.domain.Style> elementStyles;

	private String componentsString;
	private String expressionString;

	private AnalizadorLexico analizadorLexico;

	private Generator generatorGenModel;
	private StyleAssigmentContainer stylesAssigmentConainer;
	private StylesConainer stylesContainer;

	private TreeViewer treeViewerStyles;
	private TreeViewer treeViewerComponents;
	private TreeViewer treeViewerCharacteristics;
	
	private ComposedAdapterFactory composedAdapterFactory;
	private AdapterFactoryContentProvider adapterFactoryContentProvider;

	private Shapes theComponentFactory;
	private CharacteristicFactory theCharacteristicFactory;
	
	private Style styleSelected;
	private Object objectSelected;
	private Element elementSelected;
	private Component componentSelected;
	private Propertie propertieSelected;
	private Characteristic characteristicSelected;

	
	private IStructuredSelection selection;
	
	private StringTools stringTool;
	
	private int cont;
	private int fontSize;
	private int intervalFontSize;
	private int maxLevel;
	
	private boolean increasing;
	
	public Principal3() {
		
		stringTool = new StringTools();
		tokens = new TreeMap<String, String>();
		components  = new TreeMap<String, Component>();
		elementStyles = new TreeMap<String, styles.domain.Style>();
		
		expressionContainer = UiFactory.eINSTANCE.createExpressionContainer();
		componentsContainer = UiFactory.eINSTANCE.createComponentsContainer();
		
		mfExpressions = modelFactoryModel.getMfExpressions();
		mfComponents = modelFactoryModel.getMfComponents();
		
		mfStyles = modelFactoryModel.getMfStyles();
		theCharacteristicFactory = mfStyles.getTheDomainStyles().getTheCharacteristicFactory();
	
		stylesAssigmentConainer      = UiFactory.eINSTANCE.createStyleAssigmentContainer();
		stylesContainer = UiFactory.eINSTANCE.createStylesConainer();

		this.generatorGenModel = generator.GeneratorFactory.eINSTANCE.createGenerator();
		
		mfToolDataform=  TooldataformFactory.eINSTANCE.createModelFactory();
		project = CoreFactory.eINSTANCE.createProject();
		project.setTheModelFactory(mfToolDataform); mfToolDataform.getListProyecto().add(project);
		loadExpressionContainer();
		loadComponentsContainer();
	}

	public void loadComponentsContainer(){
		domainComponents = mfComponents.getTheDomainCompilator();
		uiComponents  = mfComponents.getTheUI(); 
		uiComponents.setTheDomain(domainComponents); domainComponents.setTheUI(uiComponents);
		mfComponents.setTheDomainCompilator(domainComponents); mfComponents.setTheUI(uiComponents);
		componentsContainer.setUI(uiComponents);
		theComponentFactory = domainComponents.getShapes();
	}

	public void loadExpressionContainer(){
		domainExpressions = mfExpressions.getTheDomainCompilator();
		uiExpressions = mfExpressions.getTheUI();
		mfExpressions.setTheDomainCompilator(domainExpressions); mfExpressions.setTheUI(uiExpressions);
		uiExpressions.setTheDomain(domainExpressions); domainExpressions.setTheUI(uiExpressions);
		expressionContainer.setUI(uiExpressions);
		stylesAssigmentConainer.setUI(uiExpressions);
	}

	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		ScrolledComposite scrolledComposite = new ScrolledComposite(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		toolkit.adapt(scrolledComposite);
		toolkit.paintBordersFor(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		Composite container = toolkit.createComposite(scrolledComposite, SWT.NONE);
		toolkit.paintBordersFor(container);

		Group grpCaracteristicas = new Group(container, SWT.NONE);
		grpCaracteristicas.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpCaracteristicas.setText("Caracteristicas");
		grpCaracteristicas.setBounds(20, 20, 250, 250);
		toolkit.adapt(grpCaracteristicas);
		toolkit.paintBordersFor(grpCaracteristicas);

		treeViewerCharacteristics = new TreeViewer(grpCaracteristicas, SWT.BORDER);
		Tree treeCaracteristicas = treeViewerCharacteristics.getTree();
		treeCaracteristicas.setBounds(10, 28, 230, 212);
		toolkit.paintBordersFor(treeCaracteristicas);
		treeViewerCharacteristics.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				selection = (IStructuredSelection) event.getSelection();
				if(selection==null)return;
				 objectSelected = selection.getFirstElement();
				
			}
		});

		Group grpEstilos = new Group(container, SWT.NONE);
		grpEstilos.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpEstilos.setText("Estilos");
		grpEstilos.setBounds(290, 20, 250, 250);
		toolkit.adapt(grpEstilos);
		toolkit.paintBordersFor(grpEstilos);

		treeViewerStyles = new TreeViewer(grpEstilos, SWT.BORDER);
		Tree treeEstilos = treeViewerStyles.getTree();
		treeEstilos.setBounds(10, 23, 230, 217);
		toolkit.paintBordersFor(treeEstilos);
		treeViewerStyles.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				selection = (IStructuredSelection) event.getSelection();
				if(selection==null)return;
				 objectSelected = selection.getFirstElement();
				
			}
		});

		Group grpComponents = new Group(container, SWT.NONE);
		grpComponents.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpComponents.setText("Componentes");
		grpComponents.setBounds(560, 20, 250, 250);
		toolkit.adapt(grpComponents);
		toolkit.paintBordersFor(grpComponents);

		treeViewerComponents = new TreeViewer(grpComponents, SWT.BORDER);
		Tree treeComponents = treeViewerComponents.getTree();
		treeComponents.setBounds(10, 30, 230, 210);
		toolkit.paintBordersFor(treeComponents);
		treeViewerComponents.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				selection = (IStructuredSelection) event.getSelection();
				if(selection==null)return;
				 objectSelected = selection.getFirstElement();
				
			}
		});

		Group grpEstilosComp = new Group(container, SWT.NONE);
		grpEstilosComp.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpEstilosComp.setText("Estilos por componentes");
		grpEstilosComp.setBounds(830, 20, 250, 250);
		toolkit.adapt(grpEstilosComp);
		toolkit.paintBordersFor(grpEstilosComp);

		txtEstilosComp = toolkit.createText(grpEstilosComp, "New Text", SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
		txtEstilosComp.setText("");
		txtEstilosComp.setBounds(10, 30, 230, 220);

		Group grpExpresin = new Group(container, SWT.NONE);
		grpExpresin.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpExpresin.setText("Expresi\u00F3n");
		grpExpresin.setBounds(20, 290, 1060, 200);
		toolkit.adapt(grpExpresin);
		toolkit.paintBordersFor(grpExpresin);

		txtExpresion = toolkit.createText(grpExpresin, "New Text", SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
		txtExpresion.setText("");
		txtExpresion.setBounds(10, 30, 1040, 160);

		Group grpResultadoAnalisis = new Group(container, SWT.NONE);
		grpResultadoAnalisis.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpResultadoAnalisis.setText("Resultado Analisis");
		grpResultadoAnalisis.setBounds(1100, 20, 320, 470);
		toolkit.adapt(grpResultadoAnalisis);
		toolkit.paintBordersFor(grpResultadoAnalisis);

		table = new Table(grpResultadoAnalisis, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(10, 30, 300, 200);
		toolkit.adapt(table);
		toolkit.paintBordersFor(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn tblclmnSimbolo = new TableColumn(table, SWT.NONE);
		tblclmnSimbolo.setWidth(148);
		tblclmnSimbolo.setText("Simbolo");

		TableColumn tblclmnTipo = new TableColumn(table, SWT.NONE);
		tblclmnTipo.setWidth(148);
		tblclmnTipo.setText("Tipo");

		Group grpResultado = new Group(grpResultadoAnalisis, SWT.NONE);
		grpResultado.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 11, SWT.NORMAL));
		grpResultado.setLocation(10, 250);
		grpResultado.setSize(300, 210);
		grpResultado.setText("Consola");
		toolkit.adapt(grpResultado);
		toolkit.paintBordersFor(grpResultado);

		txtResultado = toolkit.createText(grpResultado, "New Text", SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
		txtResultado.setText("");
		txtResultado.setBounds(10, 30, 280, 174);

		Button btnSaveComponent = toolkit.createButton(container, "Guardar Componente", SWT.NONE);
		btnSaveComponent.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnSaveComponent.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				saveAsComponent();
			}
		});	
		btnSaveComponent.setBounds(20, 510, 200, 30);	

		Button btnGenerateModel = new Button(container, SWT.NONE);
		btnGenerateModel.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnGenerateModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				//TODO SE AGREGAN LOS LABELS
				txtExpresion.setText(stringTool.addLabelsToTexts(txtExpresion.getText()));
				txtExpresion.setText(stringTool.addLabelsToCombos(txtExpresion.getText()));
				unPackExpression();
			}
		});
		btnGenerateModel.setBounds(240, 510, 200, 30);
		toolkit.adapt(btnGenerateModel, true, true);
		btnGenerateModel.setText("Generar Modelo");

		Button btnGenerateGenModel = toolkit.createButton(container, "Generar GenModel", SWT.NONE);
		btnGenerateGenModel.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnGenerateGenModel.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO Ajuste de tamaño de fuente de las propiedades automatico
				Shell shell = new Shell();
				SetFontDialog dialog = new SetFontDialog(shell, true, 12, 1, false);
				if (dialog.open() == Window.OK) {
		            fontSize = dialog.getSize();
		            intervalFontSize = dialog.getInterval();
		            increasing = dialog.isIncreasing();
		            if(!increasing && !dialog.isWarning() && fontSize-(intervalFontSize*3) < 8) {
		            	JOptionPane.showMessageDialog(null, "Si el modelo tiene mas de tres niveles de granularidad"
		            			+ " la letra sera muy pequeña y dificil de leer", null, JOptionPane.WARNING_MESSAGE);
		            	SetFontDialog dialogW = new SetFontDialog(shell, increasing, fontSize, intervalFontSize, dialog.isWarning());
		            	if (dialogW.open() == Window.OK) {
		            		fontSize = dialogW.getSize();
				            intervalFontSize = dialogW.getInterval();
				            increasing = dialog.isIncreasing();
				            createGenModel();
		            	}
		            	
		            } else {
			            createGenModel();
		            }
				}
				
			}
		});
		btnGenerateGenModel.setBounds(460, 510, 200, 30);									

		Button btnGenerateExcel = toolkit.createButton(container, "Generar Excel", SWT.NONE);
		btnGenerateExcel.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnGenerateExcel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnGenerateExcel.setBounds(680, 510, 200, 30);								

		Button btnNewButton = toolkit.createButton(container, "Guardar", SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnNewButton.setBounds(897, 510, 200, 30);


		scrolledComposite.setContent(container);
		scrolledComposite.setMinSize(container.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		getSite().registerContextMenu(hookContextMenuCharacteristics(), treeViewerCharacteristics);
		getSite().registerContextMenu(hookContextMenuStyles(), treeViewerStyles);
		getSite().registerContextMenu(hookContextMenuComponents(), treeViewerCharacteristics);

		createActions();
		initializeToolBar();
		initializeMenu();
		initCharacteristics();
		initComponents();
		initStyles();
	}

	
	public MenuManager hookContextMenuCharacteristics() {
		MenuManager menuMgr = new MenuManager("MenuPrincipal");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				createChildMenuCharacteristics(menuMgr);
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewerCharacteristics.getControl());
		treeViewerCharacteristics.getControl().setMenu(menu);
		return menuMgr;

	}

	public void createChildMenuCharacteristics(MenuManager menuMgr) {

		MenuManager childMenu = new MenuManager("Nuevo"); 
		menuMgr.add(childMenu);
		menuMgr.add(new Separator("adittions"));	
		
		if(objectSelected instanceof CharacteristicFactory){
			Action actionNewCharacteristic = new Action("Caracteristica") {
				private Shell shell = new Shell();
				@Override
				public void run() {
					AddCharacteristicDialog dialog = new AddCharacteristicDialog(shell);
			        // get the new values from the dialog
			        if (dialog.open() == Window.OK) {
			            String name = dialog.getName();
			            Characteristic newCharacteristic = DomainFactory.eINSTANCE.createCharacteristic();
						newCharacteristic.setName(name);
						theCharacteristicFactory.getListCharacteristic().add(newCharacteristic);
						modelFactoryModel.saveStylesModel();
			        }					
				}
			};
			childMenu.add(actionNewCharacteristic);
		}
		
		if(objectSelected instanceof Characteristic){
			characteristicSelected = (Characteristic) objectSelected;
			
			Action actionNewPropertie = new Action("Propiedad") {
				private Shell shell = new Shell();
				@Override
				public void run() {
					AddPropertieDialog dialog = new AddPropertieDialog(shell);
			        // get the new values from the dialog
			        if (dialog.open() == Window.OK) {
			            String name = dialog.getName();
			            String value = dialog.getValue();
			            
			            EList<Propertie> listProperties = characteristicSelected.getListProperties();
			            boolean ok = true;
			            for(int i = 0; i < listProperties.size(); i++) {
			            	if(listProperties.get(i).getName().equals(name)) {
			            		ok = false;
			            		JOptionPane.showMessageDialog(null, "No deben haber dos propiedades "
			            				+ "del mismo tipo en una caracteristica", null, JOptionPane.ERROR_MESSAGE);
			            		break;
			            	}
			            }
			            if(ok) {
		            		Propertie newPropertie = DomainFactory.eINSTANCE.createPropertie();
							newPropertie.setName(name);
							newPropertie.setValue(value);
							characteristicSelected.getListProperties().add(newPropertie);
							modelFactoryModel.saveStylesModel();
		            	}
			        }					
				}
			};
			childMenu.add(actionNewPropertie);
			
			Action actionEdit = new Action("Editar") {
				private Shell shell = new Shell();
				@Override
				public void run() {
					EditCharacteristicDialog dialog = new EditCharacteristicDialog(shell, characteristicSelected);
			        // get the new values from the dialog
			        if (dialog.open() == Window.OK) {
			            String name = dialog.getName();
			            characteristicSelected.setName(name);
			           
						modelFactoryModel.saveStylesModel();
						initStyles();
						treeViewerStyles.expandAll();
			        }					
				}				
			};
			menuMgr.add(actionEdit);
			
			Action actionDelete = new Action("Eliminar") {
				@Override
				public void run() {
					theCharacteristicFactory.getListCharacteristic().remove(characteristicSelected);       
		            modelFactoryModel.saveStylesModel();
				}
				
			};
			menuMgr.add(actionDelete);
		}
		
		if(objectSelected instanceof Propertie){
			propertieSelected = (Propertie) objectSelected;
			
			
			Action actionEdit = new Action("Editar") {
				private Shell shell = new Shell();
				@Override
				public void run() {
					
					EditPropertieDialog dialog = new EditPropertieDialog(shell, propertieSelected);

			        // get the new values from the dialog
			        if (dialog.open() == Window.OK) {
			            String value = dialog.getValue();
			            propertieSelected.setValue(value);        
			            modelFactoryModel.saveStylesModel();
			        }
				}
				
			};
			menuMgr.add(actionEdit);
			
			Action actionDelete = new Action("Eliminar") {
				@Override
				public void run() {
					propertieSelected.getCharacteristic().getListProperties().remove(propertieSelected);       
		            modelFactoryModel.saveStylesModel();
				}
				
			};
			menuMgr.add(actionDelete);
		}
	}
	
	public MenuManager hookContextMenuStyles() {
		MenuManager menuMgr = new MenuManager("MenuPrincipalStyle");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				createChildMenuStyles(menuMgr);
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewerStyles.getControl());
		treeViewerStyles.getControl().setMenu(menu);
		return menuMgr;

	}
	
	public void createChildMenuStyles(MenuManager menuMgr) {

		MenuManager childMenu = new MenuManager("Nuevo"); 
		menuMgr.add(childMenu);
		menuMgr.add(new Separator("adittions"));	
		
		if(objectSelected instanceof StyleFactory){
			Action actionNewStyle = new Action("Estilo") {
				private Shell shell = new Shell();
				@Override
				public void run() {
					AddStyleDialog dialog = new AddStyleDialog(shell, theCharacteristicFactory);
			        // get the new values from the dialog
			        if (dialog.open() == Window.OK) {
			            String name = dialog.getName();
			            String characteristic = dialog.getCharacteristic();
			            Style newStyle = DomainFactory.eINSTANCE.createStyle();
						newStyle.setName(name);
						EList<Characteristic> listCharacteristics = theCharacteristicFactory.getListCharacteristic();
						for (int i = 0; i < listCharacteristics.size(); i++) {
							if(listCharacteristics.get(i).getName().equals(characteristic)) {
								newStyle.setTheCharacteristic(listCharacteristics.get(i));
							}
						}
						mfStyles.getTheDomainStyles().getTheStyleFactory().getListStyle().add(newStyle);
						modelFactoryModel.saveStylesModel();
			        }					
				}
			};
			childMenu.add(actionNewStyle);
		}
		
		if(objectSelected instanceof Style){
			styleSelected = (Style) objectSelected;
						
			Action actionEdit = new Action("Editar") {
				private Shell shell = new Shell();
				@Override
				public void run() {
					EditStyleDialog dialog = new EditStyleDialog(shell, styleSelected, theCharacteristicFactory);
			        // get the new values from the dialog
			        if (dialog.open() == Window.OK) {
			        	String name = dialog.getName();
			            String characteristic = dialog.getCharacteristic();
						styleSelected.setName(name);
						EList<Characteristic> listCharacteristics = theCharacteristicFactory.getListCharacteristic();
						for (int i = 0; i < listCharacteristics.size(); i++) {
							if(listCharacteristics.get(i).getName().equals(characteristic)) {
								styleSelected.setTheCharacteristic(listCharacteristics.get(i));
							}
						}
						modelFactoryModel.saveStylesModel();
			        }					
				}				
			};
			menuMgr.add(actionEdit);
			
			Action actionDelete = new Action("Eliminar") {
				@Override
				public void run() {
					mfStyles.getTheDomainStyles().getTheStyleFactory().getListStyle().remove(styleSelected);       
		            modelFactoryModel.saveStylesModel();
				}
			};
			menuMgr.add(actionDelete);
		}
	}

	public MenuManager hookContextMenuComponents() {
		MenuManager menuMgr = new MenuManager("MenuPrincipalComponents");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				createChildMenuComponents(menuMgr);
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewerComponents.getControl());
		treeViewerComponents.getControl().setMenu(menu);
		return menuMgr;

	}
	
	public void createChildMenuComponents(MenuManager menuMgr) {
		
		menuMgr.add(new Separator("adittions"));	
		
		if(objectSelected instanceof Component){
			componentSelected = (Component) objectSelected;
			
			Action actionEdit = new Action("Editar") {
				private Shell shell = new Shell();
				@Override
				public void run() {
					EditComponentDialog dialog = new EditComponentDialog(shell, componentSelected);
			        // get the new values from the dialog
			        if (dialog.open() == Window.OK) {
			            String name = dialog.getName();
			            componentSelected.setName(name);
			           
						modelFactoryModel.saveComponentsModel();
						initStyles();
						treeViewerStyles.expandAll();
			        }					
				}				
			};
			menuMgr.add(actionEdit);
			
			Action actionDelete = new Action("Eliminar") {
				
				@Override
				public void run() {
					theComponentFactory.getListComponents().remove(componentSelected);       
		            modelFactoryModel.saveComponentsModel();
				}
				
			};
			menuMgr.add(actionDelete);
		}
		
		if(objectSelected instanceof Element){
			elementSelected = (Element) objectSelected;
			
			Action actionEdit = new Action("Editar") {
				private Shell shell = new Shell();
				
				@Override
				public void run() {
					EditElementDialog dialog = new EditElementDialog(shell, elementSelected);
			        // get the new values from the dialog
			        if (dialog.open() == Window.OK) {
			        	String name = dialog.getName();
						elementSelected.setName(name);
						modelFactoryModel.saveComponentsModel();
			        }   
		            
				}
				
			};
			menuMgr.add(actionEdit);
		}
	}


	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		IMenuManager manager = getViewSite().getActionBars().getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	public void createGenModel(){

		try {
			styles = stylesContainer.loadStyles(mfStyles);
			stylesAssigmentConainer.setText(stylesAssigmentConainer.getFormatedString(txtEstilosComp.getText()));
			if(stylesAssigmentConainer.getText().length()>0)
				elementStyles = stylesAssigmentConainer.loadElementsStyles(styles);
			
			compile();

//			styles = stylesContainer.loadStyles(mfStyles);
//			stylesAssigmentConainer.setText(stylesAssigmentConainer.getFormatedString(txtEstilosComp.getText()));
//			if(stylesAssigmentConainer.getText().length()>0)
//				elementStyles = stylesAssigmentConainer.loadElementsStyles(styles);

			boolean f = expressionContainer.createEModelFromUnpackedExpression(expressionString,tokens,components,elementStyles);
			if(!f){
				JOptionPane.showMessageDialog(null, "No se puedo generar el modelo");
			}

			generatorGenModel = generatorGenModel.loadGenModel();
			ExpressionModel expressionModel = modelFactoryModel.getMfExpressions().getTheDomainCompilator().getTheExpression().getTheExpressionModel();
			Container container = (Container) expressionModel.getListElements().get(0);
			addStyleElement(1, container);
			createCharacteristic();
			Style style = searchMinStyle();
			setMinStyle(style, container);
			modelFactoryModel.saveExpressionsModel();
			generatorGenModel.createGenModel(expressionModel);
			generatorGenModel.saveGenModel();
			
			createDataformDiagram(generatorGenModel.getTheGenModel());
			
			DataFormDiagramGenerator dataFormDiagramGenerator = generator.gendataform.GendataformFactory.eINSTANCE.createDataFormDiagramGenerator();
			dataFormDiagramGenerator.DataformDiagramGenerator(mfToolDataform);
			
			dataFormDiagramGenerator.generateDiagram();
			
		}catch(TokenMgrError te)
		{
			String error="Error\n"+te.getMessage();
			txtResultado.setText(error);
		}
		catch(ParseException ex)
		{
			txtResultado.setText(analizadorLexico.getResultado());
		}
	}

	private void setMinStyle(Style style, Element element) {
		// TODO Auto-generated method stub
		if(element instanceof Container) {
			Container c = (Container) element;
			for (int i = 0; i < c.getListElements().size(); i++) {
				setMinStyle(style, c.getListElements().get(i));
			}
		}else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Table) {
			compilator.domain.expression.expressionmodel.individualcomponent.Table t = (compilator.domain.expression.expressionmodel.individualcomponent.Table) element;
			for (int i = 0; i < t.getListColumn().size(); i++) {
				setMinStyle(style, t.getListColumn().get(i));
			}
		} else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Button) {
			element.setTheStyle(style);
		} else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Column) {
			element.setTheStyle(style);
		} else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.ComboBox) {
			element.setTheStyle(style);
		} else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Label) {
			element.setTheStyle(style);
		} else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.TextField) {
			element.setTheStyle(style);
		}
	}

	private Style searchMinStyle() {
		// TODO Auto-generated method stub
		Style style = null;
		EList<Style> listStyle = mfStyles.getTheDomainStyles().getTheStyleFactory().getListStyle();
		for (int i = 0; i <listStyle.size(); i++) {
			if(listStyle.get(i).getName().equals("Titulo " + maxLevel)) {
				style = listStyle.get(i);
				break;
			}
		}		
		return style;
	}

	public void createDataformDiagram(GenModel genModel){
		DataFormModelGenerator dataFormModelGenerator = generator.gendataform.GendataformFactory.eINSTANCE.createDataFormModelGenerator();
		mfToolDataform    = tooldataform.TooldataformFactory.eINSTANCE.createModelFactory();
		project         = tooldataform.core.CoreFactory.eINSTANCE.createProject();
		DataForm_Diagram dataformDiagram = dataFormModelGenerator.createDataFormModel(genModel);
		
		setBoundsGraphicalContainer(dataformDiagram.getTheInterface(), 10, 10 , 
				dataformDiagram.getTheInterface().getListGraphicalContainer().get(0).getWidth()+20, 
				dataformDiagram.getTheInterface().getListGraphicalContainer().get(0).getHeight()+100);	
		dataformDiagram.setOwnedByProject(project);
		project.getListDataFormDiagram().add(dataformDiagram);
		mfToolDataform.getListProyecto().add(project); 
		project.setTheModelFactory(mfToolDataform);
		saveDF();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundsGraphicalContainer(final GraphicalContainer graphicalContainer, final int x, final int y, final int width, final int height) {
		
		graphicalContainer.setWidth(new Integer(width));
		graphicalContainer.setHeight(new Integer(height));
		graphicalContainer.setPositionX(x);
		graphicalContainer.setPositionY(y);		
	}
	
	public Style searchStyle(String name) {
		Style style = null;
		EList<Style> listStyle = mfStyles.getTheDomainStyles().getTheStyleFactory().getListStyle();
		for (int i = 0; i <listStyle.size(); i++) {
			if(listStyle.get(i).getName().equals(name)) {
				style = listStyle.get(i);
				break;
			}
		}
		return style;
	}
	
	public void addStyleElement(int level, Element element) {
		
		if(element instanceof Container) {
			Container c = (Container) element;
			for (int i = 0; i < c.getListElements().size(); i++) {
				addStyleElement(level+1, c.getListElements().get(i));
			}
		}
		
		Style style = searchStyle("Titulo " + level);
		if(style == null) {
			style =	DomainFactory.eINSTANCE.createStyle();
			style.setName("Titulo " + level);
			mfStyles.getTheDomainStyles().getTheStyleFactory().getListStyle().add(style);
			modelFactoryModel.saveStylesModel();
		}
		maxLevel = Math.max(maxLevel, level);
		element.setTheStyle(style);
	}
	
	public Characteristic searchCharacteristic(String name) {
		Characteristic charact = null;
		EList<Characteristic> listCharacteristic = mfStyles.getTheDomainStyles().
				getTheCharacteristicFactory().getListCharacteristic();
		for (int i = 0; i <listCharacteristic.size(); i++) {
			if(listCharacteristic.get(i).getName().equals(name)) {
				charact = listCharacteristic.get(i);
				break;
			}
		}
		return charact;
	}
	
	public void addCharacteristicProperties(Characteristic characteristic, int level) {
		Propertie propertie = DomainFactory.eINSTANCE.createPropertie();
		propertie.setName("Font Size");
		if(increasing) {
			propertie.setValue("" + (fontSize + ((maxLevel-level)*intervalFontSize)));
		} else {
			propertie.setValue("" + (fontSize - ((level-1)*intervalFontSize)));
		}
		characteristic.getListProperties().add(propertie);
	}
	
	public void createCharacteristic() {
		
		for(int i = 1; i <= maxLevel; i++) {
			Characteristic characteristic = searchCharacteristic("C"+i);
			if(characteristic == null) {
				characteristic = DomainFactory.eINSTANCE.createCharacteristic();
				characteristic.setName("C"+i);
				mfStyles.getTheDomainStyles().getTheCharacteristicFactory().getListCharacteristic().add(characteristic);
			} else {
				characteristic.getListProperties().clear();
			}
			addCharacteristicProperties(characteristic, i);
			Style style = searchStyle("Titulo " + i);
			style.setTheCharacteristic(characteristic);
		}
		modelFactoryModel.saveStylesModel();
		initStyles();
	}
	
	public void unPackExpression(){
		
		try {
			styles = stylesContainer.loadStyles(mfStyles);
			stylesAssigmentConainer.setText(stylesAssigmentConainer.getFormatedString(txtEstilosComp.getText()));
			if(stylesAssigmentConainer.getText().length()>0)
				elementStyles = stylesAssigmentConainer.loadElementsStyles(styles);
			compile();

			String fullExpression = expressionContainer.createExpressionModel(expressionString,tokens,components,elementStyles);			
			String styles = stylesAssigmentConainer.unPackStyles();
			stylesAssigmentConainer.setText(stylesAssigmentConainer.getFormatedString(styles));

			txtExpresion.setText(fullExpression);
			txtEstilosComp.setText(styles);
		}catch(TokenMgrError te)
		{
			String error="Error\n"+te.getMessage();
			txtResultado.setText(error);
		}
		catch(ParseException ex)
		{
			txtResultado.setText(analizadorLexico.getResultado());
		}
	}

	public void saveAsComponent(){
		try {
			styles = stylesContainer.loadStyles(mfStyles);
			stylesAssigmentConainer.setText(stylesAssigmentConainer.getFormatedString(txtEstilosComp.getText()));
			if(stylesAssigmentConainer.getText().length()>0)
				elementStyles = stylesAssigmentConainer.loadElementsStyles(styles);
			compile();
			String nameComponent = JOptionPane.showInputDialog("Ingrese el nombre del componente");	
			componentsContainer.createComponent(nameComponent, expressionString, tokens, elementStyles);
		}
		catch(TokenMgrError te)
		{
			String error="Error\n"+te.getMessage();
			txtResultado.setText(error);
		}
		catch(ParseException ex)
		{
			txtResultado.setText(analizadorLexico.getResultado());
		}
	}

	public void compile()throws TokenMgrError,ParseException{

		EList<Component> listComponents = domainComponents.getShapes().getListComponents();

		componentsString  ="";
		expressionString = txtExpresion.getText();
		expressionString = (expressionString.charAt(expressionString.length()-1)==';')? expressionString: expressionString+";";

		for(int  j=0;j<listComponents.size();j++){
			componentsString+= listComponents.get(j).getName() + "=" + listComponents.get(j).getTheSentence().getFullSentence() + ";";
			components.put( listComponents.get(j).getName() , listComponents.get(j) );
		}

		String texto="";
		texto+="dI/"+componentsString+"/dF";
		texto+="eI/"+expressionString+"/eF";
		texto+="wI//wF";

		analizadorLexico= new AnalizadorLexico();
		InputStream stream= new ByteArrayInputStream(texto.getBytes(StandardCharsets.UTF_8));

		if(cont==0){
			cont++;
			analizadorLexico= new AnalizadorLexico(stream);
		}else{
			analizadorLexico.setResultado("");
			analizadorLexico.ReInit(stream);

		}

		analizadorLexico.Programa();
		txtResultado.setText(analizadorLexico.getResultado());
		String temp;
		SymbolTable temp2;
		Enumeration t = analizadorLexico.getSymbolTable().keys();
		table.removeAll();

		while ( t.hasMoreElements() == true ) {

			temp = (String)t.nextElement();
			temp2 = (SymbolTable)analizadorLexico.getSymbolTable().get(temp);
			TableItem item= new TableItem(table, SWT.NONE);
			item.setText(0,temp2.getValor());
			item.setText(1,temp2.getTipo());
			tokens.put(temp2.getValor(), temp2.getTipo());
		}
	}

	private void initCharacteristics() {
		TreeLabelProviderBrowser labelProvider = new TreeLabelProviderBrowser();
		treeViewerCharacteristics.setLabelProvider(labelProvider); // add for decorator and tooltip support
		adapterFactoryContentProvider = new AdapterFactoryContentProvider(getAdapterFactory());
		treeViewerCharacteristics.setContentProvider(adapterFactoryContentProvider);
		treeViewerCharacteristics.setInput(mfStyles.getTheDomainStyles());
		treeViewerCharacteristics.remove(mfStyles.getTheDomainStyles().getTheStyleFactory());
		treeViewerCharacteristics.expandAll();
	}
	
	private void initStyles() {
		TreeLabelProviderBrowser labelProvider = new TreeLabelProviderBrowser();
		treeViewerStyles.setLabelProvider(labelProvider); // add for decorator and tooltip support
		adapterFactoryContentProvider = new AdapterFactoryContentProvider(getAdapterFactory());
		treeViewerStyles.setContentProvider(adapterFactoryContentProvider);
		treeViewerStyles.setInput(mfStyles.getTheDomainStyles());
		treeViewerStyles.remove(mfStyles.getTheDomainStyles().getTheCharacteristicFactory());
		treeViewerStyles.expandAll();
	}
	private void initComponents() {
		TreeLabelProviderBrowser labelProvider = new TreeLabelProviderBrowser();
		treeViewerComponents.setLabelProvider(labelProvider); // add for decorator and tooltip support
		adapterFactoryContentProvider = new AdapterFactoryContentProvider(getAdapterFactory());
		treeViewerComponents.setContentProvider(adapterFactoryContentProvider);
		treeViewerComponents.setInput(domainComponents);
		treeViewerComponents.expandAll();
	}
	
	protected AdapterFactory getAdapterFactory() {
		composedAdapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		return composedAdapterFactory;
	}

	public void saveDF() {
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/domain/model.tooldataform");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(mfToolDataform);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
}