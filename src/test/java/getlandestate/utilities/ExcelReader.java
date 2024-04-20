package getlandestate.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    Workbook workbook;
    Sheet sheet;
    //Bu classtan object olusturmamizin amaci excel dosyasini okumaktir
    public ExcelReader(String dosyayolu, String sayfaIsmi){
        try {
            FileInputStream fis = new FileInputStream(dosyayolu);
            workbook= WorkbookFactory.create(fis);
            sheet=workbook.getSheet(sayfaIsmi);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Satir ve sutun indexlerini girerek ilgili cell datasini string olarak return eder
    public String getCellData(int satir, int sutun){
        Cell cell = sheet.getRow(satir).getCell(sutun);
        return cell.toString();
    }
    public int rowCount(){
        return sheet.getLastRowNum();
    }
}
