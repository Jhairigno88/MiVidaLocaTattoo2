package it.sincrono.TattooWebPage.model;

public class Utente extends Guest{

	public Utente() {
		// TODO Auto-generated constructor stub
	}
	
	private String nome=null;
	private String cognome=null;
	private String indirizzo=null;
	private int cellulare=0; 
	private String userU=null;
	private String passwordU=null;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public int getCellulare() {
		return cellulare;
	}
	public void setCellulare(int cellulare) {
		this.cellulare = cellulare;
	}
	public String getUser() {
		return userU;
	}
	public void setUser(String user) {
		this.userU = user;
	}
	public String getPassword() {
		return passwordU;
	}
	public void setPassword(String password) {
		this.passwordU = password;
	}
	
	
}
