package com.ExcelProject.ExcelRead;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Calculation {
	

	    public static void main(String[] args) throws IOException {
	        
	        // Create a new Excel workbook
	        Workbook workbook = new XSSFWorkbook();

	        // Create a new worksheet
	        Sheet sheet = workbook.createSheet("Salary Calculation");

	        // Create a row for the employee's information
	        Row employeeRow = sheet.createRow(0);
	        employeeRow.createCell(0).setCellValue("Employee Name");
	        employeeRow.createCell(1).setCellValue("John Doe");
	        employeeRow.createCell(2).setCellValue("Department");
	        employeeRow.createCell(3).setCellValue("Sales");

	        // Create a row for the monthly salary calculation
	        Row salaryRow = sheet.createRow(1);
	        salaryRow.createCell(0).setCellValue("Monthly Salary");
	        salaryRow.createCell(1).setCellValue(5000);

	        // Create a formula cell to calculate the annual salary
	        Cell annualSalaryCell = salaryRow.createCell(2);
	        annualSalaryCell.setCellFormula("B2*12");

	        // Create a formula cell to calculate the tax amount
	        Cell taxCell = salaryRow.createCell(3);
	        taxCell.setCellFormula("B3*0.25");

	        // Create a formula cell to calculate the net salary
	        Cell netSalaryCell = salaryRow.createCell(4);
	        netSalaryCell.setCellFormula("B3-B4");

	        // Save the Excel workbook
	        FileOutputStream fileOut = new FileOutputStream("E:\\Teamwork\\EmployeeSalary.xlsx");
	        workbook.write(fileOut);
	        fileOut.close();

	        // Close the workbook
	        workbook.close();

	        System.out.println("Salary calculation completed successfully.");
	    }
	}

