package it.sincrono.TattooWebPage.model;

import java.util.Date;

public class Appuntamento {

	public Appuntamento() {
		// TODO Auto-generated constructor stub
	}
	
	private Date data=null;
	private String orario=null;
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getOrario() {
		return orario;
	}
	public void setOrario(String orario) {
		this.orario = orario;
	}
	
	
}
