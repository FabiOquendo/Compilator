/**
 */
package generator.genmodel.gencontainercomponent.gencontainer.impl;

import generator.apperance.background.Background;
import generator.apperance.background.BackgroundPackage;

import generator.apperance.orientation.Orientation;
import generator.apperance.orientation.OrientationPackage;

import generator.apperance.titlesize.TitleHeight;
import generator.apperance.titlesize.TitlesizePackage;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;
import generator.genmodel.gencontainercomponent.gencontainer.GencontainerPackage;

import generator.genmodel.gencontainercomponent.impl.GenContainerElementImpl;

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
 * An implementation of the model object '<em><b>Gen Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.gencontainercomponent.gencontainer.impl.GenContainerImpl#getTheTitleHeight <em>The Title Height</em>}</li>
 *   <li>{@link generator.genmodel.gencontainercomponent.gencontainer.impl.GenContainerImpl#getTheOrientation <em>The Orientation</em>}</li>
 *   <li>{@link generator.genmodel.gencontainercomponent.gencontainer.impl.GenContainerImpl#getTheContainer <em>The Container</em>}</li>
 *   <li>{@link generator.genmodel.gencontainercomponent.gencontainer.impl.GenContainerImpl#getTheBackground <em>The Background</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenContainerImpl extends GenContainerElementImpl implements GenContainer {
	/**
	 * The cached value of the '{@link #getTheTitleHeight() <em>The Title Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheTitleHeight()
	 * @generated
	 * @ordered
	 */
	protected TitleHeight theTitleHeight;

	/**
	 * The cached value of the '{@link #getTheOrientation() <em>The Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation theOrientation;

	/**
	 * The cached value of the '{@link #getTheContainer() <em>The Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheContainer()
	 * @generated
	 * @ordered
	 */
	protected compilator.domain.expression.expressionmodel.containercomponent.Container theContainer;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencontainerPackage.Literals.GEN_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleHeight getTheTitleHeight() {
		return theTitleHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheTitleHeight(TitleHeight newTheTitleHeight, NotificationChain msgs) {
		TitleHeight oldTheTitleHeight = theTitleHeight;
		theTitleHeight = newTheTitleHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT, oldTheTitleHeight, newTheTitleHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTitleHeight(TitleHeight newTheTitleHeight) {
		if (newTheTitleHeight != theTitleHeight) {
			NotificationChain msgs = null;
			if (theTitleHeight != null)
				msgs = ((InternalEObject)theTitleHeight).eInverseRemove(this, TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER, TitleHeight.class, msgs);
			if (newTheTitleHeight != null)
				msgs = ((InternalEObject)newTheTitleHeight).eInverseAdd(this, TitlesizePackage.TITLE_HEIGHT__GEN_CONTAINER, TitleHeight.class, msgs);
			msgs = basicSetTheTitleHeight(newTheTitleHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT, newTheTitleHeight, newTheTitleHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getTheOrientation() {
		return theOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheOrientation(Orientation newTheOrientation, NotificationChain msgs) {
		Orientation oldTheOrientation = theOrientation;
		theOrientation = newTheOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION, oldTheOrientation, newTheOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheOrientation(Orientation newTheOrientation) {
		if (newTheOrientation != theOrientation) {
			NotificationChain msgs = null;
			if (theOrientation != null)
				msgs = ((InternalEObject)theOrientation).eInverseRemove(this, OrientationPackage.ORIENTATION__GEN_CONTAINER, Orientation.class, msgs);
			if (newTheOrientation != null)
				msgs = ((InternalEObject)newTheOrientation).eInverseAdd(this, OrientationPackage.ORIENTATION__GEN_CONTAINER, Orientation.class, msgs);
			msgs = basicSetTheOrientation(newTheOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION, newTheOrientation, newTheOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compilator.domain.expression.expressionmodel.containercomponent.Container getTheContainer() {
		if (theContainer != null && theContainer.eIsProxy()) {
			InternalEObject oldTheContainer = (InternalEObject)theContainer;
			theContainer = (compilator.domain.expression.expressionmodel.containercomponent.Container)eResolveProxy(oldTheContainer);
			if (theContainer != oldTheContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencontainerPackage.GEN_CONTAINER__THE_CONTAINER, oldTheContainer, theContainer));
			}
		}
		return theContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compilator.domain.expression.expressionmodel.containercomponent.Container basicGetTheContainer() {
		return theContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheContainer(compilator.domain.expression.expressionmodel.containercomponent.Container newTheContainer) {
		compilator.domain.expression.expressionmodel.containercomponent.Container oldTheContainer = theContainer;
		theContainer = newTheContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencontainerPackage.GEN_CONTAINER__THE_CONTAINER, oldTheContainer, theContainer));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND, oldTheBackground, newTheBackground);
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
				msgs = ((InternalEObject)theBackground).eInverseRemove(this, BackgroundPackage.BACKGROUND__GEN_CONTAINER, Background.class, msgs);
			if (newTheBackground != null)
				msgs = ((InternalEObject)newTheBackground).eInverseAdd(this, BackgroundPackage.BACKGROUND__GEN_CONTAINER, Background.class, msgs);
			msgs = basicSetTheBackground(newTheBackground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND, newTheBackground, newTheBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPropertiesContainer(final String orientation, final Propertie fontSize) {
		super.createProperties();
		createBackground();
		createOrientation();
		createTitleHeight();
		setDefaultContainer(orientation, fontSize);
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
	public void createOrientation() {
		Orientation o = generator.apperance.orientation.OrientationFactory.eINSTANCE.createOrientation();
		this.setTheOrientation(o);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createTitleHeight() {
		TitleHeight th = generator.apperance.titlesize.TitlesizeFactory.eINSTANCE.createTitleHeight();
		this.setTheTitleHeight(th);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultContainer(final String orientation, final Propertie fontSize) {
		if(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {
			generator.apperance.size.Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
			w.setValue(100);
			this.setTheWidth(w);
		}
		if(this.getTheHeight() == null || this.getTheHeight().getValue() == null) {
			generator.apperance.size.Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();
			h.setValue(25);
			this.setTheHeight(h);;
		}
		if(this.getTheBackground() == null || this.getTheBackground().getValue() == null) {
			generator.apperance.background.Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();
			b.setValue("#FFFFFF");
			this.setTheBackground(b);
		} 
		if(this.getTheOrientation() == null || this.getTheOrientation().getValue() == null) {
			generator.apperance.orientation.Orientation o = generator.apperance.orientation.OrientationFactory.eINSTANCE.createOrientation();
			o.setValue(orientation);
			this.setTheOrientation(o);
		} 
		if(this.getTheTitleHeight() == null || this.getTheTitleHeight().getValue() == null) {
			generator.apperance.titlesize.TitleHeight th = generator.apperance.titlesize.TitlesizeFactory.eINSTANCE.createTitleHeight();
			int h = 20;
			int value = Integer.parseInt(fontSize.getValue());
			if(value > 12) {
				h += (value-12)*2;
			}
			th.setValue(h);
			this.setTheTitleHeight(th);
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
			case GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT:
				if (theTitleHeight != null)
					msgs = ((InternalEObject)theTitleHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT, null, msgs);
				return basicSetTheTitleHeight((TitleHeight)otherEnd, msgs);
			case GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION:
				if (theOrientation != null)
					msgs = ((InternalEObject)theOrientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION, null, msgs);
				return basicSetTheOrientation((Orientation)otherEnd, msgs);
			case GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND:
				if (theBackground != null)
					msgs = ((InternalEObject)theBackground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND, null, msgs);
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
			case GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT:
				return basicSetTheTitleHeight(null, msgs);
			case GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION:
				return basicSetTheOrientation(null, msgs);
			case GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND:
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
			case GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT:
				return getTheTitleHeight();
			case GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION:
				return getTheOrientation();
			case GencontainerPackage.GEN_CONTAINER__THE_CONTAINER:
				if (resolve) return getTheContainer();
				return basicGetTheContainer();
			case GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND:
				return getTheBackground();
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
			case GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT:
				setTheTitleHeight((TitleHeight)newValue);
				return;
			case GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION:
				setTheOrientation((Orientation)newValue);
				return;
			case GencontainerPackage.GEN_CONTAINER__THE_CONTAINER:
				setTheContainer((compilator.domain.expression.expressionmodel.containercomponent.Container)newValue);
				return;
			case GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND:
				setTheBackground((Background)newValue);
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
			case GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT:
				setTheTitleHeight((TitleHeight)null);
				return;
			case GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION:
				setTheOrientation((Orientation)null);
				return;
			case GencontainerPackage.GEN_CONTAINER__THE_CONTAINER:
				setTheContainer((compilator.domain.expression.expressionmodel.containercomponent.Container)null);
				return;
			case GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND:
				setTheBackground((Background)null);
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
			case GencontainerPackage.GEN_CONTAINER__THE_TITLE_HEIGHT:
				return theTitleHeight != null;
			case GencontainerPackage.GEN_CONTAINER__THE_ORIENTATION:
				return theOrientation != null;
			case GencontainerPackage.GEN_CONTAINER__THE_CONTAINER:
				return theContainer != null;
			case GencontainerPackage.GEN_CONTAINER__THE_BACKGROUND:
				return theBackground != null;
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
			case GencontainerPackage.GEN_CONTAINER___CREATE_PROPERTIES_CONTAINER__STRING_PROPERTIE:
				createPropertiesContainer((String)arguments.get(0), (Propertie)arguments.get(1));
				return null;
			case GencontainerPackage.GEN_CONTAINER___CREATE_BACKGROUND:
				createBackground();
				return null;
			case GencontainerPackage.GEN_CONTAINER___CREATE_ORIENTATION:
				createOrientation();
				return null;
			case GencontainerPackage.GEN_CONTAINER___CREATE_TITLE_HEIGHT:
				createTitleHeight();
				return null;
			case GencontainerPackage.GEN_CONTAINER___SET_DEFAULT_CONTAINER__STRING_PROPERTIE:
				setDefaultContainer((String)arguments.get(0), (Propertie)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenContainerImpl
