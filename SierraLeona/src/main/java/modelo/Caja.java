package modelo;

import java.util.List;

public class Caja {
public int Saldo;
public List<Movimiento> movimientos;

//GETTER & SETTER
public int getSaldo() {
	return Saldo;
}
public void setSaldo(int saldo) {
	Saldo = saldo;
}
public List<Movimiento> getMovimientos() {
	return movimientos;
}
public void setMovimientos(List<Movimiento> movimientos) {
	this.movimientos = movimientos;
}


}
