package agenda.modelo;

import java.util.Objects;

public class Domicilio {

	private String tipoVia;
	private String via;
	private int numero;
	private int piso;
	private String puerta;
	private String codigoPostal;
	private String ciudad;
	private String provincia;
	
	
	
	public Domicilio() {}
	
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	
	
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero= numero;
	}
	
	
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	
	
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	@Override
	public String toString() {
		return "Domicilio [tipoVia=" + tipoVia + ", via=" + via + ", numero=" + numero + ", piso=" + piso + ", puerta="
				+ puerta + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", provincia=" + provincia + "]";
	}

	
	
	



	
	
	
	
	
	
	
	
}
