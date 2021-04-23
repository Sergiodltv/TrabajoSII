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

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ImportarAlumnosEJB {
	private String fichero;
	AlumnosEJB ejb;
	
	public ImportarAlumnosEJB(String fichero) {
		this.fichero = fichero;
		ejb = new AlumnosEJB();
	}
	
	public void insertarDatos() throws CsvValidationException {
		try {
			Reader r = new FileReader(fichero);
			/*Iterable<CSVRecord> records = CSVFormat.RFC4180.parse(r);
			for(CSVRecord record:records) {
				String dni = record.get(0);
				String nombre = record.get(1);
				String ap1 = record.get(2);
				String ap2 = record.get(3);
			}*/
			
			
			CSVReader csvReader = new CSVReader (r);
			String[] fila = null;
			while((fila = csvReader.readNext()) != null) {
				String dni = fila[0];
				String nombre = fila[1];
				String ap1 = fila[2];
				String ap2 = fila[3];
				String eminst = fila[7];
				String empers = fila[8];
				String telefono = fila[9];
				String movil = fila[10];
				String direccion = fila[11];
				
				System.out.println(dni+" | "+nombre+" | "+ap1+" | "+ap2+" | "+eminst+" | "+empers+" | "+telefono+" | "+movil+" | "+direccion);
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
