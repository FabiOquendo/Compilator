/**
 */
package generator.genmodel.genindividualcomponent.genlabel.impl;

import compilator.domain.expression.expressionmodel.individualcomponent.Label;

import generator.apperance.alignment.Alignment;
import generator.apperance.alignment.AlignmentPackage;

import generator.apperance.background.Background;
import generator.apperance.background.BackgroundPackage;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;
import generator.genmodel.genindividualcomponent.genlabel.GenlabelPackage;

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
 * An implementation of the model object '<em><b>Gen Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.genlabel.impl.GenLabelImpl#getTheBackground <em>The Background</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.genlabel.impl.GenLabelImpl#getTheLabel <em>The Label</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.genlabel.impl.GenLabelImpl#getTheAlignment <em>The Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenLabelImpl extends GenIndividualElementImpl implements GenLabel {
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
	 * The cached value of the '{@link #getTheLabel() <em>The Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheLabel()
	 * @generated
	 * @ordered
	 */
	protected Label theLabel;

	/**
	 * The cached value of the '{@link #getTheAlignment() <em>The Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheAlignment()
	 * @generated
	 * @ordered
	 */
	protected Alignment theAlignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenlabelPackage.Literals.GEN_LABEL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenlabelPackage.GEN_LABEL__THE_BACKGROUND, oldTheBackground, newTheBackground);
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
				msgs = ((InternalEObject)theBackground).eInverseRemove(this, BackgroundPackage.BACKGROUND__GEN_LABEL, Background.class, msgs);
			if (newTheBackground != null)
				msgs = ((InternalEObject)newTheBackground).eInverseAdd(this, BackgroundPackage.BACKGROUND__GEN_LABEL, Background.class, msgs);
			msgs = basicSetTheBackground(newTheBackground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenlabelPackage.GEN_LABEL__THE_BACKGROUND, newTheBackground, newTheBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getTheLabel() {
		if (theLabel != null && theLabel.eIsProxy()) {
			InternalEObject oldTheLabel = (InternalEObject)theLabel;
			theLabel = (Label)eResolveProxy(oldTheLabel);
			if (theLabel != oldTheLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenlabelPackage.GEN_LABEL__THE_LABEL, oldTheLabel, theLabel));
			}
		}
		return theLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetTheLabel() {
		return theLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheLabel(Label newTheLabel) {
		Label oldTheLabel = theLabel;
		theLabel = newTheLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenlabelPackage.GEN_LABEL__THE_LABEL, oldTheLabel, theLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignment getTheAlignment() {
		return theAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheAlignment(Alignment newTheAlignment, NotificationChain msgs) {
		Alignment oldTheAlignment = theAlignment;
		theAlignment = newTheAlignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenlabelPackage.GEN_LABEL__THE_ALIGNMENT, oldTheAlignment, newTheAlignment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheAlignment(Alignment newTheAlignment) {
		if (newTheAlignment != theAlignment) {
			NotificationChain msgs = null;
			if (theAlignment != null)
				msgs = ((InternalEObject)theAlignment).eInverseRemove(this, AlignmentPackage.ALIGNMENT__GEN_LABEL, Alignment.class, msgs);
			if (newTheAlignment != null)
				msgs = ((InternalEObject)newTheAlignment).eInverseAdd(this, AlignmentPackage.ALIGNMENT__GEN_LABEL, Alignment.class, msgs);
			msgs = basicSetTheAlignment(newTheAlignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenlabelPackage.GEN_LABEL__THE_ALIGNMENT, newTheAlignment, newTheAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPropertiesLabel(final String text, final Propertie fontSize) {
		super.createProperties();
		createAlignment();
		createBackground();
		setDefaultLabel(text, fontSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createAlignment() {
		Alignment a = generator.apperance.alignment.AlignmentFactory.eINSTANCE.createAlignment();
		this.setTheAlignment(a);
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
	public void setDefaultLabel(final String text, final Propertie fontSize) {
		if(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {
			generator.apperance.size.Width width = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
			int w = 80;
			int aux = 14 - (Integer.parseInt(fontSize.getValue())/2);
			if(text.length() >  aux) {
				int d = text.length() - aux;
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
		if(this.getTheAlignment() == null || this.getTheAlignment().getValue() == null) {
			generator.apperance.alignment.Alignment a = generator.apperance.alignment.AlignmentFactory.eINSTANCE.createAlignment();
			a.setValue("RIGHT");
			this.setTheAlignment(a);
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
			case GenlabelPackage.GEN_LABEL__THE_BACKGROUND:
				if (theBackground != null)
					msgs = ((InternalEObject)theBackground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenlabelPackage.GEN_LABEL__THE_BACKGROUND, null, msgs);
				return basicSetTheBackground((Background)otherEnd, msgs);
			case GenlabelPackage.GEN_LABEL__THE_ALIGNMENT:
				if (theAlignment != null)
					msgs = ((InternalEObject)theAlignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenlabelPackage.GEN_LABEL__THE_ALIGNMENT, null, msgs);
				return basicSetTheAlignment((Alignment)otherEnd, msgs);
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
			case GenlabelPackage.GEN_LABEL__THE_BACKGROUND:
				return basicSetTheBackground(null, msgs);
			case GenlabelPackage.GEN_LABEL__THE_ALIGNMENT:
				return basicSetTheAlignment(null, msgs);
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
			case GenlabelPackage.GEN_LABEL__THE_BACKGROUND:
				return getTheBackground();
			case GenlabelPackage.GEN_LABEL__THE_LABEL:
				if (resolve) return getTheLabel();
				return basicGetTheLabel();
			case GenlabelPackage.GEN_LABEL__THE_ALIGNMENT:
				return getTheAlignment();
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
			case GenlabelPackage.GEN_LABEL__THE_BACKGROUND:
				setTheBackground((Background)newValue);
				return;
			case GenlabelPackage.GEN_LABEL__THE_LABEL:
				setTheLabel((Label)newValue);
				return;
			case GenlabelPackage.GEN_LABEL__THE_ALIGNMENT:
				setTheAlignment((Alignment)newValue);
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
			case GenlabelPackage.GEN_LABEL__THE_BACKGROUND:
				setTheBackground((Background)null);
				return;
			case GenlabelPackage.GEN_LABEL__THE_LABEL:
				setTheLabel((Label)null);
				return;
			case GenlabelPackage.GEN_LABEL__THE_ALIGNMENT:
				setTheAlignment((Alignment)null);
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
			case GenlabelPackage.GEN_LABEL__THE_BACKGROUND:
				return theBackground != null;
			case GenlabelPackage.GEN_LABEL__THE_LABEL:
				return theLabel != null;
			case GenlabelPackage.GEN_LABEL__THE_ALIGNMENT:
				return theAlignment != null;
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
			case GenlabelPackage.GEN_LABEL___CREATE_PROPERTIES_LABEL__STRING_PROPERTIE:
				createPropertiesLabel((String)arguments.get(0), (Propertie)arguments.get(1));
				return null;
			case GenlabelPackage.GEN_LABEL___CREATE_ALIGNMENT:
				createAlignment();
				return null;
			case GenlabelPackage.GEN_LABEL___CREATE_BACKGROUND:
				createBackground();
				return null;
			case GenlabelPackage.GEN_LABEL___SET_DEFAULT_LABEL__STRING_PROPERTIE:
				setDefaultLabel((String)arguments.get(0), (Propertie)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenLabelImpl
