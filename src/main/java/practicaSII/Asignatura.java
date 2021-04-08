package practicaSII;

import java.io.Serializable; 
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Asignatura
 *
 */
@Entity

public class Asignatura implements Serializable {

	@Id @GeneratedValue
	private Integer Referencia;
	@Column(name = "codigo", nullable = false)
	private Integer Codigo;
	@Column (name = "creditos", nullable = false)
	private Integer Creditos;
	@Column (name = "ofertada", nullable = false)
	private Boolean Ofertada;
	@Column (name = "nombre", nullable = false)
	private String Nombre;
	private String Curso;
	private String Caracter;
	private String Duracion;
	private Integer UnidadTemporal;
	@Column (name = "ingles", nullable = false)
	private Boolean Ingles;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Titulacion as_titul;
	
	@OneToMany(mappedBy = "asig_cl")
	private List<Clase> clases;

	@OneToOne (mappedBy="opt_asig")
	private Optativa asig_opt;
	
	@OneToMany (mappedBy = "asigmt_asig")
	private List<Asig_Matricula> asig_asigmt;
	
	@OneToMany (mappedBy = "asi")
	private List<Grupos_Por_Asignatura> gpa;
	
	public Asignatura() {
		super();
	}   
	public Integer getReferencia() {
		return this.Referencia;
	}

	public void setReferencia(Integer Referencia) {
		this.Referencia = Referencia;
	}   
	public Integer getCodigo() {
		return this.Codigo;
	}

	public void setCodigo(Integer Codigo) {
		this.Codigo = Codigo;
	}   
	public Integer getCreditos() {
		return this.Creditos;
	}

	public void setCreditos(Integer Creditos) {
		this.Creditos = Creditos;
	}   
	public Boolean getOfertada() {
		return this.Ofertada;
	}

	public void setOfertada(Boolean Ofertada) {
		this.Ofertada = Ofertada;
	}   
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}   
	public String getCurso() {
		return this.Curso;
	}

	public void setCurso(String Curso) {
		this.Curso = Curso;
	}   
	public String getCaracter() {
		return this.Caracter;
	}

	public void setCaracter(String Caracter) {
		this.Caracter = Caracter;
	}   
	public String getDuracion() {
		return this.Duracion;
	}

	public void setDuracion(String Duracion) {
		this.Duracion = Duracion;
	}   
	public Integer getUnidad_temporal() {
		return this.UnidadTemporal;
	}

	public void setUnidad_temporal(Integer Unidad_temporal) {
		this.UnidadTemporal = Unidad_temporal;
	}   
	public Boolean getIngles() {
		return this.Ingles;
	}

	public void setIngles(Boolean Ingles) {
		this.Ingles = Ingles;
	}
	public Integer getUnidadTemporal() {
		return UnidadTemporal;
	}
	public void setUnidadTemporal(Integer unidadTemporal) {
		UnidadTemporal = unidadTemporal;
	}
	public Titulacion getAs_titul() {
		return as_titul;
	}
	public void setAs_titul(Titulacion as_titul) {
		this.as_titul = as_titul;
	}
	public List<Clase> getClases() {
		return clases;
	}
	public void setClases(List<Clase> clases) {
		this.clases = clases;
	}
	public Optativa getAsig_opt() {
		return asig_opt;
	}
	public void setAsig_opt(Optativa asig_opt) {
		this.asig_opt = asig_opt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
   
}
