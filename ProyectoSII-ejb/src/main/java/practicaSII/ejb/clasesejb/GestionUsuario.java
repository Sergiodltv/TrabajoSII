package practicaSII.ejb.clasesejb;

import practicaSII.Usuario;
import practicaSII.ejb.excetption.UsuarioEncontradoException;
import practicaSII.ejb.excetption.UsuarioIncorrectoException;

public interface GestionUsuario {
	public Usuario getUsuario(String documento) throws UsuarioIncorrectoException;
	
	public void crearUsuario(Usuario usuario) throws UsuarioEncontradoException;

	public boolean accederUsuario(Usuario usuario) throws UsuarioIncorrectoException;
}
