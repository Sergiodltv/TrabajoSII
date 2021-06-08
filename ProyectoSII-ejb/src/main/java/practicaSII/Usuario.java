package practicaSII;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
	
	@Id
	private String identificador;
	@Column (name = "documento", nullable=false, unique = true)
	private String documento;
	@Column (name="contrasenya", nullable=false)
	private String contrasenya;
	
	public Usuario() {
		super();
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contraseña) {
		this.contrasenya = contraseña;
	}

	@Override
	public boolean equals(Object obj) {
		boolean esUsuario = obj instanceof Usuario;
		Usuario u = (Usuario)obj;
		return esUsuario && u.identificador.equals(this.identificador) && u.contrasenya.equals(this.contrasenya);
	}











}
