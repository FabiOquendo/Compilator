package UI;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;

import compilator.domain.Log;
import compilator.domain.expression.Expression;
import compilator.domain.expression.expressionmodel.ExpressionModel;
import compilator.domain.expression.expressionmodel.containercomponent.Container;
import compilator.domain.expression.expressionmodel.individualcomponent.Button;
import compilator.domain.expression.expressionmodel.individualcomponent.Column;
import compilator.domain.expression.expressionmodel.individualcomponent.ComboBox;
import compilator.domain.expression.expressionmodel.individualcomponent.Label;
import compilator.domain.expression.expressionmodel.individualcomponent.Table;
import compilator.domain.expression.expressionmodel.individualcomponent.TextField;
import compilator.domain.expression.sentence.Sentence;
import compilator.domain.shapes.Component;
import compilator.domain.shapes.Shapes;
import styles.domain.Characteristic;
import styles.domain.CharacteristicFactory;
import styles.domain.Propertie;
import styles.domain.StyleFactory;
import tooldataform.pmoo.Atributo;
import styles.domain.Style;

public class TreeLabelProviderBrowser extends ColumnLabelProvider
{
	private ComposedAdapterFactory composedAdapterFactory;

	private static final Class<?> IItemLabelProviderClass = IItemLabelProvider.class;
	public String getText(Object obj) {

		//-----------------------------------------------------------------
		if(obj instanceof CharacteristicFactory){
			return "Caracteristicas";
		}
		if(obj instanceof StyleFactory){
			return "Estilos";
		}
		if (obj instanceof Shapes) {
			return "Componentes";
		}
		if(obj instanceof Characteristic){
			Characteristic modelElement = (Characteristic) obj;
			return modelElement.getName();
		}
		if(obj instanceof Style){
			Style modelElement = (Style) obj;
			return modelElement.getName()+ " : " + 
					((modelElement.getTheCharacteristic()!=null) ? modelElement.getTheCharacteristic().getName():"");
		}
		if(obj instanceof Propertie){
			Propertie modelElement = (Propertie) obj;
			return modelElement.getName() + " : " + modelElement.getValue();
		}
		
		if(obj instanceof Component){
			Component modelElement = (Component) obj;
			return "Component : " + modelElement.getName();
		}
		if(obj instanceof Container){
			Container modelElement = (Container) obj;
			return "Container : " + modelElement.getName();
		}
		if(obj instanceof Button){
			Button modelElement = (Button) obj;
			return "Button : " + modelElement.getName();
		}
		if(obj instanceof Column){
			Column modelElement = (Column) obj;
			return "Column : " + modelElement.getName();
		}
		if(obj instanceof ComboBox){
			ComboBox modelElement = (ComboBox) obj;
			return "ComboBox : " + modelElement.getName();
		}
		if(obj instanceof Label){
			Label modelElement = (Label) obj;
			return "Label : " + modelElement.getName();
		}
		if(obj instanceof Table){
			Table modelElement = (Table) obj;
			return "Table : " + modelElement.getName();
		}
		if(obj instanceof TextField){
			TextField modelElement = (TextField) obj;
			return "TextField : " + modelElement.getName();
		}
		if(obj instanceof Sentence){
			Sentence modelElement = (Sentence) obj;
			return modelElement.getFullSentence();
		}
		
		
		if(obj instanceof Atributo){
			Atributo modelElement = (Atributo) obj;
			return modelElement.getName();
		}
		if(obj instanceof Log){
			return "Log";
		}
		if(obj instanceof Expression){
			Expression modelElement = (Expression) obj;
			return modelElement.getName() + " : " + modelElement.getTheSentence().getFullSentence();
		}
		if(obj instanceof ExpressionModel){
			return "Model";
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