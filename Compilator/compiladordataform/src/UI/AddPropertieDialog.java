package UI;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Display;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


public class AddPropertieDialog extends Dialog {
    private Text txtValue;
    private String name;
    private String value;

    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private ComboViewer comboViewer;


    public AddPropertieDialog(Shell parentShell) {
        super(parentShell);
        configureShell(parentShell);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        container.setToolTipText("");
        
        Group grpEditarPropiedad = new Group(container, SWT.NONE);
        GridData gd_grpEditarPropiedad = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_grpEditarPropiedad.widthHint = 214;
        gd_grpEditarPropiedad.heightHint = 85;
        grpEditarPropiedad.setLayoutData(gd_grpEditarPropiedad);
        grpEditarPropiedad.setText("Crear Propiedad");
        
        Label lblName = formToolkit.createLabel(grpEditarPropiedad, "Nombre:", SWT.NONE);
        lblName.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        lblName.setBounds(10, 30, 55, 20);

        Label lblValue = formToolkit.createLabel(grpEditarPropiedad, "Valor:", SWT.NONE);
        lblValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        lblValue.setBounds(10, 70, 55, 20);
        
        txtValue = formToolkit.createText(grpEditarPropiedad, "New Text", SWT.BORDER);
        txtValue.setText("");
        txtValue.setBounds(70, 70, 130, 20);
        txtValue.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                Text textWidget = (Text) e.getSource();
                String valueText = textWidget.getText();
                value = valueText;
            }
        });
        
        comboViewer = new ComboViewer(grpEditarPropiedad, SWT.NONE);
        Combo combo = comboViewer.getCombo();
        combo.setBounds(70, 30, 130, 20);
        formToolkit.paintBordersFor(combo);
        String [] properties = {"X", "Y", "Width", "Height", "Font Color", "Font Type", "Font Size", "Alignment", 
        		"Background", "Lines Visible", "Orientation"};
        comboViewer.add(properties);
        combo.addSelectionListener(new SelectionAdapter() {
        	@Override
        	public void widgetSelected(SelectionEvent e) {
        		name = combo.getItem(combo.getSelectionIndex());
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
        return new Point(250, 200);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}