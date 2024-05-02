package getlandestate.utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    public List<Object> getRowData(int rowNum) {
        List<Object> rowData = new ArrayList<>();
        Row row = sheet.getRow(rowNum);
        if (row != null) {
            for (int i = 0; i < row.getLastCellNum(); i++) {
                Cell cell = row.getCell(i);
                if (cell != null) {
                    rowData.add(getCellData(rowNum, i));
                } else {
                    rowData.add(null); // Hücre null ise null değeri ekle
                }
            }
        }
        return rowData;
    }
}
