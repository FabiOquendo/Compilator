/**
 */
package generator.genmodel.genindividualcomponent.gentextfield.impl;

import generator.genmodel.genindividualcomponent.gentextfield.*;

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
public class GentextfieldFactoryImpl extends EFactoryImpl implements GentextfieldFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GentextfieldFactory init() {
		try {
			GentextfieldFactory theGentextfieldFactory = (GentextfieldFactory)EPackage.Registry.INSTANCE.getEFactory(GentextfieldPackage.eNS_URI);
			if (theGentextfieldFactory != null) {
				return theGentextfieldFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GentextfieldFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GentextfieldFactoryImpl() {
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
			case GentextfieldPackage.GEN_TEXT_FIELD: return createGenTextField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTextField createGenTextField() {
		GenTextFieldImpl genTextField = new GenTextFieldImpl();
		return genTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GentextfieldPackage getGentextfieldPackage() {
		return (GentextfieldPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GentextfieldPackage getPackage() {
		return GentextfieldPackage.eINSTANCE;
	}

} //GentextfieldFactoryImpl
