/**
 */
package generator.genexcel;

import generator.genmodel.GenModel;

import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;

import generator.genmodel.genindividualcomponent.genbutton.GenButton;

import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;

import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;

import generator.genmodel.genindividualcomponent.genlabel.GenLabel;

import generator.genmodel.genindividualcomponent.gentable.GenTable;

import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Excel Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see generator.genexcel.GenexcelPackage#getExcelGenerator()
 * @model
 * @generated
 */
public interface ExcelGenerator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Workbook wb = new org.apache.poi.xssf.usermodel.XSSFWorkbook();\r\nSheet sheet = wb.createSheet(\"Formulario\");\r\nSystem.out.println(\"Creando celdas...\");\r\nfor(int i = 0; i &lt; 1000; i++) {\r\n\torg.apache.poi.ss.usermodel.Row row = sheet.createRow(i);\r\n\tfor(int j = 0; j &lt; 1000; j++) {\r\n\t\trow.createCell(j);\r\n    }\r\n    row.setHeight((short) 33);\r\n}\r\nfor(int i = 0; i &lt; 1000; i++) {\r\n\tsheet.setColumnWidth(i, 66);\r\n}\r\n\r\nfor(int i = 0; i &lt; genModel.getListGenElements().size(); i++) {\r\n\tGenElement genElement = genModel.getListGenElements().get(i);\r\n\tif(genElement instanceof GenContainer) {\r\n\t\tGenContainer genContainer = (GenContainer) genElement;\r\n\t\tcreateContainerExcel(wb, sheet, genContainer, 5, 5);\r\n\t}\r\n}\r\n\r\nSystem.out.println(\"Celdas creadas!\");\r\norg.eclipse.core.resources.IWorkspace workspace = org.eclipse.core.\r\n\t\tresources.ResourcesPlugin.getWorkspace();\r\njava.io.File workspaceDirectory = workspace.getRoot().getLocation().toFile();\r\nString runTimePath = workspaceDirectory.getAbsolutePath().toString();\r\nrunTimePath = runTimePath.replace(\"\\\\\",\"/\");\r\nString path = runTimePath+\"/test/files/Formulario.xlsx\";\r\njava.io.FileOutputStream fileOut;\r\ntry {\r\n\tfileOut = new java.io.FileOutputStream(path);\r\n\twb.write(fileOut);\r\n\tfileOut.close();\r\n\twb.close();\r\n    System.out.println(\"Archivo guardado!\");\r\n    openFileIntoEditor(path);\r\n} catch (java.io.FileNotFoundException e) {\r\n\tjavax.swing.JOptionPane.showMessageDialog(null, \r\n\t\t\t\"No se pudo encontrar la ruta del archivo\", null, \r\n\t\t\tjavax.swing.JOptionPane.ERROR_MESSAGE);\r\n} catch (java.io.IOException e) {\r\n\tjavax.swing.JOptionPane.showMessageDialog(null, \r\n\t\t\t\"El archivo no pudo ser guardado, verifique que no se encuentre abierto\", \r\n\t\t\tnull, javax.swing.JOptionPane.ERROR_MESSAGE);\r\n}'"
	 * @generated
	 */
	void createExcel(GenModel genModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='java.io.File fileToOpen = new java.io.File(path);\r\nif (fileToOpen.exists() &amp;&amp; fileToOpen.isFile()) {\r\n\torg.eclipse.core.filesystem.IFileStore fileStore = org.eclipse.core.\r\n\t\t\tfilesystem.EFS.getLocalFileSystem().getStore(fileToOpen.toURI());\r\n\torg.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.\r\n\t\t\tgetWorkbench().getActiveWorkbenchWindow().getActivePage();\r\n\ttry {\r\n\t\torg.eclipse.ui.ide.IDE.openEditorOnFileStore(page, fileStore);\r\n\t} catch (org.eclipse.ui.PartInitException e) {\r\n\t\tjavax.swing.JOptionPane.showMessageDialog(null, \r\n\t\t\t\t\"Algo salio mal al abrir el editor\", null, \r\n\t\t\t\tjavax.swing.JOptionPane.ERROR_MESSAGE);\r\n\t}\r\n} else {\r\n\tjavax.swing.JOptionPane.showMessageDialog(null, \r\n\t\t\t\"No se pudo encontrar la ruta del archivo\", null, \r\n\t\t\tjavax.swing.JOptionPane.ERROR_MESSAGE);\r\n}'"
	 * @generated
	 */
	void openFileIntoEditor(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genContainer.getTheY().getValue())+r);\r\nCell cell = row.createCell(calculateR1(genContainer.getTheX().getValue())+c);\r\ncell.setCellValue(genContainer.getTheContainer().getName());\r\naddBorderToMergedRegion(wb, sheet, calculateR1(genContainer.getTheY().getValue())+r, \r\n\t\tcalculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r,\r\n\t\tcalculateR1(genContainer.getTheX().getValue())+c,\r\n\t\tcalculateR2(genContainer.getTheX().getValue(),genContainer.getTheWidth().getValue())+c);\r\naddBorderToContainer(wb, sheet, calculateR1(genContainer.getTheY().getValue())+r,\r\n\t\tcalculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue()\r\n\t\t\t\t+genContainer.getTheHeight().getValue())+r,\r\n\t\tcalculateR1(genContainer.getTheX().getValue())+c,\r\n\t\tcalculateR2(genContainer.getTheX().getValue(),genContainer.getTheWidth().getValue())+c);\r\norg.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.valueOf(\r\n\t\tgetColumnLetters(calculateR1(genContainer.getTheX().getValue())+c)+\r\n\t\t(calculateR1(genContainer.getTheY().getValue())+1+r)+\":\"+\r\n\t\tgetColumnLetters(calculateR2(genContainer.getTheX().getValue(),genContainer.getTheWidth().getValue())+c)+\r\n\t\t(calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+1+r));\r\nsheet.addMergedRegion( region );\r\nchangeFont(wb, cell, genContainer.getTheSize().getValue(), genContainer.getTheType().getValue());\r\nfor (int i = 0; i &lt; genContainer.getListGenElements().size(); i++) {\r\n\tGenElement genElement = genContainer.getListGenElements().get(i);\r\n\tif(genElement instanceof GenContainer) {\r\n\t\tGenContainer container = (GenContainer) genElement;\r\n\t\tcreateContainerExcel(wb, sheet, container,\r\n\t\t\t\tcalculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,\r\n\t\t\t\tcalculateR1(genContainer.getTheX().getValue())+c);\r\n\t} else if(genElement instanceof GenLabel) {\r\n\t\tGenLabel genLabel = (GenLabel) genElement;\r\n\t\tcreateLabelExcel(wb, sheet, genLabel,\r\n\t\t\t\tcalculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,\r\n\t\t\t\tcalculateR1(genContainer.getTheX().getValue())+c);\r\n\t} else if(genElement instanceof GenTextField) {\r\n\t\tGenTextField genText = (GenTextField) genElement;\r\n\t\tcreateTextExcel(wb, sheet, genText,\r\n\t\t\t\tcalculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,\r\n\t\t\t\tcalculateR1(genContainer.getTheX().getValue())+c);\r\n\t} else if(genElement instanceof GenTable) {\r\n\t\tGenTable genTable = (GenTable) genElement;\r\n\t\tcreateTableExcel(wb, sheet, genTable,\r\n\t\t\t\tcalculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,\r\n\t\t\t\tcalculateR1(genContainer.getTheX().getValue())+c);\r\n\t} else if(genElement instanceof GenComboBox) {\r\n\t\tGenComboBox genComboBox = (GenComboBox) genElement;\r\n\t\tcreateComboExcel(wb, sheet, genComboBox,\r\n\t\t\t\tcalculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,\r\n\t\t\t\tcalculateR1(genContainer.getTheX().getValue())+c);\r\n\t}   else if(genElement instanceof GenButton) {\r\n\t\tGenButton genButton = (GenButton) genElement;\r\n\t\tcreateButtonExcel(wb, sheet, genButton,\r\n\t\t\t\tcalculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r+1,\r\n\t\t\t\tcalculateR1(genContainer.getTheX().getValue())+c);\r\n\t}\r\n}'"
	 * @generated
	 */
	void createContainerExcel(Workbook wb, Sheet sheet, GenContainer genContainer, Integer r, Integer c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genLabel.getTheY().getValue())+r);\r\nCell cell = row.createCell(calculateR1(genLabel.getTheX().getValue())+c);\r\ncell.setCellValue(genLabel.getTheLabel().getName());\r\n\r\norg.apache.poi.ss.usermodel.CellStyle borderStyle = wb.createCellStyle();\r\ncell.setCellStyle(borderStyle);\r\n\r\norg.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.\r\n\t\tvalueOf(getColumnLetters(calculateR1(genLabel.getTheX().getValue())+c)+\r\n\t\t(calculateR1(genLabel.getTheY().getValue())+1+r)+\":\"+\r\n\t\tgetColumnLetters(calculateR2(genLabel.getTheX().getValue(),genLabel.getTheWidth().getValue())+c)+\r\n\t\t(calculateR2(genLabel.getTheY().getValue(),genLabel.getTheHeight().getValue())+1+r));\r\nsheet.addMergedRegion( region );\r\nchangeFont(wb, cell, genLabel.getTheSize().getValue(), genLabel.getTheType().getValue());\r\nchangeAlignment(wb, cell, genLabel.getTheAlignment().getValue());'"
	 * @generated
	 */
	void createLabelExcel(Workbook wb, Sheet sheet, GenLabel genLabel, Integer r, Integer c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genText.getTheY().getValue())+r);\r\nCell cell = row.createCell(calculateR1(genText.getTheX().getValue())+c);\r\naddBorderToMergedRegion(wb, sheet, calculateR1(genText.getTheY().getValue())+r, \r\n\t\tcalculateR2(genText.getTheY().getValue(),genText.getTheHeight().getValue())+r,\r\n\t\tcalculateR1(genText.getTheX().getValue())+c,\r\n\t\tcalculateR2(genText.getTheX().getValue(),genText.getTheWidth().getValue())+c);\r\norg.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.\r\n\t\tvalueOf(getColumnLetters(calculateR1(genText.getTheX().getValue())+c)+\r\n\t\t(calculateR1(genText.getTheY().getValue())+1+r)+\":\"+\r\n\t\tgetColumnLetters(calculateR2(genText.getTheX().getValue(),genText.getTheWidth().getValue())+c)+\r\n\t\t(calculateR2(genText.getTheY().getValue(),genText.getTheHeight().getValue())+1+r));\r\nsheet.addMergedRegion( region );\r\nchangeFont(wb, cell, genText.getTheSize().getValue(), genText.getTheType().getValue());'"
	 * @generated
	 */
	void createTextExcel(Workbook wb, Sheet sheet, GenTextField genText, Integer r, Integer c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genTable.getTheY().getValue())+r);\r\nCell cell = row.createCell(calculateR1(genTable.getTheX().getValue())+c);\r\ncell.setCellValue(genTable.getTheTable().getName());\r\naddBorderToMergedRegion(wb, sheet, calculateR1(genTable.getTheY().getValue())+r, \r\n\t\tcalculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue())+r,\r\n\t\tcalculateR1(genTable.getTheX().getValue())+c,\r\n\t\tcalculateR2(genTable.getTheX().getValue(),genTable.getTheWidth().getValue())+c);\r\naddBorderToContainer(wb, sheet, calculateR1(genTable.getTheY().getValue())+r,\r\n\t\tcalculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue()+\r\n\t\t\t\tgenTable.getTheHeight().getValue())+r,\r\n\t\tcalculateR1(genTable.getTheX().getValue())+c,\r\n\t\tcalculateR2(genTable.getTheX().getValue(),genTable.getTheWidth().getValue())+c);\r\norg.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.\r\n\t\tvalueOf(getColumnLetters(calculateR1(genTable.getTheX().getValue())+c)+\r\n\t\t(calculateR1(genTable.getTheY().getValue())+1+r)+\":\"+\r\n\t\tgetColumnLetters(calculateR2(genTable.getTheX().getValue(),genTable.getTheWidth().getValue())+c)+\r\n\t\t(calculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue())+1+r));\r\nsheet.addMergedRegion( region );\r\nchangeFont(wb, cell, genTable.getTheSize().getValue(), genTable.getTheType().getValue());\r\nint x = 0;\r\nfor (int i = 0; i &lt; genTable.getListGenColumns().size(); i++) {\r\n\tGenColumn genColumn = genTable.getListGenColumns().get(i);\r\n\tcreateColumnExcel(wb, sheet, genColumn,\r\n\t\t\tcalculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue())+r+1,\r\n\t\t\tcalculateR1(genTable.getTheX().getValue())+c, x);\r\n\tx += genColumn.getTheWidth().getValue();\r\n}\r\nint y = 0;\r\nfor (int j = 0; j &lt; 6; j++) {\r\n\tx = 0;\r\n\ty += genTable.getListGenColumns().get(0).getTheHeight().getValue();\r\n    for (int i = 0; i &lt; genTable.getListGenColumns().size(); i++) {\r\n\t\tGenColumn genColumn = genTable.getListGenColumns().get(i);\r\n\t\tcreateTableRowExcel(wb, sheet, genColumn,\r\n\t\t\t\tcalculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue())+r+1,\r\n\t\t\t\tcalculateR1(genTable.getTheX().getValue())+c, x, y);\r\n\t\tx += genColumn.getTheWidth().getValue();\r\n\t}\r\n}'"
	 * @generated
	 */
	void createTableExcel(Workbook wb, Sheet sheet, GenTable genTable, Integer r, Integer c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(0)+r);\r\nCell cell = row.createCell(calculateR1(x)+c);\r\ncell.setCellValue(genColumn.getTheColumn().getName());\r\naddBorderToMergedRegion(wb, sheet, calculateR1(0)+r, \r\n\t\tcalculateR2(0,genColumn.getTheHeight().getValue())+r,\r\n\t\tcalculateR1(x)+c,\r\n\t\tcalculateR2(x,genColumn.getTheWidth().getValue())+c);\r\norg.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.\r\n\t\tvalueOf(getColumnLetters(calculateR1(x)+c)+\r\n\t\t(calculateR1(0)+1+r)+\":\"+\r\n\t\tgetColumnLetters(calculateR2(x,genColumn.getTheWidth().getValue())+c)+\r\n\t\t(calculateR2(0,genColumn.getTheHeight().getValue())+1+r));\r\nsheet.addMergedRegion( region );\r\nchangeFont(wb, cell, genColumn.getTheSize().getValue(), genColumn.getTheType().getValue());\r\nchangeAlignment(wb, cell, genColumn.getTheAlignment().getValue());'"
	 * @generated
	 */
	void createColumnExcel(Workbook wb, Sheet sheet, GenColumn genColumn, Integer r, Integer c, Integer x);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(y)+r);\r\nCell cell = row.createCell(calculateR1(x)+c);\r\naddBorderToMergedRegion(wb, sheet, calculateR1(y)+r, \r\n\t\tcalculateR2(y,genColumn.getTheHeight().getValue())+r,\r\n\t\tcalculateR1(x)+c,\r\n\t\tcalculateR2(x,genColumn.getTheWidth().getValue())+c);\r\norg.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.\r\n\t\tvalueOf(getColumnLetters(calculateR1(x)+c)+\r\n\t\t(calculateR1(y)+1+r)+\":\"+\r\n\t\tgetColumnLetters(calculateR2(x,genColumn.getTheWidth().getValue())+c)+\r\n\t\t(calculateR2(y,genColumn.getTheHeight().getValue())+1+r));\r\nsheet.addMergedRegion( region );\r\nchangeFont(wb, cell, genColumn.getTheSize().getValue(), genColumn.getTheType().getValue());\r\nchangeAlignment(wb, cell, genColumn.getTheAlignment().getValue());'"
	 * @generated
	 */
	void createTableRowExcel(Workbook wb, Sheet sheet, GenColumn genColumn, Integer r, Integer c, Integer x, Integer y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genCombo.getTheY().getValue())+r);\r\nCell cell = row.createCell(calculateR1(genCombo.getTheX().getValue())+c);\r\ncell.setCellValue(\"V \");\r\naddBorderToMergedRegion(wb, sheet, calculateR1(genCombo.getTheY().getValue())+r, \r\n\t\tcalculateR2(genCombo.getTheY().getValue(),genCombo.getTheHeight().getValue())+r,\r\n\t\tcalculateR1(genCombo.getTheX().getValue())+c,\r\n\t\tcalculateR2(genCombo.getTheX().getValue(),genCombo.getTheWidth().getValue())+c);\r\norg.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.\r\n\t\tvalueOf(getColumnLetters(calculateR1(genCombo.getTheX().getValue())+c)+\r\n\t\t(calculateR1(genCombo.getTheY().getValue())+1+r)+\":\"+\r\n\t\tgetColumnLetters(calculateR2(genCombo.getTheX().getValue(),genCombo.getTheWidth().getValue())+c)+\r\n\t\t(calculateR2(genCombo.getTheY().getValue(),genCombo.getTheHeight().getValue())+1+r));\r\nsheet.addMergedRegion( region );\r\nchangeFont(wb, cell, genCombo.getTheSize().getValue(), genCombo.getTheType().getValue());\r\norg.apache.poi.ss.usermodel.CellStyle cellStyle = cell.getCellStyle();\r\nif(cellStyle == null) \r\n\tcellStyle = wb.createCellStyle();\r\ncellStyle.setAlignment(org.apache.poi.ss.usermodel.HorizontalAlignment.RIGHT);\r\ncell.setCellStyle(cellStyle);'"
	 * @generated
	 */
	void createComboExcel(Workbook wb, Sheet sheet, GenComboBox genCombo, Integer r, Integer c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.Row row = sheet.getRow(calculateR1(genButton.getTheY().getValue())+r);\r\nCell cell = row.createCell(calculateR1(genButton.getTheX().getValue())+c);\r\ncell.setCellValue(genButton.getTheButton().getName());\r\naddBorderToButton(wb, sheet, calculateR1(genButton.getTheY().getValue())+r, \r\n\t\tcalculateR2(genButton.getTheY().getValue(),genButton.getTheHeight().getValue())+r,\r\n\t\tcalculateR1(genButton.getTheX().getValue())+c,\r\n\t\tcalculateR2(genButton.getTheX().getValue(),genButton.getTheWidth().getValue())+c);\r\norg.apache.poi.ss.util.CellRangeAddress region = org.apache.poi.ss.util.CellRangeAddress.\r\n\t\tvalueOf(getColumnLetters(calculateR1(genButton.getTheX().getValue())+c)+\r\n\t\t(calculateR1(genButton.getTheY().getValue())+1+r)+\":\"+\r\n\t\tgetColumnLetters(calculateR2(genButton.getTheX().getValue(),genButton.getTheWidth().getValue())+c)+\r\n\t\t(calculateR2(genButton.getTheY().getValue(),genButton.getTheHeight().getValue())+1+r));\r\nsheet.addMergedRegion( region );\r\nchangeFont(wb, cell, genButton.getTheSize().getValue(), genButton.getTheType().getValue());'"
	 * @generated
	 */
	void createButtonExcel(Workbook wb, Sheet sheet, GenButton genButton, Integer r, Integer c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return (y/2);'"
	 * @generated
	 */
	Integer calculateR1(Integer y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((y+h)/2) - 1;'"
	 * @generated
	 */
	Integer calculateR2(Integer y, Integer h);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String column = \"\";\r\nwhile(index &gt;= 26) {\r\n\tcolumn = (char)((index%26)+65) + column;\r\n\tindex /= 26;\r\n\tindex--;\r\n}\r\ncolumn = (char)(index+65) + column;\r\nreturn column;'"
	 * @generated
	 */
	String getColumnLetters(Integer index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" cellDataType="generator.datatypes.Cell"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.Font font = wb.createFont();\r\nfont.setFontHeightInPoints((short)(fontSize));\r\nfont.setFontName(fontType);\r\norg.apache.poi.ss.usermodel.CellStyle cellStyle = cell.getCellStyle();\r\nif(cellStyle == null) cellStyle = wb.createCellStyle();\r\ncellStyle.setFont(font);\r\ncell.setCellStyle(cellStyle);'"
	 * @generated
	 */
	void changeFont(Workbook wb, Cell cell, Integer fontSize, String fontType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" cellDataType="generator.datatypes.Cell"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.CellStyle cellStyle = cell.getCellStyle();\r\nif(cellStyle == null) \r\n\tcellStyle = wb.createCellStyle();\r\nif(alignment.equals(\"CENTER\")) \r\n\tcellStyle.setAlignment(org.apache.poi.ss.usermodel.HorizontalAlignment.CENTER);\r\nelse if(alignment.equals(\"RIGHT\"))\r\n\tcellStyle.setAlignment(org.apache.poi.ss.usermodel.HorizontalAlignment.RIGHT);\r\nelse\r\n\tcellStyle.setAlignment(org.apache.poi.ss.usermodel.HorizontalAlignment.LEFT);\r\ncell.setCellStyle(cellStyle);'"
	 * @generated
	 */
	void changeAlignment(Workbook wb, Cell cell, String alignment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.CellStyle borderStyle = wb.createCellStyle();\r\nborderStyle.setBorderBottom(org.apache.poi.ss.usermodel.BorderStyle.THIN);\r\nborderStyle.setBorderTop(org.apache.poi.ss.usermodel.BorderStyle.THIN);\r\nborderStyle.setBorderRight(org.apache.poi.ss.usermodel.BorderStyle.THIN);\r\nborderStyle.setBorderLeft(org.apache.poi.ss.usermodel.BorderStyle.THIN);\r\norg.apache.poi.ss.usermodel.Row row = sheet.getRow(r1);\r\nfor (int i = c1; i &lt;= c2; i++) {\r\n    Cell cell = row.getCell(i);\r\n    cell.setCellStyle(borderStyle);\r\n}\r\nrow = sheet.getRow(r2);\r\nfor (int i = c1; i &lt;= c2; i++) {\r\n    Cell cell = row.getCell(i);\r\n    cell.setCellStyle(borderStyle);\r\n}\r\nfor (int i = r1; i &lt;= r2; i++) {\r\n\trow = sheet.getRow(i);\r\n\tCell cell = row.getCell(c1);\r\n    cell.setCellStyle(borderStyle);\r\n    cell = row.getCell(c2);\r\n    cell.setCellStyle(borderStyle);\r\n}'"
	 * @generated
	 */
	void addBorderToMergedRegion(Workbook wb, Sheet sheet, Integer r1, Integer r2, Integer c1, Integer c2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.CellStyle borderStyle = wb.createCellStyle();\r\nborderStyle.setBorderBottom(org.apache.poi.ss.usermodel.BorderStyle.MEDIUM);\r\nborderStyle.setBorderTop(org.apache.poi.ss.usermodel.BorderStyle.THIN);\r\nborderStyle.setBorderRight(org.apache.poi.ss.usermodel.BorderStyle.MEDIUM);\r\nborderStyle.setBorderLeft(org.apache.poi.ss.usermodel.BorderStyle.THIN);\r\norg.apache.poi.ss.usermodel.Row row = sheet.getRow(r1);\r\nfor (int i = c1; i &lt;= c2; i++) {\r\n    Cell cell = row.getCell(i);\r\n    cell.setCellStyle(borderStyle);\r\n}\r\nrow = sheet.getRow(r2);\r\nfor (int i = c1; i &lt;= c2; i++) {\r\n    Cell cell = row.getCell(i);\r\n    cell.setCellStyle(borderStyle);\r\n}\r\nfor (int i = r1; i &lt;= r2; i++) {\r\n\trow = sheet.getRow(i);\r\n\tCell cell = row.getCell(c1);\r\n    cell.setCellStyle(borderStyle);\r\n    cell = row.getCell(c2);\r\n    cell.setCellStyle(borderStyle);\r\n}'"
	 * @generated
	 */
	void addBorderToButton(Workbook wb, Sheet sheet, Integer r1, Integer r2, Integer c1, Integer c2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model wbDataType="generator.datatypes.Workbook" sheetDataType="generator.datatypes.Sheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.ss.usermodel.CellStyle borderRStyle = wb.createCellStyle();\r\nborderRStyle.setBorderRight(org.apache.poi.ss.usermodel.BorderStyle.THIN);\r\n\r\norg.apache.poi.ss.usermodel.CellStyle borderLStyle = wb.createCellStyle();\r\nborderLStyle.setBorderLeft(org.apache.poi.ss.usermodel.BorderStyle.THIN);\r\n\r\norg.apache.poi.ss.usermodel.CellStyle borderBStyle = wb.createCellStyle();\r\nborderBStyle.setBorderBottom(org.apache.poi.ss.usermodel.BorderStyle.THIN);\r\n\r\norg.apache.poi.ss.usermodel.Row row = sheet.getRow(r2);\r\nfor (int i = c1; i &lt;= c2; i++) {\r\n    Cell cell = row.getCell(i);\r\n    cell.setCellStyle(borderBStyle);\r\n}\r\nfor (int i = r1; i &lt;= r2; i++) {\r\n\trow = sheet.getRow(i);\r\n\tCell cell = row.getCell(c1);\r\n    cell.setCellStyle(borderLStyle);\r\n    cell = row.getCell(c2);\r\n    cell.setCellStyle(borderRStyle);\r\n}'"
	 * @generated
	 */
	void addBorderToContainer(Workbook wb, Sheet sheet, Integer r1, Integer r2, Integer c1, Integer c2);

} // ExcelGenerator
