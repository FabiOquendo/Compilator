/**
 */
package generator.genmodel.genindividualcomponent.gentextfield.impl;

import compilator.domain.expression.expressionmodel.individualcomponent.TextField;

import generator.apperance.background.Background;
import generator.apperance.background.BackgroundPackage;

import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;
import generator.genmodel.genindividualcomponent.gentextfield.GentextfieldPackage;

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
 * An implementation of the model object '<em><b>Gen Text Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentextfield.impl.GenTextFieldImpl#getTheBackground <em>The Background</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentextfield.impl.GenTextFieldImpl#getTheTextField <em>The Text Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenTextFieldImpl extends GenIndividualElementImpl implements GenTextField {
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
	 * The cached value of the '{@link #getTheTextField() <em>The Text Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheTextField()
	 * @generated
	 * @ordered
	 */
	protected TextField theTextField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenTextFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GentextfieldPackage.Literals.GEN_TEXT_FIELD;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND, oldTheBackground, newTheBackground);
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
				msgs = ((InternalEObject)theBackground).eInverseRemove(this, BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD, Background.class, msgs);
			if (newTheBackground != null)
				msgs = ((InternalEObject)newTheBackground).eInverseAdd(this, BackgroundPackage.BACKGROUND__GEN_TEXT_FIELD, Background.class, msgs);
			msgs = basicSetTheBackground(newTheBackground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND, newTheBackground, newTheBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField getTheTextField() {
		if (theTextField != null && theTextField.eIsProxy()) {
			InternalEObject oldTheTextField = (InternalEObject)theTextField;
			theTextField = (TextField)eResolveProxy(oldTheTextField);
			if (theTextField != oldTheTextField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GentextfieldPackage.GEN_TEXT_FIELD__THE_TEXT_FIELD, oldTheTextField, theTextField));
			}
		}
		return theTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField basicGetTheTextField() {
		return theTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTextField(TextField newTheTextField) {
		TextField oldTheTextField = theTextField;
		theTextField = newTheTextField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GentextfieldPackage.GEN_TEXT_FIELD__THE_TEXT_FIELD, oldTheTextField, theTextField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPropertiesTextField(final Propertie fontSize) {
		super.createProperties();
		createBackground();
		setDefaultText(fontSize);
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
	public void setDefaultText(final Propertie fontSize) {
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
			case GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND:
				if (theBackground != null)
					msgs = ((InternalEObject)theBackground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND, null, msgs);
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
			case GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND:
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
			case GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND:
				return getTheBackground();
			case GentextfieldPackage.GEN_TEXT_FIELD__THE_TEXT_FIELD:
				if (resolve) return getTheTextField();
				return basicGetTheTextField();
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
			case GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND:
				setTheBackground((Background)newValue);
				return;
			case GentextfieldPackage.GEN_TEXT_FIELD__THE_TEXT_FIELD:
				setTheTextField((TextField)newValue);
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
			case GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND:
				setTheBackground((Background)null);
				return;
			case GentextfieldPackage.GEN_TEXT_FIELD__THE_TEXT_FIELD:
				setTheTextField((TextField)null);
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
			case GentextfieldPackage.GEN_TEXT_FIELD__THE_BACKGROUND:
				return theBackground != null;
			case GentextfieldPackage.GEN_TEXT_FIELD__THE_TEXT_FIELD:
				return theTextField != null;
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
			case GentextfieldPackage.GEN_TEXT_FIELD___CREATE_PROPERTIES_TEXT_FIELD__PROPERTIE:
				createPropertiesTextField((Propertie)arguments.get(0));
				return null;
			case GentextfieldPackage.GEN_TEXT_FIELD___CREATE_BACKGROUND:
				createBackground();
				return null;
			case GentextfieldPackage.GEN_TEXT_FIELD___SET_DEFAULT_TEXT__PROPERTIE:
				setDefaultText((Propertie)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenTextFieldImpl
