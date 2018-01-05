/**
 */
package generator.genexcel.impl;

import generator.genexcel.ExcelGenerator;
import generator.genexcel.GenexcelPackage;
import generator.genmodel.GenModel;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;

import generator.genmodel.genindividualcomponent.genbutton.GenButton;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;

import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;

import generator.genmodel.genindividualcomponent.gentable.GenTable;

import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;

import java.lang.reflect.InvocationTargetException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Excel Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExcelGeneratorImpl extends MinimalEObjectImpl.Container implements ExcelGenerator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcelGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenexcelPackage.Literals.EXCEL_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createExcel(final GenModel genModel) {
		Workbook wb = new org.apache.poi.xssf.usermodel.XSSFWorkbook();
		Sheet sheet = wb.createSheet("Formulario");
		System.out.println("Creando celdas...");
		for(int i = 0; i < 1000; i++) {
			org.apache.poi.ss.usermodel.Row row = sheet.createRow(i);
			for(int j = 0; j < 1000; j++) {
				row.createCell(j);
		    }
		    row.setHeight((short) 33);
		}
		for(int i = 0; i < 1000; i++) {
			sheet.setColumnWidth(i, 66);
		}
		
		for(int i = 0; i < genModel.getListGenElements().size(); i++) {
			generator.genmodel.GenElement genElement = genModel.getListGenElements().get(i);
			if(genElement instanceof GenContainer) {
				GenContainer genContainer = (GenContainer) genElement;
				createContainerExcel(wb, sheet, genContainer, 5, 5);
			}
		}
		
		System.out.println("Celdas creadas!");
		org.eclipse.core.resources.IWorkspace workspace = org.eclipse.core.
				resources.ResourcesPlugin.getWorkspace();
		java.io.File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		String runTimePath = workspaceDirectory.getAbsolutePath().toString();
		runTimePath = runTimePath.replace("\\","/");
		String path = runTimePath+"/test/files/Formulario.xlsx";
		java.io.FileOutputStream fileOut;
		try {
			fileOut = new java.io.FileOutputStream(path);
			wb.write(fileOut);
			fileOut.close();
			wb.close();
		    System.out.println("Archivo guardado!");
		    openFileIntoEditor(path);
		} catch (java.io.FileNotFoundException e) {
			javax.swing.JOptionPane.showMessageDialog(null, 
					"No se pudo encontrar la ruta del archivo", null, 
					javax.swing.JOptionPane.ERROR_MESSAGE);
		} catch (java.io.IOException e) {
			javax.swing.JOptionPane.showMessageDialog(null, 
					"El archivo no pudo ser guardado, verifique que no se encuentre abierto", 
					null, javax.swing.JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void openFileIntoEditor(final String path) {
		java.io.File fileToOpen = new java.io.File(path);
		if (fileToOpen.exists() && fileToOpen.isFile()) {
			org.eclipse.core.filesystem.IFileStore fileStore = org.eclipse.core.
					filesystem.EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
			org.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.
					getWorkbench().getActiveWorkbenchWindow().getActivePage();
			try {
				org.eclipse.ui.ide.IDE.openEditorOnFileStore(page, fileStore);
			} catch (org.eclipse.ui.PartInitException e) {
				javax.swing.JOptionPane.showMessageDialog(null, 
						"Algo salio mal al abrir el editor", null, 
						javax.swing.JOptionPane.ERROR_MESSAGE);
			}
		} else {
			javax.swing.JOptionPane.showMessageDialog(null, 
					"No se pudo encontrar la ruta del archivo", null, 
					javax.swing.JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createContainerExcel(final Workbook wb, final Sheet sheet, final GenContainer genContainer, final Integer r, final Integer c) {
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genContainer.getTheY().getValue())+r);
		Cell cell = row.createCell(calculateR1(genContainer.getTheX().getValue())+c);
		cell.setCellValue(genContainer.getName());
		addBorderToMergedRegion(wb, sheet, calculateR1(genContainer.getTheY().getValue())+r, 
				calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r,
				calculateR1(genContainer.getTheX().getValue())+c,
				calculateR2(genContainer.getTheX().getValue(),genContainer.getTheWidth().getValue())+c);
		addBorderToContainer(wb, sheet, calculateR1(genContainer.getTheY().getValue())+r,
				calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue()
						+genContainer.getTheHeight().getValue())+r,
				calculateR1(genContainer.getTheX().getValue())+c,
				calculateR2(genContainer.getTheX().getValue(),genContainer.getTheWidth().getValue())+c);
		org.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.valueOf(
				getColumnLetters(calculateR1(genContainer.getTheX().getValue())+c)+
				(calculateR1(genContainer.getTheY().getValue())+1+r)+":"+
				getColumnLetters(calculateR2(genContainer.getTheX().getValue(),genContainer.getTheWidth().getValue())+c)+
				(calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+1+r));
		sheet.addMergedRegion( region );
		changeFont(wb, cell, genContainer.getTheSize().getValue(), genContainer.getTheType().getValue());
		for (int i = 0; i < genContainer.getListGenElements().size(); i++) {
			generator.genmodel.GenElement genElement = genContainer.getListGenElements().get(i);
			if(genElement instanceof GenContainer) {
				GenContainer container = (GenContainer) genElement;
				createContainerExcel(wb, sheet, container,
						calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,
						calculateR1(genContainer.getTheX().getValue())+c);
			} else if(genElement instanceof GenLabel) {
				GenLabel genLabel = (GenLabel) genElement;
				createLabelExcel(wb, sheet, genLabel,
						calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,
						calculateR1(genContainer.getTheX().getValue())+c);
			} else if(genElement instanceof GenTextField) {
				GenTextField genText = (GenTextField) genElement;
				createTextExcel(wb, sheet, genText,
						calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,
						calculateR1(genContainer.getTheX().getValue())+c);
			} else if(genElement instanceof GenTable) {
				GenTable genTable = (GenTable) genElement;
				createTableExcel(wb, sheet, genTable,
						calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,
						calculateR1(genContainer.getTheX().getValue())+c);
			} else if(genElement instanceof GenComboBox) {
				GenComboBox genComboBox = (GenComboBox) genElement;
				createComboExcel(wb, sheet, genComboBox,
						calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,
						calculateR1(genContainer.getTheX().getValue())+c);
			}   else if(genElement instanceof GenButton) {
				GenButton genButton = (GenButton) genElement;
				createButtonExcel(wb, sheet, genButton,
						calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,
						calculateR1(genContainer.getTheX().getValue())+c);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createLabelExcel(final Workbook wb, final Sheet sheet, final GenLabel genLabel, final Integer r, final Integer c) {
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genLabel.getTheY().getValue())+r);
		Cell cell = row.createCell(calculateR1(genLabel.getTheX().getValue())+c);
		cell.setCellValue(genLabel.getName());
		
		org.apache.poi.ss.usermodel.CellStyle borderStyle = wb.createCellStyle();
		cell.setCellStyle(borderStyle);
		
		org.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.
				valueOf(getColumnLetters(calculateR1(genLabel.getTheX().getValue())+c)+
				(calculateR1(genLabel.getTheY().getValue())+1+r)+":"+
				getColumnLetters(calculateR2(genLabel.getTheX().getValue(),genLabel.getTheWidth().getValue())+c)+
				(calculateR2(genLabel.getTheY().getValue(),genLabel.getTheHeight().getValue())+1+r));
		sheet.addMergedRegion( region );
		changeFont(wb, cell, genLabel.getTheSize().getValue(), genLabel.getTheType().getValue());
		changeAlignment(wb, cell, genLabel.getTheAlignment().getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createTextExcel(final Workbook wb, final Sheet sheet, final GenTextField genText, final Integer r, final Integer c) {
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genText.getTheY().getValue())+r);
		Cell cell = row.createCell(calculateR1(genText.getTheX().getValue())+c);
		addBorderToMergedRegion(wb, sheet, calculateR1(genText.getTheY().getValue())+r, 
				calculateR2(genText.getTheY().getValue(),genText.getTheHeight().getValue())+r,
				calculateR1(genText.getTheX().getValue())+c,
				calculateR2(genText.getTheX().getValue(),genText.getTheWidth().getValue())+c);
		org.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.
				valueOf(getColumnLetters(calculateR1(genText.getTheX().getValue())+c)+
				(calculateR1(genText.getTheY().getValue())+1+r)+":"+
				getColumnLetters(calculateR2(genText.getTheX().getValue(),genText.getTheWidth().getValue())+c)+
				(calculateR2(genText.getTheY().getValue(),genText.getTheHeight().getValue())+1+r));
		sheet.addMergedRegion( region );
		changeFont(wb, cell, genText.getTheSize().getValue(), genText.getTheType().getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createTableExcel(final Workbook wb, final Sheet sheet, final GenTable genTable, final Integer r, final Integer c) {
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genTable.getTheY().getValue())+r);
		Cell cell = row.createCell(calculateR1(genTable.getTheX().getValue())+c);
		cell.setCellValue(genTable.getName());
		addBorderToMergedRegion(wb, sheet, calculateR1(genTable.getTheY().getValue())+r, 
				calculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue())+r,
				calculateR1(genTable.getTheX().getValue())+c,
				calculateR2(genTable.getTheX().getValue(),genTable.getTheWidth().getValue())+c);
		addBorderToContainer(wb, sheet, calculateR1(genTable.getTheY().getValue())+r,
				calculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue()+
						genTable.getTheHeight().getValue())+r,
				calculateR1(genTable.getTheX().getValue())+c,
				calculateR2(genTable.getTheX().getValue(),genTable.getTheWidth().getValue())+c);
		org.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.
				valueOf(getColumnLetters(calculateR1(genTable.getTheX().getValue())+c)+
				(calculateR1(genTable.getTheY().getValue())+1+r)+":"+
				getColumnLetters(calculateR2(genTable.getTheX().getValue(),genTable.getTheWidth().getValue())+c)+
				(calculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue())+1+r));
		sheet.addMergedRegion( region );
		changeFont(wb, cell, genTable.getTheSize().getValue(), genTable.getTheType().getValue());
		int x = 0;
		for (int i = 0; i < genTable.getListGenColumns().size(); i++) {
			GenColumn genColumn = genTable.getListGenColumns().get(i);
			createColumnExcel(wb, sheet, genColumn,
					calculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue())+r+1,
					calculateR1(genTable.getTheX().getValue())+c, x);
			x += genColumn.getTheWidth().getValue();
		}
		int y = 0;
		for (int j = 0; j < 6; j++) {
			x = 0;
			y += genTable.getListGenColumns().get(0).getTheHeight().getValue();
		    for (int i = 0; i < genTable.getListGenColumns().size(); i++) {
				GenColumn genColumn = genTable.getListGenColumns().get(i);
				createTableRowExcel(wb, sheet, genColumn,
						calculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue())+r+1,
						calculateR1(genTable.getTheX().getValue())+c, x, y);
				x += genColumn.getTheWidth().getValue();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createColumnExcel(final Workbook wb, final Sheet sheet, final GenColumn genColumn, final Integer r, final Integer c, final Integer x) {
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(0)+r);
		Cell cell = row.createCell(calculateR1(x)+c);
		cell.setCellValue(genColumn.getName());
		addBorderToMergedRegion(wb, sheet, calculateR1(0)+r, 
				calculateR2(0,genColumn.getTheHeight().getValue())+r,
				calculateR1(x)+c,
				calculateR2(x,genColumn.getTheWidth().getValue())+c);
		org.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.
				valueOf(getColumnLetters(calculateR1(x)+c)+
				(calculateR1(0)+1+r)+":"+
				getColumnLetters(calculateR2(x,genColumn.getTheWidth().getValue())+c)+
				(calculateR2(0,genColumn.getTheHeight().getValue())+1+r));
		sheet.addMergedRegion( region );
		changeFont(wb, cell, genColumn.getTheSize().getValue(), genColumn.getTheType().getValue());
		changeAlignment(wb, cell, genColumn.getTheAlignment().getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createTableRowExcel(final Workbook wb, final Sheet sheet, final GenColumn genColumn, final Integer r, final Integer c, final Integer x, final Integer y) {
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(y)+r);
		Cell cell = row.createCell(calculateR1(x)+c);
		addBorderToMergedRegion(wb, sheet, calculateR1(y)+r, 
				calculateR2(y,genColumn.getTheHeight().getValue())+r,
				calculateR1(x)+c,
				calculateR2(x,genColumn.getTheWidth().getValue())+c);
		org.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.
				valueOf(getColumnLetters(calculateR1(x)+c)+
				(calculateR1(y)+1+r)+":"+
				getColumnLetters(calculateR2(x,genColumn.getTheWidth().getValue())+c)+
				(calculateR2(y,genColumn.getTheHeight().getValue())+1+r));
		sheet.addMergedRegion( region );
		changeFont(wb, cell, genColumn.getTheSize().getValue(), genColumn.getTheType().getValue());
		changeAlignment(wb, cell, genColumn.getTheAlignment().getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createComboExcel(final Workbook wb, final Sheet sheet, final GenComboBox genCombo, final Integer r, final Integer c) {
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genCombo.getTheY().getValue())+r);
		Cell cell = row.createCell(calculateR1(genCombo.getTheX().getValue())+c);
		cell.setCellValue("V ");
		addBorderToMergedRegion(wb, sheet, calculateR1(genCombo.getTheY().getValue())+r, 
				calculateR2(genCombo.getTheY().getValue(),genCombo.getTheHeight().getValue())+r,
				calculateR1(genCombo.getTheX().getValue())+c,
				calculateR2(genCombo.getTheX().getValue(),genCombo.getTheWidth().getValue())+c);
		org.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.
				valueOf(getColumnLetters(calculateR1(genCombo.getTheX().getValue())+c)+
				(calculateR1(genCombo.getTheY().getValue())+1+r)+":"+
				getColumnLetters(calculateR2(genCombo.getTheX().getValue(),genCombo.getTheWidth().getValue())+c)+
				(calculateR2(genCombo.getTheY().getValue(),genCombo.getTheHeight().getValue())+1+r));
		sheet.addMergedRegion( region );
		changeFont(wb, cell, genCombo.getTheSize().getValue(), genCombo.getTheType().getValue());
		org.apache.poi.ss.usermodel.CellStyle cellStyle = cell.getCellStyle();
		if(cellStyle == null) 
			cellStyle = wb.createCellStyle();
		cellStyle.setAlignment(org.apache.poi.ss.usermodel.HorizontalAlignment.RIGHT);
		cell.setCellStyle(cellStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createButtonExcel(final Workbook wb, final Sheet sheet, final GenButton genButton, final Integer r, final Integer c) {
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genButton.getTheY().getValue())+r);
		Cell cell = row.createCell(calculateR1(genButton.getTheX().getValue())+c);
		cell.setCellValue(genButton.getName());
		addBorderToButton(wb, sheet, calculateR1(genButton.getTheY().getValue())+r, 
				calculateR2(genButton.getTheY().getValue(),genButton.getTheHeight().getValue())+r,
				calculateR1(genButton.getTheX().getValue())+c,
				calculateR2(genButton.getTheX().getValue(),genButton.getTheWidth().getValue())+c);
		org.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.
				valueOf(getColumnLetters(calculateR1(genButton.getTheX().getValue())+c)+
				(calculateR1(genButton.getTheY().getValue())+1+r)+":"+
				getColumnLetters(calculateR2(genButton.getTheX().getValue(),genButton.getTheWidth().getValue())+c)+
				(calculateR2(genButton.getTheY().getValue(),genButton.getTheHeight().getValue())+1+r));
		sheet.addMergedRegion( region );
		changeFont(wb, cell, genButton.getTheSize().getValue(), genButton.getTheType().getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer calculateR1(final Integer y) {
		return (y/2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer calculateR2(final Integer y, final Integer h) {
		return ((y+h)/2) - 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnLetters(final Integer index) {
		String column = "";
		int i = index;
		while(i >= 26) {
			column = (char)((i%26)+65) + column;
			i /= 26;
			i--;
		}
		column = (char)(i+65) + column;
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeFont(final Workbook wb, final Cell cell, final Integer fontSize, final String fontType) {
		org.apache.poi.ss.usermodel.Font font = wb.createFont();
		int value = fontSize;
		font.setFontHeightInPoints((short)(value));
		font.setFontName(fontType);
		org.apache.poi.ss.usermodel.CellStyle cellStyle = cell.getCellStyle();
		if(cellStyle == null) cellStyle = wb.createCellStyle();
		cellStyle.setFont(font);
		cell.setCellStyle(cellStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeAlignment(final Workbook wb, final Cell cell, final String alignment) {
		org.apache.poi.ss.usermodel.CellStyle cellStyle = cell.getCellStyle();
		if(cellStyle == null) 
			cellStyle = wb.createCellStyle();
		if(alignment.equals("CENTER")) 
			cellStyle.setAlignment(org.apache.poi.ss.usermodel.HorizontalAlignment.CENTER);
		else if(alignment.equals("RIGHT"))
			cellStyle.setAlignment(org.apache.poi.ss.usermodel.HorizontalAlignment.RIGHT);
		else
			cellStyle.setAlignment(org.apache.poi.ss.usermodel.HorizontalAlignment.LEFT);
		cell.setCellStyle(cellStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBorderToMergedRegion(final Workbook wb, final Sheet sheet, final Integer r1, final Integer r2, final Integer c1, final Integer c2) {
		org.apache.poi.ss.usermodel.CellStyle borderStyle = wb.createCellStyle();
		borderStyle.setBorderBottom(org.apache.poi.ss.usermodel.BorderStyle.THIN);
		borderStyle.setBorderTop(org.apache.poi.ss.usermodel.BorderStyle.THIN);
		borderStyle.setBorderRight(org.apache.poi.ss.usermodel.BorderStyle.THIN);
		borderStyle.setBorderLeft(org.apache.poi.ss.usermodel.BorderStyle.THIN);
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(r1);
		for (int i = c1; i <= c2; i++) {
		    Cell cell = row.getCell(i);
		    cell.setCellStyle(borderStyle);
		}
		row = sheet.getRow(r2);
		for (int i = c1; i <= c2; i++) {
		    Cell cell = row.getCell(i);
		    cell.setCellStyle(borderStyle);
		}
		for (int i = r1; i <= r2; i++) {
			row = sheet.getRow(i);
			Cell cell = row.getCell(c1);
		    cell.setCellStyle(borderStyle);
		    cell = row.getCell(c2);
		    cell.setCellStyle(borderStyle);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBorderToButton(final Workbook wb, final Sheet sheet, final Integer r1, final Integer r2, final Integer c1, final Integer c2) {
		org.apache.poi.ss.usermodel.CellStyle borderStyle = wb.createCellStyle();
		borderStyle.setBorderBottom(org.apache.poi.ss.usermodel.BorderStyle.MEDIUM);
		borderStyle.setBorderTop(org.apache.poi.ss.usermodel.BorderStyle.THIN);
		borderStyle.setBorderRight(org.apache.poi.ss.usermodel.BorderStyle.MEDIUM);
		borderStyle.setBorderLeft(org.apache.poi.ss.usermodel.BorderStyle.THIN);
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(r1);
		for (int i = c1; i <= c2; i++) {
		    Cell cell = row.getCell(i);
		    cell.setCellStyle(borderStyle);
		}
		row = sheet.getRow(r2);
		for (int i = c1; i <= c2; i++) {
		    Cell cell = row.getCell(i);
		    cell.setCellStyle(borderStyle);
		}
		for (int i = r1; i <= r2; i++) {
			row = sheet.getRow(i);
			Cell cell = row.getCell(c1);
		    cell.setCellStyle(borderStyle);
		    cell = row.getCell(c2);
		    cell.setCellStyle(borderStyle);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBorderToContainer(final Workbook wb, final Sheet sheet, final Integer r1, final Integer r2, final Integer c1, final Integer c2) {
		org.apache.poi.ss.usermodel.CellStyle borderRStyle = wb.createCellStyle();
		borderRStyle.setBorderRight(org.apache.poi.ss.usermodel.BorderStyle.THIN);
		
		org.apache.poi.ss.usermodel.CellStyle borderLStyle = wb.createCellStyle();
		borderLStyle.setBorderLeft(org.apache.poi.ss.usermodel.BorderStyle.THIN);
		
		org.apache.poi.ss.usermodel.CellStyle borderBStyle = wb.createCellStyle();
		borderBStyle.setBorderBottom(org.apache.poi.ss.usermodel.BorderStyle.THIN);
		
		org.apache.poi.ss.usermodel.Row row = sheet.getRow(r2);
		for (int i = c1; i <= c2; i++) {
		    Cell cell = row.getCell(i);
		    cell.setCellStyle(borderBStyle);
		}
		for (int i = r1; i <= r2; i++) {
			row = sheet.getRow(i);
			Cell cell = row.getCell(c1);
		    cell.setCellStyle(borderLStyle);
		    cell = row.getCell(c2);
		    cell.setCellStyle(borderRStyle);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GenexcelPackage.EXCEL_GENERATOR___CREATE_EXCEL__GENMODEL:
				createExcel((GenModel)arguments.get(0));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___OPEN_FILE_INTO_EDITOR__STRING:
				openFileIntoEditor((String)arguments.get(0));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___CREATE_CONTAINER_EXCEL__WORKBOOK_SHEET_GENCONTAINER_INTEGER_INTEGER:
				createContainerExcel((Workbook)arguments.get(0), (Sheet)arguments.get(1), (GenContainer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___CREATE_LABEL_EXCEL__WORKBOOK_SHEET_GENLABEL_INTEGER_INTEGER:
				createLabelExcel((Workbook)arguments.get(0), (Sheet)arguments.get(1), (GenLabel)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___CREATE_TEXT_EXCEL__WORKBOOK_SHEET_GENTEXTFIELD_INTEGER_INTEGER:
				createTextExcel((Workbook)arguments.get(0), (Sheet)arguments.get(1), (GenTextField)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___CREATE_TABLE_EXCEL__WORKBOOK_SHEET_GENTABLE_INTEGER_INTEGER:
				createTableExcel((Workbook)arguments.get(0), (Sheet)arguments.get(1), (GenTable)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___CREATE_COLUMN_EXCEL__WORKBOOK_SHEET_GENCOLUMN_INTEGER_INTEGER_INTEGER:
				createColumnExcel((Workbook)arguments.get(0), (Sheet)arguments.get(1), (GenColumn)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___CREATE_TABLE_ROW_EXCEL__WORKBOOK_SHEET_GENCOLUMN_INTEGER_INTEGER_INTEGER_INTEGER:
				createTableRowExcel((Workbook)arguments.get(0), (Sheet)arguments.get(1), (GenColumn)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5), (Integer)arguments.get(6));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___CREATE_COMBO_EXCEL__WORKBOOK_SHEET_GENCOMBOBOX_INTEGER_INTEGER:
				createComboExcel((Workbook)arguments.get(0), (Sheet)arguments.get(1), (GenComboBox)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___CREATE_BUTTON_EXCEL__WORKBOOK_SHEET_GENBUTTON_INTEGER_INTEGER:
				createButtonExcel((Workbook)arguments.get(0), (Sheet)arguments.get(1), (GenButton)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___CALCULATE_R1__INTEGER:
				return calculateR1((Integer)arguments.get(0));
			case GenexcelPackage.EXCEL_GENERATOR___CALCULATE_R2__INTEGER_INTEGER:
				return calculateR2((Integer)arguments.get(0), (Integer)arguments.get(1));
			case GenexcelPackage.EXCEL_GENERATOR___GET_COLUMN_LETTERS__INTEGER:
				return getColumnLetters((Integer)arguments.get(0));
			case GenexcelPackage.EXCEL_GENERATOR___CHANGE_FONT__WORKBOOK_CELL_INTEGER_STRING:
				changeFont((Workbook)arguments.get(0), (Cell)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___CHANGE_ALIGNMENT__WORKBOOK_CELL_STRING:
				changeAlignment((Workbook)arguments.get(0), (Cell)arguments.get(1), (String)arguments.get(2));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___ADD_BORDER_TO_MERGED_REGION__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER:
				addBorderToMergedRegion((Workbook)arguments.get(0), (Sheet)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___ADD_BORDER_TO_BUTTON__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER:
				addBorderToButton((Workbook)arguments.get(0), (Sheet)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
			case GenexcelPackage.EXCEL_GENERATOR___ADD_BORDER_TO_CONTAINER__WORKBOOK_SHEET_INTEGER_INTEGER_INTEGER_INTEGER:
				addBorderToContainer((Workbook)arguments.get(0), (Sheet)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExcelGeneratorImpl
