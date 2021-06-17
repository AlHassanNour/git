package de.htwberlin.prog1.sose2021.spaceadventure.app;

import java.util.Scanner;

public class SpaceAdventureApp {

	private SpaceAdventureGame spaceAdventureGame = new SpaceAdventureGame();
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * @param args mainklasse
	 */
	public static void main(String[] args) {

		while (true) {
			showMenu();
			String choice = readUserInput();
			handle(choice);
			System.out.println("====================");
		}
	}

	/**
	 * 
	 * @return
	 */
	private static String readUserInput() {
		System.out.print("\nWas willst Du tun? Wähle einen Buchstaben:\t");
		String choiceInternal = scanner.next();

		return choiceInternal;
	}

	/**
	 * 
	 * @param choice
	 */
	private static void handle(String choice) {
		switch (choice) {
		case "R":
			createSpaceShip();
			break;
		case "W":
			showAdventureMenu();
			break;
		case "B":
			break;

		default: {
			System.out.println("Ungueltige Eingabe. Bitte ueberpruefen Sie Ihre Eingabe");
			showMenu();
		}
			break;

		}
	}

	/**
	 * 
	 */
	private static void showMenu() {

		String menuItems[] = { "", 
				"R\t <R>aumschiff erstellen", 
				"C\t Raums<c>hiff auswählen",
				"A\t Daten aller Raumschiffe <a>usgeben",
				"S\t Raumschiff <s>peichern", 
				"S\t Raumschiff <l>öschen", 
				"W\t <W>eltraumabenteuer beginnen", 
				"B\t <B>eenden" };

		System.out.println("\n----------- Space Adventure 1.0 -----------\n");
		System.out.println("\nWillkommen zum SuperStarGalaktika 4997 Spiel ...\n");
		for (int i = 1; i < menuItems.length; i++) {
			System.out.println(menuItems[i]);
		}

	}

	private static void createSpaceShip() {
		System.out.println(
				"\nLeider hat die Methode noch keinen Code. Aber Du kannst hoffentlich nachvollziehen wie der Ablauf ist. Hier sollst Du ein Raumschiff anlegen.\n");
	}
	
	private static void showAdventureMenu() {
		String menuItems[] = { "", 
				"P\t Planeten anfliegen"};
		
		System.out.println("\nDein Raumschiff ist abgehoben. Du schaust auf Deine Karte und findest die folgenden Planeten auf Deiner Karte:\n");
		System.out.println("Hotategai");
		System.out.println("Symphur");
		System.out.println("Nonoturn");
		System.out.println("Tiskarski");
		System.out.println("\n\n\n\n\n");
		
		
		for (int i = 1; i < menuItems.length; i++) {
			System.out.println(menuItems[i]);
		}
		
	}

}
