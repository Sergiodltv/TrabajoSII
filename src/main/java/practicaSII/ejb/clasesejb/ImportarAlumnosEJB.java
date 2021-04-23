package practicaSII.ejb.clasesejb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class ImportarAlumnosEJB {
	private String fichero;
	AlumnosEJB ejb;
	
	public ImportarAlumnosEJB(String fichero) {
		this.fichero = fichero;
		ejb = new AlumnosEJB();
	}
	
	public void insertarDatos() {
		try {
			Reader r = new FileReader(fichero);
			Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(r);
			for(CSVRecord record:records) {
				String dni = record.get(0);
				String nombre = record.get(1);
				String ap1 = record.get(2);
				String ap2 = record.get(3);
			}
		}catch(FileNotFoundException e) {
			
		}catch (IOException e) {
			
		//}catch (TitulacionEncontradaException e) {
		
		
			
		}
	}
	
	public static void main (String[] args) {
		ImportarAlumnosEJB t = new ImportarAlumnosEJB("/home/alumno/Descargas/Titulacion.xlsx");
		t.insertarDatos();
	}
	
}
