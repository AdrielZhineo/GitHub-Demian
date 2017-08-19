package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PRODUCTO")
public class Producto {

	@Id @GeneratedValue
	@Column
	private Long id; //no int

	@Column(length = 60)
	private String descripcion;

	@Column
	private double precio;

	//CONSTRUCTOR VACIO
	public Producto() {

	}

	//GETTER & SETTER

	public String getDescripcion() {
		return descripcion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
