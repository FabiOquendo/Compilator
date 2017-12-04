/**
 */
package generator.genmodel.gencontainercomponent.provider;


import generator.genmodel.gencontainercomponent.GenContainerElement;
import generator.genmodel.gencontainercomponent.GencontainercomponentPackage;

import generator.genmodel.gencontainercomponent.gencontainer.GencontainerFactory;

import generator.genmodel.genindividualcomponent.genbutton.GenbuttonFactory;

import generator.genmodel.genindividualcomponent.gencolunm.GencolunmFactory;

import generator.genmodel.genindividualcomponent.gencombobox.GencomboboxFactory;

import generator.genmodel.genindividualcomponent.genlabel.GenlabelFactory;

import generator.genmodel.genindividualcomponent.gentable.GentableFactory;

import generator.genmodel.genindividualcomponent.gentextfield.GentextfieldFactory;

import generator.genmodel.provider.GenElementItemProvider;

import generator.provider.GeneratorEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link generator.genmodel.gencontainercomponent.GenContainerElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenContainerElementItemProvider extends GenElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenContainerElementItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(GencontainercomponentPackage.Literals.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS);
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
		return getString("_UI_GenContainerElement_type");
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

		switch (notification.getFeatureID(GenContainerElement.class)) {
			case GencontainercomponentPackage.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS:
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
				(GencontainercomponentPackage.Literals.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS,
				 GenbuttonFactory.eINSTANCE.createGenButton()));

		newChildDescriptors.add
			(createChildParameter
				(GencontainercomponentPackage.Literals.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS,
				 GencolunmFactory.eINSTANCE.createGenColumn()));

		newChildDescriptors.add
			(createChildParameter
				(GencontainercomponentPackage.Literals.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS,
				 GencomboboxFactory.eINSTANCE.createGenComboBox()));

		newChildDescriptors.add
			(createChildParameter
				(GencontainercomponentPackage.Literals.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS,
				 GenlabelFactory.eINSTANCE.createGenLabel()));

		newChildDescriptors.add
			(createChildParameter
				(GencontainercomponentPackage.Literals.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS,
				 GentableFactory.eINSTANCE.createGenTable()));

		newChildDescriptors.add
			(createChildParameter
				(GencontainercomponentPackage.Literals.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS,
				 GentextfieldFactory.eINSTANCE.createGenTextField()));

		newChildDescriptors.add
			(createChildParameter
				(GencontainercomponentPackage.Literals.GEN_CONTAINER_ELEMENT__LIST_GEN_ELEMENTS,
				 GencontainerFactory.eINSTANCE.createGenContainer()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GeneratorEditPlugin.INSTANCE;
	}

}
