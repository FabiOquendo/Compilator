/**
 */
package generator.genmodel.provider;


import generator.apperance.font.FontFactory;

import generator.apperance.position.PositionFactory;

import generator.apperance.size.SizeFactory;

import generator.genmodel.GenElement;
import generator.genmodel.GenmodelPackage;

import generator.provider.GeneratorEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link generator.genmodel.GenElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenElementItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenElementItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenElement_name_feature", "_UI_GenElement_type"),
				 GenmodelPackage.Literals.GEN_ELEMENT__NAME,
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
			childrenFeatures.add(GenmodelPackage.Literals.GEN_ELEMENT__THE_X);
			childrenFeatures.add(GenmodelPackage.Literals.GEN_ELEMENT__THE_Y);
			childrenFeatures.add(GenmodelPackage.Literals.GEN_ELEMENT__THE_WIDTH);
			childrenFeatures.add(GenmodelPackage.Literals.GEN_ELEMENT__THE_HEIGHT);
			childrenFeatures.add(GenmodelPackage.Literals.GEN_ELEMENT__THE_COLOR);
			childrenFeatures.add(GenmodelPackage.Literals.GEN_ELEMENT__THE_TYPE);
			childrenFeatures.add(GenmodelPackage.Literals.GEN_ELEMENT__THE_SIZE);
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
		String label = ((GenElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GenElement_type") :
			getString("_UI_GenElement_type") + " " + label;
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

		switch (notification.getFeatureID(GenElement.class)) {
			case GenmodelPackage.GEN_ELEMENT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GenmodelPackage.GEN_ELEMENT__THE_X:
			case GenmodelPackage.GEN_ELEMENT__THE_Y:
			case GenmodelPackage.GEN_ELEMENT__THE_WIDTH:
			case GenmodelPackage.GEN_ELEMENT__THE_HEIGHT:
			case GenmodelPackage.GEN_ELEMENT__THE_COLOR:
			case GenmodelPackage.GEN_ELEMENT__THE_TYPE:
			case GenmodelPackage.GEN_ELEMENT__THE_SIZE:
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
				(GenmodelPackage.Literals.GEN_ELEMENT__THE_X,
				 PositionFactory.eINSTANCE.createX()));

		newChildDescriptors.add
			(createChildParameter
				(GenmodelPackage.Literals.GEN_ELEMENT__THE_Y,
				 PositionFactory.eINSTANCE.createY()));

		newChildDescriptors.add
			(createChildParameter
				(GenmodelPackage.Literals.GEN_ELEMENT__THE_WIDTH,
				 SizeFactory.eINSTANCE.createWidth()));

		newChildDescriptors.add
			(createChildParameter
				(GenmodelPackage.Literals.GEN_ELEMENT__THE_HEIGHT,
				 SizeFactory.eINSTANCE.createHeight()));

		newChildDescriptors.add
			(createChildParameter
				(GenmodelPackage.Literals.GEN_ELEMENT__THE_COLOR,
				 FontFactory.eINSTANCE.createColor()));

		newChildDescriptors.add
			(createChildParameter
				(GenmodelPackage.Literals.GEN_ELEMENT__THE_TYPE,
				 FontFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(GenmodelPackage.Literals.GEN_ELEMENT__THE_SIZE,
				 FontFactory.eINSTANCE.createSize()));
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
