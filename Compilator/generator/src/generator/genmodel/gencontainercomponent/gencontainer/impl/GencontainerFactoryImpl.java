/**
 */
package generator.genmodel.gencontainercomponent.gencontainer.impl;

import generator.genmodel.gencontainercomponent.gencontainer.*;

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
public class GencontainerFactoryImpl extends EFactoryImpl implements GencontainerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GencontainerFactory init() {
		try {
			GencontainerFactory theGencontainerFactory = (GencontainerFactory)EPackage.Registry.INSTANCE.getEFactory(GencontainerPackage.eNS_URI);
			if (theGencontainerFactory != null) {
				return theGencontainerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GencontainerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencontainerFactoryImpl() {
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
			case GencontainerPackage.GEN_CONTAINER: return createGenContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenContainer createGenContainer() {
		GenContainerImpl genContainer = new GenContainerImpl();
		return genContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencontainerPackage getGencontainerPackage() {
		return (GencontainerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GencontainerPackage getPackage() {
		return GencontainerPackage.eINSTANCE;
	}

} //GencontainerFactoryImpl
