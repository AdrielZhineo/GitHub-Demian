package modelo;

import java.util.Date;

import javax.persistence.*;

public class Movimiento {
	
	@Id
	@Column
	private int id;
	
	@Column
	public	Usuario usuario;
	public Date fechaMovimiento;
	public TipoMovimiento tipoMovimiento;
	public String descripcionMovimiento;
	public int monto;

	//GETTER & SETTER
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public String getDescripcionMovimiento() {
		return descripcionMovimiento;
	}
	public void setDescripcionMovimiento(String descripcionMovimiento) {
		this.descripcionMovimiento = descripcionMovimiento;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}

}
