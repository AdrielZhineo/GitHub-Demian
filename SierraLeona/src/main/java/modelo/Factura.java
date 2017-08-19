package modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "FACTURA")
public class Factura {

	@Id @GeneratedValue
	@Column
	private Long id; //no int

	@Column
	private Date fechafactura;
	private	int nFactura;

	@Column(length = 60)
	private Usuario usuario;
	private Cliente cliente;
	private List<Item> detalle;
	private EstadoFactura estado;

	//Constructores
	public Factura(int nroFactura, Usuario user, Cliente client, List<Item> items, Date fecha, EstadoFactura _estado ){
		fechafactura = fecha;
		nFactura = nroFactura;
		usuario = user;
		cliente = client;
		detalle = items;
		estado = _estado;
	}
	public Factura() {

	}

	// GETTER & SETTER

	public Date getFechafactura() {
		return fechafactura;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
