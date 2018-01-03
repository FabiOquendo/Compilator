package Logica;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import generator.genmodel.GenElement;
import generator.genmodel.GenModel;
import generator.genmodel.gencontainercomponent.gencontainer.GenContainer;
import generator.genmodel.genindividualcomponent.genbutton.GenButton;
import generator.genmodel.genindividualcomponent.gencolunm.GenColumn;
import generator.genmodel.genindividualcomponent.gencombobox.GenComboBox;
import generator.genmodel.genindividualcomponent.genlabel.GenLabel;
import generator.genmodel.genindividualcomponent.gentable.GenTable;
import generator.genmodel.genindividualcomponent.gentextfield.GenTextField;

public class ExcelGenerator {
	
	private GenModel genModel;
	
	public ExcelGenerator(GenModel genModel) {
		this.genModel = genModel;
	}
	
	public void createExcel() throws IOException {
		
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("Formulario");
	    System.out.println("Creando celdas...");
	    for(int i = 0; i < 1000; i++) {
	    	Row row = sheet.createRow(i);
	    	for(int j = 0; j < 1000; j++) {
	    		row.createCell(j);
		    }
		    row.setHeight((short) 33);
	    }
	    for(int i = 0; i < 1000; i++) {
	    	sheet.setColumnWidth(i, 66);
	    }
	    
	    for(int i = 0; i < genModel.getListGenElements().size(); i++) {
	    	GenElement genElement = genModel.getListGenElements().get(i);
	    	if(genElement instanceof GenContainer) {
	    		GenContainer genContainer = (GenContainer) genElement;
	    		createContainerExcel(wb, sheet, genContainer, 5, 5);
	    	}
	    }
	    
	    System.out.println("Celdas creadas!");
	    IWorkspace workspace = ResourcesPlugin.getWorkspace();
		File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		String runTimePath = workspaceDirectory.getAbsolutePath().toString();
		runTimePath = runTimePath.replace("\\","/");
	    String path = runTimePath+"/test/files/Formulario.xlsx";
	    FileOutputStream fileOut = new FileOutputStream(path);
	    wb.write(fileOut);
	    fileOut.close();
	    wb.close();
	    System.out.println("Archivo guardado!");
	    openFileIntoEditor(path);
	}
	
	public void openFileIntoEditor(final String path) {

		java.io.File fileToOpen = new java.io.File(path);

		if (fileToOpen.exists() && fileToOpen.isFile()) {
			org.eclipse.core.filesystem.IFileStore fileStore = org.eclipse.core.filesystem.EFS.getLocalFileSystem()
					.getStore(fileToOpen.toURI());
			org.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage();
			try {
				org.eclipse.ui.ide.IDE.openEditorOnFileStore(page, fileStore);
			} catch (org.eclipse.ui.PartInitException e) {
				// Put your exception handler here if you wish to
			}
		} else {
			// Do something if the file does not exist
		}

	}
	
