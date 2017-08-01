package modelo;

import java.util.List;

import javax.persistence.*;

public class Caja {
	@Id @GeneratedValue
	@Column
	private int id;
	
	@Column
	private int saldo;
	
	@OneToMany
	private List<Movimiento> movimientos;

	public Caja() {}
	
	//GETTER & SETTER
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int _saldo) {
		saldo = _saldo;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}


}
