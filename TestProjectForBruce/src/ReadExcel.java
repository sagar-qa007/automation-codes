import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

public static void main(String[] args) throws Exception {
    File src=new File("C:\\Users\\Sagar\\Desktop\\TestInputData.xlsx");

    FileInputStream fis=new FileInputStream(src);

    XSSFWorkbook wb=new XSSFWorkbook(fis);

    XSSFSheet sheet1=wb.getSheetAt(0);
    int rowcount=sheet1.getLastRowNum();
    System.out.println("Total Row " + rowcount);

    for(int i=0;i<rowcount+1;i++) {

    	
    	Cell cell1 = sheet1.getRow(i).getCell(0);	
    	
    	switch (cell1.getCellType()) {
    	
        case Cell.CELL_TYPE_STRING:
            System.out.println(cell1.getRichStringCellValue().getString());
            break;
            
        case Cell.CELL_TYPE_NUMERIC:
            if (DateUtil.isCellDateFormatted(cell1)) {
                System.out.println(cell1.getDateCellValue());
            } else {
                System.out.println(cell1.getNumericCellValue());
            }
            break;
            
        case Cell.CELL_TYPE_BOOLEAN:
            System.out.println(cell1.getBooleanCellValue());
            break;
            
        case Cell.CELL_TYPE_FORMULA:
            System.out.println(cell1.getCellFormula());
            break;
            
        default:
            System.out.println();
    }
    	
    	//String data0= cell1.getStringCellValue();
    	//System.out.println("Test Data From Excel : "+data0);
    }

    wb.close();


}

}