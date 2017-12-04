/**
 */
package compilator;

import compilator.domain.Domain;

import compilator.ui.UI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.ModelFactory#getTheDomainCompilator <em>The Domain Compilator</em>}</li>
 *   <li>{@link compilator.ModelFactory#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @see compilator.CompilatorPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>The Domain Compilator</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain Compilator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain Compilator</em>' containment reference.
	 * @see #setTheDomainCompilator(Domain)
	 * @see compilator.CompilatorPackage#getModelFactory_TheDomainCompilator()
	 * @see compilator.domain.Domain#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true" required="true"
	 * @generated
	 */
	Domain getTheDomainCompilator();

	/**
	 * Sets the value of the '{@link compilator.ModelFactory#getTheDomainCompilator <em>The Domain Compilator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain Compilator</em>' containment reference.
	 * @see #getTheDomainCompilator()
	 * @generated
	 */
	void setTheDomainCompilator(Domain value);

	/**
	 * Returns the value of the '<em><b>The UI</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.UI#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' containment reference.
	 * @see #setTheUI(UI)
	 * @see compilator.CompilatorPackage#getModelFactory_TheUI()
	 * @see compilator.ui.UI#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true" required="true"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link compilator.ModelFactory#getTheUI <em>The UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' containment reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactory modelFactory = null;\r\norg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/test/model/expression.compilator\");\r\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\ntry {\r\n\tresource.load(java.util.Collections.EMPTY_MAP);\r\n\tmodelFactory = (ModelFactory) resource.getContents().get(0);\r\n} catch (java.io.IOException e) {\r\n\t// TO-DO Auto-generated catch block\r\n\te.printStackTrace();\r\n}\r\nreturn modelFactory;'"
	 * @generated
	 */
	ModelFactory loadExpression();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactory modelFactory = this;\r\n\r\norg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/test/model/expression.compilator\");\r\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\nresource.getContents().add(modelFactory);\r\ntry {\r\n\tresource.save(java.util.Collections.EMPTY_MAP);\r\n} catch (java.io.IOException e) {\r\n\t// TO-DO Auto-generated catch block\r\n\te.printStackTrace();\r\n}'"
	 * @generated
	 */
	void saveExpression();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactory modelFactory = null;\r\n\r\norg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/test/model/components.compilator\");\r\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\ntry {\r\n\tresource.load(java.util.Collections.EMPTY_MAP);\r\n\tmodelFactory = (ModelFactory) resource.getContents().get(0);\r\n} catch (java.io.IOException e) {\r\n\t// TO-DO Auto-generated catch block\r\n\te.printStackTrace();\r\n}\r\n\r\nreturn modelFactory;'"
	 * @generated
	 */
	ModelFactory loadComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactory modelFactory = this;\r\n\r\norg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/test/model/components.compilator\");\r\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\nresource.getContents().add(modelFactory);\r\ntry {\r\n\tresource.save(java.util.Collections.EMPTY_MAP);\r\n} catch (java.io.IOException e) {\r\n\t// TO-DO Auto-generated catch block\r\n\te.printStackTrace();\r\n}'"
	 * @generated
	 */
	void saveComponents();

} // ModelFactory
