package modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class EstadoFactura {
	@Id
	@GeneratedValue
	private Long id; //no int
	
	@Column(length = 60)
	private String estado;

	// CONSTRUCTOR VACIO
			public EstadoFactura() {
				
			}
	
// GETTER & SETTER
	
	public String getEstado() {
		return estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void cambiarEstadoFactura(String est) {
		estado = est;
	}
}
