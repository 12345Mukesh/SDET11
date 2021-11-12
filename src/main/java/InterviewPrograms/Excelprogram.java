package InterviewPrograms;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelprogram
    {
	public static void main(String[] args) throws Throwable 
	{
		
	
		FileInputStream fis= new FileInputStream("../SDET_11/src/test/resources/data/Input Data.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		int lastrownumber=wb.getSheet("Sheet2").getLastRowNum();
		
		for(int i=1;i<=lastrownumber;i++)
		{
			int salary=(int) wb.getSheet("Sheet2").getRow(i).getCell(2).getNumericCellValue();
			if(salary>50000 && salary<100000)
			{
				System.out.println(wb.getSheet("Sheet2").getRow(i).getCell(1)+" "+salary);
			
			
		    }
		
		
	    }
	}
 }

