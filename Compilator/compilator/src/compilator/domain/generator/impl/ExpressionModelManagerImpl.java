/**
 */
package compilator.domain.generator.impl;

import compilator.domain.expression.expressionmodel.Element;

import compilator.domain.expression.expressionmodel.individualcomponent.Table;

import compilator.domain.generator.ComponentModelGenerator;
import compilator.domain.generator.ExpressionModelGenerator;
import compilator.domain.generator.ExpressionModelManager;
import compilator.domain.generator.GeneratorPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import styles.domain.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Model Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.generator.impl.ExpressionModelManagerImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link compilator.domain.generator.impl.ExpressionModelManagerImpl#getBody <em>Body</em>}</li>
 *   <li>{@link compilator.domain.generator.impl.ExpressionModelManagerImpl#getElementStyle <em>Element Style</em>}</li>
 *   <li>{@link compilator.domain.generator.impl.ExpressionModelManagerImpl#getExpressionGenerator <em>Expression Generator</em>}</li>
 *   <li>{@link compilator.domain.generator.impl.ExpressionModelManagerImpl#getComponentGenerator <em>Component Generator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionModelManagerImpl extends MinimalEObjectImpl.Container implements ExpressionModelManager {
	/**
	 * The default value of the '{@link #getTokens() <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected static final TreeMap TOKENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected TreeMap tokens = TOKENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementStyle() <em>Element Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementStyle()
	 * @generated
	 * @ordered
	 */
	protected static final TreeMap ELEMENT_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementStyle() <em>Element Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementStyle()
	 * @generated
	 * @ordered
	 */
	protected TreeMap elementStyle = ELEMENT_STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressionGenerator() <em>Expression Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionGenerator()
	 * @generated
	 * @ordered
	 */
	protected ExpressionModelGenerator expressionGenerator;

	/**
	 * The cached value of the '{@link #getComponentGenerator() <em>Component Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentGenerator()
	 * @generated
	 * @ordered
	 */
	protected ComponentModelGenerator componentGenerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionModelManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.EXPRESSION_MODEL_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeMap getTokens() {
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokens(TreeMap newTokens) {
		TreeMap oldTokens = tokens;
		tokens = newTokens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_MANAGER__TOKENS, oldTokens, tokens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_MANAGER__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeMap getElementStyle() {
		return elementStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementStyle(TreeMap newElementStyle) {
		TreeMap oldElementStyle = elementStyle;
		elementStyle = newElementStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_MANAGER__ELEMENT_STYLE, oldElementStyle, elementStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModelGenerator getExpressionGenerator() {
		if (expressionGenerator != null && expressionGenerator.eIsProxy()) {
			InternalEObject oldExpressionGenerator = (InternalEObject)expressionGenerator;
			expressionGenerator = (ExpressionModelGenerator)eResolveProxy(oldExpressionGenerator);
			if (expressionGenerator != oldExpressionGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR, oldExpressionGenerator, expressionGenerator));
			}
		}
		return expressionGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModelGenerator basicGetExpressionGenerator() {
		return expressionGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionGenerator(ExpressionModelGenerator newExpressionGenerator, NotificationChain msgs) {
		ExpressionModelGenerator oldExpressionGenerator = expressionGenerator;
		expressionGenerator = newExpressionGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR, oldExpressionGenerator, newExpressionGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionGenerator(ExpressionModelGenerator newExpressionGenerator) {
		if (newExpressionGenerator != expressionGenerator) {
			NotificationChain msgs = null;
			if (expressionGenerator != null)
				msgs = ((InternalEObject)expressionGenerator).eInverseRemove(this, GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER, ExpressionModelGenerator.class, msgs);
			if (newExpressionGenerator != null)
				msgs = ((InternalEObject)newExpressionGenerator).eInverseAdd(this, GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER, ExpressionModelGenerator.class, msgs);
			msgs = basicSetExpressionGenerator(newExpressionGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR, newExpressionGenerator, newExpressionGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModelGenerator getComponentGenerator() {
		if (componentGenerator != null && componentGenerator.eIsProxy()) {
			InternalEObject oldComponentGenerator = (InternalEObject)componentGenerator;
			componentGenerator = (ComponentModelGenerator)eResolveProxy(oldComponentGenerator);
			if (componentGenerator != oldComponentGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR, oldComponentGenerator, componentGenerator));
			}
		}
		return componentGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentModelGenerator basicGetComponentGenerator() {
		return componentGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentGenerator(ComponentModelGenerator newComponentGenerator, NotificationChain msgs) {
		ComponentModelGenerator oldComponentGenerator = componentGenerator;
		componentGenerator = newComponentGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR, oldComponentGenerator, newComponentGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentGenerator(ComponentModelGenerator newComponentGenerator) {
		if (newComponentGenerator != componentGenerator) {
			NotificationChain msgs = null;
			if (componentGenerator != null)
				msgs = ((InternalEObject)componentGenerator).eInverseRemove(this, GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER, ComponentModelGenerator.class, msgs);
			if (newComponentGenerator != null)
				msgs = ((InternalEObject)newComponentGenerator).eInverseAdd(this, GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER, ComponentModelGenerator.class, msgs);
			msgs = basicSetComponentGenerator(newComponentGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR, newComponentGenerator, newComponentGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName(final String s) {
		return s.split("_")[1];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable(final String s) {
		Table table = compilator.domain.expression.expressionmodel.
				individualcomponent.IndividualcomponentFactory.eINSTANCE.createTable();
		String nameTable="",body="";
		int j =0;
		while(s.charAt(j)!='<'){ nameTable+=s.charAt(j);j++;} j++;
		while(s.charAt(j)!='>'){body+=s.charAt(j);j++;}
		
		styles.domain.Style style = findStyleElement(nameTable);
		if(style!=null) table.setTheStyle(style);
		
		String [] columns = body.split(",");
		
		for(int i=0;i<columns.length;i++){
			compilator.domain.expression.expressionmodel.individualcomponent.
				Column co = compilator.domain.expression.expressionmodel.individualcomponent.
				IndividualcomponentFactory.eINSTANCE.createColumn();
			co.setName(columns[i]);
			styles.domain.Style styleColumn = findStyleElement(columns[i]);
			if(styleColumn!=null) co.setTheStyle(styleColumn);
			table.getListColumn().add(co);
		}
		table.setName(nameTable);
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainer(final String s) {
		return s.contains("[");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createIndividualElement(final String s) {
		Element e=null;
		styles.domain.Style style;
		
		if(tokens.get(s)!=null && tokens.get(s).equals("Boton")){
			compilator.domain.expression.expressionmodel.individualcomponent.Button b = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createButton();
			b.setName(getName(s));
			style = findStyleElement(s);
			if(style!=null) b.setTheStyle(style);
			e=b;
		}
		else if(tokens.get(s)!=null && tokens.get(s).equals("ComboBox")){
			compilator.domain.expression.expressionmodel.individualcomponent.Attribute a = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createAttribute();
			a.setName(s);
			compilator.domain.expression.expressionmodel.individualcomponent.Label l = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createLabel();
			l.setName(s.substring(1));
			style = findStyleElement(l.getName());
			if(style!=null) l.setTheStyle(style);
			a.setTheLabel(l);
			compilator.domain.expression.expressionmodel.individualcomponent.ComboBox cb = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createComboBox();
			cb.setName(s.substring(1));
			style = findStyleElement(cb.getName());
			if(style!=null) cb.setTheStyle(style);
			a.setTheInputElement(cb);
			e=a;
		}
		else if(tokens.get(s)!=null && tokens.get(s).equals("Campo de Texto")){
			compilator.domain.expression.expressionmodel.individualcomponent.TextField txt = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createTextField();
			txt.setName(getName(s));
			style = findStyleElement(s);
			if(style!=null) txt.setTheStyle(style);
			e = txt;
		}
		else if(tokens.get(s)!=null && tokens.get(s).equals("Label")){
			compilator.domain.expression.expressionmodel.individualcomponent.Label l = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createLabel();
			l.setName(getName(s));
			style = findStyleElement(s);
			if(style!=null) l.setTheStyle(style);
			e=l;
		}else if(tokens.get(s)!=null && tokens.get(s).equals("Atributo")){
			compilator.domain.expression.expressionmodel.individualcomponent.Attribute a = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createAttribute();
			a.setName(s);
			compilator.domain.expression.expressionmodel.individualcomponent.Label l = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createLabel();
			l.setName(s);
			style = findStyleElement(s);
			if(style!=null) l.setTheStyle(style);
			a.setTheLabel(l);
			compilator.domain.expression.expressionmodel.individualcomponent.TextField txt = compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory.eINSTANCE.createTextField();
			txt.setName(s);
			style = findStyleElement(s);
			if(style!=null) txt.setTheStyle(style);
			a.setTheInputElement(txt);
			e=a;
		}else if(s.contains("<")){
			Table  t = createTable(s);
			e = t;
		}
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList split(final String s) {
		ArrayList<String> components=new ArrayList<String>();
		int f=0;
		String si="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==',' && f==0){
				components.add(si);
				si="";
				continue;
			}
			f = (s.charAt(i)=='[' ||s.charAt(i)=='<' )? f+1:f;
			f = (s.charAt(i)==']' ||s.charAt(i)=='>' )? f-1:f;
			si+=s.charAt(i);
		}
		components.add(si);
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createContainer(final String textElement, final compilator.domain.expression.expressionmodel.containercomponent.Container container) {
		String nameContainer="";
		String body="";
		int j =0;
		
		while(textElement.charAt(j)!='['){
			nameContainer+=textElement.charAt(j);
			j++;
		}
		j++;
				
		String orientation ="-|";
		int lenghtName = nameContainer.length()-1;
		
		if(nameContainer.charAt( lenghtName)=='|' || nameContainer.charAt(lenghtName)=='-'){
			orientation = nameContainer.substring(nameContainer.length()-2, nameContainer.length());
			nameContainer = nameContainer.substring(0, lenghtName-1);
		}
		
		styles.domain.Style style = findStyleElement(nameContainer);
		if(style!=null) container.setTheStyle(style);
		
		int f=0;
		while(textElement.charAt(j)!=']' || f!=0){
			f = (textElement.charAt(j)=='[')? f+1:f;
			f = (textElement.charAt(j)==']')? f-1:f;
			body+=textElement.charAt(j);j++;
		}
		
		container.setName(nameContainer);
		container.setOrientation(orientation);
		container.setIsVisible( (textElement.charAt( textElement.length()-1)!=39 )  );
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style findStyleElement(final String element) {
		return (Style) elementStyle.get(element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR:
				if (expressionGenerator != null)
					msgs = ((InternalEObject)expressionGenerator).eInverseRemove(this, GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER, ExpressionModelGenerator.class, msgs);
				return basicSetExpressionGenerator((ExpressionModelGenerator)otherEnd, msgs);
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR:
				if (componentGenerator != null)
					msgs = ((InternalEObject)componentGenerator).eInverseRemove(this, GeneratorPackage.COMPONENT_MODEL_GENERATOR__EXPRESSION_MANAGER, ComponentModelGenerator.class, msgs);
				return basicSetComponentGenerator((ComponentModelGenerator)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR:
				return basicSetExpressionGenerator(null, msgs);
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR:
				return basicSetComponentGenerator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__TOKENS:
				return getTokens();
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__BODY:
				return getBody();
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__ELEMENT_STYLE:
				return getElementStyle();
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR:
				if (resolve) return getExpressionGenerator();
				return basicGetExpressionGenerator();
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR:
				if (resolve) return getComponentGenerator();
				return basicGetComponentGenerator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__TOKENS:
				setTokens((TreeMap)newValue);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__BODY:
				setBody((String)newValue);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__ELEMENT_STYLE:
				setElementStyle((TreeMap)newValue);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR:
				setExpressionGenerator((ExpressionModelGenerator)newValue);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR:
				setComponentGenerator((ComponentModelGenerator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__TOKENS:
				setTokens(TOKENS_EDEFAULT);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__ELEMENT_STYLE:
				setElementStyle(ELEMENT_STYLE_EDEFAULT);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR:
				setExpressionGenerator((ExpressionModelGenerator)null);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR:
				setComponentGenerator((ComponentModelGenerator)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__TOKENS:
				return TOKENS_EDEFAULT == null ? tokens != null : !TOKENS_EDEFAULT.equals(tokens);
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__ELEMENT_STYLE:
				return ELEMENT_STYLE_EDEFAULT == null ? elementStyle != null : !ELEMENT_STYLE_EDEFAULT.equals(elementStyle);
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR:
				return expressionGenerator != null;
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER__COMPONENT_GENERATOR:
				return componentGenerator != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER___GET_NAME__STRING:
				return getName((String)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER___CREATE_TABLE__STRING:
				return createTable((String)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER___IS_CONTAINER__STRING:
				return isContainer((String)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER___CREATE_INDIVIDUAL_ELEMENT__STRING:
				return createIndividualElement((String)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER___SPLIT__STRING:
				return split((String)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER___CREATE_CONTAINER__STRING_CONTAINER:
				return createContainer((String)arguments.get(0), (compilator.domain.expression.expressionmodel.containercomponent.Container)arguments.get(1));
			case GeneratorPackage.EXPRESSION_MODEL_MANAGER___FIND_STYLE_ELEMENT__STRING:
				return findStyleElement((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tokens: ");
		result.append(tokens);
		result.append(", body: ");
		result.append(body);
		result.append(", elementStyle: ");
		result.append(elementStyle);
		result.append(')');
		return result.toString();
	}

} //ExpressionModelManagerImpl
