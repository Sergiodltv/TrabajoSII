package practicaSII.ejb.clasesejb;

import javax.ejb.Local;

import practicaSII.Expediente;
import practicaSII.ejb.excetption.ExpedienteNoEncontradoException;

@Local
public interface GestionExpediente {
	
	public void modificarExpediente(Expediente exp) throws ExpedienteNoEncontradoException;
	
	public void modifNotaMediaProv(String exp, Float notaprov) throws ExpedienteNoEncontradoException;
	
	//public void modificarNotaAsig();
	
	public void eliminarExpediente(Expediente exp) throws ExpedienteNoEncontradoException;
}
