/**
 */
package generator.genmodel.genindividualcomponent.genbutton.impl;

import generator.genmodel.genindividualcomponent.genbutton.*;

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
public class GenbuttonFactoryImpl extends EFactoryImpl implements GenbuttonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenbuttonFactory init() {
		try {
			GenbuttonFactory theGenbuttonFactory = (GenbuttonFactory)EPackage.Registry.INSTANCE.getEFactory(GenbuttonPackage.eNS_URI);
			if (theGenbuttonFactory != null) {
				return theGenbuttonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenbuttonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenbuttonFactoryImpl() {
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
			case GenbuttonPackage.GEN_BUTTON: return createGenButton();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenButton createGenButton() {
		GenButtonImpl genButton = new GenButtonImpl();
		return genButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenbuttonPackage getGenbuttonPackage() {
		return (GenbuttonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenbuttonPackage getPackage() {
		return GenbuttonPackage.eINSTANCE;
	}

} //GenbuttonFactoryImpl
