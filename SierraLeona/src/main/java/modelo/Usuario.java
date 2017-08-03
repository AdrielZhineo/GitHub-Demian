package modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Usuario {
	@Id
	@GeneratedValue
	private Long id; //no int
	
	@Column(length = 60)
	private String nombre;
	@Column
	private String password;
	@Column
	private Factura factura;
	private Caja caja;
	
	// CONSTRUCTOR VACIO
			public Usuario() {
				
			}
	
	// GETTER & SETTER
	
	public String getNombre() {
		return nombre;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Caja getCaja() {
		return caja;
	}
	public void setCaja(Caja caja) {
		this.caja = caja;
	}
	
	
}
