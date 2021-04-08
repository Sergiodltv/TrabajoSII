package practicaSII;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Expediente
 *
 */
@Entity

public class Expediente implements Serializable {

	   
	@Id
	private Integer NumExpediente;
	private Boolean Activo;
	private Float NotaMediaProvisional;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Alumno al_exp;
	
	@OneToMany (mappedBy = "enc_exp")
	private List<Encuesta> fechaEnc;
	
	@OneToMany (mappedBy = "mt_exp")
	private List<Matricula> exp_mt;

	public Expediente() {
		super();
	}   
	public Integer getNumExpediente() {
		return this.NumExpediente;
	}

	public void setNumExpediente(Integer NumExpediente) {
		this.NumExpediente = NumExpediente;
	}   
	public Boolean getActivo() {
		return this.Activo;
	}

	public void setActivo(Boolean Activo) {
		this.Activo = Activo;
	}   
	public Float getNotaMediaProvisional() {
		return this.NotaMediaProvisional;
	}

	public void setNotaMediaProvisional(Float NotaMediaProvisional) {
		this.NotaMediaProvisional = NotaMediaProvisional;
	}
   
}
