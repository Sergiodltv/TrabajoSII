package practicaSII.ejb.clasesejb;

import javax.ejb.Local;

import practicaSII.Alumno;
import practicaSII.Expediente;

import practicaSII.ejb.excetption.AlumnoNoEncontradoException;
import practicaSII.ejb.excetption.ExpedienteNoEncontradoException;
public interface GestionAlumnos {

	public void anadirAlumnoMatr(Alumno alm) throws AlumnoNoEncontradoException;
	
	public void anadirAlumnoNuevo(Alumno alm, Expediente exp) throws AlumnoNoEncontradoException, ExpedienteNoEncontradoException;
	
	public void modificarAlumno(Alumno alm) throws AlumnoNoEncontradoException;
	
	public void eliminarAlumno(Alumno alm) throws AlumnoNoEncontradoException;
}


