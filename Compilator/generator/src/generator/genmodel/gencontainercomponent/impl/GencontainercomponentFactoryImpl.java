/**
 */
package generator.genmodel.gencontainercomponent.impl;

import generator.genmodel.gencontainercomponent.*;

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
public class GencontainercomponentFactoryImpl extends EFactoryImpl implements GencontainercomponentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GencontainercomponentFactory init() {
		try {
			GencontainercomponentFactory theGencontainercomponentFactory = (GencontainercomponentFactory)EPackage.Registry.INSTANCE.getEFactory(GencontainercomponentPackage.eNS_URI);
			if (theGencontainercomponentFactory != null) {
				return theGencontainercomponentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GencontainercomponentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencontainercomponentFactoryImpl() {
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
	public GencontainercomponentPackage getGencontainercomponentPackage() {
		return (GencontainercomponentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GencontainercomponentPackage getPackage() {
		return GencontainercomponentPackage.eINSTANCE;
	}

} //GencontainercomponentFactoryImpl
