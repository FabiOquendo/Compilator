/**
 */
package generator.gendataform.impl;

import generator.gendataform.*;

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
public class GendataformFactoryImpl extends EFactoryImpl implements GendataformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GendataformFactory init() {
		try {
			GendataformFactory theGendataformFactory = (GendataformFactory)EPackage.Registry.INSTANCE.getEFactory(GendataformPackage.eNS_URI);
			if (theGendataformFactory != null) {
				return theGendataformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GendataformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GendataformFactoryImpl() {
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
			case GendataformPackage.DATA_FORM_DIAGRAM_GENERATOR: return createDataFormDiagramGenerator();
			case GendataformPackage.DATA_FORM_MODEL_GENERATOR: return createDataFormModelGenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormDiagramGenerator createDataFormDiagramGenerator() {
		DataFormDiagramGeneratorImpl dataFormDiagramGenerator = new DataFormDiagramGeneratorImpl();
		return dataFormDiagramGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFormModelGenerator createDataFormModelGenerator() {
		DataFormModelGeneratorImpl dataFormModelGenerator = new DataFormModelGeneratorImpl();
		return dataFormModelGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GendataformPackage getGendataformPackage() {
		return (GendataformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GendataformPackage getPackage() {
		return GendataformPackage.eINSTANCE;
	}

} //GendataformFactoryImpl
