package com.Maven_Pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenCreat {

	public static void write_data() throws IOException {

		File f = new File(".\\Excel\\DATA.xlsx");
		FileInputStream fl = new FileInputStream(f);
		Workbook wa = new XSSFWorkbook(fl);
		Sheet createSheet = wa.createSheet("Data1");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Yuvaraj");
		wa.getSheet("Data1").getRow(0).createCell(1).setCellValue(123);
		wa.getSheet("Data1").getRow(0).createCell(2).setCellValue("Code");
		wa.getSheet("Data1").createRow(1).createCell(0).setCellValue("Raja");
		wa.getSheet("Data1").getRow(1).createCell(1).setCellValue(456);
		wa.getSheet("Data1").getRow(1).createCell(2).setCellValue("Code");
		wa.getSheet("Data1").createRow(2).createCell(0).setCellValue("Risi");
		wa.getSheet("Data1").getRow(2).createCell(1).setCellValue(789);
		wa.getSheet("Data1").getRow(2).createCell(2).setCellValue("Code");
		FileOutputStream fos = new FileOutputStream(f);
		
		wa.write(fos);
		wa.close();
	}
	public static void main(String[] args) throws IOException {
		write_data();
		
	}

}
  