package fr.caensup.sio.caserne;

public class Lieu {
	private String cp;
	private String ville;
	private int numero;
	private String rue;

	public Lieu(String cp, String ville, int numero, String rue) {
		this.cp = cp;
		this.ville = ville;
		this.numero = numero;
		this.rue = rue;
	}

	public Lieu(String cp, String ville) {
		this(cp, ville, 0, "");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Intervention)) {
			return false;
		}
		return this.toString().equals(((Intervention) obj).toString());
	}

	@Override
	public int hashCode() {
		return super.toString().hashCode();
	}

	@Override
	public String toString() {
		return numero + " " + rue + "\n" + cp + " " + ville;
	}

}
