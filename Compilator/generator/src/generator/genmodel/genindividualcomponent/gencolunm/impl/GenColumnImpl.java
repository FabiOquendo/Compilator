/**
 */
package generator.genmodel.genindividualcomponent.gencolunm.impl;

import compilator.domain.expression.expressionmodel.individualcomponent.Column;

import generator.apperance.alignment.Alignment;
import generator.apperance.alignment.AlignmentPackage;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;
import generator.genmodel.genindividualcomponent.gencolunm.GencolunmPackage;

import generator.genmodel.genindividualcomponent.gentable.GenTable;
import generator.genmodel.genindividualcomponent.gentable.GentablePackage;

import generator.genmodel.genindividualcomponent.impl.GenIndividualElementImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import styles.domain.Propertie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.gencolunm.impl.GenColumnImpl#getGenTable <em>Gen Table</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gencolunm.impl.GenColumnImpl#getTheColumn <em>The Column</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gencolunm.impl.GenColumnImpl#getTheAlignment <em>The Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenColumnImpl extends GenIndividualElementImpl implements GenColumn {
	/**
	 * The cached value of the '{@link #getTheColumn() <em>The Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheColumn()
	 * @generated
	 * @ordered
	 */
	protected Column theColumn;

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
	protected GenColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GencolunmPackage.Literals.GEN_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTable getGenTable() {
		if (eContainerFeatureID() != GencolunmPackage.GEN_COLUMN__GEN_TABLE) return null;
		return (GenTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenTable(GenTable newGenTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenTable, GencolunmPackage.GEN_COLUMN__GEN_TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenTable(GenTable newGenTable) {
		if (newGenTable != eInternalContainer() || (eContainerFeatureID() != GencolunmPackage.GEN_COLUMN__GEN_TABLE && newGenTable != null)) {
			if (EcoreUtil.isAncestor(this, newGenTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenTable != null)
				msgs = ((InternalEObject)newGenTable).eInverseAdd(this, GentablePackage.GEN_TABLE__LIST_GEN_COLUMNS, GenTable.class, msgs);
			msgs = basicSetGenTable(newGenTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencolunmPackage.GEN_COLUMN__GEN_TABLE, newGenTable, newGenTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getTheColumn() {
		if (theColumn != null && theColumn.eIsProxy()) {
			InternalEObject oldTheColumn = (InternalEObject)theColumn;
			theColumn = (Column)eResolveProxy(oldTheColumn);
			if (theColumn != oldTheColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GencolunmPackage.GEN_COLUMN__THE_COLUMN, oldTheColumn, theColumn));
			}
		}
		return theColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetTheColumn() {
		return theColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheColumn(Column newTheColumn) {
		Column oldTheColumn = theColumn;
		theColumn = newTheColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencolunmPackage.GEN_COLUMN__THE_COLUMN, oldTheColumn, theColumn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT, oldTheAlignment, newTheAlignment);
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
				msgs = ((InternalEObject)theAlignment).eInverseRemove(this, AlignmentPackage.ALIGNMENT__GEN_COLUMN, Alignment.class, msgs);
			if (newTheAlignment != null)
				msgs = ((InternalEObject)newTheAlignment).eInverseAdd(this, AlignmentPackage.ALIGNMENT__GEN_COLUMN, Alignment.class, msgs);
			msgs = basicSetTheAlignment(newTheAlignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT, newTheAlignment, newTheAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPropertiesColumn(final String text, final Propertie fontSize) {
		super.createProperties();
		createAlignment();
		setDefaultColumn(text, fontSize);
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
	public void setDefaultColumn(final String text, final Propertie fontSize) {
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
			a.setValue("CENTER");
			this.setTheAlignment(a);
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
			case GencolunmPackage.GEN_COLUMN__GEN_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenTable((GenTable)otherEnd, msgs);
			case GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT:
				if (theAlignment != null)
					msgs = ((InternalEObject)theAlignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT, null, msgs);
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
			case GencolunmPackage.GEN_COLUMN__GEN_TABLE:
				return basicSetGenTable(null, msgs);
			case GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GencolunmPackage.GEN_COLUMN__GEN_TABLE:
				return eInternalContainer().eInverseRemove(this, GentablePackage.GEN_TABLE__LIST_GEN_COLUMNS, GenTable.class, msgs);
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
			case GencolunmPackage.GEN_COLUMN__GEN_TABLE:
				return getGenTable();
			case GencolunmPackage.GEN_COLUMN__THE_COLUMN:
				if (resolve) return getTheColumn();
				return basicGetTheColumn();
			case GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT:
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
			case GencolunmPackage.GEN_COLUMN__GEN_TABLE:
				setGenTable((GenTable)newValue);
				return;
			case GencolunmPackage.GEN_COLUMN__THE_COLUMN:
				setTheColumn((Column)newValue);
				return;
			case GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT:
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
			case GencolunmPackage.GEN_COLUMN__GEN_TABLE:
				setGenTable((GenTable)null);
				return;
			case GencolunmPackage.GEN_COLUMN__THE_COLUMN:
				setTheColumn((Column)null);
				return;
			case GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT:
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
			case GencolunmPackage.GEN_COLUMN__GEN_TABLE:
				return getGenTable() != null;
			case GencolunmPackage.GEN_COLUMN__THE_COLUMN:
				return theColumn != null;
			case GencolunmPackage.GEN_COLUMN__THE_ALIGNMENT:
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
			case GencolunmPackage.GEN_COLUMN___CREATE_PROPERTIES_COLUMN__STRING_PROPERTIE:
				createPropertiesColumn((String)arguments.get(0), (Propertie)arguments.get(1));
				return null;
			case GencolunmPackage.GEN_COLUMN___CREATE_ALIGNMENT:
				createAlignment();
				return null;
			case GencolunmPackage.GEN_COLUMN___SET_DEFAULT_COLUMN__STRING_PROPERTIE:
				setDefaultColumn((String)arguments.get(0), (Propertie)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenColumnImpl
