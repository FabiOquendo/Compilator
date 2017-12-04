/**
 */
package compilator.ui.util;

import compilator.ui.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see compilator.ui.UiPackage
 * @generated
 */
public class UiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UiPackage.eINSTANCE;
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
	protected UiSwitch<Adapter> modelSwitch =
		new UiSwitch<Adapter>() {
			@Override
			public Adapter caseUI(UI object) {
				return createUIAdapter();
			}
			@Override
			public Adapter caseStylesConainer(StylesConainer object) {
				return createStylesConainerAdapter();
			}
			@Override
			public Adapter caseComponentsContainer(ComponentsContainer object) {
				return createComponentsContainerAdapter();
			}
			@Override
			public Adapter caseCharacteristicstContainer(CharacteristicstContainer object) {
				return createCharacteristicstContainerAdapter();
			}
			@Override
			public Adapter caseExpressionContainer(ExpressionContainer object) {
				return createExpressionContainerAdapter();
			}
			@Override
			public Adapter caseStyleAssigmentContainer(StyleAssigmentContainer object) {
				return createStyleAssigmentContainerAdapter();
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
	 * Creates a new adapter for an object of class '{@link compilator.ui.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compilator.ui.UI
	 * @generated
	 */
	public Adapter createUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compilator.ui.StylesConainer <em>Styles Conainer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compilator.ui.StylesConainer
	 * @generated
	 */
	public Adapter createStylesConainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compilator.ui.ComponentsContainer <em>Components Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compilator.ui.ComponentsContainer
	 * @generated
	 */
	public Adapter createComponentsContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compilator.ui.CharacteristicstContainer <em>Characteristicst Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compilator.ui.CharacteristicstContainer
	 * @generated
	 */
	public Adapter createCharacteristicstContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compilator.ui.ExpressionContainer <em>Expression Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compilator.ui.ExpressionContainer
	 * @generated
	 */
	public Adapter createExpressionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link compilator.ui.StyleAssigmentContainer <em>Style Assigment Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see compilator.ui.StyleAssigmentContainer
	 * @generated
	 */
	public Adapter createStyleAssigmentContainerAdapter() {
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

} //UiAdapterFactory
