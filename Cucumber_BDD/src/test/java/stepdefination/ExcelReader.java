package stepdefination;

 
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {

	 public static List<List<String>> getSheetData(String filePath, String sheetName) {
	        List<List<String>> sheetData = new ArrayList<>();
	        try (FileInputStream fis = new FileInputStream(filePath);
	             Workbook workbook = WorkbookFactory.create(fis)) {

	            Sheet sheet = workbook.getSheet(sheetName);

	            for (Row row : sheet) {
	                List<String> rowData = new ArrayList<>();
	                for (Cell cell : row) {
	                    rowData.add(cell.toString());
	                }
	                sheetData.add(rowData);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return sheetData;
	    }
	}