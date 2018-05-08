package uf4_ptUrg2_ex1;

public class Test1 {

	public static void main(String[] args) {
		//Diferent probes per comprobar que cada una de les clases
		
		Media m1 = new Media("Hola", 2);
		System.out.println(m1.getNom());
		m1.setNom("Adios");
		System.out.println(m1.getNom());
		m1.play();
		System.out.println();
		
		Musica mu1 = new Musica("La cucaracha", 0.5, "DaniH", "Hip-Hop");
		System.out.println(mu1.getNom());
		mu1.setNom("Tupac Song");
		System.out.println(mu1.getNom());
		mu1.play();
		System.out.println();
		
		Video v1 = new Video("Video espectacular", 1, "Adrian", "Español");
		System.out.println(v1.getNom());
		v1.setNom("Video no tan espectacular");
		System.out.println(v1.getNom());
		v1.play();
		System.out.println();
		
		MP3 mp1 = new MP3("Algo en mp3", 1.5, "Bad Bunny", "Trap", 1);
		System.out.println(mp1.getNom());
		mp1.setNom("Amorfoda");
		System.out.println(mp1.getNom());
		mp1.play();
		System.out.println();
		
		Ogg o1 = new Ogg("Calimba", 2.5, "Leo Messi", "Estilazo", 1);
		System.out.println(o1.getNom());
		o1.setNom("Futbol magico");
		System.out.println(o1.getNom());
		o1.play();
		System.out.println();
		
		

	}

}
