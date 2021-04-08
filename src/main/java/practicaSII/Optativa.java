package practicaSII;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Optativa
 *
 */
@Entity

public class Optativa implements Serializable {

	@Column (name = "plazas", nullable = false)
	private Integer Plazas;
	private String Mencion;
	private static final long serialVersionUID = 1L;
	
	@Id
	@OneToOne
	private Asignatura opt_asig;

	public Optativa() {
		super();
	}   
	public Integer getPlazas() {
		return this.Plazas;
	}

	public void setPlazas(Integer Plazas) {
		this.Plazas = Plazas;
	}   
	public String getMencion() {
		return this.Mencion;
	}

	public void setMencion(String Mencion) {
		this.Mencion = Mencion;
	}
	public Asignatura getOpt_asig() {
		return opt_asig;
	}
	public void setOpt_asig(Asignatura opt_asig) {
		this.opt_asig = opt_asig;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}
