package practicaSII.ejb.clasesejb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import practicaSII.Asignatura;
import practicaSII.ejb.excetption.AsignaturaEncontradaException;


public class ImportarAsignaturaEJB {
	private String fichero;
	AsignaturaEJB ejb;
	
	public ImportarAsignaturaEJB (String fichero){
		this.fichero = fichero;
		ejb = new AsignaturaEJB();
	}
	
	public void insertarDatos() {
		try {
			FileInputStream excel = new FileInputStream(new File(fichero));
			Workbook wk = new XSSFWorkbook(excel);
			Sheet sheet5 = wk.getSheetAt(5);
			Iterator<Row> it = sheet5.iterator();
			it.next();
			while(it.hasNext()) {
				Row current = it.next();
				Integer referencia = new Integer ((int)current.getCell(0).getNumericCellValue());
				Integer cod = new Integer ((int)current.getCell(2).getNumericCellValue());
				Integer totalcred = new Integer ((int)current.getCell(8).getNumericCellValue());
				Integer credPr = new Integer ((int)current.getCell(7).getNumericCellValue());
				Integer credTeo = new Integer ((int)current.getCell(6).getNumericCellValue());
				String ofer = current.getCell(1).getStringCellValue();
				String nombre = current.getCell(4).getStringCellValue();
				Integer curso = new Integer ((int)current.getCell(5).getNumericCellValue());
				String duracion = current.getCell(9).getStringCellValue();
				String plazas = current.getCell(10).getStringCellValue();
				//String ingles = current.getCell(11).getStringCellValue();
				
				Asignatura asignatura = new Asignatura(referencia, cod, totalcred, credPr,credTeo,ofer,nombre,curso,duracion,plazas);
				
			}
			
			Sheet sheet2 = wk.getSheetAt(2);
			it = sheet2.iterator();
			it.next();
			
		}catch (FileNotFoundException e) {
			
		}catch (IOException e) {
			
		}//catch (AsignaturaEncontradaException e) {
		
		//}
	}
}
