package UI;

import java.io.ByteArrayInputStream;
import java.io.IOException;
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
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import Logica.AnalizadorLexico;
import Logica.ExcelGenerator;
import Logica.ParseException;
import Logica.StringTools;
import Logica.SymbolTable;
import Logica.TokenMgrError;
import compilator.ModelFactory;
import compilator.domain.Domain;
import compilator.domain.expression.Expression;
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

public class Principal extends ViewPart {

	public static final String ID = "UI.Principal"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

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

	private int cont;
	private int fontSize;
	private int intervalFontSize;
	private int maxLevel;

	private boolean increasing;
	
	private StringTools stringTool;

	// TODO
	ModelFactoryModel modelFactoryModel = ModelFactoryModel.getInstance();

	private ModelFactoryStyles mfStyles;

	private ModelFactory mfExpressions;
	private Domain domainExpressions;
	private UI uiExpressions;
	private ExpressionContainer expressionContainer;

	private ModelFactory mfComponents;
	private Domain domainComponents;
	private UI uiComponents;
	private ComponentsContainer componentsContainer;

	private tooldataform.ModelFactory mfToolDataform;
	private tooldataform.core.Project project;

	private Text txtNormalExpression;
	private Text txtExpandedExpression;
	private Text txtConsole;

	private Table tableResult;

	private TreeViewer treeViewerDocumentStyle;
	private TreeViewer treeViewerLithographicStyle;
	private TreeViewer treeViewerCharacteristics;
	private TreeViewer treeViewerComponents;
	private TreeViewer treeViewerPatterns;
	private TreeViewer treeViewerLog;

	public Principal() {
		
		stringTool = new StringTools();
		
		tokens = new TreeMap<String, String>();
		components = new TreeMap<String, Component>();
		elementStyles = new TreeMap<String, styles.domain.Style>();

		expressionContainer = UiFactory.eINSTANCE.createExpressionContainer();
		componentsContainer = UiFactory.eINSTANCE.createComponentsContainer();

		mfExpressions = modelFactoryModel.getMfExpressions();
		mfComponents = modelFactoryModel.getMfComponents();
		mfStyles = modelFactoryModel.getMfStyles();
		mfToolDataform = modelFactoryModel.getMfToolDataform();

		theCharacteristicFactory = mfStyles.getTheDomainStyles().getTheCharacteristicFactory();

		stylesAssigmentConainer = UiFactory.eINSTANCE.createStyleAssigmentContainer();
		stylesContainer = UiFactory.eINSTANCE.createStylesConainer();

		this.generatorGenModel = generator.GeneratorFactory.eINSTANCE.createGenerator();

		project = mfToolDataform.getListProyecto().get(0);
		
		mfExpressions.getTheDomainCompilator().getTheLog().getListExpressions().clear();
		mfExpressions.saveExpression();

		loadExpressionContainer();
		loadComponentsContainer();
	}

	public void loadComponentsContainer() {
		domainComponents = mfComponents.getTheDomainCompilator();
		uiComponents = mfComponents.getTheUI();
		uiComponents.setTheDomain(domainComponents);
		domainComponents.setTheUI(uiComponents);
		mfComponents.setTheDomainCompilator(domainComponents);
		mfComponents.setTheUI(uiComponents);
		componentsContainer.setUI(uiComponents);
		theComponentFactory = domainComponents.getShapes();
	}

	public void loadExpressionContainer() {
		domainExpressions = mfExpressions.getTheDomainCompilator();
		uiExpressions = mfExpressions.getTheUI();
		mfExpressions.setTheDomainCompilator(domainExpressions);
		mfExpressions.setTheUI(uiExpressions);
		uiExpressions.setTheDomain(domainExpressions);
		domainExpressions.setTheUI(uiExpressions);
		expressionContainer.setUI(uiExpressions);
		stylesAssigmentConainer.setUI(uiExpressions);
	}

