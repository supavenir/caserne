package fr.caensup.sio.caserne;

import java.util.ArrayList;
import java.util.List;

public class Caserne {
	private String nom;
	private String ville;
	private List<Pompier> lesPompiers;

	public Caserne(String ville) {
		this("Caserne", ville);
	}

	public Caserne(String nom, String ville) {
		this.nom = nom;
		this.ville = ville;
		this.lesPompiers = new ArrayList<>();
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

	public List<Pompier> getLesPompiers() {
		return lesPompiers;
	}

	public void affecter(Pompier unPompier) {
		this.lesPompiers.add(unPompier);
		unPompier.setCaserne(this);
	}

	public int countPompier() {
		return lesPompiers.size();
	}

	@Override
	public String toString() {
		return nom + " de " + ville;
	}

}
