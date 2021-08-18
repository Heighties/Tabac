package fr.heighties.tabac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Combien de paquet achetiez vous par jour?  :");
		double paquet = input.nextDouble();

		System.out.println("Quel est le prix du paquet? : ");
		double prix = input.nextDouble();

		System.out.println("Depuis combien de jours avez vous arrêté de fumer? : ");
		double jours = input.nextDouble();

		System.out.println("Bravo, vous avez économisé : " + paquet * prix * jours + "€");

	}
}
