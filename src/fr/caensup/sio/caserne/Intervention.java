package fr.caensup.sio.caserne;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Intervention {
	private Set<Pompier> pompiers;
	private Lieu lieu;
	private LocalDateTime dateHeure;

	private Caserne caserne;

	public Intervention(LocalDateTime dateHeure, Set<Pompier> pompiers) {
		this.dateHeure = dateHeure;
		this.pompiers = pompiers;
	}

	public Intervention(LocalDateTime dateHeure) {
		this(dateHeure, new HashSet<Pompier>());
	}

	public void ajouterPompier(Pompier... pompiers) {
		for (Pompier p : pompiers) {
			if (p.getLaCaserne().equals(caserne)) {
				this.pompiers.add(p);
			}
		}
	}

	public String toString() {
		return pompiers.toString();
	}

	public Set<Pompier> getPompiers() {
		return pompiers;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public LocalDateTime getDateHeure() {
		return dateHeure;
	}

	public void setDateHeure(LocalDateTime dateHeure) {
		this.dateHeure = dateHeure;
	}

	public Caserne getCaserne() {
		return caserne;
	}

	public void setCaserne(Caserne caserne) {
		this.caserne = caserne;
	}

}
