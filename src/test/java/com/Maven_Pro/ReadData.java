package com.Maven_Pro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	private static void readParticularData() throws IOException {
//File f =new File(".\\Excel\\DATA.xlsx");
//FileInputStream fis  = new FileInputStream(f);
//Workbook wb = new XSSFWorkbook(fis);
//	Sheet sheetAt = wb.getSheetAt(0);
//	Row row = sheetAt.getRow(1);
//	Cell cell = row.getCell(2);
//	CellType cellType = cell.getCellType();
//	if (cellType.equals(cellType.STRING)) {
//		String stringCellValue = cell.getStringCellValue();
//		System.out.println(stringCellValue);
//	}
//	else if (cellType.equals(cellType.NUMERIC)) {
//	double numericCellValue = cell.getNumericCellValue();
//	int data = (int) numericCellValue;
//	System.out.println(data);
//	}
//	wb.close();
// get all Data
		File f =new File(".\\Excel\\DATA.xlsx");
		FileInputStream fls = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fls);
		Sheet sheetAt = w.getSheetAt(0);
		int rows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
		Row row = sheetAt.getRow(i);
		int cells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cells; j++) {
		Cell cell = row.getCell(j);
		CellType type = cell.getCellType();
		if (type.equals(CellType.STRING)) {
		String value = cell.getStringCellValue();
		System.out.println(value);		
		}	
		else if (type.equals(CellType.NUMERIC)) {
		double value = cell.getNumericCellValue();
		int data = (int) value;
		System.out.println(data);	
		}
		w.close();
		}
		}
	}
	public static void main(String[] args) throws IOException {
		readParticularData();
	}
}
