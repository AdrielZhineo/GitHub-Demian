package modelo;

import java.util.Date;

import javax.persistence.*;

public class Movimiento {
	
	@Id
	@Column
	private int id;
	
	@Column(length = 60)
	public	Usuario usuario;
	
	@Column
	public Date fechaMovimiento;
	
	@Column(length = 60)
	public TipoMovimiento tipoMovimiento;
	
	@Column(length = 60)
	public String descripcionMovimiento;
	@Column
	public int monto;

	// CONSTRUCTOR VACIO
			public Movimiento() {
				
			}
			
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
