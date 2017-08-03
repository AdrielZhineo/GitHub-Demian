package modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class TipoMovimiento {
	@Id
	@GeneratedValue
	private Long id; //no int
	
	@Column(length = 60)
	private String nombreMovimiento;

//CONSTRUCTOR VACIO
		public TipoMovimiento() {
			
		}

//GETTER & SETTER

public String getNombreMovimiento() {
	return nombreMovimiento;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public void setNombreMovimiento(String nombreMovimiento) {
	this.nombreMovimiento = nombreMovimiento;
}

}
