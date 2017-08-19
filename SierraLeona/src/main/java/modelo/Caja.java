package modelo;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "CAJA")
public class Caja {
	@Id @GeneratedValue
	@Column
	private long id;

	@Column()
	private int saldo;

	@OneToMany
	private List<Movimiento> movimientos;

	public Caja() {}

	//GETTER & SETTER

	public int getSaldo() {
		return saldo;
	}
	public void setId(long id) {
		this.id = id;
	}

	public void setSaldo(int _saldo) {
		saldo = _saldo;
	}
	public long getId() {
		return id;
	}

	public void setId(int _id) {
		this.id = _id;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(List<Movimiento> _movimientos) {
		this.movimientos = _movimientos;
	}


}
