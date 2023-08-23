package fr.caensup.sio.caserne;

public class Caserne {
	private String nom;
	private String ville;

	public Caserne(String ville) {
		this("Caserne", ville);
	}

	public Caserne(String nom, String ville) {
		this.nom = nom;
		this.ville = ville;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public String getVille() {
		return ville;
	}

	@Override
	public String toString() {
		return nom + " de " + ville;
	}

}
