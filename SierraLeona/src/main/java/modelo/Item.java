package modelo;

public class Item {
	public Producto producto;

	// GETTER & SETTER	
	public Producto getProducto() {
		return producto;
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
