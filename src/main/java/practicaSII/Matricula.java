package practicaSII;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Matricula
 *
 */
@Entity

public class Matricula implements Serializable {

	   
	@EmbeddedId
	private MatriculaPK id;
	@Column (name = "estado", nullable = false)
	private Boolean Estado;
	@Column (name = "fecha_matricula", nullable = false) @Temporal (TemporalType.DATE)
	private Date FechaMatricula;
	private Integer NumArchivo;
	private String TurnoPreferente;
	private Boolean NuevoIngreso;
	private String ListadoAsignaturas;
	private static final long serialVersionUID = 1L;
	
	@MapsId("exp_fk")
	@ManyToOne
	private Expediente mt_exp;

	public Matricula() {
		super();
	}   
	
	@OneToMany(mappedBy ="asigmt_mt")
	private List<Asig_Matricula> mt_asigmt;
	 
	public Boolean getEstado() {
		return this.Estado;
	}

	public void setEstado(Boolean Estado) {
		this.Estado = Estado;
	}   
	public Date getFechaMatricula() {
		return this.FechaMatricula;
	}

	public void setFechaMatricula(Date FechaMatricula) {
		this.FechaMatricula = FechaMatricula;
	}   
	public Integer getNumArchivo() {
		return this.NumArchivo;
	}

	public void setNumArchivo(Integer NumArchivo) {
		this.NumArchivo = NumArchivo;
	}   
	public String getTurnoPreferido() {
		return this.TurnoPreferente;
	}

	public void setTurnoPreferido(String TurnoPreferido) {
		this.TurnoPreferente = TurnoPreferido;
	}   
	public Boolean getNuevoIngreso() {
		return this.NuevoIngreso;
	}

	public void setNuevoIngreso(Boolean NuevoIngreso) {
		this.NuevoIngreso = NuevoIngreso;
	}   
	public String getListadoAsignaturas() {
		return this.ListadoAsignaturas;
	}

	public void setListadoAsignaturas(String ListadoAsignaturas) {
		this.ListadoAsignaturas = ListadoAsignaturas;
	}
   
}
