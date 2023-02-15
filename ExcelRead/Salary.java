package com.ExcelProject.ExcelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Salary {
	public static void main(String[] args) throws IOException {
		String url="E:\\Teamwork\\EmployeeSalary.xlsx";
		File file = new File(url);

		FileInputStream inputStream = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(inputStream);

		Sheet sheet = workbook.getSheetAt(0);
		double totalsalary = 0.0;
		int count = 0;
		for (Row row : sheet) {
			if (row.getRowNum() == 0) {
				continue;
			}
			String sumsalary = row.getCell(3).toString();
			totalsalary = totalsalary + Double.parseDouble(sumsalary);
			count++;
		}
		workbook.close();
		inputStream.close();
		System.out.println("Average Salary = "+totalsalary / count);
		System.out.println("Total Salary = " + totalsalary);
	}

}
