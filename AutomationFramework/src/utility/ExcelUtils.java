package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import automationFramework.LocalTC;
public class ExcelUtils {
	private  XSSFSheet ExcelWSheet;
	private  XSSFWorkbook ExcelWBook;
	private  XSSFCell Cell;
	private  XSSFRow Row;
	
	//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method
	public  void setExcelFile(String Path,String SheetName) throws Exception {
		try {
			
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(Path);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e){
			System.out.println("error message"+e.getMessage());
			throw (e);
		}
	}

	
	//This method returns number of rows in the sheet
		public  int getRowCount()
	{
				try{
					int rowCount=ExcelWSheet.getLastRowNum()+1;
					System.out.println(" no of rows from excel utility..."+rowCount);
					return rowCount;
		}catch (Exception e){
			
			System.out.println("error massage.."+e.getMessage());
		throw(e);
		}	
	}
	
		//This method returns number of rows in the sheet
		public  int getColCount()
	{
				try{
					int ColCount=ExcelWSheet.getRow(1).getLastCellNum();
					System.out.println(" no of cols from excel utility..."+ColCount);
					return ColCount;
		}catch (Exception e){
			System.out.println("error massage.."+e.getMessage());
		throw(e);
		}	
	}
		
	// This function is return the getnumaric cell value.it is use for take the test case ID.
	public  int getNumaricCellData(int RowNum, int ColNum) throws Exception{
		int  CellData = 0;
		try{
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
		switch (Cell.getCellType()) {
			case XSSFCell.CELL_TYPE_STRING:
				CellData = -1;
			break;
			case XSSFCell.CELL_TYPE_BOOLEAN:
				CellData = -1;
			break;
			case XSSFCell.CELL_TYPE_NUMERIC:
				CellData = (int)Cell.getNumericCellValue();
			break;
			case XSSFCell.CELL_TYPE_BLANK:
				CellData = 0;
			break; 
			case XSSFCell.CELL_TYPE_FORMULA:
				CellData = -1;
			break; 
		}
			return CellData;
		}catch (Exception e){
			System.out.println("error massage.."+e.getMessage());
			return -1;
		}
	}

	//.......................................................................................
	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
	public  String getCellData(int RowNum, int ColNum) throws Exception{
		String CellData = "";
		try {
			
				Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
				if(null == Cell){
					return null;
				}
				switch (Cell.getCellType()) {
				case XSSFCell.CELL_TYPE_STRING:
					CellData = Cell.getStringCellValue();
					break;
				case XSSFCell.CELL_TYPE_BOOLEAN:
					CellData = "";
					break;
				case XSSFCell.CELL_TYPE_NUMERIC:
					CellData = BigDecimal.valueOf(Cell.getNumericCellValue()).toPlainString();
					break;
				case XSSFCell.CELL_TYPE_BLANK:
					CellData = "";
					break;
				case XSSFCell.CELL_TYPE_FORMULA:
					CellData = Cell.getCellFormula();
					break;
				}
				
			/* else {
				return null;
			}*/
			return CellData;
		}catch (Exception e){
			System.out.println("error massage.."+e.getMessage());
			return"";
		}
	}

	//This method is to write in the Excel cell, Row num and Col num are the parameters
	public  void setCellData(LocalTC vars,  int RowNum, int ColNum) throws Exception	{
		try{
			Row  = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);
			if (Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(vars.ResultStatus);
			} else {
				Cell.setCellValue(vars.ResultStatus);
			}
			// Constant variables Test Data path and Test Data file name
			FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}catch(Exception e){
			throw (e);
		}
	}
}