package practicaSII;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Titulacion
 *
 */
@Entity
//@Table(name="e_r")

public class Titulacion implements Serializable {

	   
	@Id @GeneratedValue
	private Integer Codigo;
	private String Nombre;
	private Integer Creditos;
	private static final long serialVersionUID = 1L;
	
	@OneToMany (mappedBy = "as_titul")
	private List<Asignatura> referencias;
	
	@OneToMany (mappedBy = "g_titul")
	private List<Grupo> idGrupos;
	
	
	@ManyToMany (mappedBy = "c_titul")
	private List<Centro> idCentros;


	public Titulacion() {
		super();
	}   
	public Integer getCodigo() {
		return this.Codigo;
	}

	public void setCodigo(Integer Codigo) {
		this.Codigo = Codigo;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public Integer getCreditos() {
		return this.Creditos;
	}

	public void setCreditos(Integer Creditos) {
		this.Creditos = Creditos;
	}
   
}
