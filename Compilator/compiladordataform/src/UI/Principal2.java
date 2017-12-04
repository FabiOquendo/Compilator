package UI;

import java.util.TreeMap;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;

import Logica.StringTools;

import styles.domain.Characteristic;
import styles.domain.DomainFactory;
import styles.domain.Propertie;

import tooldataform.formmodel.containers.GraphicalContainer;

import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.ScrolledComposite;

import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;

import org.eclipse.wb.swt.ResourceManager;

public class Principal2 extends ViewPart {

	public static final String ID = "UI.Principal"; //$NON-NLS-1$
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	
	private Text txtNormalExpression;
	private Text txtExpandedExpression;
	private Text txtConsole;
	private Table tableResult;

	public TreeMap<String, styles.domain.Style> styles;
	public TreeMap<String, styles.domain.Style> elementStyles;

	private TreeViewer treeViewerDocumentStyle;
	private TreeViewer treeViewerLithographicStyle;
	private TreeViewer treeViewerCharacteristics;
	private TreeViewer treeViewerComponents;
	private TreeViewer treeViewerPatterns;
	private TreeViewer treeViewerLog;
	
	private ComposedAdapterFactory composedAdapterFactory;
	
	private IStructuredSelection selection;
	
	private StringTools stringTool;
	
	private int fontSize;
	private int intervalFontSize;
	private int maxLevel;
	
	private boolean increasing;
	
	public Principal2() {
		
		stringTool = new StringTools();
		elementStyles = new TreeMap<String, styles.domain.Style>();
		
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
		
		//////////////////////////////////////////////////////////////////////////////////
		//GRUPO ESTILOS
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
						if(selection==null)return;
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
						if(selection==null)return;
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
						if(selection==null)return;
					}
				});
				
		
		//////////////////////////////////////////////////////////////////////////////////
		//GRUPO TEXTO EXPRESION
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
		
				txtNormalExpression = toolkit.createText(grpNormalExpression, "New Text", SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
				txtNormalExpression.setText("");
				txtNormalExpression.setBounds(10, 30, 750, 100);
			
			Group grpExpandedExpression = new Group(grpExpression, SWT.NONE);
			grpExpandedExpression.setFont(SWTResourceManager.getFont("Yu Gothic UI Semibold", 12, SWT.NORMAL));
			grpExpandedExpression.setText("Expresi\u00F3n Expandida");
			grpExpandedExpression.setBounds(10, 210, 770, 190);
			toolkit.adapt(grpExpandedExpression);
			toolkit.paintBordersFor(grpExpandedExpression);
		
				txtExpandedExpression = toolkit.createText(grpExpandedExpression, "New Text", SWT.H_SCROLL | SWT.V_SCROLL | SWT.CANCEL);
				txtExpandedExpression.setText("");
				txtExpandedExpression.setBounds(10, 30, 750, 150);
			
			Button btnContract = toolkit.createButton(grpExpression, "", SWT.NONE);
			btnContract.setImage(ResourceManager.getPluginImage("compiladordataform", "icons/up2.png"));
			btnContract.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
			btnContract.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					//TODO 
				}
			});
			btnContract.setBounds(10, 160, 60, 40);
			
			Button btnExpand = toolkit.createButton(grpExpression, "", SWT.NONE);
			btnExpand.setImage(ResourceManager.getPluginImage("compiladordataform", "icons/down2.png"));
			btnExpand.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
			btnExpand.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					//TODO 
				}
			});
			btnExpand.setBounds(90, 160, 60, 40);
			
		
		//////////////////////////////////////////////////////////////////////////////////
		//GRUPO PATRONES Y COMPONENTES
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
						if(selection==null)return;
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
						if(selection==null)return;
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
						if(selection==null)return;
					}
				});

			Button btnSaveLog = toolkit.createButton(group, "", SWT.NONE);
			btnSaveLog.setImage(ResourceManager.getPluginImage("compiladordataform", "icons/up2.png"));
			btnSaveLog.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
			btnSaveLog.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					//TODO 
				}
			});
			btnSaveLog.setBounds(130, 440, 60, 40);

			
		//////////////////////////////////////////////////////////////////////////////////
		//GRUPO RESULTADO
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
		//BOTONES DEL CONTENEDOR
		//////////////////////////////////////////////////////////////////////////////////	
				
		Button btnUp = toolkit.createButton(container, "", SWT.NONE);
		btnUp.setImage(ResourceManager.getPluginImage("compiladordataform", "icons/up2.png"));
		btnUp.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO 
			}
		});
		btnUp.setBounds(115, 290, 60, 40);
		
		Button btnRight = toolkit.createButton(container, "", SWT.NONE);
		btnRight.setImage(ResourceManager.getPluginImage("compiladordataform", "icons/right2.png"));
		btnRight.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnRight.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO 
			}
		});
		btnRight.setBounds(810, 500, 40, 60);	
		
		Button btnGenerateModel = new Button(container, SWT.NONE);
		btnGenerateModel.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnGenerateModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO 
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
				//TODO 
			}
		});
		btnGenerateGenModel.setBounds(299, 758, 200, 30);									
				
		Button btnSaveComponent = toolkit.createButton(container, "Guardar Componente", SWT.NONE);
		btnSaveComponent.setFont(SWTResourceManager.getFont("Yu Gothic UI Light", 12, SWT.NORMAL));
		btnSaveComponent.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO 
			}
		});	
		btnSaveComponent.setBounds(600, 758, 200, 30);


		scrolledComposite.setContent(container);
		scrolledComposite.setMinSize(container.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		getSite().registerContextMenu(hookContextMenuCharacteristics(), treeViewerCharacteristics);
		getSite().registerContextMenu(hookContextMenuStyles(), treeViewerLithographicStyle);
		getSite().registerContextMenu(hookContextMenuComponents(), treeViewerCharacteristics);

		createActions();
	}

	
	public MenuManager hookContextMenuCharacteristics() {
		MenuManager menuMgr = new MenuManager("MenuPrincipal");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewerCharacteristics.getControl());
		treeViewerCharacteristics.getControl().setMenu(menu);
		return menuMgr;

	}

	
	public MenuManager hookContextMenuStyles() {
		MenuManager menuMgr = new MenuManager("MenuPrincipalStyle");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				createChildMenuStyles(menuMgr);
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewerLithographicStyle.getControl());
		treeViewerLithographicStyle.getControl().setMenu(menu);
		return menuMgr;

	}
	
	public void createChildMenuStyles(MenuManager menuMgr) {

		MenuManager childMenu = new MenuManager("Nuevo"); 
		menuMgr.add(childMenu);
		menuMgr.add(new Separator("adittions"));	
		
		
	}

	public MenuManager hookContextMenuComponents() {
		MenuManager menuMgr = new MenuManager("MenuPrincipalComponents");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewerComponents.getControl());
		treeViewerComponents.getControl().setMenu(menu);
		return menuMgr;

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

	protected AdapterFactory getAdapterFactory() {
		composedAdapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		return composedAdapterFactory;
	}
}