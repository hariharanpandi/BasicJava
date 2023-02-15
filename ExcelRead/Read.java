package com.ExcelProject.ExcelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	public static void main(String[] args) {
		Read rc = new Read();
		
		String vOutput = rc.ReadCellData(2, 1);
		System.out.println(vOutput);
	}

	
	public String ReadCellData(int vRow, int vColumn) {
		String value = null; 
		Workbook wb = null; 
		try {
			FileInputStream fis = new FileInputStream("E:\\Teamwork\\EmployeeSalary.xlsx");
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(vRow);
		Cell cell = row.getCell(vColumn);
		value = cell.getStringCellValue();
		return value;
	}
}
//System.out.println(row.getRowNum());
//for (Cell cell : row) {
//	
//	System.out.print(cell.toString() + "\t");
//	}