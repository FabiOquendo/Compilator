package UI;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;

import compilator.domain.expression.expressionmodel.ExpressionModel;
import compilator.domain.expression.expressionmodel.containercomponent.Container;
import compilator.domain.expression.expressionmodel.individualcomponent.Attribute;
import compilator.domain.expression.expressionmodel.individualcomponent.Button;
import compilator.domain.expression.expressionmodel.individualcomponent.Column;
import compilator.domain.expression.expressionmodel.individualcomponent.ComboBox;
import compilator.domain.expression.expressionmodel.individualcomponent.Label;
import compilator.domain.expression.expressionmodel.individualcomponent.Table;
import compilator.domain.expression.expressionmodel.individualcomponent.TextField;


public class TreeLabelProviderBrowserDoc extends ColumnLabelProvider
{
	private ComposedAdapterFactory composedAdapterFactory;

	private static final Class<?> IItemLabelProviderClass = IItemLabelProvider.class;
	public String getText(Object obj) {

		//-----------------------------------------------------------------
		if(obj instanceof ExpressionModel){
			return "Model";
		}
		if(obj instanceof Container){
			Container modelElement = (Container) obj;
			if(modelElement.getTheStyle() != null)
				return "Container : " + modelElement.getName() + " : " + modelElement.getTheStyle().getName();
			else
				return "Container : " + modelElement.getName();
		}
		if(obj instanceof Button){
			Button modelElement = (Button) obj;
			if(modelElement.getTheStyle() != null)
				return "Button : " + modelElement.getName() + " : " + modelElement.getTheStyle().getName();
			else
				return "Button : " + modelElement.getName();
		}
		if(obj instanceof Column){
			Column modelElement = (Column) obj;
			if(modelElement.getTheStyle() != null)
				return "Column : " + modelElement.getName() + " : " + modelElement.getTheStyle().getName();
			else
				return "Column : " + modelElement.getName();
		}
		if(obj instanceof ComboBox){
			ComboBox modelElement = (ComboBox) obj;
			if(modelElement.getTheStyle() != null)
				return "ComboBox : " + modelElement.getName() + " : " + modelElement.getTheStyle().getName();
			else
				return "ComboBox : " + modelElement.getName();
		}
		if(obj instanceof Label){
			Label modelElement = (Label) obj;
			if(modelElement.getTheStyle() != null)
				return "Label : " + modelElement.getName() + " : " + modelElement.getTheStyle().getName();
			else
				return "Label : " + modelElement.getName();
		}
		if(obj instanceof Table){
			Table modelElement = (Table) obj;
			if(modelElement.getTheStyle() != null)
				return "Table : " + modelElement.getName() + " : " + modelElement.getTheStyle().getName();
			else
				return "Table : " + modelElement.getName();
		}
		if(obj instanceof TextField){
			TextField modelElement = (TextField) obj;
			if(modelElement.getTheStyle() != null)
				return "TextField : " + modelElement.getName() + " : " + modelElement.getTheStyle().getName();
			else
				return "TextField : " + modelElement.getName();
		}
		if(obj instanceof Attribute){
			Attribute modelElement = (Attribute) obj;
			if(modelElement.getTheStyle() != null)
				return "Attribute : " + modelElement.getName() + " : " + modelElement.getTheStyle().getName();
			else
				return "Attribute : " + modelElement.getName();
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
