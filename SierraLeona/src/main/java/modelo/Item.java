package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ITEM")
public class Item {
	@Id @GeneratedValue
	@Column
	private Long id; //no int

	@Column
	private Producto producto;
	
	@Column
	public int precio;
	
	@Column
	public int cantidad;

	// CONSTRUCTOR VACIO
	public Item() {

	}
	// GETTER & SETTER	

	public Producto getProducto() {
		return producto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String toString() {
		String valor = new String();
		valor += "Precio " + this.precio + " Cantidad " + this.cantidad;
		return valor;
	}

}
