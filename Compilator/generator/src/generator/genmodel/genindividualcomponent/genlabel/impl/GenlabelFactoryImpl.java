/**
 */
package generator.genmodel.genindividualcomponent.genlabel.impl;

import generator.genmodel.genindividualcomponent.genlabel.*;

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
public class GenlabelFactoryImpl extends EFactoryImpl implements GenlabelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenlabelFactory init() {
		try {
			GenlabelFactory theGenlabelFactory = (GenlabelFactory)EPackage.Registry.INSTANCE.getEFactory(GenlabelPackage.eNS_URI);
			if (theGenlabelFactory != null) {
				return theGenlabelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenlabelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenlabelFactoryImpl() {
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
			case GenlabelPackage.GEN_LABEL: return createGenLabel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenLabel createGenLabel() {
		GenLabelImpl genLabel = new GenLabelImpl();
		return genLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenlabelPackage getGenlabelPackage() {
		return (GenlabelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenlabelPackage getPackage() {
		return GenlabelPackage.eINSTANCE;
	}

} //GenlabelFactoryImpl
