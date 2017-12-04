/**
 */
package generator.genmodel.impl;

import generator.apperance.font.Color;
import generator.apperance.font.FontPackage;
import generator.apperance.font.Size;
import generator.apperance.font.Type;

import generator.apperance.position.PositionPackage;
import generator.apperance.position.X;
import generator.apperance.position.Y;

import generator.apperance.size.Height;
import generator.apperance.size.SizePackage;
import generator.apperance.size.Width;

import generator.genmodel.GenElement;
import generator.genmodel.GenModel;
import generator.genmodel.GenmodelPackage;

import generator.genmodel.gencontainercomponent.GenContainerElement;
import generator.genmodel.gencontainercomponent.GencontainercomponentPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.impl.GenElementImpl#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link generator.genmodel.impl.GenElementImpl#getGenContainerElement <em>Gen Container Element</em>}</li>
 *   <li>{@link generator.genmodel.impl.GenElementImpl#getTheX <em>The X</em>}</li>
 *   <li>{@link generator.genmodel.impl.GenElementImpl#getTheY <em>The Y</em>}</li>
 *   <li>{@link generator.genmodel.impl.GenElementImpl#getTheWidth <em>The Width</em>}</li>
 *   <li>{@link generator.genmodel.impl.GenElementImpl#getTheHeight <em>The Height</em>}</li>
 *   <li>{@link generator.genmodel.impl.GenElementImpl#getTheColor <em>The Color</em>}</li>
 *   <li>{@link generator.genmodel.impl.GenElementImpl#getTheType <em>The Type</em>}</li>
 *   <li>{@link generator.genmodel.impl.GenElementImpl#getTheSize <em>The Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GenElementImpl extends MinimalEObjectImpl.Container implements GenElement {
	/**
	 * The cached value of the '{@link #getTheX() <em>The X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheX()
	 * @generated
	 * @ordered
	 */
	protected X theX;

	/**
	 * The cached value of the '{@link #getTheY() <em>The Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheY()
	 * @generated
	 * @ordered
	 */
	protected Y theY;

	/**
	 * The cached value of the '{@link #getTheWidth() <em>The Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheWidth()
	 * @generated
	 * @ordered
	 */
	protected Width theWidth;

	/**
	 * The cached value of the '{@link #getTheHeight() <em>The Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheHeight()
	 * @generated
	 * @ordered
	 */
	protected Height theHeight;

	/**
	 * The cached value of the '{@link #getTheColor() <em>The Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheColor()
	 * @generated
	 * @ordered
	 */
	protected Color theColor;

	/**
	 * The cached value of the '{@link #getTheType() <em>The Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheType()
	 * @generated
	 * @ordered
	 */
	protected Type theType;

	/**
	 * The cached value of the '{@link #getTheSize() <em>The Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheSize()
	 * @generated
	 * @ordered
	 */
	protected Size theSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenmodelPackage.Literals.GEN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel getGenModel() {
		if (eContainerFeatureID() != GenmodelPackage.GEN_ELEMENT__GEN_MODEL) return null;
		return (GenModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenModel(GenModel newGenModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenModel, GenmodelPackage.GEN_ELEMENT__GEN_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenModel(GenModel newGenModel) {
		if (newGenModel != eInternalContainer() || (eContainerFeatureID() != GenmodelPackage.GEN_ELEMENT__GEN_MODEL && newGenModel != null)) {
			if (EcoreUtil.isAncestor(this, newGenModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenModel != null)
				msgs = ((InternalEObject)newGenModel).eInverseAdd(this, GenmodelPackage.GEN_MODEL__LIST_GEN_ELEMENTS, GenModel.class, msgs);
			msgs = basicSetGenModel(newGenModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__GEN_MODEL, newGenModel, newGenModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenContainerElement getGenContainerElement() {
		if (eContainerFeatureID() != GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT) return null;
		return (GenContainerElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenContainerElement(GenContainerElement newGenContainerElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenContainerElement, GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenContainerElement(GenContainerElement newGenContainerElement) {
		if (newGenContainerElement != eInternalContainer() || (eContainerFeatureID() != GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT && newGenContainerElement != null)) {
			if (EcoreUtil.isAncestor(this, newGenContainerElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenContainerElement != null)
				msgs = ((InternalEObject)newGenContainerElement).eInverseAdd(this, GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS, GenContainerElement.class, msgs);
			msgs = basicSetGenContainerElement(newGenContainerElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT, newGenContainerElement, newGenContainerElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X getTheX() {
		return theX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheX(X newTheX, NotificationChain msgs) {
		X oldTheX = theX;
		theX = newTheX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_X, oldTheX, newTheX);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheX(X newTheX) {
		if (newTheX != theX) {
			NotificationChain msgs = null;
			if (theX != null)
				msgs = ((InternalEObject)theX).eInverseRemove(this, PositionPackage.X__GEN_ELEMENT, X.class, msgs);
			if (newTheX != null)
				msgs = ((InternalEObject)newTheX).eInverseAdd(this, PositionPackage.X__GEN_ELEMENT, X.class, msgs);
			msgs = basicSetTheX(newTheX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_X, newTheX, newTheX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Y getTheY() {
		return theY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheY(Y newTheY, NotificationChain msgs) {
		Y oldTheY = theY;
		theY = newTheY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_Y, oldTheY, newTheY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheY(Y newTheY) {
		if (newTheY != theY) {
			NotificationChain msgs = null;
			if (theY != null)
				msgs = ((InternalEObject)theY).eInverseRemove(this, PositionPackage.Y__GEN_ELEMENT, Y.class, msgs);
			if (newTheY != null)
				msgs = ((InternalEObject)newTheY).eInverseAdd(this, PositionPackage.Y__GEN_ELEMENT, Y.class, msgs);
			msgs = basicSetTheY(newTheY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_Y, newTheY, newTheY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Width getTheWidth() {
		return theWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheWidth(Width newTheWidth, NotificationChain msgs) {
		Width oldTheWidth = theWidth;
		theWidth = newTheWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_WIDTH, oldTheWidth, newTheWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheWidth(Width newTheWidth) {
		if (newTheWidth != theWidth) {
			NotificationChain msgs = null;
			if (theWidth != null)
				msgs = ((InternalEObject)theWidth).eInverseRemove(this, SizePackage.WIDTH__GEN_ELEMENT, Width.class, msgs);
			if (newTheWidth != null)
				msgs = ((InternalEObject)newTheWidth).eInverseAdd(this, SizePackage.WIDTH__GEN_ELEMENT, Width.class, msgs);
			msgs = basicSetTheWidth(newTheWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_WIDTH, newTheWidth, newTheWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Height getTheHeight() {
		return theHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheHeight(Height newTheHeight, NotificationChain msgs) {
		Height oldTheHeight = theHeight;
		theHeight = newTheHeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_HEIGHT, oldTheHeight, newTheHeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheHeight(Height newTheHeight) {
		if (newTheHeight != theHeight) {
			NotificationChain msgs = null;
			if (theHeight != null)
				msgs = ((InternalEObject)theHeight).eInverseRemove(this, SizePackage.HEIGHT__GEN_ELEMENT, Height.class, msgs);
			if (newTheHeight != null)
				msgs = ((InternalEObject)newTheHeight).eInverseAdd(this, SizePackage.HEIGHT__GEN_ELEMENT, Height.class, msgs);
			msgs = basicSetTheHeight(newTheHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_HEIGHT, newTheHeight, newTheHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getTheColor() {
		return theColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheColor(Color newTheColor, NotificationChain msgs) {
		Color oldTheColor = theColor;
		theColor = newTheColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_COLOR, oldTheColor, newTheColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheColor(Color newTheColor) {
		if (newTheColor != theColor) {
			NotificationChain msgs = null;
			if (theColor != null)
				msgs = ((InternalEObject)theColor).eInverseRemove(this, FontPackage.COLOR__GEN_ELEMENT, Color.class, msgs);
			if (newTheColor != null)
				msgs = ((InternalEObject)newTheColor).eInverseAdd(this, FontPackage.COLOR__GEN_ELEMENT, Color.class, msgs);
			msgs = basicSetTheColor(newTheColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_COLOR, newTheColor, newTheColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getTheType() {
		return theType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheType(Type newTheType, NotificationChain msgs) {
		Type oldTheType = theType;
		theType = newTheType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_TYPE, oldTheType, newTheType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheType(Type newTheType) {
		if (newTheType != theType) {
			NotificationChain msgs = null;
			if (theType != null)
				msgs = ((InternalEObject)theType).eInverseRemove(this, FontPackage.TYPE__GEN_ELEMENT, Type.class, msgs);
			if (newTheType != null)
				msgs = ((InternalEObject)newTheType).eInverseAdd(this, FontPackage.TYPE__GEN_ELEMENT, Type.class, msgs);
			msgs = basicSetTheType(newTheType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_TYPE, newTheType, newTheType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size getTheSize() {
		return theSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheSize(Size newTheSize, NotificationChain msgs) {
		Size oldTheSize = theSize;
		theSize = newTheSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_SIZE, oldTheSize, newTheSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheSize(Size newTheSize) {
		if (newTheSize != theSize) {
			NotificationChain msgs = null;
			if (theSize != null)
				msgs = ((InternalEObject)theSize).eInverseRemove(this, FontPackage.SIZE__GEN_ELEMENT, Size.class, msgs);
			if (newTheSize != null)
				msgs = ((InternalEObject)newTheSize).eInverseAdd(this, FontPackage.SIZE__GEN_ELEMENT, Size.class, msgs);
			msgs = basicSetTheSize(newTheSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenmodelPackage.GEN_ELEMENT__THE_SIZE, newTheSize, newTheSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createX() {
			X x = generator.apperance.position.PositionFactory.eINSTANCE.createX();
			this.setTheX(x);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createY() {
			Y y = generator.apperance.position.PositionFactory.eINSTANCE.createY();
			this.setTheY(y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createWidth() {
			Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
			this.setTheWidth(w);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createHeight() {
			Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();
			this.setTheHeight(h);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createFontColor() {
			Color c = generator.apperance.font.FontFactory.eINSTANCE.createColor();
			this.setTheColor(c);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createFontType() {
			Type t = generator.apperance.font.FontFactory.eINSTANCE.createType();
			this.setTheType(t);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createFontSize() {
			Size s = generator.apperance.font.FontFactory.eINSTANCE.createSize();
			this.setTheSize(s);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createProperties() {
		createX();
		createY();
		createWidth();
		createHeight();
		createFontColor();
		createFontType();
		createFontSize();
		setDefaultFont();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFont() {
		if(this.getTheColor() == null || this.getTheColor().getValue() == null) {
			generator.apperance.font.Color c = generator.apperance.font.FontFactory.eINSTANCE.createColor();
			c.setValue("#000000");
			this.setTheColor(c);
		}
		if(this.getTheType() == null || this.getTheType().getValue() == null) {
			generator.apperance.font.Type t = generator.apperance.font.FontFactory.eINSTANCE.createType();
			t.setValue("Calibri");
			this.setTheType(t);
		} 
		if(this.getTheSize() == null || this.getTheSize().getValue() == null) {
			generator.apperance.font.Size s = generator.apperance.font.FontFactory.eINSTANCE.createSize();
			s.setValue(11);
			this.setTheSize(s);
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
			case GenmodelPackage.GEN_ELEMENT__GEN_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenModel((GenModel)otherEnd, msgs);
			case GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenContainerElement((GenContainerElement)otherEnd, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_X:
				if (theX != null)
					msgs = ((InternalEObject)theX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenmodelPackage.GEN_ELEMENT__THE_X, null, msgs);
				return basicSetTheX((X)otherEnd, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_Y:
				if (theY != null)
					msgs = ((InternalEObject)theY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenmodelPackage.GEN_ELEMENT__THE_Y, null, msgs);
				return basicSetTheY((Y)otherEnd, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_WIDTH:
				if (theWidth != null)
					msgs = ((InternalEObject)theWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenmodelPackage.GEN_ELEMENT__THE_WIDTH, null, msgs);
				return basicSetTheWidth((Width)otherEnd, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_HEIGHT:
				if (theHeight != null)
					msgs = ((InternalEObject)theHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenmodelPackage.GEN_ELEMENT__THE_HEIGHT, null, msgs);
				return basicSetTheHeight((Height)otherEnd, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_COLOR:
				if (theColor != null)
					msgs = ((InternalEObject)theColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenmodelPackage.GEN_ELEMENT__THE_COLOR, null, msgs);
				return basicSetTheColor((Color)otherEnd, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_TYPE:
				if (theType != null)
					msgs = ((InternalEObject)theType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenmodelPackage.GEN_ELEMENT__THE_TYPE, null, msgs);
				return basicSetTheType((Type)otherEnd, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_SIZE:
				if (theSize != null)
					msgs = ((InternalEObject)theSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenmodelPackage.GEN_ELEMENT__THE_SIZE, null, msgs);
				return basicSetTheSize((Size)otherEnd, msgs);
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
			case GenmodelPackage.GEN_ELEMENT__GEN_MODEL:
				return basicSetGenModel(null, msgs);
			case GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT:
				return basicSetGenContainerElement(null, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_X:
				return basicSetTheX(null, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_Y:
				return basicSetTheY(null, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_WIDTH:
				return basicSetTheWidth(null, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_HEIGHT:
				return basicSetTheHeight(null, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_COLOR:
				return basicSetTheColor(null, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_TYPE:
				return basicSetTheType(null, msgs);
			case GenmodelPackage.GEN_ELEMENT__THE_SIZE:
				return basicSetTheSize(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GenmodelPackage.GEN_ELEMENT__GEN_MODEL:
				return eInternalContainer().eInverseRemove(this, GenmodelPackage.GEN_MODEL__LIST_GEN_ELEMENTS, GenModel.class, msgs);
			case GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT:
				return eInternalContainer().eInverseRemove(this, GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS, GenContainerElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenmodelPackage.GEN_ELEMENT__GEN_MODEL:
				return getGenModel();
			case GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT:
				return getGenContainerElement();
			case GenmodelPackage.GEN_ELEMENT__THE_X:
				return getTheX();
			case GenmodelPackage.GEN_ELEMENT__THE_Y:
				return getTheY();
			case GenmodelPackage.GEN_ELEMENT__THE_WIDTH:
				return getTheWidth();
			case GenmodelPackage.GEN_ELEMENT__THE_HEIGHT:
				return getTheHeight();
			case GenmodelPackage.GEN_ELEMENT__THE_COLOR:
				return getTheColor();
			case GenmodelPackage.GEN_ELEMENT__THE_TYPE:
				return getTheType();
			case GenmodelPackage.GEN_ELEMENT__THE_SIZE:
				return getTheSize();
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
			case GenmodelPackage.GEN_ELEMENT__GEN_MODEL:
				setGenModel((GenModel)newValue);
				return;
			case GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT:
				setGenContainerElement((GenContainerElement)newValue);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_X:
				setTheX((X)newValue);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_Y:
				setTheY((Y)newValue);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_WIDTH:
				setTheWidth((Width)newValue);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_HEIGHT:
				setTheHeight((Height)newValue);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_COLOR:
				setTheColor((Color)newValue);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_TYPE:
				setTheType((Type)newValue);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_SIZE:
				setTheSize((Size)newValue);
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
			case GenmodelPackage.GEN_ELEMENT__GEN_MODEL:
				setGenModel((GenModel)null);
				return;
			case GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT:
				setGenContainerElement((GenContainerElement)null);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_X:
				setTheX((X)null);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_Y:
				setTheY((Y)null);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_WIDTH:
				setTheWidth((Width)null);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_HEIGHT:
				setTheHeight((Height)null);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_COLOR:
				setTheColor((Color)null);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_TYPE:
				setTheType((Type)null);
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_SIZE:
				setTheSize((Size)null);
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
			case GenmodelPackage.GEN_ELEMENT__GEN_MODEL:
				return getGenModel() != null;
			case GenmodelPackage.GEN_ELEMENT__GEN_CONTAINER_ELEMENT:
				return getGenContainerElement() != null;
			case GenmodelPackage.GEN_ELEMENT__THE_X:
				return theX != null;
			case GenmodelPackage.GEN_ELEMENT__THE_Y:
				return theY != null;
			case GenmodelPackage.GEN_ELEMENT__THE_WIDTH:
				return theWidth != null;
			case GenmodelPackage.GEN_ELEMENT__THE_HEIGHT:
				return theHeight != null;
			case GenmodelPackage.GEN_ELEMENT__THE_COLOR:
				return theColor != null;
			case GenmodelPackage.GEN_ELEMENT__THE_TYPE:
				return theType != null;
			case GenmodelPackage.GEN_ELEMENT__THE_SIZE:
				return theSize != null;
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
			case GenmodelPackage.GEN_ELEMENT___CREATE_X:
				createX();
				return null;
			case GenmodelPackage.GEN_ELEMENT___CREATE_Y:
				createY();
				return null;
			case GenmodelPackage.GEN_ELEMENT___CREATE_WIDTH:
				createWidth();
				return null;
			case GenmodelPackage.GEN_ELEMENT___CREATE_HEIGHT:
				createHeight();
				return null;
			case GenmodelPackage.GEN_ELEMENT___CREATE_FONT_COLOR:
				createFontColor();
				return null;
			case GenmodelPackage.GEN_ELEMENT___CREATE_FONT_TYPE:
				createFontType();
				return null;
			case GenmodelPackage.GEN_ELEMENT___CREATE_FONT_SIZE:
				createFontSize();
				return null;
			case GenmodelPackage.GEN_ELEMENT___CREATE_PROPERTIES:
				createProperties();
				return null;
			case GenmodelPackage.GEN_ELEMENT___SET_DEFAULT_FONT:
				setDefaultFont();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenElementImpl
