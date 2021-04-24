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

import practicaSII.Alumno;
import practicaSII.Matricula;

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
			Iterable<CSVRecord> lines = CSVFormat.RFC4180.parse(r);
			for(CSVRecord line:lines) {
				String dni = line.get(0);
				String nombre = line.get(1);
				String ap1 = line.get(2);
				String ap2 = line.get(3);
				Integer nExp = Integer.parseInt(line.get(4));
				Integer nArchivo = Integer.parseInt(line.get(5));
				String emailInst = line.get(6);
				String emailPers = line.get(7);
				Integer telefono = Integer.parseInt(line.get(8));
				Integer movil = Integer.parseInt(line.get(9));
				String direccion = line.get(10);
				String localidad = line.get(11);
				String provincia = line.get(12);
				Integer cp = Integer.parseInt(line.get(13));
				String fechaMat = line.get(14);
				String turnoPref = line.get(15);
				String grAsignados = line.get(16);
				String nMedia = line.get(17);
				Integer crSuperados = Integer.parseInt(line.get(18));
				Integer crFb = Integer.parseInt(line.get(19));
				Integer crOb = Integer.parseInt(line.get(20));
				Integer crOp = Integer.parseInt(line.get(21));
				Integer crCf = Integer.parseInt(line.get(22));
				Integer crPe = Integer.parseInt(line.get(23));
				Integer crTf = Integer.parseInt(line.get(24));
				
				Alumno alumno = new Alumno(dni,nombre,ap1,ap2,emailInst,emailPers,telefono,movil,direccion,localidad,provincia,cp);
				Matricula matricula = new Matricula();
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
