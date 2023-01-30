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

public class Datadrivenpro {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\elang\\eclipse-workspace\\Maven_Pro\\DATA.xlsx");
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
	else if (type.equals(type.NUMERIC)) {
	double value = cell.getNumericCellValue();
	int data = (int) value;
	System.out.println(data);	
	} 
	}		
	}
	System.out.println(" ");
	Row row = sheetAt.getRow(2);
	Cell cell = row.getCell(3);
	System.out.println("Raja English Mark and Grade:"+cell);
}
}
