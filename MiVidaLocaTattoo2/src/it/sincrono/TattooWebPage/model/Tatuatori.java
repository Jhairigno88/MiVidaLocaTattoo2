package it.sincrono.TattooWebPage.model;

public class Tatuatori {
	 private String nomeTa,cognomeTa=null;
	 private int etaTa=0;
	 
	 public Tatuatori() {
		 
	 }

	public String getCognomeTa() {
		return cognomeTa;
	}

	public void setCognomeTa(String cognomeTa) {
		this.cognomeTa = cognomeTa;
	}

	public String getNomeTa() {
		return nomeTa;
	}

	public void setNomeTa(String nomeTa) {
		this.nomeTa = nomeTa;
	}

	public int getEtaTa() {
		return etaTa;
	}

	public void setEtaTa(int etaTa) {
		this.etaTa = etaTa;
	}

}
