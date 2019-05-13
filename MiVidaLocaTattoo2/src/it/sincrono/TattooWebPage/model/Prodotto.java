package it.sincrono.TattooWebPage.model;

public class Prodotto {

	public Prodotto() {
		// TODO Auto-generated constructor stub
	}
	
	private String id=null;
	private double prezzo=0;
	private int quantità=0;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getQuantità() {
		return quantità;
	}
	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}
	

}
