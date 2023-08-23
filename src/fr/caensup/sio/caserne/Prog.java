package fr.caensup.sio.caserne;

public class Prog {

	public static void main(String[] args) {
		Pompier.afficherCount();
		Pompier p1 = new Pompier("ZBRE112VBQ");
		p1.afficher();
		new Pompier("SERT A RIEN");
		Pompier.afficherCount();
		System.out.println(p1.getMatricule());
		p1.setAge(140);

		Caserne cas = new Caserne("Toulouse");
		System.out.println(cas);

	}

}
