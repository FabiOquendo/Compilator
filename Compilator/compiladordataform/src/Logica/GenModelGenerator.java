package Logica;

import generator.genmodel.GenModel;
import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;
import generator.genmodel.genindividualcomponent.genbutton.GenButton;
import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;
import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;
import generator.genmodel.genindividualcomponent.genlabel.GenLabel;
import generator.genmodel.genindividualcomponent.gentable.GenTable;
import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;
import tooldataform.ModelFactory;
import tooldataform.formmodel.concreta.Button;
import tooldataform.formmodel.concreta.ColumView;
import tooldataform.formmodel.concreta.ComboView;
import tooldataform.formmodel.concreta.Container;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.GraphicalIndividualEement;
import tooldataform.formmodel.concreta.Interface;
import tooldataform.formmodel.concreta.LabelView;
import tooldataform.formmodel.concreta.ModelElementDataForm;
import tooldataform.formmodel.concreta.TableView;
import tooldataform.formmodel.concreta.TextView;
import tooldataform.formmodel.containers.GraphicalContainer;

public class GenModelGenerator {
	
	public GenModelGenerator() {
		super();
	}
	
	public int getContainerAmountAbove(GraphicalContainer parent,ModelElementDataForm element) {
		int amount = 0;
		int y = 0;
		if(element instanceof Container) {
			Container c = (Container) element;
			y = c.getPositionY();
		} else if(element instanceof GraphicalIndividualEement) {
			GraphicalIndividualEement ind = (GraphicalIndividualEement) element;
			y = ind.getPositionY();
		}
		
		for(int i = 0; i < parent.getListGraphicalContainer().size(); i++) {
			GraphicalContainer c = parent.getListGraphicalContainer().get(i);
			if(c.getPositionY()+c.getHeight() <= y)
				amount++;
		}
			
		return amount;
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
		
		return genContainer;
	}
	
	public GenTable createGenTable(TableView tableView) {
		GenTable genTable = generator.genmodel.genindividualcomponent.gentable.
				GentableFactory.eINSTANCE.createGenTable();
		
		for(int i = 0; i < tableView.getListColumView().size(); i++) {
			genTable.getListGenColumns().add(createGenColumn(tableView.getListColumView().get(i)));
		}
		
		return genTable;
	}
	
	public GenColumn createGenColumn(ColumView columnView) {
		GenColumn genColumn = generator.genmodel.genindividualcomponent.gencolunm.
				GencolunmFactory.eINSTANCE.createGenColumn();
		
		return genColumn;
	}
	
	public GenComboBox createGenCombo(ComboView comboView) {
		GenComboBox genCombo = generator.genmodel.genindividualcomponent.gencombobox.
				GencomboboxFactory.eINSTANCE.createGenComboBox();
		
		
		return genCombo;
	}
	
	public GenButton createGenButton(Button button) {
		GenButton genButton = generator.genmodel.genindividualcomponent.genbutton.
				GenbuttonFactory.eINSTANCE.createGenButton();
		
		
		return genButton;
	}
	
	public GenLabel createGenLabel(LabelView labelView) {
		GenLabel genLabel = generator.genmodel.genindividualcomponent.genlabel.
				GenlabelFactory.eINSTANCE.createGenLabel();
		
		
		return genLabel;
	}
	
	public GenTextField createGenTextField(TextView textView) {
		GenTextField genText = generator.genmodel.genindividualcomponent.gentextfield.
				GentextfieldFactory.eINSTANCE.createGenTextField();
		
		
		return genText;
	}
}
