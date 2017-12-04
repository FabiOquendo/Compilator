/**
 */
package generator.genmodel.genindividualcomponent.gentable.impl;

import compilator.domain.expression.expressionmodel.individualcomponent.Table;

import generator.apperance.background.Background;
import generator.apperance.background.BackgroundPackage;

import generator.apperance.linesvisible.LinesVisible;
import generator.apperance.linesvisible.LinesvisiblePackage;

import generator.apperance.titlesize.TitleHeight;
import generator.apperance.titlesize.TitlesizePackage;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;
import generator.genmodel.genindividualcomponent.gencolunm.GencolunmPackage;

import generator.genmodel.genindividualcomponent.gentable.GenTable;
import generator.genmodel.genindividualcomponent.gentable.GentablePackage;

import generator.genmodel.genindividualcomponent.impl.GenIndividualElementImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import styles.domain.Propertie;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentable.impl.GenTableImpl#getTheBackground <em>The Background</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentable.impl.GenTableImpl#getTheLinesVisible <em>The Lines Visible</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentable.impl.GenTableImpl#getTheTitleHeight <em>The Title Height</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentable.impl.GenTableImpl#getListGenColumns <em>List Gen Columns</em>}</li>
 *   <li>{@link generator.genmodel.genindividualcomponent.gentable.impl.GenTableImpl#getTheTable <em>The Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenTableImpl extends GenIndividualElementImpl implements GenTable {
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
	 * The cached value of the '{@link #getTheLinesVisible() <em>The Lines Visible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected LinesVisible theLinesVisible;

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
	 * The cached value of the '{@link #getListGenColumns() <em>List Gen Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListGenColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<GenColumn> listGenColumns;

	/**
	 * The cached value of the '{@link #getTheTable() <em>The Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheTable()
	 * @generated
	 * @ordered
	 */
	protected Table theTable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GentablePackage.Literals.GEN_TABLE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GentablePackage.GEN_TABLE__THE_BACKGROUND, oldTheBackground, newTheBackground);
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
				msgs = ((InternalEObject)theBackground).eInverseRemove(this, BackgroundPackage.BACKGROUND__GEN_TABLE, Background.class, msgs);
			if (newTheBackground != null)
				msgs = ((InternalEObject)newTheBackground).eInverseAdd(this, BackgroundPackage.BACKGROUND__GEN_TABLE, Background.class, msgs);
			msgs = basicSetTheBackground(newTheBackground, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GentablePackage.GEN_TABLE__THE_BACKGROUND, newTheBackground, newTheBackground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinesVisible getTheLinesVisible() {
		return theLinesVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheLinesVisible(LinesVisible newTheLinesVisible, NotificationChain msgs) {
		LinesVisible oldTheLinesVisible = theLinesVisible;
		theLinesVisible = newTheLinesVisible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GentablePackage.GEN_TABLE__THE_LINES_VISIBLE, oldTheLinesVisible, newTheLinesVisible);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheLinesVisible(LinesVisible newTheLinesVisible) {
		if (newTheLinesVisible != theLinesVisible) {
			NotificationChain msgs = null;
			if (theLinesVisible != null)
				msgs = ((InternalEObject)theLinesVisible).eInverseRemove(this, LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE, LinesVisible.class, msgs);
			if (newTheLinesVisible != null)
				msgs = ((InternalEObject)newTheLinesVisible).eInverseAdd(this, LinesvisiblePackage.LINES_VISIBLE__GEN_TABLE, LinesVisible.class, msgs);
			msgs = basicSetTheLinesVisible(newTheLinesVisible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GentablePackage.GEN_TABLE__THE_LINES_VISIBLE, newTheLinesVisible, newTheLinesVisible));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT, oldTheTitleHeight, newTheTitleHeight);
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
				msgs = ((InternalEObject)theTitleHeight).eInverseRemove(this, TitlesizePackage.TITLE_HEIGHT__GEN_TABLE, TitleHeight.class, msgs);
			if (newTheTitleHeight != null)
				msgs = ((InternalEObject)newTheTitleHeight).eInverseAdd(this, TitlesizePackage.TITLE_HEIGHT__GEN_TABLE, TitleHeight.class, msgs);
			msgs = basicSetTheTitleHeight(newTheTitleHeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT, newTheTitleHeight, newTheTitleHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenColumn> getListGenColumns() {
		if (listGenColumns == null) {
			listGenColumns = new EObjectContainmentWithInverseEList<GenColumn>(GenColumn.class, this, GentablePackage.GEN_TABLE__LIST_GEN_COLUMNS, GencolunmPackage.GEN_COLUMN__GEN_TABLE);
		}
		return listGenColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTheTable() {
		if (theTable != null && theTable.eIsProxy()) {
			InternalEObject oldTheTable = (InternalEObject)theTable;
			theTable = (Table)eResolveProxy(oldTheTable);
			if (theTable != oldTheTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GentablePackage.GEN_TABLE__THE_TABLE, oldTheTable, theTable));
			}
		}
		return theTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTheTable() {
		return theTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheTable(Table newTheTable) {
		Table oldTheTable = theTable;
		theTable = newTheTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GentablePackage.GEN_TABLE__THE_TABLE, oldTheTable, theTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPropertiesTable(final Integer columnHeight, final Integer columnsWidth, final Propertie fontSize) {
		super.createProperties();
		createBackground();
		createLinesVisible();
		createTitleHeight();
		setDefaultTable(columnHeight, columnsWidth, fontSize);
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
	public void createLinesVisible() {
		LinesVisible l = generator.apperance.linesvisible.LinesvisibleFactory.eINSTANCE.createLinesVisible();
		this.setTheLinesVisible(l);
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
	public void setDefaultTable(final Integer columnHeight, final Integer columnsWidth, final Propertie fontSize) {
		int titleH = 20;
		int value = Integer.parseInt(fontSize.getValue());
		if(value > 12) {
			titleH += (value-12)*2;
		}
		if(this.getTheWidth() == null || this.getTheWidth().getValue() == null) {
			generator.apperance.size.Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
			w.setValue(columnsWidth);
			this.setTheWidth(w);
		}
		if(this.getTheHeight() == null || this.getTheHeight().getValue() == null) {
			generator.apperance.size.Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();
			h.setValue(titleH+ (columnHeight*6));
			this.setTheHeight(h);;
		}
		if(this.getTheBackground() == null || this.getTheBackground().getValue() == null) {
			generator.apperance.background.Background b = generator.apperance.background.BackgroundFactory.eINSTANCE.createBackground();
			b.setValue("#FFFFFF");
			this.setTheBackground(b);
		} 
		if(this.getTheLinesVisible() == null || this.getTheLinesVisible().getValue() == null) {
			generator.apperance.linesvisible.LinesVisible l = generator.apperance.linesvisible.LinesvisibleFactory.eINSTANCE.createLinesVisible();
			l.setValue(false);
			this.setTheLinesVisible(l);
		}
		if(this.getTheTitleHeight() == null || this.getTheTitleHeight().getValue() == null) {
			generator.apperance.titlesize.TitleHeight th = generator.apperance.titlesize.TitlesizeFactory.eINSTANCE.createTitleHeight();
			th.setValue(titleH);
			this.setTheTitleHeight(th);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GentablePackage.GEN_TABLE__THE_BACKGROUND:
				if (theBackground != null)
					msgs = ((InternalEObject)theBackground).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GentablePackage.GEN_TABLE__THE_BACKGROUND, null, msgs);
				return basicSetTheBackground((Background)otherEnd, msgs);
			case GentablePackage.GEN_TABLE__THE_LINES_VISIBLE:
				if (theLinesVisible != null)
					msgs = ((InternalEObject)theLinesVisible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GentablePackage.GEN_TABLE__THE_LINES_VISIBLE, null, msgs);
				return basicSetTheLinesVisible((LinesVisible)otherEnd, msgs);
			case GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT:
				if (theTitleHeight != null)
					msgs = ((InternalEObject)theTitleHeight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT, null, msgs);
				return basicSetTheTitleHeight((TitleHeight)otherEnd, msgs);
			case GentablePackage.GEN_TABLE__LIST_GEN_COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListGenColumns()).basicAdd(otherEnd, msgs);
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
			case GentablePackage.GEN_TABLE__THE_BACKGROUND:
				return basicSetTheBackground(null, msgs);
			case GentablePackage.GEN_TABLE__THE_LINES_VISIBLE:
				return basicSetTheLinesVisible(null, msgs);
			case GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT:
				return basicSetTheTitleHeight(null, msgs);
			case GentablePackage.GEN_TABLE__LIST_GEN_COLUMNS:
				return ((InternalEList<?>)getListGenColumns()).basicRemove(otherEnd, msgs);
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
			case GentablePackage.GEN_TABLE__THE_BACKGROUND:
				return getTheBackground();
			case GentablePackage.GEN_TABLE__THE_LINES_VISIBLE:
				return getTheLinesVisible();
			case GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT:
				return getTheTitleHeight();
			case GentablePackage.GEN_TABLE__LIST_GEN_COLUMNS:
				return getListGenColumns();
			case GentablePackage.GEN_TABLE__THE_TABLE:
				if (resolve) return getTheTable();
				return basicGetTheTable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GentablePackage.GEN_TABLE__THE_BACKGROUND:
				setTheBackground((Background)newValue);
				return;
			case GentablePackage.GEN_TABLE__THE_LINES_VISIBLE:
				setTheLinesVisible((LinesVisible)newValue);
				return;
			case GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT:
				setTheTitleHeight((TitleHeight)newValue);
				return;
			case GentablePackage.GEN_TABLE__LIST_GEN_COLUMNS:
				getListGenColumns().clear();
				getListGenColumns().addAll((Collection<? extends GenColumn>)newValue);
				return;
			case GentablePackage.GEN_TABLE__THE_TABLE:
				setTheTable((Table)newValue);
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
			case GentablePackage.GEN_TABLE__THE_BACKGROUND:
				setTheBackground((Background)null);
				return;
			case GentablePackage.GEN_TABLE__THE_LINES_VISIBLE:
				setTheLinesVisible((LinesVisible)null);
				return;
			case GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT:
				setTheTitleHeight((TitleHeight)null);
				return;
			case GentablePackage.GEN_TABLE__LIST_GEN_COLUMNS:
				getListGenColumns().clear();
				return;
			case GentablePackage.GEN_TABLE__THE_TABLE:
				setTheTable((Table)null);
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
			case GentablePackage.GEN_TABLE__THE_BACKGROUND:
				return theBackground != null;
			case GentablePackage.GEN_TABLE__THE_LINES_VISIBLE:
				return theLinesVisible != null;
			case GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT:
				return theTitleHeight != null;
			case GentablePackage.GEN_TABLE__LIST_GEN_COLUMNS:
				return listGenColumns != null && !listGenColumns.isEmpty();
			case GentablePackage.GEN_TABLE__THE_TABLE:
				return theTable != null;
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
			case GentablePackage.GEN_TABLE___CREATE_PROPERTIES_TABLE__INTEGER_INTEGER_PROPERTIE:
				createPropertiesTable((Integer)arguments.get(0), (Integer)arguments.get(1), (Propertie)arguments.get(2));
				return null;
			case GentablePackage.GEN_TABLE___CREATE_BACKGROUND:
				createBackground();
				return null;
			case GentablePackage.GEN_TABLE___CREATE_LINES_VISIBLE:
				createLinesVisible();
				return null;
			case GentablePackage.GEN_TABLE___CREATE_TITLE_HEIGHT:
				createTitleHeight();
				return null;
			case GentablePackage.GEN_TABLE___SET_DEFAULT_TABLE__INTEGER_INTEGER_PROPERTIE:
				setDefaultTable((Integer)arguments.get(0), (Integer)arguments.get(1), (Propertie)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GenTableImpl
