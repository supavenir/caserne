package fr.caensup.sio.caserne;

import fr.caensup.sio.caserne.exceptions.EmptyMatriculeException;

public class Pompier {

	public static final String PREFIX = "POMP";
	private static int count;
	private String matricule;
	private int age;
	private String nom;
	private String prenom;
	private Caserne laCaserne;

	public Pompier(String matricule) throws EmptyMatriculeException {
		this(matricule, "", "", 0);
	}

	public Pompier(String matricule, String nom, String prenom) throws EmptyMatriculeException {
		this(matricule, nom, prenom, 0);
	}

	public Pompier(String matricule, String nom, String prenom, int age) throws EmptyMatriculeException {
		this.age = age;
		this.prenom = prenom;
		this.nom = nom;
		setMatricule(matricule);
		Pompier.count++;
	}

	public void setMatricule(String matricule) throws EmptyMatriculeException {
		if (matricule != null && !"".equals(matricule)) {
			this.matricule = PREFIX + "_" + matricule;
			return;
		}
		throw new EmptyMatriculeException();
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

	public void setCaserne(Caserne uneCaserne) {
		this.laCaserne = uneCaserne;
	}

	public Caserne getLaCaserne() {
		return laCaserne;
	}

	public Pompier affecter(Caserne caserne) {
		caserne.affecter(this);
		return this;
	}

	public static void afficherCount() {
		System.out.println(count + " pompier(s) instancié(s)");
	}

	@Override
	public String toString() {
		String s = this.matricule + " - " + this.nom + " " + this.prenom + "(" + this.age + ")";
		if (laCaserne != null) {
			s += "\nAffectation : " + laCaserne;
		}
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Pompier)) {
			return false;
		}
		return this.matricule.equals(((Pompier) obj).matricule);
	}

	@Override
	public int hashCode() {
		return this.matricule.hashCode();
	}
}
