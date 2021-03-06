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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;

public class AddCharacteristicDialog extends Dialog {
    private Text txtName;
    private String name;

    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

    public AddCharacteristicDialog(Shell parentShell) {
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
        grpEditarPropiedad.setText("Crear Caracteristica");
        
        Label lblName = formToolkit.createLabel(grpEditarPropiedad, "Nombre:", SWT.NONE);
        lblName.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        lblName.setBounds(10, 40, 55, 20);
        
        txtName = formToolkit.createText(grpEditarPropiedad, "New Text", SWT.BORDER);
        txtName.setText("");
        txtName.setBounds(70, 40, 130, 20);
        txtName.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                Text textWidget = (Text) e.getSource();
                String nameText = textWidget.getText();
                name = nameText;
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

}
