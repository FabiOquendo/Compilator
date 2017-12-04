/**
 */
package compilator.domain.generator;

import compilator.domain.expression.expressionmodel.containercomponent.Container;

import compilator.domain.shapes.Component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Model Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.generator.ComponentModelGenerator#getExpressionManager <em>Expression Manager</em>}</li>
 * </ul>
 *
 * @see compilator.domain.generator.GeneratorPackage#getComponentModelGenerator()
 * @model
 * @generated
 */
public interface ComponentModelGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression Manager</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.generator.ExpressionModelManager#getComponentGenerator <em>Component Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Manager</em>' reference.
	 * @see #setExpressionManager(ExpressionModelManager)
	 * @see compilator.domain.generator.GeneratorPackage#getComponentModelGenerator_ExpressionManager()
	 * @see compilator.domain.generator.ExpressionModelManager#getComponentGenerator
	 * @model opposite="componentGenerator" required="true"
	 * @generated
	 */
	ExpressionModelManager getExpressionManager();

	/**
	 * Sets the value of the '{@link compilator.domain.generator.ComponentModelGenerator#getExpressionManager <em>Expression Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Manager</em>' reference.
	 * @see #getExpressionManager()
	 * @generated
	 */
	void setExpressionManager(ExpressionModelManager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.lang.Object [] elements = expressionManager.split(s).toArray();\r\n\t\t\r\n\t\tfor(int i=0;i&lt;elements.length;i++){\r\n\t\t\tString textElement =  (String)elements[i];\r\n\t\t\t\t\r\n\t\t\tif(expressionManager.isContainer(textElement)){\r\n\t\t\t\t\r\n\t\t\t\tcompilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();\r\n\t\t\t\tString body = expressionManager.createContainer(textElement,container);\r\n\t\t\t\texploreSentence(body,container);\r\n\t\t\t\tparent.getListElements().add(container);\r\n\t\t\t\r\n\t\t\t}else{\r\n\t\t\t\tparent.getListElements().add(expressionManager.createIndividualElement(textElement));\r\n\t\t\t}\r\n\t\t}'"
	 * @generated
	 */
	void exploreSentence(String s, Container parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tcompilator.domain.shapes.Component component = compilator.domain.shapes.ShapesFactory.eINSTANCE.createComponent();\r\n\t\tcomponent.setName(nameComponent);\r\n\t\t\r\n\t\tcompilator.domain.expression.sentence.Sentence sentence = compilator.domain.expression.sentence.SentenceFactory.eINSTANCE.createSentence();\r\n\t\tsentence.setFullSentence(unformatedSentence);\r\n\t\tcomponent.setTheSentence(sentence);\r\n\t\tjava.lang.Object [] elements = expressionManager.split(formatedSentence).toArray();\r\n\t\t\r\n\t\tfor(int i=0;i&lt;elements.length;i++){\r\n\t\t\t\r\n\t\t\tString textElement = (String) elements[i];\r\n\t\t\t\r\n\t\t\tif(expressionManager.isContainer(textElement)){\r\n\t\t\t\t\r\n\t\t\t\tcompilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();\r\n\t\t\t\r\n\t\t\t\tString body = expressionManager.createContainer(textElement,container);\r\n\t\t\t\t\r\n\t\t\t\texploreSentence(body,container);\r\n\t\t\t\tcomponent.setTheElement(container);\r\n\t\t\t}else{\r\n\t\t\t\tcomponent.setTheElement(expressionManager.createIndividualElement(textElement));\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn component;'"
	 * @generated
	 */
	Component createComponent(String nameComponent, String formatedSentence, String unformatedSentence);

} // ComponentModelGenerator
