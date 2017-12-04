/**
 */
package generator.genmodel.genindividualcomponent.gencombobox.util;

import generator.genmodel.GenElement;

import generator.genmodel.genindividualcomponent.GenIndividualElement;

import generator.genmodel.genindividualcomponent.gencombobox.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see generator.genmodel.genindividualcomponent.gencombobox.GencomboboxPackage
 * @generated
 */
public class GencomboboxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GencomboboxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GencomboboxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GencomboboxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GencomboboxSwitch<Adapter> modelSwitch =
		new GencomboboxSwitch<Adapter>() {
			@Override
			public Adapter caseGenComboBox(GenComboBox object) {
				return createGenComboBoxAdapter();
			}
			@Override
			public Adapter caseGenElement(GenElement object) {
				return createGenElementAdapter();
			}
			@Override
			public Adapter caseGenIndividualElement(GenIndividualElement object) {
				return createGenIndividualElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link generator.genmodel.genindividualcomponent.gencombobox.GenComboBox <em>Gen Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.genmodel.genindividualcomponent.gencombobox.GenComboBox
	 * @generated
	 */
	public Adapter createGenComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.genmodel.GenElement <em>Gen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.genmodel.GenElement
	 * @generated
	 */
	public Adapter createGenElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generator.genmodel.genindividualcomponent.GenIndividualElement <em>Gen Individual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generator.genmodel.genindividualcomponent.GenIndividualElement
	 * @generated
	 */
	public Adapter createGenIndividualElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GencomboboxAdapterFactory
