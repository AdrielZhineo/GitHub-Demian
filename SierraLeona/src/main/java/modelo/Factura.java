package modelo;

import java.util.Date;
import java.util.List;

public class Factura {
	public Date fechafactura;
	public	int nFactura;
	public Usuario usuario;
	public Cliente cliente;
	public List<Item> detalle;
	public EstadoFactura estado;

	
	// SETTER FACTURA
	public void setFactura(int nroFactura, Usuario user, Cliente client, List<Item> items, Date fecha, String estado ){
		fechafactura = fecha;
		nFactura = nroFactura;
		usuario = user;
		cliente = client;
		detalle = items;
		estado = "No pagada";
		

	}
	
	// GETTER & SETTER	
	public Date getFechafactura() {
		return fechafactura;
	}


	public Date setFechafactura(Date fechafactura) {
		return fechafactura;
	}


	public int getnFactura() {
		return nFactura;
	}


	public void setnFactura(int nFactura) {
		this.nFactura = nFactura;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setEmpresa(Cliente client) {
		this.cliente = client;
	}


	public List<Item> getDetalle() {
		return detalle;
	}


	public void setDetalle(List<Item> detalle) {
		this.detalle = detalle;
	}


	public EstadoFactura getEstado() {
		return estado;
	}


	public void setEstado(EstadoFactura estado) {
		this.estado = estado;
	}


	public double total() {
		return detalle.stream().mapToInt(item -> item.getCantidad() * item.getPrecio()).sum();
		}

}
