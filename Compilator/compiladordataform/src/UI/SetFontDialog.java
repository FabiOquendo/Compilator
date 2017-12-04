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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SetFontDialog extends Dialog {

    private Text txtSize;
	private Text txtInterval;
	
    private boolean increasing;
    private int size;
    private int interval;
	private boolean warning;

    private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

    public SetFontDialog(Shell parentShell, boolean increasing, int size, int interval, boolean warning) {
        super(parentShell);
        configureShell(parentShell);
        this.increasing = increasing;
        this.size = size;
        this.interval = interval;
        this.warning = warning;
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        container.setToolTipText("");
        
        Group grpEditarPropiedad = new Group(container, SWT.NONE);
        GridData gd_grpEditarPropiedad = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_grpEditarPropiedad.widthHint = 214;
        gd_grpEditarPropiedad.heightHint = 105;
        grpEditarPropiedad.setLayoutData(gd_grpEditarPropiedad);
        grpEditarPropiedad.setText("Set Properties Font Size");
        
        Label lblSize = formToolkit.createLabel(grpEditarPropiedad, "Initial size:", SWT.NONE);
        lblSize.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        lblSize.setBounds(10, 70, 70, 20);
        
        txtSize = formToolkit.createText(grpEditarPropiedad, "New Text", SWT.BORDER);
        txtSize.setText("" + size);
        txtSize.setBounds(80, 70, 130, 20);
        txtSize.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                Text textWidget = (Text) e.getSource();
                String sizeText = textWidget.getText();
                size = Integer.parseInt(sizeText);
            }
        });
        
        Label lblInterval = formToolkit.createLabel(grpEditarPropiedad, "Interval:", SWT.NONE);
        lblInterval.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
        lblInterval.setBounds(10, 100, 70, 20);
        
        txtInterval = formToolkit.createText(grpEditarPropiedad, "New Text", SWT.BORDER);
        txtInterval.setText("" + interval);
        txtInterval.setBounds(80, 100, 130, 20);
        txtInterval.addModifyListener(new ModifyListener() {

            @Override
            public void modifyText(ModifyEvent e) {
                Text textWidget = (Text) e.getSource();
                String intervalText = textWidget.getText();
                interval = Integer.parseInt(intervalText);
            }
        });
        
        
     // Create a group to contain 2 radio (Male & Female)
        
        Group genderGroup = new Group(grpEditarPropiedad, SWT.NONE);
        genderGroup.setBounds(10, 20, 200, 35);
         
         
        Button buttonIncreasing = new Button(genderGroup, SWT.RADIO);
        buttonIncreasing.addSelectionListener(new SelectionAdapter() {
        	@Override
        	public void widgetSelected(SelectionEvent e) {
        	}
        });
        buttonIncreasing.setText("Increasing");
        buttonIncreasing.setBounds(10, 10, 80, 20);
        buttonIncreasing.setSelection(increasing);
        buttonIncreasing.addSelectionListener(new SelectionAdapter()  {
        	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                Button source=  (Button) e.getSource();
                 
                if(source.getSelection())  {
                    increasing = true;
                }
            }
             
        });
         
        Button buttonDecreasing = new Button(genderGroup, SWT.RADIO);
        buttonDecreasing.setText("Decreasing");
        buttonDecreasing.setBounds(110, 10, 80, 20);
        buttonDecreasing.setSelection(!increasing);
        buttonDecreasing.addSelectionListener(new SelectionAdapter()  {
       	 
            @Override
            public void widgetSelected(SelectionEvent e) {
                Button source=  (Button) e.getSource();
                 
                if(source.getSelection())  {
                    increasing = false;
                }
            }
             
        });
        
        return container;
    }

    // override method to use "Login" as label for the OK button
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
    	createButton(parent, IDialogConstants.OK_ID, "OK", true);
        createButton(parent, IDialogConstants.CANCEL_ID,
                IDialogConstants.CANCEL_LABEL, false);
    }

    @Override
    protected Point getInitialSize() {
        return new Point(250, 230);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

	public boolean isIncreasing() {
		return increasing;
	}

	public void setIncreasing(boolean increasing) {
		this.increasing = increasing;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public boolean isWarning() {
		return warning;
	}

	public void setWarning(boolean warning) {
		this.warning = warning;
	}
}

