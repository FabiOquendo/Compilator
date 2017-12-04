/**
 */
package compilator.domain.datatypes.util.impl;

import compilator.CompilatorPackage;

import compilator.domain.DomainPackage;

import compilator.domain.datatypes.util.UtilFactory;
import compilator.domain.datatypes.util.UtilPackage;

import compilator.domain.expression.ExpressionPackage;

import compilator.domain.expression.expressionmodel.ExpressionmodelPackage;

import compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage;

import compilator.domain.expression.expressionmodel.containercomponent.impl.ContainercomponentPackageImpl;

import compilator.domain.expression.expressionmodel.impl.ExpressionmodelPackageImpl;

import compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentPackage;

import compilator.domain.expression.expressionmodel.individualcomponent.impl.IndividualcomponentPackageImpl;

import compilator.domain.expression.impl.ExpressionPackageImpl;

import compilator.domain.expression.sentence.SentencePackage;

import compilator.domain.expression.sentence.impl.SentencePackageImpl;

import compilator.domain.generator.GeneratorPackage;

import compilator.domain.generator.impl.GeneratorPackageImpl;

import compilator.domain.impl.DomainPackageImpl;

import compilator.domain.shapes.ShapesPackage;

import compilator.domain.shapes.impl.ShapesPackageImpl;

import compilator.impl.CompilatorPackageImpl;

import compilator.ui.UiPackage;

import compilator.ui.impl.UiPackageImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilPackageImpl extends EPackageImpl implements UtilPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType treeMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrayListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType treeSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashMapEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see compilator.domain.datatypes.util.UtilPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UtilPackageImpl() {
		super(eNS_URI, UtilFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UtilPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UtilPackage init() {
		if (isInited) return (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

		// Obtain or create and register package
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UtilPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StylesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CompilatorPackageImpl theCompilatorPackage = (CompilatorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CompilatorPackage.eNS_URI) instanceof CompilatorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CompilatorPackage.eNS_URI) : CompilatorPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		ExpressionmodelPackageImpl theExpressionmodelPackage = (ExpressionmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionmodelPackage.eNS_URI) instanceof ExpressionmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionmodelPackage.eNS_URI) : ExpressionmodelPackage.eINSTANCE);
		IndividualcomponentPackageImpl theIndividualcomponentPackage = (IndividualcomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndividualcomponentPackage.eNS_URI) instanceof IndividualcomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndividualcomponentPackage.eNS_URI) : IndividualcomponentPackage.eINSTANCE);
		ContainercomponentPackageImpl theContainercomponentPackage = (ContainercomponentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ContainercomponentPackage.eNS_URI) instanceof ContainercomponentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ContainercomponentPackage.eNS_URI) : ContainercomponentPackage.eINSTANCE);
		SentencePackageImpl theSentencePackage = (SentencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SentencePackage.eNS_URI) instanceof SentencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SentencePackage.eNS_URI) : SentencePackage.eINSTANCE);
		ShapesPackageImpl theShapesPackage = (ShapesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI) instanceof ShapesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI) : ShapesPackage.eINSTANCE);
		GeneratorPackageImpl theGeneratorPackage = (GeneratorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) instanceof GeneratorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorPackage.eNS_URI) : GeneratorPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theUtilPackage.createPackageContents();
		theCompilatorPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theExpressionmodelPackage.createPackageContents();
		theIndividualcomponentPackage.createPackageContents();
		theContainercomponentPackage.createPackageContents();
		theSentencePackage.createPackageContents();
		theShapesPackage.createPackageContents();
		theGeneratorPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theUtilPackage.initializePackageContents();
		theCompilatorPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theExpressionmodelPackage.initializePackageContents();
		theIndividualcomponentPackage.initializePackageContents();
		theContainercomponentPackage.initializePackageContents();
		theSentencePackage.initializePackageContents();
		theShapesPackage.initializePackageContents();
		theGeneratorPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUtilPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UtilPackage.eNS_URI, theUtilPackage);
		return theUtilPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTreeMap() {
		return treeMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArrayList() {
		return arrayListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTreeSet() {
		return treeSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHashMap() {
		return hashMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilFactory getUtilFactory() {
		return (UtilFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create data types
		treeMapEDataType = createEDataType(TREE_MAP);
		arrayListEDataType = createEDataType(ARRAY_LIST);
		treeSetEDataType = createEDataType(TREE_SET);
		hashMapEDataType = createEDataType(HASH_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize data types
		initEDataType(treeMapEDataType, TreeMap.class, "TreeMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(arrayListEDataType, ArrayList.class, "ArrayList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(treeSetEDataType, TreeSet.class, "TreeSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hashMapEDataType, HashMap.class, "HashMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //UtilPackageImpl
