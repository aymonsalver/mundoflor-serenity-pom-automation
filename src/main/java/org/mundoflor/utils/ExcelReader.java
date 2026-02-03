package org.mundoflor.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mundoflor.models.UserData;

import java.io.FileInputStream;

public class ExcelReader {

    public static UserData readData(String route){
        UserData userData = null;

        // Código para leer desde el archivo Excel y poblar el objeto userData
        try(FileInputStream fis = new FileInputStream(route); Workbook workbook = new XSSFWorkbook(fis)){
            Sheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(1); // Asumiendo que los datos están en la segunda fila
            String firstName = row.getCell(0).getStringCellValue();
            String lastName = row.getCell(1).getStringCellValue();
            String address = row.getCell(2).getStringCellValue();
            String phone = String.valueOf(row.getCell(3).getNumericCellValue());
            String email = row.getCell(4).getStringCellValue();
            String remitente = row.getCell(5).getStringCellValue();
            userData = new UserData(firstName, lastName, address, phone, email, remitente);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userData;
    }
}
