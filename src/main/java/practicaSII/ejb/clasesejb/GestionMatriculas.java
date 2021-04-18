package practicaSII.ejb.clasesejb;

import java.util.Date;
import java.util.List;

import javax.ejb.Local;

import practicaSII.Matricula;
import practicaSII.ejb.excetption.MatriculaEncontradaException;
import practicaSII.ejb.excetption.MatriculaNoEncontradaException;


@Local
public interface GestionMatriculas {

	public void anadirMatricula(Matricula mat) throws MatriculaEncontradaException;
	
	public void modificarMatricula(Matricula mat) throws MatriculaNoEncontradaException;
	
	public void borrarMatricula(Matricula mat) throws MatriculaNoEncontradaException;
	
	public List<Matricula> buscarMatriculaExp(String exp) throws MatriculaNoEncontradaException;
	
	public List<Matricula> buscarMatriculaEstado (String estado) throws MatriculaNoEncontradaException;
	
	public List<Matricula> buscarMatriculaFecha (Date fexcha) throws MatriculaNoEncontradaException;
	
	public List<Matricula> buscarMatriculaNumArchivo (String numArch) throws MatriculaNoEncontradaException;
	
	public List<Matricula> buscarMatriculaTurno (String turno) throws MatriculaNoEncontradaException;

	//añadir más tipos de busqueda si hace falta
	
}
