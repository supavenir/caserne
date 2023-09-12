package fr.caensup.sio.caserne;

import java.util.ArrayList;
import java.util.List;

public class Caserne {
	private String nom;
	private String ville;
	private List<Pompier> lesPompiers;
	private List<Intervention> interventions;

	public Caserne(String ville) {
		this("Caserne", ville);
	}

	public Caserne(String nom, String ville) {
		this.nom = nom;
		this.ville = ville;
		this.lesPompiers = new ArrayList<>();
		this.interventions = new ArrayList<>();
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

	public List<Intervention> getInterventions() {
		return interventions;
	}

	@Override
	public String toString() {
		return nom + " de " + ville;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Caserne)) {
			return false;
		}
		Caserne oCaserne = (Caserne) obj;
		return this.nom.equals(oCaserne.nom) && this.ville.equals(oCaserne.ville);
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

}
