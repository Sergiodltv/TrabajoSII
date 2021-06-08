package es.uma.informatica.sii.proyectosii.jsf;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import practicaSII.Usuario;
import practicaSII.ejb.clasesejb.GestionUsuario;
import practicaSII.ejb.excetption.UsuarioIncorrectoException;


@Named
@SessionScoped
public class UsuarioBeans implements Serializable{
	
	//@Inject
	//private AlumnosEJB alumnoEJB;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject 
	private GestionUsuario usuarioEJB;
	
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String acceder(){
		String vista = "index.xhtml";
		/*
		try{
			if (usuarioEJB.accederUsuario(usuario)) {
				vista = "vistaAlumno.xhtml";
			}
			
		}catch (UsuarioIncorrectoException e) {
			 FacesMessage fm = new FacesMessage("Nombre de usuario o contraseña incorrectos");
			 FacesContext.getCurrentInstance().addMessage("login:user", fm);
		}
		*/
		return vista;
	}
	
}

