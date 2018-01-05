package Logica;

import generator.apperance.alignment.Alignment;
import generator.apperance.font.Color;
import generator.apperance.font.Size;
import generator.apperance.font.Type;
import generator.apperance.position.X;
import generator.apperance.position.Y;
import generator.apperance.size.Height;
import generator.apperance.size.Width;
import generator.apperance.titlesize.TitleHeight;
import generator.genmodel.GenModel;
import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;
import generator.genmodel.genindividualcomponent.GenIndividualElement;
import generator.genmodel.genindividualcomponent.genbutton.GenButton;
import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;
import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;
import generator.genmodel.genindividualcomponent.genlabel.GenLabel;
import generator.genmodel.genindividualcomponent.gentable.GenTable;
import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;

import tooldataform.formmodel.concreta.Button;
import tooldataform.formmodel.concreta.ColumView;
import tooldataform.formmodel.concreta.ComboView;
import tooldataform.formmodel.concreta.Container;
import tooldataform.formmodel.concreta.GraphicalIndividualEement;
import tooldataform.formmodel.concreta.Interface;
import tooldataform.formmodel.concreta.LabelView;
import tooldataform.formmodel.concreta.TableView;
import tooldataform.formmodel.concreta.TextView;
import tooldataform.formmodel.containers.GraphicalContainer;

public class GenModelGenerator {
	
	public GenModelGenerator() {
		super();
	}
	
	public GenModel createGenModel(Interface interface1) {
		GenModel genModel = generator.genmodel.GenmodelFactory.eINSTANCE.createGenModel();
		
		for(int i = 0; i < interface1.getListGraphicalContainer().size(); i++) {
			if(interface1.getListGraphicalContainer().get(i) instanceof Container) {
				Container container = (Container) interface1.getListGraphicalContainer().get(i);
				genModel.getListGenElements().add(createGenContainer(container));
			} else if(interface1.getListGraphicalContainer().get(i) instanceof TableView) {
				TableView tableView = (TableView) interface1.getListGraphicalContainer().get(i);
				genModel.getListGenElements().add(createGenTable(tableView));
			} else if(interface1.getListGraphicalContainer().get(i) instanceof ComboView) {
				ComboView comboView = (ComboView) interface1.getListGraphicalContainer().get(i);
				genModel.getListGenElements().add(createGenCombo(comboView));
			}
		}
		for(int i = 0; i < interface1.getListIndividualElementDataForm().size(); i++) {
			if(interface1.getListIndividualElementDataForm().get(i) instanceof Button) {
				Button button = (Button) interface1.getListIndividualElementDataForm().get(i);
				genModel.getListGenElements().add(createGenButton(button));
			} else if(interface1.getListIndividualElementDataForm().get(i) instanceof LabelView) {
				LabelView labelView = (LabelView) interface1.getListIndividualElementDataForm().get(i);
				genModel.getListGenElements().add(createGenLabel(labelView));
			} else if(interface1.getListIndividualElementDataForm().get(i) instanceof TextView) {
				TextView textView = (TextView) interface1.getListIndividualElementDataForm().get(i);
				genModel.getListGenElements().add(createGenTextField(textView));
			}
		}
		
		return genModel;
	}
	
	public GenContainer createGenContainer(Container container) {
		GenContainer genContainer = generator.genmodel.gencontainercomponent.gencontainer.
				GencontainerFactory.eINSTANCE.createGenContainer();
		genContainer.setName(container.getName());
		for(int i = 0; i < container.getListGraphicalContainer().size(); i++) {
			if(container.getListGraphicalContainer().get(i) instanceof Container) {
				Container c = (Container) container.getListGraphicalContainer().get(i);
				genContainer.getListGenElements().add(createGenContainer(c));
			}  else if(container.getListGraphicalContainer().get(i) instanceof TableView) {
				TableView tableView = (TableView) container.getListGraphicalContainer().get(i);
				genContainer.getListGenElements().add(createGenTable(tableView));
			} else if(container.getListGraphicalContainer().get(i) instanceof ComboView) {
				ComboView comboView = (ComboView) container.getListGraphicalContainer().get(i);
				genContainer.getListGenElements().add(createGenCombo(comboView));
			}
		}
		for(int i = 0; i < container.getListIndividualElementDataForm().size(); i++) {
			if(container.getListIndividualElementDataForm().get(i) instanceof Button) {
				Button button = (Button) container.getListIndividualElementDataForm().get(i);
				genContainer.getListGenElements().add(createGenButton(button));
			} else if(container.getListIndividualElementDataForm().get(i) instanceof LabelView) {
				LabelView labelView = (LabelView) container.getListIndividualElementDataForm().get(i);
				genContainer.getListGenElements().add(createGenLabel(labelView));
			} else if(container.getListIndividualElementDataForm().get(i) instanceof TextView) {
				TextView textView = (TextView) container.getListIndividualElementDataForm().get(i);
				genContainer.getListGenElements().add(createGenTextField(textView));
			}
		}
		
		return (GenContainer) setPropertiesContainer(genContainer, container);
	}
		
	public GenTable createGenTable(TableView tableView) {
		GenTable genTable = generator.genmodel.genindividualcomponent.gentable.
				GentableFactory.eINSTANCE.createGenTable();
		genTable.setName(tableView.getName());
		for(int i = 0; i < tableView.getListColumView().size(); i++) {
			genTable.getListGenColumns().add(createGenColumn(tableView.getListColumView().get(i)));
		}
		
		return (GenTable) setPropertiesElement(genTable, tableView);
	}
	
