package modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Item {
	@Id
	@GeneratedValue
	private Long id; //no int
	
	
	private Producto producto;

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
	public int precio;
	public int cantidad;
	
	public String toString() {
		String valor = new String();
		valor += "Precio " + this.precio + " Cantidad " + this.cantidad;
		return valor;
	}

}
