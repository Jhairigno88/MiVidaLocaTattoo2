package it.sincrono.TattooWebPage.model;

public class Admin extends Guest{

	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	private String nomeAdmin=null;
	private String cognomeAdmin=null;
	private String userAdmin=null;
	private String passwordAdmin=null;
	public String getNomeAdmin() {
		return nomeAdmin;
	}
	public void setNomeAdmin(String nomeAdmin) {
		this.nomeAdmin = nomeAdmin;
	}
	public String getCognomeAdmin() {
		return cognomeAdmin;
	}
	public void setCognomeAdmin(String cognomeAdmin) {
		this.cognomeAdmin = cognomeAdmin;
	}
	public String getUserAdmin() {
		return userAdmin;
	}
	public void setUserAdmin(String userAdmin) {
		this.userAdmin = userAdmin;
	}
	public String getPasswordAdmin() {
		return passwordAdmin;
	}
	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}
	
}
