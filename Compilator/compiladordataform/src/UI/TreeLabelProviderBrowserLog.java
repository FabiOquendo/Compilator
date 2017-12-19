package UI;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;

import compilator.domain.Log;
import compilator.domain.expression.Expression;

public class TreeLabelProviderBrowserLog extends ColumnLabelProvider
{
	private ComposedAdapterFactory composedAdapterFactory;

	private static final Class<?> IItemLabelProviderClass = IItemLabelProvider.class;
	public String getText(Object obj) {

		//-----------------------------------------------------------------
		if(obj instanceof Log){
			return "Log";
		}
		if(obj instanceof Expression){
			Expression modelElement = (Expression) obj;
			return modelElement.getName() + " : " + modelElement.getTheSentence().getFullSentence();
		}

		return "";
	}

	public org.eclipse.swt.graphics.Image getImage(Object obj) {
		final AdapterFactory adapterFactory = getAdapterFactory();
		// lookup item provider for the eobjet
		IItemLabelProvider itemLabelProvider = (IItemLabelProvider)adapterFactory.adapt(obj, IItemLabelProviderClass);

		//-----------------------------
	
			return 	getImageFromObject(itemLabelProvider.getImage(obj));
	
		
	}
	protected Image getImageFromObject(Object object)
	{
		return ExtendedImageRegistry.INSTANCE.getImage(object);
	}

	protected AdapterFactory getAdapterFactory()
	{
		composedAdapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		return composedAdapterFactory;
	}


	

}