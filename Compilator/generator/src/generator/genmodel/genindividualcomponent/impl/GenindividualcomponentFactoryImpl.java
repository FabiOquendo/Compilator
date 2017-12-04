/**
 */
package generator.genmodel.genindividualcomponent.impl;

import generator.genmodel.genindividualcomponent.*;

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
public class GenindividualcomponentFactoryImpl extends EFactoryImpl implements GenindividualcomponentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenindividualcomponentFactory init() {
		try {
			GenindividualcomponentFactory theGenindividualcomponentFactory = (GenindividualcomponentFactory)EPackage.Registry.INSTANCE.getEFactory(GenindividualcomponentPackage.eNS_URI);
			if (theGenindividualcomponentFactory != null) {
				return theGenindividualcomponentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenindividualcomponentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenindividualcomponentFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenindividualcomponentPackage getGenindividualcomponentPackage() {
		return (GenindividualcomponentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenindividualcomponentPackage getPackage() {
		return GenindividualcomponentPackage.eINSTANCE;
	}

} //GenindividualcomponentFactoryImpl
