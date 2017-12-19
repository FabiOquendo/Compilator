/**
 */
package generator.gendataform;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;

import tooldataform.ModelFactory;

import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.Interface;
import tooldataform.formmodel.concreta.ModelElementDataForm;

import tooldataform.formmodel.containers.GraphicalContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Form Diagram Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generator.gendataform.DataFormDiagramGenerator#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link generator.gendataform.DataFormDiagramGenerator#getDataformDiagram <em>Dataform Diagram</em>}</li>
 *   <li>{@link generator.gendataform.DataFormDiagramGenerator#getInterface1 <em>Interface1</em>}</li>
 * </ul>
 *
 * @see generator.gendataform.GendataformPackage#getDataFormDiagramGenerator()
 * @model
 * @generated
 */
public interface DataFormDiagramGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Factory</em>' attribute.
	 * @see #setModelFactory(ModelFactory)
	 * @see generator.gendataform.GendataformPackage#getDataFormDiagramGenerator_ModelFactory()
	 * @model dataType="generator.datatypes.datatypesdataform.ModelFactory"
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * Sets the value of the '{@link generator.gendataform.DataFormDiagramGenerator#getModelFactory <em>Model Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Factory</em>' attribute.
	 * @see #getModelFactory()
	 * @generated
	 */
	void setModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Dataform Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataform Diagram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataform Diagram</em>' attribute.
	 * @see #setDataformDiagram(DataForm_Diagram)
	 * @see generator.gendataform.GendataformPackage#getDataFormDiagramGenerator_DataformDiagram()
	 * @model dataType="generator.datatypes.datatypesdataform.DataForm_Diagram"
	 * @generated
	 */
	DataForm_Diagram getDataformDiagram();

	/**
	 * Sets the value of the '{@link generator.gendataform.DataFormDiagramGenerator#getDataformDiagram <em>Dataform Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataform Diagram</em>' attribute.
	 * @see #getDataformDiagram()
	 * @generated
	 */
	void setDataformDiagram(DataForm_Diagram value);

	/**
	 * Returns the value of the '<em><b>Interface1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface1</em>' attribute.
	 * @see #setInterface1(Interface)
	 * @see generator.gendataform.GendataformPackage#getDataFormDiagramGenerator_Interface1()
	 * @model dataType="generator.datatypes.datatypesdataform.Interface"
	 * @generated
	 */
	Interface getInterface1();

	/**
	 * Sets the value of the '{@link generator.gendataform.DataFormDiagramGenerator#getInterface1 <em>Interface1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface1</em>' attribute.
	 * @see #getInterface1()
	 * @generated
	 */
	void setInterface1(Interface value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelFactoryDataType="generator.datatypes.datatypesdataform.ModelFactory"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.modelFactory = modelFactory;\r\nthis.dataformDiagram = (DataForm_Diagram) this.modelFactory.getListProyecto().get(0).getListDiagram().get(0);\r\nthis.interface1 = dataformDiagram.getTheInterface();'"
	 * @generated
	 */
	void DataformDiagramGenerator(ModelFactory modelFactory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model diagramDataType="generator.datatypes.datatypesgmf.Diagram"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/test/domain/model.tooldataform_diagram\");\r\n        org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n        org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n        resource.getContents().add(diagram);\r\n        try {\r\n            resource.save(java.util.Collections.EMPTY_MAP);\r\n        } catch (java.io.IOException e) {\r\n            e.printStackTrace();\r\n        }\r\n    '"
	 * @generated
	 */
	void salvarDiagram(Diagram diagram);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        \r\n        org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/test/domain/model.tooldataform\");\r\n        org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n        org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n        try {\r\n            resource.load(java.util.Collections.EMPTY_MAP);\r\n            modelFactory =  (ModelFactory) resource.getContents().get(0);\r\n        } catch (java.io.IOException e) {\r\n            // TO-DO Auto-generated catch block\r\n            e.printStackTrace();\r\n        }\r\n    '"
	 * @generated
	 */
	void cargarDiagram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n    \t\r\n    \ttry{\r\n\t    \torg.eclipse.ui.IWorkbench workbench = org.eclipse.ui.PlatformUI.getWorkbench();\r\n\t    \torg.eclipse.ui.IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();\r\n\t        activePage.closeEditors(activePage.getEditorReferences(), true);\r\n\t        org.apache.commons.io.FileUtils.touch(new java.io.File(path));\r\n\t        java.io.File fileToDelete = org.apache.commons.io.FileUtils.getFile(path);\r\n\t        org.apache.commons.io.FileUtils.deleteQuietly(fileToDelete);\r\n    \t} \r\n    \tcatch(java.io.IOException e){\r\n    \t\t e.printStackTrace();\r\n    \t}\r\n    '"
	 * @generated
	 */
	void resetDiagram(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        \r\n        Diagram diag = createDiagram();\r\n        salvarDiagram(diag);\r\n        openDiagram(diag);\r\n    '"
	 * @generated
	 */
	void generateDiagram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesgmf.Diagram"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='//create the diagram\r\nint diagramVID = tooldataform.diagram.part.MetamodelodataformVisualIDRegistry.\r\n\t\tgetDiagramVisualID(dataformDiagram);\r\nif (diagramVID != tooldataform.diagram.edit.parts.DataForm_DiagramEditPart.VISUAL_ID) {\r\n    // error\r\n}\r\nDiagram diagram = org.eclipse.gmf.runtime.diagram.core.services.ViewService.\r\n\t\tcreateDiagram(dataformDiagram,tooldataform.diagram.edit.parts.DataForm_DiagramEditPart.MODEL_ID,\r\n\t\t\t\ttooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);\r\n// save the ressource\r\ntry {\r\n    dataformDiagram.eResource().save(tooldataform.diagram.part.MetamodelodataformDiagramEditorUtil.\r\n    \t\tgetSaveOptions());\r\n} catch (java.io.IOException e) {\r\n\ttooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.getInstance().logError(\r\n            \"Save operation failed for: \" + dataformDiagram.eResource(), e); //$NON-NLS-1$\r\n}\r\n\t\r\nNode node = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().createNode( \r\n\t\tnew org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(interface1), diagram, null, 0, \r\n\t\ttrue,tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);\r\nBounds bounds = createBounds(interface1.getPositionX(),interface1.getPositionY(),\r\n        interface1.getWidth(),interface1.getHeight());\r\nnode.setLayoutConstraint(bounds);\r\n\r\nboolean flag = false;\r\nfor(int k = 1; k &lt; node.getPersistedChildren().size(); k++) {\r\n\tif(node.getPersistedChildren().get(k) instanceof org.eclipse.gmf.runtime.notation.impl.\r\n\t\t\tBasicCompartmentImpl) {\r\n\t\tif(!flag) {\r\n\t\t\tflag = true;\r\n\t\t\tcontinue;\r\n\t\t}\r\n\t\torg.eclipse.gmf.runtime.notation.impl.BasicCompartmentImpl bC = (org.eclipse.gmf.runtime.\r\n\t\t\t\tnotation.impl.BasicCompartmentImpl) node.getPersistedChildren().get(k);\r\n\t\tbC.setCollapsed(true);\r\n\t} \r\n}\r\ninitComponents(interface1, node);\r\ndiagram.setName(\"model.tooldataform_diagram\");\r\nreturn diagram;'"
	 * @generated
	 */
	Diagram createDiagram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model graphicalContainerDataType="generator.datatypes.datatypesdataform.GraphicalContainer" parentDataType="generator.datatypes.datatypesgmf.Node"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for (int i = 0; i &lt; graphicalContainer.getListGraphicalContainer().size(); i++) {\r\n\tGraphicalContainer gc = graphicalContainer.getListGraphicalContainer().get(i);\r\n\tNode node = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().createNode(\r\n\t\t\tnew org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(gc),\r\n\t\t\t(Node) parent.getPersistedChildren().get(1), null, i, true,\r\n\t\t\ttooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);\r\n\tBounds bounds = createBounds(gc.getPositionX(), gc.getPositionY(), gc.getWidth(), gc.getHeight());\r\n\tnode.setLayoutConstraint(bounds);\r\n\torg.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node\r\n\t\t\t.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);\r\n\tif (nodeFontStyle != null) {\r\n\t\tnodeFontStyle.setFontName(getFontDataformElement(gc));\r\n\t}\r\n\tnode.getStyles().add(nodeFontStyle);\r\n\tfor (int k = 0; k &lt; node.getPersistedChildren().size(); k++) {\r\n\t\tif (node.getPersistedChildren()\r\n\t\t\t\t.get(k) instanceof org.eclipse.gmf.runtime.notation.impl.BasicCompartmentImpl) {\r\n\t\t\torg.eclipse.gmf.runtime.notation.impl.BasicCompartmentImpl bC = (org.eclipse.gmf.runtime.notation.impl.BasicCompartmentImpl) node\r\n\t\t\t\t\t.getPersistedChildren().get(k);\r\n\t\t\tbC.setCollapsed(true);\r\n\t\t}\r\n\t}\r\n\tinitComponents(graphicalContainer.getListGraphicalContainer().get(i), node);\r\n}\r\n\r\nint size = graphicalContainer.getListGraphicalContainer().size();\r\nfor (int j = 0; j &lt; graphicalContainer.getListIndividualElementDataForm().size(); j++) {\r\n\ttooldataform.formmodel.concreta.GraphicalIndividualEement ie = graphicalContainer\r\n\t\t\t.getListIndividualElementDataForm().get(j);\r\n\tNode node = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().createNode(\r\n\t\t\tnew org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(ie),\r\n\t\t\t(Node) parent.getPersistedChildren().get(1), null, size + j, true,\r\n\t\t\ttooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);\r\n\tif (ie instanceof tooldataform.formmodel.concreta.TextView) {\r\n\r\n\t\torg.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node\r\n\t\t\t\t.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);\r\n\t\tif (nodeFontStyle != null) {\r\n\t\t\tnodeFontStyle.setFontName(getFontDataformElement(ie));\r\n\t\t\tnodeFontStyle.setFontHeight(getFontSizeDataformElement(ie) - 4);\r\n\t\t}\r\n\t\tnode.getStyles().add(nodeFontStyle);\r\n\t\tBounds bounds = createBounds(ie.getPositionX(), ie.getPositionY(), ie.getWidth() - 10, ie.getHeight());\r\n\t\tnode.setLayoutConstraint(bounds);\r\n\t} else {\r\n\t\torg.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node\r\n\t\t\t\t.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);\r\n\t\tif (nodeFontStyle != null) {\r\n\t\t\tnodeFontStyle.setFontName(getFontDataformElement(ie));\r\n\t\t\tnodeFontStyle.setFontHeight(getFontSizeDataformElement(ie));\r\n\t\t}\r\n\t\tnode.getStyles().add(nodeFontStyle);\r\n\t\tBounds bounds = createBounds(ie.getPositionX(), ie.getPositionY(), ie.getWidth(), ie.getHeight());\r\n\t\tnode.setLayoutConstraint(bounds);\r\n\t}\r\n}\r\n\r\nif (graphicalContainer instanceof tooldataform.formmodel.concreta.TableView) {\r\n\ttooldataform.formmodel.concreta.TableView table = (tooldataform.formmodel.concreta.TableView) graphicalContainer;\r\n\tfor (int j = 0; j &lt; table.getListColumView().size(); j++) {\r\n\t\ttooldataform.formmodel.concreta.ColumView column = (tooldataform.formmodel.concreta.ColumView) table\r\n\t\t\t\t.getListColumView().get(j);\r\n\t\tNode node = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().createNode(\r\n\t\t\t\tnew org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(column),\r\n\t\t\t\t(Node) parent.getPersistedChildren().get(1), null, size + j, true,\r\n\t\t\t\ttooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);\r\n\t\torg.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node\r\n\t\t\t\t.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);\r\n\t\tif (nodeFontStyle != null) {\r\n\t\t\tnodeFontStyle.setFontName(getFontDataformElement(column));\r\n\t\t\tnodeFontStyle.setFontHeight(getFontSizeDataformElement(column));\r\n\t\t}\r\n\t\tnode.getStyles().add(nodeFontStyle);\r\n\t}\r\n}'"
	 * @generated
	 */
	void initComponents(GraphicalContainer graphicalContainer, Node parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="generator.datatypes.datatypesgmf.Bounds"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        \r\n        Bounds bounds =  org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds();\r\n        bounds.setX(x);\r\n        bounds.setY(y);\r\n        bounds.setWidth(width);\r\n        bounds.setHeight(height);\r\n        return bounds;\r\n    '"
	 * @generated
	 */
	Bounds createBounds(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model diagDataType="generator.datatypes.datatypesgmf.Diagram"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        \r\n        //open the diagram\r\n        try {    \r\n            //open it\r\n            org.eclipse.emf.common.util.URI uri = org.eclipse.emf.ecore.util.EcoreUtil.getURI(diag);\r\n            org.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.getWorkbench()    .getActiveWorkbenchWindow().getActivePage();\r\n            page.openEditor(new org.eclipse.emf.common.ui.URIEditorInput(uri,dataformDiagram.getName()),  tooldataform.diagram.part.MetamodelodataformDiagramEditor.ID);\r\n            \r\n        } catch (org.eclipse.ui.PartInitException e) {\r\n        \ttooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.getInstance().logError(\r\n                    \"Unable to open editor\", e); //$NON-NLS-1$\r\n        }\r\n    '"
	 * @generated
	 */
	void openDiagram(Diagram diag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementDataType="generator.datatypes.datatypesdataform.ModelElementDataForm"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String font = \"Calibri\"; // Por defecto\r\nif (element instanceof GraphicalContainer) {\r\n\tGraphicalContainer graphicalContainer = (GraphicalContainer) element;\r\n\tEList&lt;tooldataform.styles.domain.Propertie&gt; listProperties = graphicalContainer.getTheStyle().getTheCharacteristic()\r\n\t\t\t.getListProperties();\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tif (listProperties.get(i).getName().equals(\"Font Type\"))\r\n\t\t\tfont = listProperties.get(i).getValue();\r\n\t}\r\n} else if (element instanceof tooldataform.formmodel.concreta.GraphicalIndividualEement) {\r\n\ttooldataform.formmodel.concreta.GraphicalIndividualEement individualElement = \r\n\t\t\t(tooldataform.formmodel.concreta.GraphicalIndividualEement) element;\r\n\tEList&lt;tooldataform.styles.domain.Propertie&gt; listProperties = individualElement.getTheStyle().getTheCharacteristic()\r\n\t\t\t.getListProperties();\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tif (listProperties.get(i).getName().equals(\"Font Type\"))\r\n\t\t\tfont = listProperties.get(i).getValue();\r\n\t}\r\n}\r\nreturn font;'"
	 * @generated
	 */
	String getFontDataformElement(ModelElementDataForm element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementDataType="generator.datatypes.datatypesdataform.ModelElementDataForm"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int fontSize = 12; // Por defecto\r\nif (element instanceof GraphicalContainer) {\r\n\tGraphicalContainer graphicalContainer = (GraphicalContainer) element;\r\n\tEList&lt;tooldataform.styles.domain.Propertie&gt; listProperties = graphicalContainer.getTheStyle().getTheCharacteristic()\r\n\t\t\t.getListProperties();\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tif (listProperties.get(i).getName().equals(\"Font Size\"))\r\n\t\t\tfontSize = Integer.parseInt(listProperties.get(i).getValue());\r\n\t}\r\n} else if (element instanceof tooldataform.formmodel.concreta.GraphicalIndividualEement) {\r\n\ttooldataform.formmodel.concreta.GraphicalIndividualEement individualElement = \r\n\t\t\t(tooldataform.formmodel.concreta.GraphicalIndividualEement) element;\r\n\tEList&lt;tooldataform.styles.domain.Propertie&gt; listProperties = individualElement.getTheStyle().getTheCharacteristic()\r\n\t\t\t.getListProperties();\r\n\tfor (int i = 0; i &lt; listProperties.size(); i++) {\r\n\t\tif (listProperties.get(i).getName().equals(\"Font Size\"))\r\n\t\t\tfontSize = Integer.parseInt(listProperties.get(i).getValue());\r\n\t}\r\n}\r\nreturn fontSize;'"
	 * @generated
	 */
	Integer getFontSizeDataformElement(ModelElementDataForm element);

} // DataFormDiagramGenerator
