/**
 */
package generator.genmodel.genindividualcomponent.gencombobox.impl;

import generator.genmodel.genindividualcomponent.gencombobox.*;

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
public class GencomboboxFactoryImpl extends EFactoryImpl implements GencomboboxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GencomboboxFactory init() {
		try {
			GencomboboxFactory theGencomboboxFactory = (GencomboboxFactory)EPackage.Registry.INSTANCE.getEFactory(GencomboboxPackage.eNS_URI);
			if (theGencomboboxFactory != null) {
				return theGencomboboxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GencomboboxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencomboboxFactoryImpl() {
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
			case GencomboboxPackage.GEN_COMBO_BOX: return createGenComboBox();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenComboBox createGenComboBox() {
		GenComboBoxImpl genComboBox = new GenComboBoxImpl();
		return genComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencomboboxPackage getGencomboboxPackage() {
		return (GencomboboxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GencomboboxPackage getPackage() {
		return GencomboboxPackage.eINSTANCE;
	}

} //GencomboboxFactoryImpl
