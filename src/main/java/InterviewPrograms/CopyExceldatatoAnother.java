//package InterviewPrograms;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.Iterator;
//
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//class CopyExceldatatoAnother {
//
//	public static void main(String[] args) 
//	{
//		//Provide the Path of excel file which we want to copy
//				File inputFile=new File("../SDET_11/src/test/resources/data/Input Data.xlsx");
//				FileInputStream fis=new FileInputStream(inputFile);
//				Workbook inputWorkbook=WorkbookFactory.create(fis);
//				int inputSheetCount=inputWorkbook.getNumberOfSheets();
//				System.out.println("Input sheetCount: "+inputSheetCount);
//				
//				// Provide the path of excel file in which we wanted to copy the data
//				File outputFile=new File("../SDET_11/src/test/resources/data/Input Data.xlsx");
//				FileOutputStream fos=new FileOutputStream(outputFile);
//				
//				// Creating workbook for output
//					XSSFWorkbook outputWorkbook=new XSSFWorkbook();
//				
//				
//				
//				for(int i=0;i<inputSheetCount;i++) 
//                { 
//                  XSSFSheet inputSheet= inputWorkbook.getSheetAt(i); 
//                  String inputSheetName=inputWorkbook.getSheetName(i); 
//                  XSSFSheet outputSheet=outputWorkbook.createSheet(inputSheetName); 
//
//                 // Create and call method to copy the sheet and content in new workbook. 
//                 copySheet(inputSheet,outputSheet); 
//                }
//
//               // Write all the sheets in the new Workbook(testData_Copy.xlsx) using FileOutStream Object
//               outputWorkbook.write(fos); 
//              // At the end of the Program close the FileOutputStream object. 
//               fos.close(); 
//	}
//				
//	 public static void copySheet(XSSFSheet inputSheet,XSSFSheet outputSheet) 
//     { 
//        int rowCount=inputSheet.getLastRowNum(); 
//        System.out.println(rowCount+" rows in inputsheet "+inputSheet.getSheetName()); 
//         
//          int currentRowIndex=0; if(rowCount>0)
//	{
//		Iterator rowIterator=inputSheet.iterator();
//		while(rowIterator.hasNext())
//		{
//			int currentCellIndex=0;
//			Iterator cellIterator=((Row) rowIterator.next()).cellIterator();
//			while(cellIterator.hasNext())
//			{
//			//  Creating new Row, Cell and Input value in the newly created sheet. 
//				String cellData=cellIterator.next().toString();
//				if(currentCellIndex==0)
//					outputSheet.createRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
//				else
//					outputSheet.getRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
//				
//				currentCellIndex++;
//			}
//			currentRowIndex++;
//		}
//		System.out.println((currentRowIndex-1)+" rows added to outputsheet "+outputSheet.getSheetName());
//		System.out.println();
//	}
//}
//
//
//
//
//		
//				
//
//	}
//
//
