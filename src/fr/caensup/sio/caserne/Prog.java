package fr.caensup.sio.caserne;

import java.time.LocalDateTime;

import fr.caensup.sio.caserne.exceptions.EmptyMatriculeException;

public class Prog {

	public static void main(String[] args) {
		// Pompier.afficherCount();
		try {
			Pompier p1 = new Pompier("ZBRE112VBQ");
			p1.setNom("DUPONT");
			p1.setPrenom("Paul");
			p1.setAge(22);
			// p1.afficher();
			new Pompier("SERT A RIEN");
			// Pompier.afficherCount();

			p1.setAge(140);

			Caserne cas = new Caserne("Toulouse");

			Pompier p2 = new Pompier("QSFJONQ", "nom", "prenom");

			Pompier p3 = new Pompier("GOIZGJS", "Jean", "Laurent", 45);

			p1.affecter(cas);
			cas.affecter(p2);
			p3.affecter(cas);

			Intervention I1 = new Intervention(LocalDateTime.now());
			I1.ajouterPompier(p1, p2, p3, p1, new Pompier("GOIZGJS", "Jean", "Laurent", 45));

			System.out.println(I1.toString());
			new Pompier("");
		} catch (EmptyMatriculeException e) {
			System.out.println("Pompier sans matricule !");
		}

	}

}
