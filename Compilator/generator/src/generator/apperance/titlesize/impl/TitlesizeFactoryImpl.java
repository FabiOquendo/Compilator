/**
 */
package generator.apperance.titlesize.impl;

import generator.apperance.titlesize.*;

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
public class TitlesizeFactoryImpl extends EFactoryImpl implements TitlesizeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TitlesizeFactory init() {
		try {
			TitlesizeFactory theTitlesizeFactory = (TitlesizeFactory)EPackage.Registry.INSTANCE.getEFactory(TitlesizePackage.eNS_URI);
			if (theTitlesizeFactory != null) {
				return theTitlesizeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TitlesizeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitlesizeFactoryImpl() {
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
			case TitlesizePackage.TITLE_HEIGHT: return createTitleHeight();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleHeight createTitleHeight() {
		TitleHeightImpl titleHeight = new TitleHeightImpl();
		return titleHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitlesizePackage getTitlesizePackage() {
		return (TitlesizePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TitlesizePackage getPackage() {
		return TitlesizePackage.eINSTANCE;
	}

} //TitlesizeFactoryImpl
