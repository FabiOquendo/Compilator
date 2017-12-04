/**
 */
package generator.genmodel.genindividualcomponent.gencombobox.impl;

import compilator.domain.expression.expressionmodel.individualcomponent.ComboBox;

import generator.apperance.background.Background;
import generator.apperance.background.BackgroundPackage;

import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;
import generator.genmodel.genindividualcomponent.gencombobox.GencomboboxPackage;

import generator.genmodel.genindividualcomponent.impl.GenIndividualElementImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import styles.domain.Propertie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Combo Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.gencombobox.impl.GenComboBoxImpl#getTheBackground <em>The Background</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gencombobox.impl.GenComboBoxImpl#getTheComboBox <em>The Combo Box</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenComboBoxImpl extends GenIndividualElementImpl implements GenComboBox {
	/**
	 * The cached value of the '{@link #getTheBackground() <em>The Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheBackground()
	 * @generated
	 * @ordered
	 */
	protected Background theBackground;

	/**
	 * The cached value of the '{@link #getTheComboBox() <em>The Combo Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheComboBox()
	 * @generated
	 * @ordered
	 */
	protected ComboBox theComboBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenComboBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencomboboxPackage.Literals.GEN_COMBO_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Background getTheBackground() {
		return theBackground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheBackground(Background newTheBackground, NotificationChain msgs) {
		Background oldTheBackground = theBackground;
		theBackground = newTheBackground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND, oldTheBackground, newTheBackground);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheBackground(Background newTheBackground) {
		if (newTheBackground != theBackground) {
			NotificationChain msgs = null;
			if (theBackground != null)
				msgs = ((InternalEObject)theBackground).eInverseRemove(this, BackgroundPackage.BACKGROUND__GEN_COMBO_BOX, Background.class, msgs);
			if (newTheBackground != null)
				msgs = ((InternalEObject)newTheBackground).eInverseAdd(this, BackgroundPackage.BACKGROUND__GEN_COMBO_BOX, Background.class, msgs);
			msgs = basicSetTheBackground(newTheBackground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND, newTheBackground, newTheBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox getTheComboBox() {
		if (theComboBox != null && theComboBox.eIsProxy()) {
			InternalEObject oldTheComboBox = (InternalEObject)theComboBox;
			theComboBox = (ComboBox)eResolveProxy(oldTheComboBox);
			if (theComboBox != oldTheComboBox) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencomboboxPackage.GEN_COMBO_BOX__THE_COMBO_BOX, oldTheComboBox, theComboBox));
			}
		}
		return theComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComboBox basicGetTheComboBox() {
		return theComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheComboBox(ComboBox newTheComboBox) {
		ComboBox oldTheComboBox = theComboBox;
		theComboBox = newTheComboBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencomboboxPackage.GEN_COMBO_BOX__THE_COMBO_BOX, oldTheComboBox, theComboBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPropertiesComboBox(final Propertie fontSize) {
		super.createProperties();
		createBackground();
		setDefaultCombo(fontSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createBackground() {
		Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();
		this.setTheBackground(b);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCombo(final Propertie fontSize) {
		if(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {
			generator.apperance.size.Width width = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
			int w = 80;
			int aux = 14 - (Integer.parseInt(fontSize.getValue())/2);
			if(12 >  aux) {
				int d = 12 - aux;
				w += d*10;
			}
			width.setValue(w);
			this.setTheWidth(width);
		}
		if(this.getTheHeight() == null || this.getTheHeight().getValue() == null) {
			generator.apperance.size.Height height = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();
			int h = 20;
			int value = Integer.parseInt(fontSize.getValue());
			if(value > 12) {
				h += (value-12)*2;
			}
			height.setValue(h);
			this.setTheHeight(height);
		}
		if(this.getTheBackground() == null || this.getTheBackground().getValue() == null) {
			generator.apperance.background.Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();
			b.setValue("#FFFFFF");
			this.setTheBackground(b);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND:
				if (theBackground != null)
					msgs = ((InternalEObject)theBackground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND, null, msgs);
				return basicSetTheBackground((Background)otherEnd, msgs);
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
			case GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND:
				return basicSetTheBackground(null, msgs);
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
			case GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND:
				return getTheBackground();
			case GencomboboxPackage.GEN_COMBO_BOX__THE_COMBO_BOX:
				if (resolve) return getTheComboBox();
				return basicGetTheComboBox();
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
			case GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND:
				setTheBackground((Background)newValue);
				return;
			case GencomboboxPackage.GEN_COMBO_BOX__THE_COMBO_BOX:
				setTheComboBox((ComboBox)newValue);
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
			case GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND:
				setTheBackground((Background)null);
				return;
			case GencomboboxPackage.GEN_COMBO_BOX__THE_COMBO_BOX:
				setTheComboBox((ComboBox)null);
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
			case GencomboboxPackage.GEN_COMBO_BOX__THE_BACKGROUND:
				return theBackground != null;
			case GencomboboxPackage.GEN_COMBO_BOX__THE_COMBO_BOX:
				return theComboBox != null;
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
			case GencomboboxPackage.GEN_COMBO_BOX___CREATE_PROPERTIES_COMBO_BOX__PROPERTIE:
				createPropertiesComboBox((Propertie)arguments.get(0));
				return null;
			case GencomboboxPackage.GEN_COMBO_BOX___CREATE_BACKGROUND:
				createBackground();
				return null;
			case GencomboboxPackage.GEN_COMBO_BOX___SET_DEFAULT_COMBO__PROPERTIE:
				setDefaultCombo((Propertie)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenComboBoxImpl
