/**
 */
package compilator.domain.expression.expressionmodel.containercomponent.provider;


import compilator.domain.expression.expressionmodel.containercomponent.ContainerElement;
import compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentFactory;
import compilator.domain.expression.expressionmodel.containercomponent.ContainercomponentPackage;

import compilator.domain.expression.expressionmodel.individualcomponent.IndividualcomponentFactory;

import compilator.domain.expression.expressionmodel.provider.ElementItemProvider;

import compilator.provider.CompilatorEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link compilator.domain.expression.expressionmodel.containercomponent.ContainerElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerElementItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOrientationPropertyDescriptor(object);
			addIsVisiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Orientation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrientationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContainerElement_orientation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContainerElement_orientation_feature", "_UI_ContainerElement_type"),
				 ContainercomponentPackage.Literals.CONTAINER_ELEMENT__ORIENTATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContainerElement_isVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContainerElement_isVisible_feature", "_UI_ContainerElement_type"),
				 ContainercomponentPackage.Literals.CONTAINER_ELEMENT__IS_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ContainercomponentPackage.Literals.CONTAINER_ELEMENT__LIST_ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContainerElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContainerElement_type") :
			getString("_UI_ContainerElement_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ContainerElement.class)) {
			case ContainercomponentPackage.CONTAINER_ELEMENT__ORIENTATION:
			case ContainercomponentPackage.CONTAINER_ELEMENT__IS_VISIBLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContainercomponentPackage.CONTAINER_ELEMENT__LIST_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ContainercomponentPackage.Literals.CONTAINER_ELEMENT__LIST_ELEMENTS,
				 ContainercomponentFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ContainercomponentPackage.Literals.CONTAINER_ELEMENT__LIST_ELEMENTS,
				 IndividualcomponentFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(ContainercomponentPackage.Literals.CONTAINER_ELEMENT__LIST_ELEMENTS,
				 IndividualcomponentFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(ContainercomponentPackage.Literals.CONTAINER_ELEMENT__LIST_ELEMENTS,
				 IndividualcomponentFactory.eINSTANCE.createTextField()));

		newChildDescriptors.add
			(createChildParameter
				(ContainercomponentPackage.Literals.CONTAINER_ELEMENT__LIST_ELEMENTS,
				 IndividualcomponentFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(ContainercomponentPackage.Literals.CONTAINER_ELEMENT__LIST_ELEMENTS,
				 IndividualcomponentFactory.eINSTANCE.createComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(ContainercomponentPackage.Literals.CONTAINER_ELEMENT__LIST_ELEMENTS,
				 IndividualcomponentFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(ContainercomponentPackage.Literals.CONTAINER_ELEMENT__LIST_ELEMENTS,
				 IndividualcomponentFactory.eINSTANCE.createItem()));

		newChildDescriptors.add
			(createChildParameter
				(ContainercomponentPackage.Literals.CONTAINER_ELEMENT__LIST_ELEMENTS,
				 IndividualcomponentFactory.eINSTANCE.createAttribute()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CompilatorEditPlugin.INSTANCE;
	}

}
