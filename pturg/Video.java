package uf4_ptUrg2_ex1;

public class Video extends Media{
	private String director;
	private String idioma;
	public Video(String nom, double durada, String director, String idioma) {
		super(nom, durada);
		this.director = director;
		this.idioma = idioma;
	}
	

}
