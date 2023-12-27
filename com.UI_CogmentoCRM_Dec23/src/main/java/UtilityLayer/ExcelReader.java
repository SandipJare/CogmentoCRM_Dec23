package UtilityLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static XSSFWorkbook workbook;
	public static FileInputStream fis;

	public ExcelReader(String path) {
		File f = new File(path);
		try {
			fis = new FileInputStream(f);
			workbook = new XSSFWorkbook();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int getRowCount(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum() + 1;
	}

	public static int getCellCount(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

	public static Object getSpecificSheetData(int sheetIndex, int row, int cell) {
		XSSFCell cells = workbook.getSheetAt(sheetIndex).getRow(row).getCell(cell);

		if (cells == null) {
			return "";
		} else {
			if (cells.getCellType() == XSSFCell.CELL_TYPE_STRING) {
				return cells.getStringCellValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
				return cells.getRawValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
				return cells.getBooleanCellValue();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {
				return cells.getCellFormula();
			} else if (cells.getCellType() == XSSFCell.CELL_TYPE_ERROR) {
				return cells.getErrorCellString();
			}
		}
		return null;
	}

	public static Object[][] getAllSheetData(int sheetIndex) {
		int row = getRowCount(sheetIndex);
		int cell = getCellCount(sheetIndex);
		Object[][] obj = new Object[row][cell];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				obj[i][j] = getSpecificSheetData(sheetIndex, i, j);
			}
		}

		return obj;

	}

	
}
