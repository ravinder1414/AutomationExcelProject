package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
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
		FileInputStream ExcelFile = null;
		try {
			
			// Open the Excel file
			ExcelFile = new FileInputStream(Path);
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName.trim().replace("\\n", "").trim());
		} catch (Exception e){
			Log.info("error message"+e.getMessage());
			throw (e);
		}finally {
			if(null != ExcelFile){
				ExcelFile.close();
			}
		}
	}

	
	//This method returns number of rows in the sheet
		public  int getRowCount()
	{
				try{
					int rowCount=ExcelWSheet.getLastRowNum()+1;
					Log.info(" no of rows from excel utility..."+rowCount);
					return rowCount;
		}catch (Exception e){
			Log.info("error message.."+e.getMessage());
    		throw(e);
		}	
	}
	
		//This method returns number of rows in the sheet
		public  int getColCount()
	{
				try{
					int ColCount=ExcelWSheet.getRow(1).getLastCellNum();
					Log.info(" no of cols from excel utility..."+ColCount);
					return ColCount;
		}catch (Exception e){
			Log.info("error message.."+e.getMessage());
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
			Log.info("error message.."+e.getMessage());
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
				Cell.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
				switch (Cell.getCellType()) {
				
				case XSSFCell.CELL_TYPE_STRING:
					CellData = Cell.getStringCellValue();
					break;
				case XSSFCell.CELL_TYPE_BOOLEAN:
					CellData = "";
					break;
				case XSSFCell.CELL_TYPE_NUMERIC:
					 if (HSSFDateUtil.isCellDateFormatted(Cell))
						 CellData = Cell.getDateCellValue()+"";
					 else
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
			Log.info("error message.."+e.getMessage());
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

	public static void updateExcellSheet(LocalTC Vars) throws Exception {
		
		try {
			FileInputStream file = new FileInputStream(Vars.sTestRunPath);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Test Runs");
			XSSFCell cell = null;
			// Update the value of cell
			cell = sheet.getRow(Vars.row+2).getCell(9);
			cell.setCellValue(Vars.ExecutionStatus);
			cell = sheet.getRow(Vars.testcasestart).getCell(9);
			cell.setCellValue(Vars.TestCaseStatus);
			cell = sheet.getRow(Vars.row+2).getCell(10);
			cell.setCellValue(Vars.getActualResult());
			Vars.getResultsStatus().add(Vars.ResultStatus);
			file.close();
			FileOutputStream outFile = new FileOutputStream(new File(Vars.sTestRunPath));
			workbook.write(outFile);
			outFile.close();
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * @return boolean
	 */
	// reading pdf/excel file from the local machine
	public static boolean readDataFromFile(String filePath, int row, int col, String ObjectEventCh, String ObjectValCh) throws Exception {
		FileInputStream ExcelFile = null;
		boolean bflag = false;
		String extension = null;
		if (null == filePath || filePath.isEmpty()) {
			filePath = lastFileModified(Constant.tempTestReportPath);
		}
		//filePath = "C:\\temp\\" + latestFileName;
		int i = filePath.lastIndexOf('.');
		if (i > 0) {
		    extension = filePath.substring(i+1);
		}
		if (extension.equalsIgnoreCase("pdf")) {
			PDFParser parser = null;
			COSDocument cosDoc = null;
			PDFTextStripper pdfStripper = null;
			PDDocument pdDoc = null;
			try {
				parser = new PDFParser((RandomAccessRead) new FileInputStream(filePath));
				parser.parse();
				cosDoc = parser.getDocument();
				pdfStripper = new PDFTextStripper();
				pdDoc = new PDDocument(cosDoc);
				String parsedText = pdfStripper.getText(pdDoc);
				bflag = Arrays.asList(parsedText.split(" ")).contains(ObjectValCh);

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				cosDoc.close();
				pdDoc.close();
			}
		} else if(extension.equalsIgnoreCase("csv")){
				String line = "";
		        String cvsSplitBy = ",";
				try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
					int count = 0;
		            while ((line = br.readLine()) != null) {
		            	count++;
		                // use comma as separator
		                String[] csvValue = line.split(cvsSplitBy); //split by separator to each line
		                if((row > 0 && !(csvValue.length < row)) || (col > 0 && !(csvValue.length < col))){
		                if(count == row){
		                	for(String strData : csvValue){
		                		if(strData.replaceAll("\"", "").equals(ObjectValCh)){
		                			bflag = true;
			                		break;
		                		}
		                	}
		                }else if(col >0){
		                	if(csvValue[col-1].replaceAll("\"", "").equals(ObjectValCh)){
		                		bflag = true;
		                		break;
		                	}
		                }
		                }
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			}else{
			try {
				XSSFSheet ExcelSheet;
				XSSFWorkbook ExcelBook;
				XSSFRow rw;
				// Open the Excel file
				ExcelFile = new FileInputStream(filePath);
				// Access the required test data sheet
				ExcelBook = new XSSFWorkbook(ExcelFile);
				ExcelSheet = ExcelBook.getSheetAt(0);
				int rows = ExcelSheet.getLastRowNum() + 1;
				int cols = ExcelSheet.getRow(1).getLastCellNum();
				if (row > 0 && row <= rows) {
					rw = ExcelSheet.getRow(row);
					Iterator<Cell> itr = rw.cellIterator();
					while (itr.hasNext()) {
						XSSFCell cellValue = (XSSFCell) itr.next();
						bflag = getCellData(ObjectEventCh, ObjectValCh, cellValue);
						if (bflag)
							break;
						System.out.println(itr.next());
					}
				}
				if (col > 0 && col <= col) {
					Iterator<Row> itrRow = ExcelSheet.iterator();
					while (itrRow.hasNext()) {
						rw = (XSSFRow) itrRow.next();
						Iterator<Cell> cells = rw.cellIterator();
						while (cells.hasNext()) {
							XSSFCell cellValue = (XSSFCell) cells.next();
							if (cellValue.getColumnIndex() == col) {
								bflag = getCellData(ObjectEventCh, ObjectValCh, cellValue);
								break;
							}

						}
					}
				}
			} catch (Exception e) {
				Log.info("error message" + e.getMessage());
				throw (e);
			} finally {
				if (null != ExcelFile) {
					ExcelFile.close();
				}
			}
			}
		
		return bflag;

	}

	//returning the cell data from the sheet
	public static boolean getCellData(String ObjectEventCh, String ObjectValCh, XSSFCell cellValue) {
		boolean bflag = false;
		if (!ObjectEventCh.isEmpty() && !ObjectValCh.isEmpty()) {
			if (Integer.parseInt(ObjectEventCh) <= Integer.parseInt(cellValue.getStringCellValue())) {
				if (Integer.parseInt(cellValue.getStringCellValue()) <= Integer.parseInt(ObjectValCh)) {
					bflag = true;
				}
			}
		} else if (!ObjectEventCh.isEmpty() && ObjectEventCh.equals(cellValue.getStringCellValue())
				&& ObjectValCh.isEmpty()) {
			bflag = true;
		} else if (ObjectEventCh.isEmpty() && !ObjectValCh.isEmpty()
				&& ObjectValCh.equals(cellValue.getStringCellValue())) {
			bflag = true;
		}
		return bflag;
	}
	
	/*
	 * @return String
	 * last downloaded file in the given path
	 */
	public static String lastFileModified(String dir) {
	    File fl = new File(dir);
	    File[] files = fl.listFiles();
	    if (files == null || files.length == 0) {
	        return null;
	    }
	    File lastModifiedFile = files[0];
	    for (File file : files) {
	    	String extension = "";
	    	int i = file.toString().lastIndexOf('.');
			if (i > 0) {
			    extension = file.toString().substring(i+1);
			}
	        if (lastModifiedFile.lastModified() < file.lastModified()) {
	        	if(!extension.isEmpty() && (extension.equalsIgnoreCase("csv") || extension.equalsIgnoreCase("pdf") || extension.equalsIgnoreCase("xlsx"))){
	        		lastModifiedFile = file;
	        	}
	        }
	    }
	    Constant.Vars.map.put("file_extention", lastModifiedFile.toString());
	    return lastModifiedFile.toString();
	}
}
	