	public void createContainerExcel(Workbook wb, Sheet sheet, GenContainer genContainer, int r, int c) {
		Row row = sheet.getRow(calculateR1(genContainer.getTheY().getValue())+r);
	    Cell cell = row.createCell(calculateR1(genContainer.getTheX().getValue())+c);
	    cell.setCellValue(genContainer.getTheContainer().getName());
	    addBorderToMergedRegion(wb, sheet, calculateR1(genContainer.getTheY().getValue())+r, 
	    		calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+r,
	    		calculateR1(genContainer.getTheX().getValue())+c,
	    		calculateR2(genContainer.getTheX().getValue(),genContainer.getTheWidth().getValue())+c);
	    addBorderToContainer(wb, sheet, calculateR1(genContainer.getTheY().getValue())+r,
	    		calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue()+genContainer.getTheHeight().getValue())+r,
	    		calculateR1(genContainer.getTheX().getValue())+c,
	    		calculateR2(genContainer.getTheX().getValue(),genContainer.getTheWidth().getValue())+c);
	    CellRangeAddress region = CellRangeAddress.valueOf(getColumnLetters(calculateR1(genContainer.getTheX().getValue())+c)+
	    		(calculateR1(genContainer.getTheY().getValue())+1+r)+":"+
	    		getColumnLetters(calculateR2(genContainer.getTheX().getValue(),genContainer.getTheWidth().getValue())+c)+
	    		(calculateR2(genContainer.getTheY().getValue(),genContainer.getTheTitleHeight().getValue())+1+r));
	    sheet.addMergedRegion( region );
	    changeFont(wb, cell, genContainer.getTheSize().getValue(), genContainer.getTheType().getValue());
	    for (int i = 0; i < genContainer.getListGenElements().size(); i++) {
	    	GenElement genElement = genContainer.getListGenElements().get(i);
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
	
	public void createLabelExcel(Workbook wb, Sheet sheet, GenLabel genLabel, int r, int c) {
		Row row = sheet.getRow(calculateR1(genLabel.getTheY().getValue())+r);
	    Cell cell = row.createCell(calculateR1(genLabel.getTheX().getValue())+c);
	    cell.setCellValue(genLabel.getTheLabel().getName());
	    
	    CellStyle borderStyle = wb.createCellStyle();
	    cell.setCellStyle(borderStyle);
	    
	    CellRangeAddress region = CellRangeAddress.valueOf(getColumnLetters(calculateR1(genLabel.getTheX().getValue())+c)+
	    		(calculateR1(genLabel.getTheY().getValue())+1+r)+":"+
	    		getColumnLetters(calculateR2(genLabel.getTheX().getValue(),genLabel.getTheWidth().getValue())+c)+
	    		(calculateR2(genLabel.getTheY().getValue(),genLabel.getTheHeight().getValue())+1+r));
	    sheet.addMergedRegion( region );
	    changeFont(wb, cell, genLabel.getTheSize().getValue(), genLabel.getTheType().getValue());
	    changeAlignment(wb, cell, genLabel.getTheAlignment().getValue());
	}
	
	public void createTextExcel(Workbook wb, Sheet sheet, GenTextField genText, int r, int c) {
		Row row = sheet.getRow(calculateR1(genText.getTheY().getValue())+r);
	    Cell cell = row.createCell(calculateR1(genText.getTheX().getValue())+c);
		addBorderToMergedRegion(wb, sheet, calculateR1(genText.getTheY().getValue())+r, 
	    		calculateR2(genText.getTheY().getValue(),genText.getTheHeight().getValue())+r,
	    		calculateR1(genText.getTheX().getValue())+c,
	    		calculateR2(genText.getTheX().getValue(),genText.getTheWidth().getValue())+c);
	    CellRangeAddress region = CellRangeAddress.valueOf(getColumnLetters(calculateR1(genText.getTheX().getValue())+c)+
	    		(calculateR1(genText.getTheY().getValue())+1+r)+":"+
	    		getColumnLetters(calculateR2(genText.getTheX().getValue(),genText.getTheWidth().getValue())+c)+
	    		(calculateR2(genText.getTheY().getValue(),genText.getTheHeight().getValue())+1+r));
	    sheet.addMergedRegion( region );
	    changeFont(wb, cell, genText.getTheSize().getValue(), genText.getTheType().getValue());
	}
	
	public void createTableExcel(Workbook wb, Sheet sheet, GenTable genTable, int r, int c) {
		Row row = sheet.getRow(calculateR1(genTable.getTheY().getValue())+r);
	    Cell cell = row.createCell(calculateR1(genTable.getTheX().getValue())+c);
	    cell.setCellValue(genTable.getTheTable().getName());
	    addBorderToMergedRegion(wb, sheet, calculateR1(genTable.getTheY().getValue())+r, 
	    		calculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue())+r,
	    		calculateR1(genTable.getTheX().getValue())+c,
	    		calculateR2(genTable.getTheX().getValue(),genTable.getTheWidth().getValue())+c);
	    addBorderToContainer(wb, sheet, calculateR1(genTable.getTheY().getValue())+r,
	    		calculateR2(genTable.getTheY().getValue(),genTable.getTheTitleHeight().getValue()+genTable.getTheHeight().getValue())+r,
	    		calculateR1(genTable.getTheX().getValue())+c,
	    		calculateR2(genTable.getTheX().getValue(),genTable.getTheWidth().getValue())+c);
	    CellRangeAddress region = CellRangeAddress.valueOf(getColumnLetters(calculateR1(genTable.getTheX().getValue())+c)+
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
	
	public void createColumnExcel(Workbook wb, Sheet sheet, GenColumn genColumn, int r, int c, int x) {
		Row row = sheet.getRow(calculateR1(0)+r);
	    Cell cell = row.createCell(calculateR1(x)+c);
	    cell.setCellValue(genColumn.getTheColumn().getName());
		addBorderToMergedRegion(wb, sheet, calculateR1(0)+r, 
	    		calculateR2(0,genColumn.getTheHeight().getValue())+r,
	    		calculateR1(x)+c,
	    		calculateR2(x,genColumn.getTheWidth().getValue())+c);
	    CellRangeAddress region = CellRangeAddress.valueOf(getColumnLetters(calculateR1(x)+c)+
	    		(calculateR1(0)+1+r)+":"+
	    		getColumnLetters(calculateR2(x,genColumn.getTheWidth().getValue())+c)+
	    		(calculateR2(0,genColumn.getTheHeight().getValue())+1+r));
	    sheet.addMergedRegion( region );
	    changeFont(wb, cell, genColumn.getTheSize().getValue(), genColumn.getTheType().getValue());
	    changeAlignment(wb, cell, genColumn.getTheAlignment().getValue());
	}
	
	public void createTableRowExcel(Workbook wb, Sheet sheet, GenColumn genColumn, int r, int c, int x, int y) {
		Row row = sheet.getRow(calculateR1(y)+r);
	    Cell cell = row.createCell(calculateR1(x)+c);
		addBorderToMergedRegion(wb, sheet, calculateR1(y)+r, 
	    		calculateR2(y,genColumn.getTheHeight().getValue())+r,
	    		calculateR1(x)+c,
	    		calculateR2(x,genColumn.getTheWidth().getValue())+c);
	    CellRangeAddress region = CellRangeAddress.valueOf(getColumnLetters(calculateR1(x)+c)+
	    		(calculateR1(y)+1+r)+":"+
	    		getColumnLetters(calculateR2(x,genColumn.getTheWidth().getValue())+c)+
	    		(calculateR2(y,genColumn.getTheHeight().getValue())+1+r));
	    sheet.addMergedRegion( region );
	    changeFont(wb, cell, genColumn.getTheSize().getValue(), genColumn.getTheType().getValue());
	    changeAlignment(wb, cell, genColumn.getTheAlignment().getValue());
	}
	
	public void createComboExcel(Workbook wb, Sheet sheet, GenComboBox genCombo, int r, int c) {
		Row row = sheet.getRow(calculateR1(genCombo.getTheY().getValue())+r);
	    Cell cell = row.createCell(calculateR1(genCombo.getTheX().getValue())+c);
	    cell.setCellValue("V ");
		addBorderToMergedRegion(wb, sheet, calculateR1(genCombo.getTheY().getValue())+r, 
	    		calculateR2(genCombo.getTheY().getValue(),genCombo.getTheHeight().getValue())+r,
	    		calculateR1(genCombo.getTheX().getValue())+c,
	    		calculateR2(genCombo.getTheX().getValue(),genCombo.getTheWidth().getValue())+c);
	    CellRangeAddress region = CellRangeAddress.valueOf(getColumnLetters(calculateR1(genCombo.getTheX().getValue())+c)+
	    		(calculateR1(genCombo.getTheY().getValue())+1+r)+":"+
	    		getColumnLetters(calculateR2(genCombo.getTheX().getValue(),genCombo.getTheWidth().getValue())+c)+
	    		(calculateR2(genCombo.getTheY().getValue(),genCombo.getTheHeight().getValue())+1+r));
	    sheet.addMergedRegion( region );
	    changeFont(wb, cell, genCombo.getTheSize().getValue(), genCombo.getTheType().getValue());
	    CellStyle cellStyle = cell.getCellStyle();
		if(cellStyle == null) 
			cellStyle = wb.createCellStyle();
		cellStyle.setAlignment(HorizontalAlignment.RIGHT);
		cell.setCellStyle(cellStyle);
	}
	
	public void createButtonExcel(Workbook wb, Sheet sheet, GenButton genButton, int r, int c) {
		Row row = sheet.getRow(calculateR1(genButton.getTheY().getValue())+r);
	    Cell cell = row.createCell(calculateR1(genButton.getTheX().getValue())+c);
	    cell.setCellValue(genButton.getTheButton().getName());
		addBorderToButton(wb, sheet, calculateR1(genButton.getTheY().getValue())+r, 
	    		calculateR2(genButton.getTheY().getValue(),genButton.getTheHeight().getValue())+r,
	    		calculateR1(genButton.getTheX().getValue())+c,
	    		calculateR2(genButton.getTheX().getValue(),genButton.getTheWidth().getValue())+c);
	    CellRangeAddress region = CellRangeAddress.valueOf(getColumnLetters(calculateR1(genButton.getTheX().getValue())+c)+
	    		(calculateR1(genButton.getTheY().getValue())+1+r)+":"+
	    		getColumnLetters(calculateR2(genButton.getTheX().getValue(),genButton.getTheWidth().getValue())+c)+
	    		(calculateR2(genButton.getTheY().getValue(),genButton.getTheHeight().getValue())+1+r));
	    sheet.addMergedRegion( region );
	    changeFont(wb, cell, genButton.getTheSize().getValue(), genButton.getTheType().getValue());
	}
	
	public int calculateR1(int y) {
		return (y/2);
	}
	
	public int calculateR2(int y, int h) {
		return ((y+h)/2) - 1;
	}
	
	public String getColumnLetters(int index) {
		String column = "";
		while(index >= 26) {
			column = (char)((index%26)+65) + column;
			index /= 26;
			index--;
		}
		column = (char)(index+65) + column;
		return column;
	}
	
	public void changeFont(Workbook wb, Cell cell, int fontSize, String fontType) {
		Font font = wb.createFont();
		font.setFontHeightInPoints((short)(fontSize));
		font.setFontName(fontType);
		CellStyle cellStyle = cell.getCellStyle();
		if(cellStyle == null) cellStyle = wb.createCellStyle();
		cellStyle.setFont(font);
		cell.setCellStyle(cellStyle);
	}
	

	public void changeAlignment(Workbook wb, Cell cell, String alignment) {
		CellStyle cellStyle = cell.getCellStyle();
		if(cellStyle == null) 
			cellStyle = wb.createCellStyle();
		if(alignment.equals("CENTER")) 
			cellStyle.setAlignment(HorizontalAlignment.CENTER);
		else if(alignment.equals("RIGHT"))
			cellStyle.setAlignment(HorizontalAlignment.RIGHT);
		else
			cellStyle.setAlignment(HorizontalAlignment.LEFT);
		cell.setCellStyle(cellStyle);
	}

	public void addBorderToMergedRegion(Workbook wb, Sheet sheet, int r1, int r2, int c1, int c2) {
		CellStyle borderStyle = wb.createCellStyle();
	    borderStyle.setBorderBottom(BorderStyle.THIN);
	    borderStyle.setBorderTop(BorderStyle.THIN);
	    borderStyle.setBorderRight(BorderStyle.THIN);
	    borderStyle.setBorderLeft(BorderStyle.THIN);
	    Row row = sheet.getRow(r1);
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
	
	public void addBorderToButton(Workbook wb, Sheet sheet, int r1, int r2, int c1, int c2) {
		CellStyle borderStyle = wb.createCellStyle();
	    borderStyle.setBorderBottom(BorderStyle.MEDIUM);
	    borderStyle.setBorderTop(BorderStyle.THIN);
	    borderStyle.setBorderRight(BorderStyle.MEDIUM);
	    borderStyle.setBorderLeft(BorderStyle.THIN);
	    Row row = sheet.getRow(r1);
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
	
	public static void addBorderToContainer(Workbook wb, Sheet sheet, int r1, int r2, int c1, int c2) {
	    CellStyle borderRStyle = wb.createCellStyle();
	    borderRStyle.setBorderRight(BorderStyle.THIN);

	    CellStyle borderLStyle = wb.createCellStyle();
	    borderLStyle.setBorderLeft(BorderStyle.THIN);
	    
	    CellStyle borderBStyle = wb.createCellStyle();
	    borderBStyle.setBorderBottom(BorderStyle.THIN);
	    
	    Row row = sheet.getRow(r2);
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
}
