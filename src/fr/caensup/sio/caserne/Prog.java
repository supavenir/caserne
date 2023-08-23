package fr.caensup.sio.caserne;

public class Prog {

	public static void main(String[] args) {
		Pompier.afficherCount();
		Pompier p1 = new Pompier("ZBRE112VBQ");
		p1.setNom("DUPONT");
		p1.setPrenom("Paul");
		p1.setAge(22);
		p1.afficher();
		new Pompier("SERT A RIEN");
		Pompier.afficherCount();
		System.out.println(p1.getMatricule());
		p1.setAge(140);

		Caserne cas = new Caserne("Toulouse");
		System.out.println(cas);

		Pompier p2 = new Pompier("QSFJONQ", "nom", "prenom");

		Pompier p3 = new Pompier("GOIZGJS", "Jean", "Laurent", 45);

		System.out.println(cas.countPompier());

		p1.affecter(cas);
		cas.affecter(p2);
		p3.affecter(cas);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(cas.countPompier());

	}

}
