package fr.caensup.sio.caserne;

public class Pompier {

	public static final String PREFIX = "POMP";
	private static int count;
	private String matricule;
	private int age;
	private String nom;
	private String prenom;

	public Pompier(String matricule) {
		this.matricule = PREFIX + "_" + matricule;
		Pompier.count++;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age <= 126) {
			this.age = age;
		}
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void afficher() {
		System.out.println(matricule);
	}

	public static void afficherCount() {
		System.out.println(count + " pompier(s) instancié(s)");
	}
}
