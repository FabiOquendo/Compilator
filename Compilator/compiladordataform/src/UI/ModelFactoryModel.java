package UI;

import java.util.Observable;

import compilator.CompilatorFactory;
import compilator.ModelFactory;
import styles.ModelFactoryStyles;
import styles.StylesFactory;

public class ModelFactoryModel extends Observable{

	private static final String extensionID = "org.uniquindio.sinfoci.tool.browser.ui.modelelement";
	private static final String PLUGIN_ID = "org.uniquindio.sinfoci.tool.browser.ui";

	//------------------------------  Singleton ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aqu� al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// M�todo para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	//------------------------------  Singleton ------------------------------------------------
	ModelFactory mfExpressions = CompilatorFactory.eINSTANCE.createModelFactory();
	
	ModelFactory mfComponents = CompilatorFactory.eINSTANCE.createModelFactory();
	
	ModelFactoryStyles mfStyles = StylesFactory.eINSTANCE.createModelFactoryStyles();
	
	
	//__________________________________________

	public ModelFactoryModel() {
		//obtiene la ruta del rumtime
		String url = org.eclipse.core.runtime.Platform.getInstanceLocation().getURL().getPath();
		// TODO Auto-generated constructor stub
		mfExpressions = loadExpressionsModel();
		mfComponents = loadComponentsModel();		
		mfStyles = loadStylesModel();
		
//		Resource eResource = modelFactoryBrowser.eResource();
//		ResourceSet resourceSet = eResource.getResourceSet();
//
//		transactionalEditingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
//
//		if ( modelFactoryBrowser == null ){
//			modelFactoryBrowser = tempModelFactory;
//		}
	}

	public ModelFactoryStyles loadStylesModel() {
		return mfStyles.load();
	}
	
	public void saveStylesModel() {
		mfStyles.save();
	}
	
	public ModelFactory loadExpressionsModel() {
		return mfExpressions.loadExpression();
	}
	
	public void saveExpressionsModel() {
		mfExpressions.saveExpression();
	}
	
	public ModelFactory loadComponentsModel() {
		return mfComponents.loadComponents();
	}
	
	public void saveComponentsModel() {
		mfComponents.saveComponents();
	}

	public ModelFactory getMfExpressions() {
		return mfExpressions;
	}

	public void setMfExpressions(ModelFactory mfExpressions) {
		this.mfExpressions = mfExpressions;
	}

	public ModelFactory getMfComponents() {
		return mfComponents;
	}

	public void setMfComponents(ModelFactory mfComponents) {
		this.mfComponents = mfComponents;
	}

	public ModelFactoryStyles getMfStyles() {
		return mfStyles;
	}

	public void setMfStyles(ModelFactoryStyles mfStyles) {
		this.mfStyles = mfStyles;
	}

//	private String getPathBrowser() {
//		// TODO Auto-generated method stub
//		String path = "platform:/resource/"+getNombreProyecto()+"/model/browser.diagramclass";
//		return path;
//	}


//		public ModelFactory cargarBrowserModel() {
//			// TODO Auto-generated method stub
//	
//			ModelFactory modelFactory = null;
//	
//			org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
//			transactionalEditingDomain = TransactionalEditingDomain.Factory.INSTANCE
//					.createEditingDomain(resourceSet);
//			//EXISTEN 3 FORMAS DE CARGAR EL RECURSOtest\model\
//	
//			//1. CON LA SIGUIENTE RUTA (platform:/resource) SE CARGAR EL RECURSO CUANDO SE HACE UNA NUEVA INSTANCIA DE ECLIPSE, EN DONDE SE CREA UN PROYECTO(test)
//			//QUE CONTIENE LAS PRODUCCIONES, DONDE SE ESPECIFICA QUE RECURSO CARGAR
//			
//			//"platform:/resource/test/model/browser.diagramclass"
//			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(getPathBrowser());
//	
//			//2.CON LA SIGUIENTE RUTA (platform:/plugin/) SE CARGAR EL RECURSO DE ALGUNOS DE LOS PLUGINS(whoownme.model) EN LOS QUE SE ESTA TRABJANDO EN EL WORKSPACE
//			//org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/plugin/whoownme.model/resource/model.whoownme");
//	
//			//3. CON LA SIGUIENTE RUTA (file:\\E:\\) SE CARGA EL RECURSO INDICANDO UNA RUTA DESDE EL DIRECTORIO DE ARCHIVOS DE WIMDOWS
//			//org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("file:\\E:\\varios\\td\\whoownme\\whoownme\\whoownme.model\\resource\\model.whoownme");
//	
//			org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
//	
//			try {
//				resource.load(null);
//				modelFactory = (ModelFactory)resource.getContents().get(0);
//				System.out.println("loaded: " + modelFactory);
//			}
//			catch (java.io.IOException e) {
//				System.out.println("failed to read " + uri); 		
//				System.out.println(e);
//			}
//			return modelFactory;
//		}

//		public void salvarBrowserModel() {
//	
//			ModelFactory modelFactory = getModelFactoryBrowser();
//	
//	
//			//EXISTEN 2 FORMAS DE GUARDAR EL RECURSO
//	
//			//1. SE GUARDA EN LA INSTACIA DE ECLIPSE DONDE SE VE LA PRODUCCION.
//			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(getPathBrowser());
//	
//			//2. SE INDICA LA RUTA POR MEDIO DEL DIRECTORIO DE ARCHIVOS DE WIMDOWS
//			//		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI( "file:/E:/varios/td/whoownme/whoownme/whoownme.model/resource/model.whoownme");
//	
//			org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
//	
//			org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
//	
//			final CommandStack commandStack = transactionalEditingDomain.getCommandStack();
//			commandStack.execute(new RecordingCommand(transactionalEditingDomain) {
//	
//				@Override
//				protected void doExecute() {
//					//Save DiagramDialog at proper position
//					resource.getContents().add(modelFactory);
//					try {
//						resource.save(java.util.Collections.EMPTY_MAP);
//					} catch (java.io.IOException e) {
//						// TO-DO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			});
//			return;
//		}

//	public String obtenerRutaDiagramas(){
//		//obtener el nombre del proyecto y la ruta de los digramas
//		String path = "";
//		path="platform:/resource/"+getNombreProyecto()+"/diagramas/";
//		return path;
//	}

//	public String getNombreProyecto() {
//		//cambiar por el nombre del proyecto
//		String nameProject = "test";
//		return nameProject;
//
//		// hay obtener el nombre del proyecto se debe crear un properties en donde se guarde la 
//		//informacion del proyecto
//	}

//	public org.eclipse.emf.ecore.resource.Resource getResourceDiagram(String path){
//		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(path);
//		org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
//		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
//		try {
//			resource.load(java.util.Collections.EMPTY_MAP);
//
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return resource;
//	}
//	public  String getIdElement() {
//		String id= EcoreUtil.generateUUID();
//		return id;
//	}
}
