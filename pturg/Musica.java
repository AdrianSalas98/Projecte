package uf4_ptUrg2_ex1;

public class Musica extends Media {
	private String artista;
	private String estil;
	public Musica(String nom, double durada, String artista, String estil) {
		super(nom, durada);
		this.artista = artista;
		this.estil = estil;
	}
	public Musica(String nom, double durada) {
		super(nom, durada);
	}
	

}
