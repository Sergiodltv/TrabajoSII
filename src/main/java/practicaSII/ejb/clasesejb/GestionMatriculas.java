package practicaSII.ejb.clasesejb;

import practicaSII.Matricula;
import practicaSII.ejb.excetption.MatriculaNoEncontradaException;

public interface GestionMatriculas {

	public void anadirMatricula(Matricula mat) throws MatriculaNoEncontradaException;
	
	public void modificarMatricula(Matricula mat) throws MatriculaNoEncontradaException;
	
	public void borrarMatricula(Matricula mat) throws MatriculaNoEncontradaException;
}
