/**
 */
package styles;

import org.eclipse.emf.ecore.EObject;

import styles.domain.Domain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory Styles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link styles.ModelFactoryStyles#getTheDomainStyles <em>The Domain Styles</em>}</li>
 * </ul>
 *
 * @see styles.StylesPackage#getModelFactoryStyles()
 * @model
 * @generated
 */
public interface ModelFactoryStyles extends EObject {
	/**
	 * Returns the value of the '<em><b>The Domain Styles</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link styles.domain.Domain#getModelFactoryStyles <em>Model Factory Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain Styles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain Styles</em>' containment reference.
	 * @see #setTheDomainStyles(Domain)
	 * @see styles.StylesPackage#getModelFactoryStyles_TheDomainStyles()
	 * @see styles.domain.Domain#getModelFactoryStyles
	 * @model opposite="ModelFactoryStyles" containment="true" required="true"
	 * @generated
	 */
	Domain getTheDomainStyles();

	/**
	 * Sets the value of the '{@link styles.ModelFactoryStyles#getTheDomainStyles <em>The Domain Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain Styles</em>' containment reference.
	 * @see #getTheDomainStyles()
	 * @generated
	 */
	void setTheDomainStyles(Domain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactoryStyles modelFactory = null;\r\n\r\norg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/test/model/styles.styles\");\r\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\ntry {\r\n\tresource.load(java.util.Collections.EMPTY_MAP);\r\n\tmodelFactory = (ModelFactoryStyles) resource.getContents().get(0);\r\n} catch (java.io.IOException e) {\r\n\t// TO-DO Auto-generated catch block\r\n\te.printStackTrace();\r\n}\r\nreturn modelFactory;'"
	 * @generated
	 */
	ModelFactoryStyles load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='ModelFactoryStyles modelFactory = this;\r\n\r\norg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/test/model/styles.styles\");\r\norg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\norg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\nresource.getContents().add(modelFactory);\r\ntry {\r\n\tresource.save(java.util.Collections.EMPTY_MAP);\r\n} catch (java.io.IOException e) {\r\n\t// TO-DO Auto-generated catch block\r\n\te.printStackTrace();\r\n}'"
	 * @generated
	 */
	void save();

} // ModelFactoryStyles
