/**
 */
package compilator.domain;

import compilator.ModelFactory;

import compilator.domain.expression.Expression;

import compilator.domain.shapes.Shapes;

import compilator.ui.UI;

import java.util.TreeMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.Domain#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link compilator.domain.Domain#getTheUI <em>The UI</em>}</li>
 *   <li>{@link compilator.domain.Domain#getListExpression <em>List Expression</em>}</li>
 *   <li>{@link compilator.domain.Domain#getTheExpression <em>The Expression</em>}</li>
 *   <li>{@link compilator.domain.Domain#getShapes <em>Shapes</em>}</li>
 * </ul>
 *
 * @see compilator.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link compilator.ModelFactory#getTheDomainCompilator <em>The Domain Compilator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see compilator.domain.DomainPackage#getDomain_TheModelFactory()
	 * @see compilator.ModelFactory#getTheDomainCompilator
	 * @model opposite="theDomainCompilator"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link compilator.domain.Domain#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>The UI</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link compilator.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' reference.
	 * @see #setTheUI(UI)
	 * @see compilator.domain.DomainPackage#getDomain_TheUI()
	 * @see compilator.ui.UI#getTheDomain
	 * @model opposite="theDomain" required="true"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link compilator.domain.Domain#getTheUI <em>The UI</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * Returns the value of the '<em><b>List Expression</b></em>' containment reference list.
	 * The list contents are of type {@link compilator.domain.expression.Expression}.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.Expression#getTheDomainContainer <em>The Domain Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Expression</em>' containment reference list.
	 * @see compilator.domain.DomainPackage#getDomain_ListExpression()
	 * @see compilator.domain.expression.Expression#getTheDomainContainer
	 * @model opposite="theDomainContainer" containment="true"
	 * @generated
	 */
	EList<Expression> getListExpression();

	/**
	 * Returns the value of the '<em><b>The Expression</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.expression.Expression#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Expression</em>' containment reference.
	 * @see #setTheExpression(Expression)
	 * @see compilator.domain.DomainPackage#getDomain_TheExpression()
	 * @see compilator.domain.expression.Expression#getTheDomain
	 * @model opposite="theDomain" containment="true" required="true"
	 * @generated
	 */
	Expression getTheExpression();

	/**
	 * Sets the value of the '{@link compilator.domain.Domain#getTheExpression <em>The Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Expression</em>' containment reference.
	 * @see #getTheExpression()
	 * @generated
	 */
	void setTheExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Shapes</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link compilator.domain.shapes.Shapes#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shapes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes</em>' containment reference.
	 * @see #setShapes(Shapes)
	 * @see compilator.domain.DomainPackage#getDomain_Shapes()
	 * @see compilator.domain.shapes.Shapes#getDomain
	 * @model opposite="Domain" containment="true" required="true"
	 * @generated
	 */
	Shapes getShapes();

	/**
	 * Sets the value of the '{@link compilator.domain.Domain#getShapes <em>Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shapes</em>' containment reference.
	 * @see #getShapes()
	 * @generated
	 */
	void setShapes(Shapes value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="compilator.domain.datatypes.util.TreeMap" elementStyleDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='compilator.domain.generator.ExpressionModelManager emg = compilator.domain.generator.GeneratorFactory.eINSTANCE.createExpressionModelManager();\r\nemg.setTokens(tokens);\r\nemg.setElementStyle(elementStyle);\r\n\r\ncompilator.domain.generator.ComponentModelGenerator componentGenerator = compilator.domain.generator.GeneratorFactory.eINSTANCE.createComponentModelGenerator();\r\n\r\ncomponentGenerator.setExpressionManager(emg);\r\n\r\ncompilator.domain.shapes.Component c = componentGenerator.createComponent(nameComponent, expressionString, expressionString);\r\ngetShapes().getListComponents().add(c);\r\ngetTheModelFactory().saveComponents();\r\n'"
	 * @generated
	 */
	void createComponent(String nameComponent, String expressionString, TreeMap tokens, TreeMap elementStyle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="compilator.domain.datatypes.util.TreeMap" componentsDataType="compilator.domain.datatypes.util.TreeMap" elementStylesDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='compilator.domain.generator.ExpressionModelManager emg = compilator.domain.generator.GeneratorFactory.eINSTANCE.createExpressionModelManager();\r\nemg.setTokens(tokens);\r\nemg.setElementStyle(elementStyles);\t\t\t\t\r\n\r\ncompilator.domain.generator.ExpressionModelGenerator generator = compilator.domain.generator.GeneratorFactory.eINSTANCE.createExpressionModelGenerator();\r\ngenerator.setComponents(components);\r\ngenerator.setExpressionManager(emg);\r\n\r\ncompilator.domain.expression.Expression  ex = generator.createExpressionModel(expressionString, expressionString);\r\n\r\n\r\nString unpackedString = generator.unpackStringExpression(ex.getTheExpressionModel());\r\nString textStyles = generator.getTextComponentsStyles(elementStyles);\r\n\r\nex.getTheSentence().setFullSentence(unpackedString);\r\nex.getTheSentence().setTextStyles(textStyles);\r\n\r\nsetTheExpression(ex);\r\ngetTheModelFactory().saveExpression();\r\nreturn unpackedString;'"
	 * @generated
	 */
	String createExpressionModel(String expressionString, TreeMap tokens, TreeMap components, TreeMap elementStyles);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return getTheExpression().getTheSentence().getTextStyles();'"
	 * @generated
	 */
	String unPackStyles();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tokensDataType="compilator.domain.datatypes.util.TreeMap" componentsDataType="compilator.domain.datatypes.util.TreeMap" elementStylesDataType="compilator.domain.datatypes.util.TreeMap"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='compilator.domain.generator.ExpressionModelManager emg = compilator.domain.generator.GeneratorFactory.eINSTANCE.createExpressionModelManager();\r\nemg.setTokens(tokens);\r\nemg.setElementStyle(elementStyles);\t\t\t\t\r\n\r\ncompilator.domain.generator.ExpressionModelGenerator generator = compilator.domain.generator.GeneratorFactory.eINSTANCE.createExpressionModelGenerator();\r\ngenerator.setComponents(components);\r\ngenerator.setExpressionManager(emg);\r\n\r\ncompilator.domain.expression.Expression  ex = generator.createEModelFromUnpackedExpression(formatedString);\t\r\nif(ex==null) return false;\r\n\r\nex.getTheSentence().setFullSentence(formatedString);\r\n\r\nsetTheExpression(ex);\r\ngetTheModelFactory().saveExpression();\r\n\r\nreturn true;'"
	 * @generated
	 */
	boolean createEModelFromUnpackedExpression(String formatedString, TreeMap tokens, TreeMap components, TreeMap elementStyles);

} // Domain
