package uf4_ptUrg2_ex1;

public class Media {
	//Atributs
	private String nom;
	private double durada;
	
	//Constructor
	public Media(String nom, double durada) {
		this.nom = nom;
		this.durada = durada;
	}
	
	//Getters and Setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//Metode play per saber que s' estan reproduint
	public void play() {
		System.out.println("Se esta reproduciendo");
	}
	

}
