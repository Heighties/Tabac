package fr.heighties.tabac;

public class Paquet {
	private int nombreCigarette;
	private int prix;

	public Paquet(int nombreCigarette, int prix) {
		this.nombreCigarette = nombreCigarette;
		this.prix = prix;

	}

	public int getNombreCigarette() {
		return nombreCigarette;
	}

	public int getPrix() {
		return prix;
	}
}