	/**
	 * Create contents of the view part.
	 * 
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

		//////////////////////////////////////////////////////////////////////////////////
		// GRUPO ESTILOS
		//////////////////////////////////////////////////////////////////////////////////

		Group grpStyles = new Group(container, SWT.NONE);
		grpStyles.setBounds(10, 10, 790, 270);
		toolkit.adapt(grpStyles);
		toolkit.paintBordersFor(grpStyles);

		Group grpDocumentStyle = new Group(grpStyles, SWT.NONE);
		grpDocumentStyle.setBounds(10, 10, 250, 250);
		grpDocumentStyle.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpDocumentStyle.setText("Estilo Documento");
		toolkit.adapt(grpDocumentStyle);
		toolkit.paintBordersFor(grpDocumentStyle);

		treeViewerDocumentStyle = new TreeViewer(grpDocumentStyle, SWT.BORDER);
		Tree treeDocumentStyle = treeViewerDocumentStyle.getTree();
		treeDocumentStyle.setBounds(10, 20, 230, 220);
		toolkit.paintBordersFor(treeDocumentStyle);
		treeViewerDocumentStyle.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				selection = (IStructuredSelection) event.getSelection();
				if (selection == null)
					return;
				objectSelected = selection.getFirstElement();
			}
		});

		Group grpLithographicStyle = new Group(grpStyles, SWT.NONE);
		grpLithographicStyle.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpLithographicStyle.setText("Estilo Litografico");
		grpLithographicStyle.setBounds(270, 10, 250, 250);
		toolkit.adapt(grpLithographicStyle);
		toolkit.paintBordersFor(grpLithographicStyle);

		treeViewerLithographicStyle = new TreeViewer(grpLithographicStyle, SWT.BORDER);
		Tree treeLithographicStyle = treeViewerLithographicStyle.getTree();
		treeLithographicStyle.setBounds(10, 20, 230, 220);
		toolkit.paintBordersFor(treeLithographicStyle);
		treeViewerLithographicStyle.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				selection = (IStructuredSelection) event.getSelection();
				if (selection == null)
					return;
				objectSelected = selection.getFirstElement();
			}
		});

		Group grpCharacteristics = new Group(grpStyles, SWT.NONE);
		grpCharacteristics.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpCharacteristics.setText("Caracteristicas");
		grpCharacteristics.setBounds(530, 10, 250, 250);
		toolkit.adapt(grpCharacteristics);
		toolkit.paintBordersFor(grpCharacteristics);

		treeViewerCharacteristics = new TreeViewer(grpCharacteristics, SWT.BORDER);
		Tree treeCharacteristics = treeViewerCharacteristics.getTree();
		treeCharacteristics.setBounds(10, 20, 230, 220);
		toolkit.paintBordersFor(treeCharacteristics);
		treeViewerCharacteristics.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				selection = (IStructuredSelection) event.getSelection();
				if (selection == null)
					return;
				objectSelected = selection.getFirstElement();
			}
		});

		//////////////////////////////////////////////////////////////////////////////////
		// GRUPO TEXTO EXPRESION
		//////////////////////////////////////////////////////////////////////////////////

		Group grpExpression = new Group(container, SWT.NONE);
		grpExpression.setBounds(10, 330, 790, 410);
		toolkit.adapt(grpExpression);
		toolkit.paintBordersFor(grpExpression);

		Group grpNormalExpression = new Group(grpExpression, SWT.NONE);
		grpNormalExpression.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpNormalExpression.setText("Expresi\u00F3n Normal");
		grpNormalExpression.setBounds(10, 10, 770, 140);
		toolkit.adapt(grpNormalExpression);
		toolkit.paintBordersFor(grpNormalExpression);

		txtNormalExpression = toolkit.createText(grpNormalExpression, "New Text",
				SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
		txtNormalExpression.setText("");
		txtNormalExpression.setBounds(10, 30, 750, 100);

		Group grpExpandedExpression = new Group(grpExpression, SWT.NONE);
		grpExpandedExpression.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpExpandedExpression.setText("Expresi\u00F3n Expandida");
		grpExpandedExpression.setBounds(10, 210, 770, 190);
		toolkit.adapt(grpExpandedExpression);
		toolkit.paintBordersFor(grpExpandedExpression);

		txtExpandedExpression = toolkit.createText(grpExpandedExpression, "New Text",
				SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
		txtExpandedExpression.setText("");
		txtExpandedExpression.setBounds(10, 30, 750, 150);

		Button btnContract = toolkit.createButton(grpExpression, "", SWT.NONE);
		btnContract.setImage(ResourceManager.getPluginImage("compiladordataform", "icons/up2.png"));
		btnContract.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnContract.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO
			}
		});
		btnContract.setBounds(10, 160, 60, 40);

		Button btnExpand = toolkit.createButton(grpExpression, "", SWT.NONE);
		btnExpand.setImage(ResourceManager.getPluginImage("compiladordataform", "icons/down2.png"));
		btnExpand.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnExpand.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO
			}
		});
		btnExpand.setBounds(90, 160, 60, 40);

		//////////////////////////////////////////////////////////////////////////////////
		// GRUPO PATRONES Y COMPONENTES
		//////////////////////////////////////////////////////////////////////////////////

		Group group = new Group(container, SWT.NONE);
		group.setBounds(860, 10, 320, 730);
		toolkit.adapt(group);
		toolkit.paintBordersFor(group);

		Group grpPatterns = new Group(group, SWT.NONE);
		grpPatterns.setText("Patrones");
		grpPatterns.setBounds(10, 10, 300, 200);
		toolkit.adapt(grpPatterns);
		toolkit.paintBordersFor(grpPatterns);

		treeViewerPatterns = new TreeViewer(grpPatterns, SWT.BORDER);
		Tree treePatterns = treeViewerPatterns.getTree();
		treePatterns.setBounds(10, 20, 280, 170);
		toolkit.paintBordersFor(treePatterns);
		treeViewerPatterns.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				selection = (IStructuredSelection) event.getSelection();
				if (selection == null)
					return;
				objectSelected = selection.getFirstElement();
			}
		});

		Group grpComponents = new Group(group, SWT.NONE);
		grpComponents.setBounds(10, 230, 300, 200);
		grpComponents.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpComponents.setText("Componentes");
		toolkit.adapt(grpComponents);
		toolkit.paintBordersFor(grpComponents);

		treeViewerComponents = new TreeViewer(grpComponents, SWT.BORDER);
		Tree treeComponents = treeViewerComponents.getTree();
		treeComponents.setBounds(10, 20, 280, 170);
		toolkit.paintBordersFor(treeComponents);
		treeViewerComponents.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				selection = (IStructuredSelection) event.getSelection();
				if (selection == null)
					return;
				objectSelected = selection.getFirstElement();
			}
		});

		Group grpLog = new Group(group, SWT.NONE);
		grpLog.setText("Log");
		grpLog.setBounds(10, 490, 300, 234);
		toolkit.adapt(grpLog);
		toolkit.paintBordersFor(grpLog);

		treeViewerLog = new TreeViewer(grpLog, SWT.BORDER);
		Tree treeLog = treeViewerLog.getTree();
		treeLog.setBounds(10, 20, 280, 170);
		toolkit.paintBordersFor(treeLog);
		treeViewerLog.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				selection = (IStructuredSelection) event.getSelection();
				if (selection == null)
					return;
				objectSelected = selection.getFirstElement();
			}
		});

		Button btnSaveLog = toolkit.createButton(group, "", SWT.NONE);
		btnSaveLog.setImage(ResourceManager.getPluginImage("compiladordataform", "icons/up2.png"));
		btnSaveLog.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnSaveLog.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO
			}
		});
		btnSaveLog.setBounds(130, 440, 60, 40);

		//////////////////////////////////////////////////////////////////////////////////
		// GRUPO RESULTADO
		//////////////////////////////////////////////////////////////////////////////////

		Group grpResult = new Group(container, SWT.NONE);
		grpResult.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
		grpResult.setText("Resultado Analisis");
		grpResult.setBounds(1190, 10, 320, 730);
		toolkit.adapt(grpResult);
		toolkit.paintBordersFor(grpResult);

		tableResult = new Table(grpResult, SWT.BORDER | SWT.FULL_SELECTION);
		tableResult.setBounds(10, 30, 300, 410);
		toolkit.adapt(tableResult);
		toolkit.paintBordersFor(tableResult);
		tableResult.setHeaderVisible(true);
		tableResult.setLinesVisible(true);

		TableColumn tblclmnSimbolo = new TableColumn(tableResult, SWT.NONE);
		tblclmnSimbolo.setWidth(148);
		tblclmnSimbolo.setText("Simbolo");

		TableColumn tblclmnTipo = new TableColumn(tableResult, SWT.NONE);
		tblclmnTipo.setWidth(148);
		tblclmnTipo.setText("Tipo");

		Group grpConsole = new Group(grpResult, SWT.NONE);
		grpConsole.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 11, SWT.NORMAL));
		grpConsole.setLocation(10, 450);
		grpConsole.setSize(300, 270);
		grpConsole.setText("Consola");
		toolkit.adapt(grpConsole);
		toolkit.paintBordersFor(grpConsole);

		txtConsole = toolkit.createText(grpConsole, "New Text", SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
		txtConsole.setText("");
		txtConsole.setBounds(10, 30, 280, 230);

		//////////////////////////////////////////////////////////////////////////////////
		// BOTONES DEL CONTENEDOR
		//////////////////////////////////////////////////////////////////////////////////

		Button btnUp = toolkit.createButton(container, "", SWT.NONE);
		btnUp.setImage(ResourceManager.getPluginImage("compiladordataform", "icons/up2.png"));
		btnUp.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO
				
				initDocumentStyle();
			}
		});
		btnUp.setBounds(115, 290, 60, 40);

		Button btnRight = toolkit.createButton(container, "", SWT.NONE);
		btnRight.setImage(ResourceManager.getPluginImage("compiladordataform", "icons/right2.png"));
		btnRight.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnRight.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO
				try {
					compile();

					String id = JOptionPane.showInputDialog("Ingrese el identificador de la expresion");
					Expression ex = compilator.domain.expression.ExpressionFactory.eINSTANCE.createExpression();
					ex.setName(id + " : " + txtNormalExpression.getText());
					mfExpressions.getTheDomainCompilator().getTheLog().getListExpressions().add(ex);
					modelFactoryModel.saveExpressionsModel();
					initLog();

				} catch (TokenMgrError te) {
					String error = "Error\n" + te.getMessage();
					txtConsole.setText(error);
				} catch (ParseException ex) {
					txtConsole.setText(analizadorLexico.getResultado());
				}

			}
		});
		btnRight.setBounds(810, 500, 40, 60);

		Button btnGenerateModel = new Button(container, SWT.NONE);
		btnGenerateModel.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnGenerateModel.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				txtNormalExpression.setText(stringTool.addLabelsToTexts(txtNormalExpression.getText()));
				txtNormalExpression.setText(stringTool.addLabelsToCombos(txtNormalExpression.getText()));
				unPackExpression();
				initLog();
			}
		});
		btnGenerateModel.setBounds(10, 758, 200, 30);
		toolkit.adapt(btnGenerateModel, true, true);
		btnGenerateModel.setText("Generar Modelo");

		Button btnGenerateGenModel = toolkit.createButton(container, "Generar GenModel", SWT.NONE);
		btnGenerateGenModel.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnGenerateGenModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Cerrar otros editores
				closeEditors();
				// TODO Ajuste de tamaño de fuente de las propiedades automatico
				Shell shell = new Shell();
				SetFontDialog dialog = new SetFontDialog(shell, true, 12, 1, false);
				if (dialog.open() == Window.OK) {
					fontSize = dialog.getSize();
					intervalFontSize = dialog.getInterval();
					increasing = dialog.isIncreasing();
					if (!increasing && !dialog.isWarning() && fontSize - (intervalFontSize * 3) < 8) {
						JOptionPane.showMessageDialog(null,
								"Si el modelo tiene mas de tres niveles de granularidad"
										+ " la letra sera muy pequeña y dificil de leer",
								null, JOptionPane.WARNING_MESSAGE);
						SetFontDialog dialogW = new SetFontDialog(shell, increasing, fontSize, intervalFontSize,
								dialog.isWarning());
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
		btnGenerateGenModel.setBounds(299, 758, 200, 30);

		Button btnSaveComponent = toolkit.createButton(container, "Guardar Componente", SWT.NONE);
		btnSaveComponent.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnSaveComponent.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				saveAsComponent();
			}
		});
		btnSaveComponent.setBounds(600, 758, 200, 30);

		scrolledComposite.setContent(container);
		scrolledComposite.setMinSize(container.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		getSite().registerContextMenu(hookContextMenuDocumentStyle(), treeViewerDocumentStyle);
		getSite().registerContextMenu(hookContextMenuLithographicStyles(), treeViewerLithographicStyle);
		getSite().registerContextMenu(hookContextMenuCharacteristics(), treeViewerCharacteristics);

		getSite().registerContextMenu(hookContextMenuPatterns(), treeViewerPatterns);
		getSite().registerContextMenu(hookContextMenuComponents(), treeViewerComponents);
		getSite().registerContextMenu(hookContextMenuLog(), treeViewerLog);

		createActions();
		initCharacteristics();
		initComponents();
		initLithographicStyle();
		initDocumentStyle();
		initLog();
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

	@Override
	public void setFocus() {
		// Set the focus
	}

	//////////////////////////////////////////////////////////////////////////////////
	// MENU DEL ARBOL DE ESTILO DOCUMENTO
	//////////////////////////////////////////////////////////////////////////////////

	public MenuManager hookContextMenuDocumentStyle() {
		MenuManager menuMgr = new MenuManager("DocuemntoStyleMainMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				createChildMenuDocumentStyle(menuMgr);
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewerDocumentStyle.getControl());
		treeViewerDocumentStyle.getControl().setMenu(menu);
		return menuMgr;
	}

	public void createChildMenuDocumentStyle(MenuManager menuMgr) {
		MenuManager childMenu = new MenuManager("Nuevo");
		menuMgr.add(childMenu);
		menuMgr.add(new Separator("adittions"));
	}

	//////////////////////////////////////////////////////////////////////////////////
	// MENU DEL ARBOL DE ESTILO LITOGRAFICO
	//////////////////////////////////////////////////////////////////////////////////

	public MenuManager hookContextMenuLithographicStyles() {
		MenuManager menuMgr = new MenuManager("LithographicStyleMainMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				createChildMenuLithographicStyles(menuMgr);
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewerLithographicStyle.getControl());
		treeViewerLithographicStyle.getControl().setMenu(menu);
		return menuMgr;
	}

	public void createChildMenuLithographicStyles(MenuManager menuMgr) {
		MenuManager childMenu = new MenuManager("Nuevo");
		menuMgr.add(childMenu);
		menuMgr.add(new Separator("adittions"));

		if (objectSelected instanceof StyleFactory) {
			Action actionNewStyle = new Action("Estilo") {
				private Shell shell = new Shell();

				@Override
				public void run() {
					AddStyleDialog dialog = new AddStyleDialog(shell, theCharacteristicFactory);
					if (dialog.open() == Window.OK) {
						String name = dialog.getName();
						String characteristic = dialog.getCharacteristic();
						Style newStyle = DomainFactory.eINSTANCE.createStyle();
						newStyle.setName(name);
						EList<Characteristic> listCharacteristics = theCharacteristicFactory.getListCharacteristic();
						for (int i = 0; i < listCharacteristics.size(); i++) {
							if (listCharacteristics.get(i).getName().equals(characteristic)) {
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

		if (objectSelected instanceof Style) {
			styleSelected = (Style) objectSelected;

			Action actionEdit = new Action("Editar") {
				private Shell shell = new Shell();

				@Override
				public void run() {
					EditStyleDialog dialog = new EditStyleDialog(shell, styleSelected, theCharacteristicFactory);
					if (dialog.open() == Window.OK) {
						String name = dialog.getName();
						String characteristic = dialog.getCharacteristic();
						styleSelected.setName(name);
						EList<Characteristic> listCharacteristics = theCharacteristicFactory.getListCharacteristic();
						for (int i = 0; i < listCharacteristics.size(); i++) {
							if (listCharacteristics.get(i).getName().equals(characteristic)) {
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

	//////////////////////////////////////////////////////////////////////////////////
	// MENU DEL ARBOL DE CARACTERISTICAS
	//////////////////////////////////////////////////////////////////////////////////

	public MenuManager hookContextMenuCharacteristics() {
		MenuManager menuMgr = new MenuManager("CharacteristicsMainMenu");
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

		if (objectSelected instanceof CharacteristicFactory) {
			Action actionNewCharacteristic = new Action("Caracteristica") {
				private Shell shell = new Shell();

				@Override
				public void run() {
					AddCharacteristicDialog dialog = new AddCharacteristicDialog(shell);
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

		if (objectSelected instanceof Characteristic) {
			characteristicSelected = (Characteristic) objectSelected;

			Action actionNewPropertie = new Action("Propiedad") {
				private Shell shell = new Shell();

				@Override
				public void run() {
					AddPropertieDialog dialog = new AddPropertieDialog(shell);
					if (dialog.open() == Window.OK) {
						String name = dialog.getName();
						String value = dialog.getValue();
						EList<Propertie> listProperties = characteristicSelected.getListProperties();
						boolean ok = true;
						for (int i = 0; i < listProperties.size(); i++) {
							if (listProperties.get(i).getName().equals(name)) {
								ok = false;
								JOptionPane.showMessageDialog(null,
										"No deben haber dos propiedades " + "del mismo tipo en una caracteristica",
										null, JOptionPane.ERROR_MESSAGE);
								break;
							}
						}
						if (ok) {
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
					if (dialog.open() == Window.OK) {
						String name = dialog.getName();
						characteristicSelected.setName(name);
						modelFactoryModel.saveStylesModel();
						initLithographicStyle();
						treeViewerLithographicStyle.expandAll();
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

		if (objectSelected instanceof Propertie) {
			propertieSelected = (Propertie) objectSelected;

			Action actionEdit = new Action("Editar") {
				private Shell shell = new Shell();

				@Override
				public void run() {
					EditPropertieDialog dialog = new EditPropertieDialog(shell, propertieSelected);
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

	//////////////////////////////////////////////////////////////////////////////////
	// MENU DEL ARBOL DE LOG
	//////////////////////////////////////////////////////////////////////////////////

	public MenuManager hookContextMenuPatterns() {
		MenuManager menuMgr = new MenuManager("PatternsMainMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				createChildMenuPatterns(menuMgr);
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewerPatterns.getControl());
		treeViewerPatterns.getControl().setMenu(menu);
		return menuMgr;
	}

	public void createChildMenuPatterns(MenuManager menuMgr) {
		MenuManager childMenu = new MenuManager("Nuevo");
		menuMgr.add(childMenu);
		menuMgr.add(new Separator("adittions"));
	}

	//////////////////////////////////////////////////////////////////////////////////
	// MENU DEL ARBOL DE COMPONENTES
	//////////////////////////////////////////////////////////////////////////////////

	public MenuManager hookContextMenuComponents() {
		MenuManager menuMgr = new MenuManager("ComponentsMainMenu");
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

		if (objectSelected instanceof Component) {
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
						initLithographicStyle();
						treeViewerLithographicStyle.expandAll();
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

		if (objectSelected instanceof Element) {
			elementSelected = (Element) objectSelected;

			Action actionEdit = new Action("Editar") {
				private Shell shell = new Shell();

				@Override
				public void run() {
					EditElementDialog dialog = new EditElementDialog(shell, elementSelected);
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

	//////////////////////////////////////////////////////////////////////////////////
	// MENU DEL ARBOL DE LOG
	//////////////////////////////////////////////////////////////////////////////////

	public MenuManager hookContextMenuLog() {
		MenuManager menuMgr = new MenuManager("LogMainMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				createChildMenuLog(menuMgr);
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewerLog.getControl());
		treeViewerLog.getControl().setMenu(menu);
		return menuMgr;
	}

	public void createChildMenuLog(MenuManager menuMgr) {
		MenuManager childMenu = new MenuManager("Nuevo");
		menuMgr.add(childMenu);
		menuMgr.add(new Separator("adittions"));
	}

	public void createGenModel() {

		try {
			compile();

			boolean f = expressionContainer.createEModelFromUnpackedExpression(expressionString, tokens, components,
					elementStyles);
			if (!f) {
				JOptionPane.showMessageDialog(null, "No se puedo generar el modelo");
			}

			generatorGenModel = generatorGenModel.loadGenModel();
			ExpressionModel expressionModel = modelFactoryModel.getMfExpressions().getTheDomainCompilator()
					.getTheExpression().getTheExpressionModel();
			Container container = (Container) expressionModel.getListElements().get(0);
			addStyleElement(1, container);
			createCharacteristic();
			Style style = searchMinStyle();
			setMinStyle(style, container);
			modelFactoryModel.saveExpressionsModel();
			generatorGenModel.createGenModel(expressionModel);
			generatorGenModel.saveGenModel();

			createDataformDiagram(generatorGenModel.getTheGenModel());

			DataFormDiagramGenerator dataFormDiagramGenerator = generator.gendataform.GendataformFactory.eINSTANCE
					.createDataFormDiagramGenerator();
			dataFormDiagramGenerator.DataformDiagramGenerator(mfToolDataform);

			dataFormDiagramGenerator.generateDiagram();
			
			ExcelGenerator excelGenerator = new ExcelGenerator(generatorGenModel.getTheGenModel());
			try {
				excelGenerator.createExcel();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (TokenMgrError te) {
			String error = "Error\n" + te.getMessage();
			txtConsole.setText(error);
		} catch (ParseException ex) {
			txtConsole.setText(analizadorLexico.getResultado());
		}
	}

	private void setMinStyle(Style style, Element element) {
		// TODO Auto-generated method stub
		if (element instanceof Container) {
			Container c = (Container) element;
			for (int i = 0; i < c.getListElements().size(); i++) {
				setMinStyle(style, c.getListElements().get(i));
			}
		} else if (element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Table) {
			compilator.domain.expression.expressionmodel.individualcomponent.Table t = (compilator.domain.expression.expressionmodel.individualcomponent.Table) element;
			for (int i = 0; i < t.getListColumn().size(); i++) {
				setMinStyle(style, t.getListColumn().get(i));
			}
		} else if (element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Attribute) {
			compilator.domain.expression.expressionmodel.individualcomponent.Attribute a = (compilator.domain.expression.expressionmodel.individualcomponent.Attribute) element;
			setMinStyle(style, a.getTheLabel());
			setMinStyle(style, a.getTheTextField());
			
		} else if (element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Button) {
			element.setTheStyle(style);
		} else if (element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Column) {
			element.setTheStyle(style);
		} else if (element instanceof compilator.domain.expression.expressionmodel.individualcomponent.ComboBox) {
			element.setTheStyle(style);
		} else if (element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Label) {
			element.setTheStyle(style);
		} else if (element instanceof compilator.domain.expression.expressionmodel.individualcomponent.TextField) {
			element.setTheStyle(style);
		}
	}

	private Style searchMinStyle() {
		// TODO Auto-generated method stub
		Style style = null;
		EList<Style> listStyle = mfStyles.getTheDomainStyles().getTheStyleFactory().getListStyle();
		for (int i = 0; i < listStyle.size(); i++) {
			if (listStyle.get(i).getName().equals("Titulo " + maxLevel)) {
				style = listStyle.get(i);
				break;
			}
		}
		return style;
	}

	public void createDataformDiagram(GenModel genModel) {
		DataFormModelGenerator dataFormModelGenerator = generator.gendataform.GendataformFactory.eINSTANCE
				.createDataFormModelGenerator();
		tooldataform.styles.domain.Domain domainStyle = project.getTheDomainStyles();
		mfToolDataform.getListProyecto().get(0).getListDiagram().clear();
		domainStyle.getTheStyleFactory().getListStyle().clear();
		domainStyle.getTheCharacteristicFactory().getListCharacteristic().clear();
		DataForm_Diagram dataformDiagram = dataFormModelGenerator.createDataFormModel(domainStyle, genModel);

		setBoundsGraphicalContainer(dataformDiagram.getTheInterface(), 10, 10,
				dataformDiagram.getTheInterface().getListGraphicalContainer().get(0).getWidth() + 20,
				dataformDiagram.getTheInterface().getListGraphicalContainer().get(0).getHeight() + 100);
//		dataformDiagram.setOwnedByProject(project);
		mfToolDataform.getListProyecto().get(0).getListDiagram().add(dataformDiagram);
//		mfToolDataform.getListProyecto().add(project);
//		project.setTheModelFactory(mfToolDataform);
		saveDF();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBoundsGraphicalContainer(final GraphicalContainer graphicalContainer, final int x, final int y,
			final int width, final int height) {

		graphicalContainer.setWidth(new Integer(width));
		graphicalContainer.setHeight(new Integer(height));
		graphicalContainer.setPositionX(x);
		graphicalContainer.setPositionY(y);
	}

	public Style searchStyle(String name) {
		Style style = null;
		EList<Style> listStyle = mfStyles.getTheDomainStyles().getTheStyleFactory().getListStyle();
		for (int i = 0; i < listStyle.size(); i++) {
			if (listStyle.get(i).getName().equals(name)) {
				style = listStyle.get(i);
				break;
			}
		}
		return style;
	}

	public void addStyleElement(int level, Element element) {

		if (element instanceof Container) {
			Container c = (Container) element;
			for (int i = 0; i < c.getListElements().size(); i++) {
				addStyleElement(level + 1, c.getListElements().get(i));
			}
		}

		Style style = searchStyle("Titulo " + level);
		if (style == null) {
			style = DomainFactory.eINSTANCE.createStyle();
			style.setName("Titulo " + level);
			mfStyles.getTheDomainStyles().getTheStyleFactory().getListStyle().add(style);
			modelFactoryModel.saveStylesModel();
		}
		maxLevel = Math.max(maxLevel, level);
		element.setTheStyle(style);
	}

	public Characteristic searchCharacteristic(String name) {
		Characteristic charact = null;
		EList<Characteristic> listCharacteristic = mfStyles.getTheDomainStyles().getTheCharacteristicFactory()
				.getListCharacteristic();
		for (int i = 0; i < listCharacteristic.size(); i++) {
			if (listCharacteristic.get(i).getName().equals(name)) {
				charact = listCharacteristic.get(i);
				break;
			}
		}
		return charact;
	}

	public void addCharacteristicProperties(Characteristic characteristic, int level) {
		Propertie propertie = DomainFactory.eINSTANCE.createPropertie();
		propertie.setName("Font Size");
		if (increasing) {
			propertie.setValue("" + (fontSize + ((maxLevel - level) * intervalFontSize)));
		} else {
			propertie.setValue("" + (fontSize - ((level - 1) * intervalFontSize)));
		}
		characteristic.getListProperties().add(propertie);
	}

	public void createCharacteristic() {

		for (int i = 1; i <= maxLevel; i++) {
			Characteristic characteristic = searchCharacteristic("C" + i);
			if (characteristic == null) {
				characteristic = DomainFactory.eINSTANCE.createCharacteristic();
				characteristic.setName("C" + i);
				mfStyles.getTheDomainStyles().getTheCharacteristicFactory().getListCharacteristic().add(characteristic);
			} else {
				characteristic.getListProperties().clear();
			}
			addCharacteristicProperties(characteristic, i);
			Style style = searchStyle("Titulo " + i);
			style.setTheCharacteristic(characteristic);
		}
		modelFactoryModel.saveStylesModel();
		initLithographicStyle();
	}

	public void unPackExpression() {

		try {
			compile();

			String fullExpression = expressionContainer.createExpressionModel(expressionString, tokens, components,
					elementStyles);
			txtNormalExpression.setText(fullExpression);
			// txtEstilosComp.setText(styles);
		} catch (TokenMgrError te) {
			String error = "Error\n" + te.getMessage();
			txtConsole.setText(error);
		} catch (ParseException ex) {
			txtConsole.setText(analizadorLexico.getResultado());
		}
	}

	public void saveAsComponent() {
		try {
			compile();
			String nameComponent = JOptionPane.showInputDialog("Ingrese el nombre del componente");
			componentsContainer.createComponent(nameComponent, expressionString, tokens, elementStyles);
		} catch (TokenMgrError te) {
			String error = "Error\n" + te.getMessage();
			txtConsole.setText(error);
		} catch (ParseException ex) {
			txtConsole.setText(analizadorLexico.getResultado());
		}
	}

	public void compile() throws TokenMgrError, ParseException {

		EList<Component> listComponents = domainComponents.getShapes().getListComponents();

		componentsString = "";
		expressionString = txtNormalExpression.getText();
		expressionString = (expressionString.charAt(expressionString.length() - 1) == ';') ? expressionString
				: expressionString + ";";

		for (int j = 0; j < listComponents.size(); j++) {
			componentsString += listComponents.get(j).getName() + "="
					+ listComponents.get(j).getTheSentence().getFullSentence() + ";";
			components.put(listComponents.get(j).getName(), listComponents.get(j));
		}

		String texto = "";
		texto += "dI/" + componentsString + "/dF";
		texto += "eI/" + expressionString + "/eF";
		texto += "wI//wF";

		analizadorLexico = new AnalizadorLexico();
		InputStream stream = new ByteArrayInputStream(texto.getBytes(StandardCharsets.UTF_8));

		if (cont == 0) {
			cont++;
			analizadorLexico = new AnalizadorLexico(stream);
		} else {
			analizadorLexico.setResultado("");
			analizadorLexico.ReInit(stream);

		}

		analizadorLexico.Programa();
		txtConsole.setText(analizadorLexico.getResultado());
		String temp;
		SymbolTable temp2;
		Enumeration t = analizadorLexico.getSymbolTable().keys();
		tableResult.removeAll();

		while (t.hasMoreElements() == true) {

			temp = (String) t.nextElement();
			temp2 = (SymbolTable) analizadorLexico.getSymbolTable().get(temp);
			TableItem item = new TableItem(tableResult, SWT.NONE);
			item.setText(0, temp2.getValor());
			item.setText(1, temp2.getTipo());
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

	private void initLithographicStyle() {
		TreeLabelProviderBrowser labelProvider = new TreeLabelProviderBrowser();
		treeViewerLithographicStyle.setLabelProvider(labelProvider); // add for decorator and tooltip support
		adapterFactoryContentProvider = new AdapterFactoryContentProvider(getAdapterFactory());
		treeViewerLithographicStyle.setContentProvider(adapterFactoryContentProvider);
		treeViewerLithographicStyle.setInput(mfStyles.getTheDomainStyles());
		treeViewerLithographicStyle.remove(mfStyles.getTheDomainStyles().getTheCharacteristicFactory());
		treeViewerLithographicStyle.expandAll();
	}
	
	private void initDocumentStyle() {
		TreeLabelProviderBrowserDoc labelProvider = new TreeLabelProviderBrowserDoc();
		treeViewerDocumentStyle.setLabelProvider(labelProvider); // add for decorator and tooltip support
		adapterFactoryContentProvider = new AdapterFactoryContentProvider(getAdapterFactory());
		treeViewerDocumentStyle.setContentProvider(adapterFactoryContentProvider);
		treeViewerDocumentStyle.setInput(mfExpressions.getTheDomainCompilator().getTheExpression());
		treeViewerDocumentStyle.remove(mfExpressions.getTheDomainCompilator().getTheExpression().getTheSentence());
		treeViewerDocumentStyle.expandAll();
	}
	
	private void initLog() {
		TreeLabelProviderBrowserLog labelProvider = new TreeLabelProviderBrowserLog();
		treeViewerLog.setLabelProvider(labelProvider); // add for decorator and tooltip support
		adapterFactoryContentProvider = new AdapterFactoryContentProvider(getAdapterFactory());
		treeViewerLog.setContentProvider(adapterFactoryContentProvider);
		treeViewerLog.setInput(mfExpressions.getTheDomainCompilator());
		treeViewerLog.remove(mfExpressions.getTheDomainCompilator().getTheExpression());
		treeViewerLog.expandAll();
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
		composedAdapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		return composedAdapterFactory;
	}

	public void saveDF() {
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/domain/model.tooldataform");
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(mfToolDataform);
		try {
			resource.save(java.util.Collections.EMPTY_MAP);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeEditors() {
		IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		page.closeAllEditors(true);
	}
}