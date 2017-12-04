/**
 */
package generator.genmodel.genindividualcomponent.gentable.provider;


import generator.apperance.background.BackgroundFactory;

import generator.apperance.linesvisible.LinesvisibleFactory;

import generator.apperance.titlesize.TitlesizeFactory;

import generator.genmodel.genindividualcomponent.gencolunm.GencolunmFactory;

import generator.genmodel.genindividualcomponent.gentable.GenTable;
import generator.genmodel.genindividualcomponent.gentable.GentablePackage;

import generator.genmodel.genindividualcomponent.provider.GenIndividualElementItemProvider;

import generator.provider.GeneratorEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link generator.genmodel.genindividualcomponent.gentable.GenTable} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenTableItemProvider extends GenIndividualElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenTableItemProvider(AdapterFactory adapterFactory) {
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

			addTheTablePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the The Table feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheTablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenTable_theTable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GenTable_theTable_feature", "_UI_GenTable_type"),
				 GentablePackage.Literals.GEN_TABLE__THE_TABLE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(GentablePackage.Literals.GEN_TABLE__THE_BACKGROUND);
			childrenFeatures.add(GentablePackage.Literals.GEN_TABLE__THE_LINES_VISIBLE);
			childrenFeatures.add(GentablePackage.Literals.GEN_TABLE__THE_TITLE_HEIGHT);
			childrenFeatures.add(GentablePackage.Literals.GEN_TABLE__LIST_GEN_COLUMNS);
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
	 * This returns GenTable.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GenTable"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_GenTable_type");
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

		switch (notification.getFeatureID(GenTable.class)) {
			case GentablePackage.GEN_TABLE__THE_BACKGROUND:
			case GentablePackage.GEN_TABLE__THE_LINES_VISIBLE:
			case GentablePackage.GEN_TABLE__THE_TITLE_HEIGHT:
			case GentablePackage.GEN_TABLE__LIST_GEN_COLUMNS:
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
				(GentablePackage.Literals.GEN_TABLE__THE_BACKGROUND,
				 BackgroundFactory.eINSTANCE.createBackground()));

		newChildDescriptors.add
			(createChildParameter
				(GentablePackage.Literals.GEN_TABLE__THE_LINES_VISIBLE,
				 LinesvisibleFactory.eINSTANCE.createLinesVisible()));

		newChildDescriptors.add
			(createChildParameter
				(GentablePackage.Literals.GEN_TABLE__THE_TITLE_HEIGHT,
				 TitlesizeFactory.eINSTANCE.createTitleHeight()));

		newChildDescriptors.add
			(createChildParameter
				(GentablePackage.Literals.GEN_TABLE__LIST_GEN_COLUMNS,
				 GencolunmFactory.eINSTANCE.createGenColumn()));
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