	public GenColumn createGenColumn(ColumView columnView) {
		GenColumn genColumn = generator.genmodel.genindividualcomponent.gencolunm.
				GencolunmFactory.eINSTANCE.createGenColumn();
		genColumn.setName(columnView.getName());
		return (GenColumn) setPropertiesIndividualElement(genColumn, columnView);
	}
	
	public GenComboBox createGenCombo(ComboView comboView) {
		GenComboBox genCombo = generator.genmodel.genindividualcomponent.gencombobox.
				GencomboboxFactory.eINSTANCE.createGenComboBox();
		genCombo.setName(comboView.getName());
		
		return (GenComboBox) setPropertiesElement(genCombo, comboView);
	}
	
	public GenButton createGenButton(Button button) {
		GenButton genButton = generator.genmodel.genindividualcomponent.genbutton.
				GenbuttonFactory.eINSTANCE.createGenButton();
		genButton.setName(button.getName());
		
		return (GenButton) setPropertiesIndividualElement(genButton, button);
	}
	
	public GenLabel createGenLabel(LabelView labelView) {
		GenLabel genLabel = generator.genmodel.genindividualcomponent.genlabel.
				GenlabelFactory.eINSTANCE.createGenLabel();
		genLabel.setName(labelView.getName());
		Alignment a = generator.apperance.alignment.AlignmentFactory.eINSTANCE.createAlignment();
		a.setValue("RIGHT");
		genLabel.setTheAlignment(a);
		return (GenLabel) setPropertiesIndividualElement(genLabel, labelView);
	}
	
	public GenTextField createGenTextField(TextView textView) {
		GenTextField genText = generator.genmodel.genindividualcomponent.gentextfield.
				GentextfieldFactory.eINSTANCE.createGenTextField();
		genText.setName(textView.getName());
		
		return (GenTextField) setPropertiesIndividualElement(genText, textView);
	}
	
	public GenContainer setPropertiesContainer(GenContainer genContainer, GraphicalContainer container) {
		X x = generator.apperance.position.PositionFactory.eINSTANCE.createX();
		x.setValue(container.getPositionX());
		genContainer.setTheX(x);
		Y y = generator.apperance.position.PositionFactory.eINSTANCE.createY();
		y.setValue(container.getPositionY());
		genContainer.setTheY(y);
		Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
		w.setValue(container.getWidth());
		genContainer.setTheWidth(w);
		Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();
		h.setValue(container.getHeight()-50);
		genContainer.setTheHeight(h);
		TitleHeight th = generator.apperance.titlesize.TitlesizeFactory.eINSTANCE.createTitleHeight();
		th.setValue(25);
		genContainer.setTheTitleHeight(th);
		Color c = generator.apperance.font.FontFactory.eINSTANCE.createColor();
		//TODO Valores por defecto
		c.setValue("BLACK");
		genContainer.setTheColor(c);
		Size s = generator.apperance.font.FontFactory.eINSTANCE.createSize();
		s.setValue(12);
		genContainer.setTheSize(s);
		Type t = generator.apperance.font.FontFactory.eINSTANCE.createType();
		t.setValue("Calabri");
		genContainer.setTheType(t);
		return genContainer;
	}
	
	public GenIndividualElement setPropertiesIndividualElement(GenIndividualElement genElement, GraphicalIndividualEement element) {
		X x = generator.apperance.position.PositionFactory.eINSTANCE.createX();
		x.setValue(element.getPositionX());
		genElement.setTheX(x);
		Y y = generator.apperance.position.PositionFactory.eINSTANCE.createY();
		y.setValue(element.getPositionY());
		genElement.setTheY(y);
		Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
		w.setValue(element.getWidth());
		genElement.setTheWidth(w);
		Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();
		h.setValue(element.getHeight());
		genElement.setTheHeight(h);
		Color c = generator.apperance.font.FontFactory.eINSTANCE.createColor();
		//TODO Valores por defecto
		c.setValue("BLACK");
		genElement.setTheColor(c);
		Size s = generator.apperance.font.FontFactory.eINSTANCE.createSize();
		s.setValue(12);
		genElement.setTheSize(s);
		Type t = generator.apperance.font.FontFactory.eINSTANCE.createType();
		t.setValue("Calabri");
		genElement.setTheType(t);
		return genElement;
	}
	
	public GenIndividualElement setPropertiesElement(GenIndividualElement genElement, GraphicalContainer container) {
		X x = generator.apperance.position.PositionFactory.eINSTANCE.createX();
		x.setValue(container.getPositionX());
		genElement.setTheX(x);
		Y y = generator.apperance.position.PositionFactory.eINSTANCE.createY();
		y.setValue(container.getPositionY());
		genElement.setTheY(y);
		Width w = generator.apperance.size.SizeFactory.eINSTANCE.createWidth();
		w.setValue(container.getWidth());
		genElement.setTheWidth(w);
		Height h = generator.apperance.size.SizeFactory.eINSTANCE.createHeight();
		h.setValue(container.getHeight());
		genElement.setTheHeight(h);
		Color c = generator.apperance.font.FontFactory.eINSTANCE.createColor();
		//TODO Valores por defecto
		c.setValue("BLACK");
		genElement.setTheColor(c);
		Size s = generator.apperance.font.FontFactory.eINSTANCE.createSize();
		s.setValue(12);
		genElement.setTheSize(s);
		Type t = generator.apperance.font.FontFactory.eINSTANCE.createType();
		t.setValue("Calabri");
		genElement.setTheType(t);
		return genElement;
	}
}
