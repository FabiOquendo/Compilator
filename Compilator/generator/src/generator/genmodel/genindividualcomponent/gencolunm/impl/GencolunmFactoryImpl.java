/**
 */
package generator.genmodel.genindividualcomponent.gencolunm.impl;

import generator.genmodel.genindividualcomponent.gencolunm.*;

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
public class GencolunmFactoryImpl extends EFactoryImpl implements GencolunmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GencolunmFactory init() {
		try {
			GencolunmFactory theGencolunmFactory = (GencolunmFactory)EPackage.Registry.INSTANCE.getEFactory(GencolunmPackage.eNS_URI);
			if (theGencolunmFactory != null) {
				return theGencolunmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GencolunmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencolunmFactoryImpl() {
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
			case GencolunmPackage.GEN_COLUMN: return createGenColumn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenColumn createGenColumn() {
		GenColumnImpl genColumn = new GenColumnImpl();
		return genColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencolunmPackage getGencolunmPackage() {
		return (GencolunmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GencolunmPackage getPackage() {
		return GencolunmPackage.eINSTANCE;
	}

} //GencolunmFactoryImpl
