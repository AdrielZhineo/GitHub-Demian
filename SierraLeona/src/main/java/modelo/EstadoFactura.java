package modelo;

public class EstadoFactura {
	public String estado;

// GETTER & SETTER
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void cambiarEstadoFactura(String est) {
		estado = est;
	}
}
