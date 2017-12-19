/**
 */
package generator.impl;

import compilator.domain.expression.Expression;

import compilator.domain.expression.expressionmodel.Element;
import compilator.domain.expression.expressionmodel.ExpressionModel;
import compilator.domain.expression.expressionmodel.individualcomponent.Attribute;
import compilator.domain.expression.expressionmodel.individualcomponent.Button;
import compilator.domain.expression.expressionmodel.individualcomponent.Column;
import compilator.domain.expression.expressionmodel.individualcomponent.ComboBox;
import compilator.domain.expression.expressionmodel.individualcomponent.Label;
import compilator.domain.expression.expressionmodel.individualcomponent.Table;
import compilator.domain.expression.expressionmodel.individualcomponent.TextField;

import generator.Generator;
import generator.GeneratorPackage;

import generator.genmodel.GenElement;
import generator.genmodel.GenModel;
import generator.genmodel.GenmodelPackage;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;

import generator.genmodel.genindividualcomponent.GenIndividualElement;

import generator.genmodel.genindividualcomponent.genbutton.GenButton;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;

import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;

import generator.genmodel.genindividualcomponent.gentable.GenTable;

import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.impl.GeneratorImpl#getTheExpression <em>The Expression</em>}</li>
 *   <li>{@link generator.impl.GeneratorImpl#getTheGenModel <em>The Gen Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratorImpl extends MinimalEObjectImpl.Container implements Generator {
	/**
	 * The cached value of the '{@link #getTheExpression() <em>The Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression theExpression;

	/**
	 * The cached value of the '{@link #getTheGenModel() <em>The Gen Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheGenModel()
	 * @generated
	 * @ordered
	 */
	protected GenModel theGenModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTheExpression() {
		return theExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheExpression(Expression newTheExpression, NotificationChain msgs) {
		Expression oldTheExpression = theExpression;
		theExpression = newTheExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENERATOR__THE_EXPRESSION, oldTheExpression, newTheExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheExpression(Expression newTheExpression) {
		if (newTheExpression != theExpression) {
			NotificationChain msgs = null;
			if (theExpression != null)
				msgs = ((InternalEObject)theExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENERATOR__THE_EXPRESSION, null, msgs);
			if (newTheExpression != null)
				msgs = ((InternalEObject)newTheExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENERATOR__THE_EXPRESSION, null, msgs);
			msgs = basicSetTheExpression(newTheExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENERATOR__THE_EXPRESSION, newTheExpression, newTheExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel getTheGenModel() {
		return theGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheGenModel(GenModel newTheGenModel, NotificationChain msgs) {
		GenModel oldTheGenModel = theGenModel;
		theGenModel = newTheGenModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENERATOR__THE_GEN_MODEL, oldTheGenModel, newTheGenModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheGenModel(GenModel newTheGenModel) {
		if (newTheGenModel != theGenModel) {
			NotificationChain msgs = null;
			if (theGenModel != null)
				msgs = ((InternalEObject)theGenModel).eInverseRemove(this, GenmodelPackage.GEN_MODEL__GENERATOR, GenModel.class, msgs);
			if (newTheGenModel != null)
				msgs = ((InternalEObject)newTheGenModel).eInverseAdd(this, GenmodelPackage.GEN_MODEL__GENERATOR, GenModel.class, msgs);
			msgs = basicSetTheGenModel(newTheGenModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENERATOR__THE_GEN_MODEL, newTheGenModel, newTheGenModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createGenModel(final ExpressionModel expressionModel) {
		generator.genmodel.GenModel genModel= generator.genmodel.GenmodelFactory.eINSTANCE.createGenModel();
				
		for(int i =0 ;i< expressionModel.getListElements().size();i++){
		      compilator.domain.expression.expressionmodel.Element element = expressionModel.getListElements().get(i);
		      if(element instanceof compilator.domain.expression.expressionmodel.containercomponent.Container){
			genModel.getListGenElements().add(createGenContainer((compilator.domain.expression.expressionmodel.containercomponent.Container) element));
		       }else{
			genModel.getListGenElements().add(createGenIndividualElement(element));
		        }
		}
		this.setTheGenModel(genModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 *///TODO
	public GenContainer createGenContainer(final compilator.domain.expression.expressionmodel.containercomponent.Container container) {
		GenContainer genContainer = generator.genmodel.gencontainercomponent.gencontainer.
				GencontainerFactory.eINSTANCE.createGenContainer();
		genContainer.setTheContainer(container);
		styles.domain.Propertie fontSize = null;
		EList<styles.domain.Propertie> listProperties = container.getTheStyle().
				getTheCharacteristic().getListProperties();
		for (int i = 0; i < listProperties.size(); i++) {
			if(listProperties.get(i).getName().equals("Font Size")) {
				fontSize = listProperties.get(i);
				break;
			}
		}
		String orientation = container.getOrientation();
		genContainer.createPropertiesContainer(orientation, fontSize);
		if(container.getTheStyle() != null) {
			genContainer = (GenContainer) setApperances(container, genContainer);
			for (int i = 0; i < listProperties.size(); i++) {
				styles.domain.Propertie propertie = listProperties.get(i);
				
				if(propertie.getName().equals("Background")) {
					generator.apperance.background.Background b = generator.apperance.background.
							BackgroundFactory.eINSTANCE.createBackground();
					b.setValue(propertie.getValue());
					genContainer.setTheBackground(b);
				}
			}
		}
		
		int x, y;
		if(container.getIsVisible()){
			x = 10; y = 10;
		} else {
			x = 0; y = 0;
		}
		int xa=0,ya=0;
		int maxix=10,maxiy=10;
		
		for(int i =0 ;i< container.getListElements().size();i++){
			compilator.domain.expression.expressionmodel.Element element = container.getListElements().get(i);
			if(element instanceof compilator.domain.expression.expressionmodel.containercomponent.Container){
				GenContainer c = createGenContainer((compilator.domain.expression.expressionmodel.
						containercomponent.Container) element);
				c.getTheX().setValue(new Integer(x)); c.getTheY().setValue(new Integer(y));
				
				genContainer.getListGenElements().add(c);
				
				xa = c.getTheWidth().getValue().intValue(); ya = c.getTheHeight().getValue().intValue(); 
				if(container.getOrientation().charAt(0) == '-'){ 
					y = y + ya;
					maxiy=y;//TODO
				}
			}else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Attribute){//TODO
				Attribute attribute = (Attribute) element;
				attribute.getTheLabel().setTheStyle(attribute.getTheStyle());
				attribute.getTheTextField().setTheStyle(attribute.getTheStyle());
				GenLabel label = (GenLabel) createGenIndividualElement(attribute.getTheLabel());
				label.getTheX().setValue(new Integer(x)); label.getTheY().setValue(new Integer(y));
				genContainer.getListGenElements().add(label);
				xa = label.getTheWidth().getValue().intValue(); ya = label.getTheHeight().getValue().intValue();
				
				if(container.getOrientation().charAt(1) == '|'){ 
					xa += 5;
					x += xa;
				}
				else {
					ya += 5;
					y += ya;
				}
				
				GenTextField text = (GenTextField) createGenIndividualElement(attribute.getTheTextField());
				text.getTheX().setValue(new Integer(x)); text.getTheY().setValue(new Integer(y));
				genContainer.getListGenElements().add(text);
				if(container.getOrientation().charAt(1) == '|'){ 
					x -= xa;
					xa += text.getTheWidth().getValue().intValue();
					ya = text.getTheHeight().getValue().intValue();
				}
				else {
					y -= ya;
					ya += text.getTheHeight().getValue().intValue();
					xa = text.getTheWidth().getValue().intValue();
				}
				
			}else{
			
				GenIndividualElement ind = createGenIndividualElement(element);
				ind.getTheX().setValue(new Integer(x)); ind.getTheY().setValue(new Integer(y));
				
				genContainer.getListGenElements().add(ind);
				
				xa = ind.getTheWidth().getValue().intValue(); ya = ind.getTheHeight().getValue().intValue();
			}
			
			if(container.getOrientation().charAt(0) == '|'){ 
				x = x + xa + 10;
				maxix = x;
				maxiy = java.lang.Math.max(maxiy, ya+20) ;
			}
			else {
				y = y + ya + 10;
				maxiy=y;
				maxix = java.lang.Math.max(maxix,xa+20);
			}
		}
		
		if(!container.getIsVisible()){
			if(container.getOrientation().charAt(0) == '|') {
				maxix -= 10; maxiy -= 20;
			} else {
				maxix -= 20; maxiy -= 10;
			}
		}
		
		generator.apperance.size.Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();
		h.setValue(new Integer(maxiy));
		generator.apperance.size.Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
		w.setValue(new Integer(maxix));
		generator.apperance.position.X xx = generator.apperance.position.PositionFactory.eINSTANCE.createX();
		xx.setValue(0);
		generator.apperance.position.Y yy = generator.apperance.position.PositionFactory.eINSTANCE.createY();
		yy.setValue(0);
		genContainer.setTheHeight(h); genContainer.setTheWidth(w);
		genContainer.setTheX(xx); genContainer.setTheY(yy);
		return genContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenIndividualElement createGenIndividualElement(final Element element) {
		if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Button){
			GenButton genButton = createGenButton((Button) element);
			return genButton;
		}
		else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.ComboBox){
			GenComboBox genComboBox = createGenComboBox((ComboBox) element);
			return genComboBox;
		}
		else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Label){
			GenLabel genLabel = createGenLabel((Label) element);
			return genLabel;
		}
		else  if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.Table){
			GenTable genTable = createGenTable((Table) element);
			return genTable;
		}
		else if(element instanceof compilator.domain.expression.expressionmodel.individualcomponent.TextField){
			GenTextField genTextField = createGenTextField((TextField) element);
			return genTextField;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenButton createGenButton(final Button button) {
		GenButton genButton = generator.genmodel.genindividualcomponent.genbutton.
				GenbuttonFactory.eINSTANCE.createGenButton();
		genButton.setTheButton(button);
		String text = button.getName();
		styles.domain.Propertie fontSize = null;
		EList<styles.domain.Propertie> listProperties = button.getTheStyle().
				getTheCharacteristic().getListProperties();
		for (int i = 0; i < listProperties.size(); i++) {
			if(listProperties.get(i).getName().equals("Font Size")) {
				fontSize = listProperties.get(i);
				break;
			}
		}
		genButton.createPropertiesButton(text, fontSize);
		
		if(button.getTheStyle() != null) {
			genButton = (GenButton) setApperances(button, genButton);
			for (int i = 0; i < listProperties.size(); i++) {
				styles.domain.Propertie propertie = listProperties.get(i);
				
				if(propertie.getName().equals("Alignment")) {
					generator.apperance.alignment.Alignment a = generator.apperance.alignment.
							AlignmentFactory.eINSTANCE.createAlignment();
					a.setValue(propertie.getValue());
					genButton.setTheAlignment(a);
				}
			}
		}
		return genButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenColumn createGenColumn(final Column column) {
		GenColumn genColumn = generator.genmodel.genindividualcomponent.gencolunm.
				GencolunmFactory.eINSTANCE.createGenColumn();
		genColumn.setTheColumn(column);
		String text = column.getName();
		styles.domain.Propertie fontSize = null;
		EList<styles.domain.Propertie> listProperties = column.getTheStyle().
				getTheCharacteristic().getListProperties();
		for (int i = 0; i < listProperties.size(); i++) {
			if(listProperties.get(i).getName().equals("Font Size")) {
				fontSize = listProperties.get(i);
				break;
			}
		}			
		genColumn.createPropertiesColumn(text, fontSize);
		
		if(column.getTheStyle() != null) {
			genColumn = (GenColumn) setApperances(column, genColumn);
			for (int i = 0; i < listProperties.size(); i++) {
				styles.domain.Propertie propertie = listProperties.get(i);
				
				if(propertie.getName().equals("Alignment")) {
					generator.apperance.alignment.Alignment a = generator.apperance.alignment.
							AlignmentFactory.eINSTANCE.createAlignment();
					a.setValue(propertie.getValue());
					genColumn.setTheAlignment(a);
				}
			}
		}
		return genColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenComboBox createGenComboBox(final ComboBox combo) {
		GenComboBox genCombo = generator.genmodel.genindividualcomponent.gencombobox.
				GencomboboxFactory.eINSTANCE.createGenComboBox();
		genCombo.setTheComboBox(combo);
		styles.domain.Propertie fontSize = null;
		EList<styles.domain.Propertie> listProperties = combo.getTheStyle().
				getTheCharacteristic().getListProperties();
		for (int i = 0; i < listProperties.size(); i++) {
			if(listProperties.get(i).getName().equals("Font Size")) {
				fontSize = listProperties.get(i);
				break;
			}
		}
		genCombo.createPropertiesComboBox(fontSize);
		
		if(combo.getTheStyle() != null) {
			genCombo = (GenComboBox) setApperances(combo, genCombo);
			for (int i = 0; i < listProperties.size(); i++) {
				styles.domain.Propertie propertie = listProperties.get(i);
				
				if(propertie.getName().equals("Background")) {
					generator.apperance.background.Background b = generator.apperance.background.
							BackgroundFactory.eINSTANCE.createBackground();
					b.setValue(propertie.getValue());
					genCombo.setTheBackground(b);
				}
			}
		}
		return genCombo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLabel createGenLabel(final Label label) {
		GenLabel genLabel = generator.genmodel.genindividualcomponent.genlabel.
				GenlabelFactory.eINSTANCE.createGenLabel();
		genLabel.setTheLabel(label);
		String text = label.getName();
		styles.domain.Propertie fontSize = null;
		EList<styles.domain.Propertie> listProperties = label.getTheStyle().
				getTheCharacteristic().getListProperties();
		for (int i = 0; i < listProperties.size(); i++) {
			if(listProperties.get(i).getName().equals("Font Size")) {
				fontSize = listProperties.get(i);
				break;
			}
		}
		genLabel.createPropertiesLabel(text, fontSize);
		
		if(label.getTheStyle() != null) {
			genLabel = (GenLabel) setApperances(label, genLabel);
			for (int i = 0; i < listProperties.size(); i++) {
				styles.domain.Propertie propertie = listProperties.get(i);
				
				if(propertie.getName().equals("Alignment")) {
					generator.apperance.alignment.Alignment a = generator.apperance.alignment.
							AlignmentFactory.eINSTANCE.createAlignment();
					a.setValue(propertie.getValue());
					genLabel.setTheAlignment(a);
				} else if(propertie.getName().equals("Background")) {
					generator.apperance.background.Background b = generator.apperance.background.
							BackgroundFactory.eINSTANCE.createBackground();
					b.setValue(propertie.getValue());
					genLabel.setTheBackground(b);
				}
			}
		}
		return genLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTable createGenTable(final Table table) {
		GenTable genTable = generator.genmodel.genindividualcomponent.gentable.
				GentableFactory.eINSTANCE.createGenTable();
		genTable.setTheTable(table);
		int columnsWidth = 0;
		int columnHeight = 0;
		for(int i=0;i<table.getListColumn().size();i++){
			GenColumn genColumn = createGenColumn(table.getListColumn().get(i));
			columnsWidth += genColumn.getTheWidth().getValue();
			columnHeight = genColumn.getTheHeight().getValue();
			genTable.getListGenColumns().add(genColumn);
		}
		styles.domain.Propertie fontSize = null;
		EList<styles.domain.Propertie> listProperties = table.getTheStyle().
				getTheCharacteristic().getListProperties();
		for (int i = 0; i < listProperties.size(); i++) {
			if(listProperties.get(i).getName().equals("Font Size")) {
				fontSize = listProperties.get(i);
				break;
			}
		}
		genTable.createPropertiesTable(columnHeight, columnsWidth, fontSize);
		if(table.getTheStyle() != null) {
			genTable = (GenTable) setApperances(table, genTable);
			for (int i = 0; i < listProperties.size(); i++) {
				styles.domain.Propertie propertie = listProperties.get(i);
				
				if(propertie.getName().equals("Background")) {
					generator.apperance.background.Background b = generator.apperance.background.
							BackgroundFactory.eINSTANCE.createBackground();
					b.setValue(propertie.getValue());
					genTable.setTheBackground(b);
				} else if(propertie.getName().equals("Lines Visible")) {
					generator.apperance.linesvisible.LinesVisible l = generator.apperance.linesvisible.
							LinesvisibleFactory.eINSTANCE.createLinesVisible();
					l.setValue(propertie.getValue().equals("True"));
					genTable.setTheLinesVisible(l);
				}
			}
		}
		return genTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTextField createGenTextField(final TextField text) {
		GenTextField genText = generator.genmodel.genindividualcomponent.gentextfield.
				GentextfieldFactory.eINSTANCE.createGenTextField();		
		genText.setTheTextField(text);
		styles.domain.Propertie fontSize = null;
		EList<styles.domain.Propertie> listProperties = text.getTheStyle().
				getTheCharacteristic().getListProperties();
		for (int i = 0; i < listProperties.size(); i++) {
			if(listProperties.get(i).getName().equals("Font Size")) {
				fontSize = listProperties.get(i);
				break;
			}
		}
		genText.createPropertiesTextField(fontSize);
		
		if(text.getTheStyle() != null) {
			genText = (GenTextField) setApperances(text, genText);
			for (int i = 0; i < listProperties.size(); i++) {
				styles.domain.Propertie propertie = listProperties.get(i);
				
				if(propertie.getName().equals("Background")) {
					generator.apperance.background.Background b = generator.apperance.background.
							BackgroundFactory.eINSTANCE.createBackground();
					b.setValue(propertie.getValue());
					genText.setTheBackground(b);
				}
			}
		}
		return genText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenElement setApperances(final Element element, final GenElement genElement) {
		EList<styles.domain.Propertie> listProperties = element.getTheStyle().getTheCharacteristic().getListProperties();
		for (int i = 0; i < listProperties.size(); i++) {
			styles.domain.Propertie propertie = listProperties.get(i);
			
			if(propertie.getName().equals("X")) {
				generator.apperance.position.X x = generator.apperance.position.PositionFactory.eINSTANCE.createX();
				x.setValue(Integer.parseInt(propertie.getValue()));
				genElement.setTheX(x);
			} else if(propertie.getName().equals("Y")) {
				generator.apperance.position.Y y = generator.apperance.position.PositionFactory.eINSTANCE.createY();
				y.setValue(Integer.parseInt(propertie.getValue()));
				genElement.setTheY(y);
			} else if(propertie.getName().equals("Width")) {
				generator.apperance.size.Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
				w.setValue(Integer.parseInt(propertie.getValue()));
				genElement.setTheWidth(w);
			} else if(propertie.getName().equals("Height")) {
				generator.apperance.size.Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();
				h.setValue(Integer.parseInt(propertie.getValue()));
				genElement.setTheHeight(h);
			} else if(propertie.getName().equals("Font Color")) {
				generator.apperance.font.Color c = generator.apperance.font.FontFactory.eINSTANCE.createColor();
				c.setValue(propertie.getValue());
				genElement.setTheColor(c);
			} else if(propertie.getName().equals("Font Type")) {
				generator.apperance.font.Type t = generator.apperance.font.FontFactory.eINSTANCE.createType();
				t.setValue(propertie.getValue());
				genElement.setTheType(t);
			} else if(propertie.getName().equals("Font Size")) {
				generator.apperance.font.Size s = generator.apperance.font.FontFactory.eINSTANCE.createSize();
				s.setValue(Integer.parseInt(propertie.getValue()));
				genElement.setTheSize(s);
			} 
		}
		
		return genElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveGenModel() {
				Generator gen = this;
				
				org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/model/generator.generator");
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
				org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
				resource.getContents().add(gen);
				try {
					resource.save(java.util.Collections.EMPTY_MAP);
				} catch (java.io.IOException e) {
					// TO-DO Auto-generated catch block
					e.printStackTrace();
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator loadGenModel() {
				Generator gen = null;
				
				org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/test/model/generator.generator");
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
				org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
				try {
					resource.load(java.util.Collections.EMPTY_MAP);
					gen = (Generator) resource.getContents().get(0);
				} catch (java.io.IOException e) {
					// TO-DO Auto-generated catch block
					e.printStackTrace();
				}
		
				return gen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorPackage.GENERATOR__THE_GEN_MODEL:
				if (theGenModel != null)
					msgs = ((InternalEObject)theGenModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeneratorPackage.GENERATOR__THE_GEN_MODEL, null, msgs);
				return basicSetTheGenModel((GenModel)otherEnd, msgs);
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
			case GeneratorPackage.GENERATOR__THE_EXPRESSION:
				return basicSetTheExpression(null, msgs);
			case GeneratorPackage.GENERATOR__THE_GEN_MODEL:
				return basicSetTheGenModel(null, msgs);
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
			case GeneratorPackage.GENERATOR__THE_EXPRESSION:
				return getTheExpression();
			case GeneratorPackage.GENERATOR__THE_GEN_MODEL:
				return getTheGenModel();
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
			case GeneratorPackage.GENERATOR__THE_EXPRESSION:
				setTheExpression((Expression)newValue);
				return;
			case GeneratorPackage.GENERATOR__THE_GEN_MODEL:
				setTheGenModel((GenModel)newValue);
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
			case GeneratorPackage.GENERATOR__THE_EXPRESSION:
				setTheExpression((Expression)null);
				return;
			case GeneratorPackage.GENERATOR__THE_GEN_MODEL:
				setTheGenModel((GenModel)null);
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
			case GeneratorPackage.GENERATOR__THE_EXPRESSION:
				return theExpression != null;
			case GeneratorPackage.GENERATOR__THE_GEN_MODEL:
				return theGenModel != null;
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
			case GeneratorPackage.GENERATOR___CREATE_GEN_MODEL__EXPRESSIONMODEL:
				createGenModel((ExpressionModel)arguments.get(0));
				return null;
			case GeneratorPackage.GENERATOR___CREATE_GEN_CONTAINER__CONTAINER:
				return createGenContainer((compilator.domain.expression.expressionmodel.containercomponent.Container)arguments.get(0));
			case GeneratorPackage.GENERATOR___CREATE_GEN_INDIVIDUAL_ELEMENT__ELEMENT:
				return createGenIndividualElement((Element)arguments.get(0));
			case GeneratorPackage.GENERATOR___CREATE_GEN_BUTTON__BUTTON:
				return createGenButton((Button)arguments.get(0));
			case GeneratorPackage.GENERATOR___CREATE_GEN_COLUMN__COLUMN:
				return createGenColumn((Column)arguments.get(0));
			case GeneratorPackage.GENERATOR___CREATE_GEN_COMBO_BOX__COMBOBOX:
				return createGenComboBox((ComboBox)arguments.get(0));
			case GeneratorPackage.GENERATOR___CREATE_GEN_LABEL__LABEL:
				return createGenLabel((Label)arguments.get(0));
			case GeneratorPackage.GENERATOR___CREATE_GEN_TABLE__TABLE:
				return createGenTable((Table)arguments.get(0));
			case GeneratorPackage.GENERATOR___CREATE_GEN_TEXT_FIELD__TEXTFIELD:
				return createGenTextField((TextField)arguments.get(0));
			case GeneratorPackage.GENERATOR___SET_APPERANCES__ELEMENT_GENELEMENT:
				return setApperances((Element)arguments.get(0), (GenElement)arguments.get(1));
			case GeneratorPackage.GENERATOR___SAVE_GEN_MODEL:
				saveGenModel();
				return null;
			case GeneratorPackage.GENERATOR___LOAD_GEN_MODEL:
				return loadGenModel();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GeneratorImpl
