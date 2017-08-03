package modelo;

import javax.persistence.*;


public class Cliente {
		
	@Id
	@GeneratedValue
	private long id; //no int
	
	@Column(length = 60)
		private String razonSocial;
	@Column
		private int cuit;

// CONSTRUCTOR VACIO
		public Cliente() {
			
		}
		
// GETTER & SETTER
		
public void setCliente(String razonSocialCliente, int cuitCliente) {
	razonSocial = razonSocialCliente;
	cuit = cuitCliente;
}
		
public long getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getRazonSocial() {
			return razonSocial;
		}
public void setRazonSocial(String razonSocial) {
			this.razonSocial = razonSocial;
		}
public int getCuit() {
			return cuit;
		}
public void setCuit(int cuit) {
			this.cuit = cuit;
		}

}
