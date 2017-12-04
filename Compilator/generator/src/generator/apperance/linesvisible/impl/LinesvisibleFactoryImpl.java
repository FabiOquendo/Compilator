/**
 */
package generator.apperance.linesvisible.impl;

import generator.apperance.linesvisible.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinesvisibleFactoryImpl extends EFactoryImpl implements LinesvisibleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LinesvisibleFactory init() {
		try {
			LinesvisibleFactory theLinesvisibleFactory = (LinesvisibleFactory)EPackage.Registry.INSTANCE.getEFactory(LinesvisiblePackage.eNS_URI);
			if (theLinesvisibleFactory != null) {
				return theLinesvisibleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LinesvisibleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinesvisibleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LinesvisiblePackage.LINES_VISIBLE: return createLinesVisible();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinesVisible createLinesVisible() {
		LinesVisibleImpl linesVisible = new LinesVisibleImpl();
		return linesVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinesvisiblePackage getLinesvisiblePackage() {
		return (LinesvisiblePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LinesvisiblePackage getPackage() {
		return LinesvisiblePackage.eINSTANCE;
	}

} //LinesvisibleFactoryImpl
