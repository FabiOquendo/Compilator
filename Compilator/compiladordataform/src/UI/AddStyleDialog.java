package UI;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Display;
import org.eclipse.wb.swt.SWTResourceManager;

import styles.domain.Characteristic;
import styles.domain.CharacteristicFactory;

import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AddStyleDialog extends Dialog {
    private Text txtName;
    private String name;
    private String [] characteristics;

    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private ComboViewer comboViewer;
	private String characteristic;

    public AddStyleDialog(Shell parentShell, CharacteristicFactory theCharacteristicFactory) {
        super(parentShell);
        configureShell(parentShell);
        EList<Characteristic> listCharacteristics = theCharacteristicFactory.getListCharacteristic();
        characteristics = new String[listCharacteristics.size()];
        for(int i = 0; i < listCharacteristics.size(); i++) {
        	characteristics[i] = listCharacteristics.get(i).getName();
        }
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        container.setToolTipText("");
        
        Group grpEditarPropiedad = new Group(container, SWT.NONE);
        GridData gd_grpEditarPropiedad = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_grpEditarPropiedad.widthHint = 263;
        gd_grpEditarPropiedad.heightHint = 85;
        grpEditarPropiedad.setLayoutData(gd_grpEditarPropiedad);
        grpEditarPropiedad.setText("Crear Estilo");
        
        Label lblName = formToolkit.createLabel(grpEditarPropiedad, "Nombre:", SWT.NONE);
        lblName.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        lblName.setBounds(10, 30, 80, 20);
        
        txtName = formToolkit.createText(grpEditarPropiedad, "New Text", SWT.BORDER);
        txtName.setText("");
        txtName.setBounds(100, 30, 140, 20);
        txtName.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                Text textWidget = (Text) e.getSource();
                String nameText = textWidget.getText();
                name = nameText;
            }
        });
        
        Label lblValue = formToolkit.createLabel(grpEditarPropiedad, "Caracteristica:", SWT.NONE);
        lblValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        lblValue.setBounds(10, 70, 80, 20);
        
        comboViewer = new ComboViewer(grpEditarPropiedad, SWT.NONE);
        Combo combo = comboViewer.getCombo();
        combo.setBounds(100, 70, 140, 20);
        formToolkit.paintBordersFor(combo);
        comboViewer.add(characteristics);
        combo.addSelectionListener(new SelectionAdapter() {
        	@Override
        	public void widgetSelected(SelectionEvent e) {
        		characteristic = combo.getItem(combo.getSelectionIndex());
        	}
        });
        
        return container;
    }

    // override method to use "Login" as label for the OK button
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, "Crear", true);
        createButton(parent, IDialogConstants.CANCEL_ID,
                IDialogConstants.CANCEL_LABEL, false);
    }

    @Override
    protected Point getInitialSize() {
        return new Point(300, 200);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

}
