package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {

	public String path;                        //path of the excel file
	public FileInputStream fis = null;        //reads the file
	public FileOutputStream fileout = null;  // writes the file
	private XSSFWorkbook workbook = null;   // access the xl document
	private XSSFSheet sheet =null;         // access the sheet the xl document
	private XSSFRow row =null;            // access the row in the xl document
	private XSSFCell cell = null;        // access the cell in the xl document



		public Xls_Reader(String path) {
			this.path=path;
			try {
				fis = new FileInputStream(path);
				workbook = new XSSFWorkbook(fis);
				sheet = workbook.getSheetAt(0);
				fis.close();
				
			}catch (Exception e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		    }
		     public String getCellData(String sheetName,String colName,int rowNum){
		    	 try {
		    		 if(rowNum <=0)
		    			 return"";
		    	 int index = workbook.getSheetIndex(sheetName);
		    	 int col_Num =-1;
		    	 if(index==-1)
		    		 return"";
		    	 
		    	 sheet = workbook.getSheetAt(index);
		    	 row = sheet.getRow(0);
		    	 
		    	 for(int i=0;i<row.getLastCellNum();i++) {
		    		 
		    		 if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
		    			 col_Num = i;
		    	 }
		    	 if(col_Num==-1)
		    		 return"";
		    	 
		    	 sheet = workbook.getSheetAt(index);
		    	 row = sheet.getRow(rowNum-1);
		    	 
		    	 if(row==null)
		    		 return"";
		    	 
		    	 cell = row.getCell(col_Num);
		    	 if(cell==null)
		    		 return"";
		    	 return cell.getStringCellValue();
		    	 }
		    	 catch(Exception e) {
		    		 e.printStackTrace();
		    		 return "row "+rowNum+" or column "+colName +"does not exist in xls";
		    		 
		    	 }
		     }

		}	
			





	
	
	
	
	

