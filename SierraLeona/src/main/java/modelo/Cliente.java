package modelo;

public class Cliente {
		public String razonSocial;
		public int cuit;
	
// GETTER & SETTER
public void setCliente(String razonSocialCliente, int cuitCliente) {
	razonSocial = razonSocialCliente;
	cuit = cuitCliente;
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
