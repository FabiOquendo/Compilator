/**
 */
package compilator.domain.generator.impl;

import compilator.domain.expression.Expression;

import compilator.domain.expression.expressionmodel.Element;
import compilator.domain.expression.expressionmodel.ExpressionModel;

import compilator.domain.generator.ExpressionModelGenerator;
import compilator.domain.generator.ExpressionModelManager;
import compilator.domain.generator.GeneratorPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Model Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link compilator.domain.generator.impl.ExpressionModelGeneratorImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link compilator.domain.generator.impl.ExpressionModelGeneratorImpl#getTextComponents <em>Text Components</em>}</li>
 *   <li>{@link compilator.domain.generator.impl.ExpressionModelGeneratorImpl#getComponentsStyles <em>Components Styles</em>}</li>
 *   <li>{@link compilator.domain.generator.impl.ExpressionModelGeneratorImpl#getExpressionManager <em>Expression Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionModelGeneratorImpl extends MinimalEObjectImpl.Container implements ExpressionModelGenerator {
	/**
	 * The default value of the '{@link #getComponents() <em>Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected static final TreeMap COMPONENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected TreeMap components = COMPONENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextComponents() <em>Text Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextComponents()
	 * @generated
	 * @ordered
	 */
	protected static final TreeSet TEXT_COMPONENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextComponents() <em>Text Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextComponents()
	 * @generated
	 * @ordered
	 */
	protected TreeSet textComponents = TEXT_COMPONENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentsStyles() <em>Components Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsStyles()
	 * @generated
	 * @ordered
	 */
	protected static final TreeMap COMPONENTS_STYLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentsStyles() <em>Components Styles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsStyles()
	 * @generated
	 * @ordered
	 */
	protected TreeMap componentsStyles = COMPONENTS_STYLES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressionManager() <em>Expression Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionManager()
	 * @generated
	 * @ordered
	 */
	protected ExpressionModelManager expressionManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionModelGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.EXPRESSION_MODEL_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeMap getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponents(TreeMap newComponents) {
		TreeMap oldComponents = components;
		components = newComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_GENERATOR__COMPONENTS, oldComponents, components));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeSet getTextComponents() {
		return textComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextComponents(TreeSet newTextComponents) {
		TreeSet oldTextComponents = textComponents;
		textComponents = newTextComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_GENERATOR__TEXT_COMPONENTS, oldTextComponents, textComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeMap getComponentsStyles() {
		return componentsStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentsStyles(TreeMap newComponentsStyles) {
		TreeMap oldComponentsStyles = componentsStyles;
		componentsStyles = newComponentsStyles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_GENERATOR__COMPONENTS_STYLES, oldComponentsStyles, componentsStyles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModelManager getExpressionManager() {
		if (expressionManager != null && expressionManager.eIsProxy()) {
			InternalEObject oldExpressionManager = (InternalEObject)expressionManager;
			expressionManager = (ExpressionModelManager)eResolveProxy(oldExpressionManager);
			if (expressionManager != oldExpressionManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER, oldExpressionManager, expressionManager));
			}
		}
		return expressionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionModelManager basicGetExpressionManager() {
		return expressionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpressionManager(ExpressionModelManager newExpressionManager, NotificationChain msgs) {
		ExpressionModelManager oldExpressionManager = expressionManager;
		expressionManager = newExpressionManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER, oldExpressionManager, newExpressionManager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpressionManager(ExpressionModelManager newExpressionManager) {
		if (newExpressionManager != expressionManager) {
			NotificationChain msgs = null;
			if (expressionManager != null)
				msgs = ((InternalEObject)expressionManager).eInverseRemove(this, GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR, ExpressionModelManager.class, msgs);
			if (newExpressionManager != null)
				msgs = ((InternalEObject)newExpressionManager).eInverseAdd(this, GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR, ExpressionModelManager.class, msgs);
			msgs = basicSetExpressionManager(newExpressionManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER, newExpressionManager, newExpressionManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exploreSentence(final String s, final compilator.domain.expression.expressionmodel.containercomponent.Container parent) {
			java.lang.Object [] elements = expressionManager.split(s).toArray();
			
			for(int i=0;i<elements.length;i++){
				
				String textElement =  (String)elements[i];
				
				if(components.containsKey(textElement)){
					
					compilator.domain.shapes.Component component  = (compilator.domain.shapes.Component)components.get(textElement); 
					compilator.domain.expression.expressionmodel.Element e = org.eclipse.emf.ecore.util.EcoreUtil.copy(component.getTheElement());
					//TODO
					getComponentStyles(e);
					textComponents.add(textElement);
					parent.getListElements().add(e);
				}
				else if(expressionManager.isContainer(textElement)){
					
					compilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();
					String body = expressionManager.createContainer(textElement,container);
					exploreSentence(body,container);
					parent.getListElements().add(container);
				
				}else{
					parent.getListElements().add(expressionManager.createIndividualElement(textElement));
				}
			}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpressionModel(final String formatedSentence, final String unformatedSentence) {
			textComponents = new TreeSet<String>();
			
			componentsStyles = new TreeMap<String, TreeSet<String>>();
			
			compilator.domain.expression.Expression expression = compilator.domain.expression.ExpressionFactory.eINSTANCE.createExpression();
			
			compilator.domain.expression.sentence.Sentence sentence = compilator.domain.expression.sentence.SentenceFactory.eINSTANCE.createSentence();
			
			compilator.domain.expression.expressionmodel.ExpressionModel model = compilator.domain.expression.expressionmodel.ExpressionmodelFactory.eINSTANCE.createExpressionModel();
			
			sentence.setCompressedSentence(unformatedSentence);
			
			expression.setTheSentence(sentence);
			
			java.lang.Object [] elements = expressionManager.split(formatedSentence).toArray();
			
			
			for(int i=0;i<elements.length;i++){
				
				String textElement = (String) elements[i];
				
				if(components.containsKey(textElement)){
					
					compilator.domain.shapes.Component component  = (compilator.domain.shapes.Component)components.get(textElement); 
					
					compilator.domain.expression.expressionmodel.Element e = org.eclipse.emf.ecore.util.EcoreUtil.copy(component.getTheElement());
		
					getComponentStyles(e);
					
					model.getListElements().add(e);
					
					textComponents.add(textElement);
					
				}
				else if(expressionManager.isContainer(textElement)){
					
					compilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();
				
					String body = expressionManager.createContainer(textElement,container);
					
					exploreSentence(body,container);
					model.getListElements().add(container);
				}else{
					model.getListElements().add(expressionManager.createIndividualElement(textElement));
				}
			}
			expression.setTheExpressionModel(model);
			return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String unpackStringExpression(final ExpressionModel model) {
				String textExpression="";
				for(int i=0;i<model.getListElements().size();i++){
					compilator.domain.expression.expressionmodel.Element element = model.getListElements().get(i);
					String textElement;
					if(element instanceof compilator.domain.expression.expressionmodel.containercomponent.Container){
						
						textElement = getTextExpressionContainer((compilator.domain.expression.expressionmodel.containercomponent.Container)element);
						textExpression += (i==0)? textElement: "," + textElement; 
					}else{
						textElement = getTextElement(element);
						textExpression+= (i==0)? textElement: "," + textElement ;
					}
				}
				return textExpression+";";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextExpressionContainer(final compilator.domain.expression.expressionmodel.containercomponent.Container c) {
				String textExpression= c.getName()+c.getOrientation()+"[";
				
				for(int i=0;i<c.getListElements().size();i++){
					
					compilator.domain.expression.expressionmodel.Element element = c.getListElements().get(i);
					
					String textElement;
					if(element instanceof compilator.domain.expression.expressionmodel.containercomponent.Container){
						
						textElement = getTextExpressionContainer((compilator.domain.expression.expressionmodel.containercomponent.Container)element);
						textExpression += (i==0)? textElement: "," + textElement; 
					}else{
						textElement = getTextElement(element);
						textExpression+= (i==0)? textElement: "," + textElement ;
					}
				}
				textExpression+="]";
				return textExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextElement(final Element element) {
				String ans=element.getName();
				
				if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Button){
					ans = "btn_"+ans;
				}
				else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.ComboBox){
					ans = "*"+ans;
				}
				else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Label){
					ans = "lbl_"+ans;
				}
				else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.TextField){
					ans = "txt_"+ans;
				}
				else if( element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Table){
					ans = getTableText(element);
				}
				return ans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableText(final Element element) {
				 compilator.domain.expression.expressionmodel.individualcomponent.Table table = ( compilator.domain.expression.expressionmodel.individualcomponent.Table)element;
				 
				 String ans = table.getName()+"<";
				 
				 for(int i=0;i<table.getListColumn().size();i++){
					 String name = table.getListColumn().get(i).getName();
					 ans +=(i==0)? name: "," + name;
				 }
				 return ans+">";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getComponentStyles(final Element element) {
		getContainerStyles((compilator.domain.expression.expressionmodel.containercomponent.Container) element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getContainerStyles(final compilator.domain.expression.expressionmodel.containercomponent.Container c) {
		if(c.getTheStyle() != null) {
			if(componentsStyles.containsKey(c.getTheStyle().getName())) {
				TreeSet<String> set = (TreeSet<String>) componentsStyles.get(c.getTheStyle().getName());
				set.add(c.getName());
				componentsStyles.put(c.getTheStyle().getName(), set);
			} else {
				TreeSet<String> set = new TreeSet<String>();
				set.add(c.getName());
				componentsStyles.put(c.getTheStyle().getName(), set);
			}
		}
		
		for(int i=0;i<c.getListElements().size();i++){
			compilator.domain.expression.expressionmodel.Element element = c.getListElements().get(i);
			if(element instanceof compilator.domain.expression.expressionmodel.containercomponent.Container){
				getContainerStyles((compilator.domain.expression.expressionmodel.containercomponent.Container)element);
			}else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Table) {
				getTableStyle(element);
			}else {
				getElementStyle(element);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getTableStyle(final Element element) {
		compilator.domain.expression.expressionmodel.individualcomponent.Table table = 
				(compilator.domain.expression.expressionmodel.individualcomponent.Table) element;
		 
		 if(table.getTheStyle() != null) {
			if(componentsStyles.containsKey(table.getTheStyle().getName())) {
				TreeSet<String> set = (TreeSet<String>) componentsStyles.
						get(table.getTheStyle().getName());
				set.add(table.getName());
				componentsStyles.put(table.getTheStyle().getName(), set);
			} else {
				TreeSet<String> set = new TreeSet<String>();
				set.add(table.getName());
				componentsStyles.put(table.getTheStyle().getName(), set);
			}
		}
		 
		for(int i=0;i<table.getListColumn().size();i++){
			compilator.domain.expression.expressionmodel.individualcomponent.Column column = table.
					getListColumn().get(i);
			if(column.getTheStyle() != null) {
				if(componentsStyles.containsKey(column.getTheStyle().getName())) {
					TreeSet<String> set = (TreeSet<String>) componentsStyles.
							get(column.getTheStyle().getName());
					set.add(column.getName());
					componentsStyles.put(column.getTheStyle().getName(), set);
				} else {
					TreeSet<String> set = new TreeSet<String>();
					set.add(column.getName());
					componentsStyles.put(column.getTheStyle().getName(), set);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getElementStyle(final Element element) {
		if(element.getTheStyle() != null) {
			if(componentsStyles.containsKey(element.getTheStyle().getName())) {
				TreeSet<String> set = (TreeSet<String>) componentsStyles.get(element.getTheStyle().getName());
				set.add(getTextElement(element));
				componentsStyles.put(element.getTheStyle().getName(), set);
			} else {
				TreeSet<String> set = new TreeSet<String>();
				set.add(getTextElement(element));
				componentsStyles.put(element.getTheStyle().getName(), set);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextComponentsStyles(final TreeMap elementStyles) {
		String text = "";
		fillAdditionalElementStyles(elementStyles);
		for(Object entry : componentsStyles.entrySet()) {
			java.util.Map.Entry<String, TreeSet<String>> en = (java.util.Map.Entry<String, TreeSet<String>>)entry;
			String key = en.getKey();
			  TreeSet<String> set = en.getValue();
			  text += key + " {\n";
			  int i=0;
			  for(String s : set) {
				  text += "\t" + s;
				  if(i < set.size()-1) {
					  text += ",";
				  }
				  text += "\n";
				  i++;
			  }
			  text += "};\n\n";
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fillAdditionalElementStyles(final TreeMap elementStyles) {
		for(Object entry : elementStyles.entrySet()) {
			java.util.Map.Entry<String, styles.domain.Style > en = (java.util.Map.Entry<String, 
					styles.domain.Style>)entry;
			String key = en.getKey();
			styles.domain.Style s = en.getValue();
			
			if(componentsStyles.containsKey(s.getName())) {
				TreeSet<String> set = (TreeSet<String>) componentsStyles.get(s.getName());
				set.add(key);
				componentsStyles.put(s.getName(), set);
			} else {
				TreeSet<String> set = new TreeSet<String>();
				set.add(key);
				componentsStyles.put(s.getName(), set);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createEModelFromUnpackedExpression(final String formatedString) {
		compilator.domain.expression.Expression expression = compilator.domain.expression.ExpressionFactory.eINSTANCE.createExpression();
		
		compilator.domain.expression.sentence.Sentence sentence = compilator.domain.expression.sentence.SentenceFactory.eINSTANCE.createSentence();
		
		compilator.domain.expression.expressionmodel.ExpressionModel model = compilator.domain.expression.expressionmodel.ExpressionmodelFactory.eINSTANCE.createExpressionModel();
		
		sentence.setCompressedSentence(formatedString);
		
		expression.setTheSentence(sentence);
		
		java.lang.Object [] elements = expressionManager.split(formatedString).toArray();
		
		boolean f = true;
		for(int i=0;i<elements.length && f;i++){
			
			String textElement = (String) elements[i];
			
			if(components.containsKey(textElement)){
				f=false;				
			}
			else if(expressionManager.isContainer(textElement)){
				
				compilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();
			
				String body = expressionManager.createContainer(textElement,container);
				
				f = f && exploreUnpackedSentences(body,container);
				model.getListElements().add(container);
			}else{
				model.getListElements().add(expressionManager.createIndividualElement(textElement));
			}
		}
		expression.setTheExpressionModel(model);
		return (f)?expression:null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean exploreUnpackedSentences(final String s, final compilator.domain.expression.expressionmodel.containercomponent.Container parent) {
		java.lang.Object [] elements = expressionManager.split(s).toArray();
		
		boolean f  = true;
		for(int i=0;i<elements.length && f;i++){
			
			String textElement =  (String)elements[i];
			
			if(components.containsKey(textElement)){
				f = false;
			}
			else if(expressionManager.isContainer(textElement)){
				
				compilator.domain.expression.expressionmodel.containercomponent.Container container = compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory.eINSTANCE.createContainer();
				String body = expressionManager.createContainer(textElement,container);
				f = f && exploreUnpackedSentences(body,container);
				parent.getListElements().add(container);
			
			}else{
				parent.getListElements().add(expressionManager.createIndividualElement(textElement));
			}
		}
		
		return f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER:
				if (expressionManager != null)
					msgs = ((InternalEObject)expressionManager).eInverseRemove(this, GeneratorPackage.EXPRESSION_MODEL_MANAGER__EXPRESSION_GENERATOR, ExpressionModelManager.class, msgs);
				return basicSetExpressionManager((ExpressionModelManager)otherEnd, msgs);
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
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER:
				return basicSetExpressionManager(null, msgs);
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
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__COMPONENTS:
				return getComponents();
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__TEXT_COMPONENTS:
				return getTextComponents();
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__COMPONENTS_STYLES:
				return getComponentsStyles();
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER:
				if (resolve) return getExpressionManager();
				return basicGetExpressionManager();
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
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__COMPONENTS:
				setComponents((TreeMap)newValue);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__TEXT_COMPONENTS:
				setTextComponents((TreeSet)newValue);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__COMPONENTS_STYLES:
				setComponentsStyles((TreeMap)newValue);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER:
				setExpressionManager((ExpressionModelManager)newValue);
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
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__COMPONENTS:
				setComponents(COMPONENTS_EDEFAULT);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__TEXT_COMPONENTS:
				setTextComponents(TEXT_COMPONENTS_EDEFAULT);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__COMPONENTS_STYLES:
				setComponentsStyles(COMPONENTS_STYLES_EDEFAULT);
				return;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER:
				setExpressionManager((ExpressionModelManager)null);
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
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__COMPONENTS:
				return COMPONENTS_EDEFAULT == null ? components != null : !COMPONENTS_EDEFAULT.equals(components);
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__TEXT_COMPONENTS:
				return TEXT_COMPONENTS_EDEFAULT == null ? textComponents != null : !TEXT_COMPONENTS_EDEFAULT.equals(textComponents);
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__COMPONENTS_STYLES:
				return COMPONENTS_STYLES_EDEFAULT == null ? componentsStyles != null : !COMPONENTS_STYLES_EDEFAULT.equals(componentsStyles);
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR__EXPRESSION_MANAGER:
				return expressionManager != null;
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
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___EXPLORE_SENTENCE__STRING_CONTAINER:
				exploreSentence((String)arguments.get(0), (compilator.domain.expression.expressionmodel.containercomponent.Container)arguments.get(1));
				return null;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___CREATE_EXPRESSION_MODEL__STRING_STRING:
				return createExpressionModel((String)arguments.get(0), (String)arguments.get(1));
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___UNPACK_STRING_EXPRESSION__EXPRESSIONMODEL:
				return unpackStringExpression((ExpressionModel)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___GET_TEXT_EXPRESSION_CONTAINER__CONTAINER:
				return getTextExpressionContainer((compilator.domain.expression.expressionmodel.containercomponent.Container)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___GET_TEXT_ELEMENT__ELEMENT:
				return getTextElement((Element)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___GET_TABLE_TEXT__ELEMENT:
				return getTableText((Element)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___GET_COMPONENT_STYLES__ELEMENT:
				getComponentStyles((Element)arguments.get(0));
				return null;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___GET_CONTAINER_STYLES__CONTAINER:
				getContainerStyles((compilator.domain.expression.expressionmodel.containercomponent.Container)arguments.get(0));
				return null;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___GET_TABLE_STYLE__ELEMENT:
				getTableStyle((Element)arguments.get(0));
				return null;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___GET_ELEMENT_STYLE__ELEMENT:
				getElementStyle((Element)arguments.get(0));
				return null;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___GET_TEXT_COMPONENTS_STYLES__TREEMAP:
				return getTextComponentsStyles((TreeMap)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___FILL_ADDITIONAL_ELEMENT_STYLES__TREEMAP:
				fillAdditionalElementStyles((TreeMap)arguments.get(0));
				return null;
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___CREATE_EMODEL_FROM_UNPACKED_EXPRESSION__STRING:
				return createEModelFromUnpackedExpression((String)arguments.get(0));
			case GeneratorPackage.EXPRESSION_MODEL_GENERATOR___EXPLORE_UNPACKED_SENTENCES__STRING_CONTAINER:
				return exploreUnpackedSentences((String)arguments.get(0), (compilator.domain.expression.expressionmodel.containercomponent.Container)arguments.get(1));
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
		result.append(" (components: ");
		result.append(components);
		result.append(", textComponents: ");
		result.append(textComponents);
		result.append(", componentsStyles: ");
		result.append(componentsStyles);
		result.append(')');
		return result.toString();
	}

} //ExpressionModelGeneratorImpl
