package de.htwberlin.prog1.sose2021.spaceadventure.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.htwberlin.prog1.sose21.spaceadventure.model.SpaceShip;

public class SpaceAdventureApp {
	private static List<SpaceShip> spaceShips = new ArrayList<SpaceShip>();
	private SpaceAdventureGame spaceAdventureGame = new SpaceAdventureGame();
	private static Scanner scanner = new Scanner(System.in);
	private static SpaceShip currentSpaceShip;

	/**
	 * @param args mainklasse
	 */
	public static void main(String[] args) {
		spaceShips.add(new SpaceShip("XR", "hallo", 5));
		spaceShips.add(new SpaceShip("XS", "goodbay", 2));
		
		while (true) {
			showMenu();
			String choice = readUserInput();
			handle(choice);
			System.out.println("====================");
		}
	}

	/**
	 * 
	 * 
	 * @return coiceInternal 
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
		case "C":
			showSpaceShipsData();
			selectSpaceShip();
			break;
		case "A": 
			showSpaceShipsData();
			break;
		case "S":
			addToSpaceShips();
			break;
		case "W":
			showAdventureMenu();
			break;
		case "B":
			System.exit(0);
			break;

		default: {
			System.out.println("Ungueltige Eingabe. Bitte ueberpruefen Sie Ihre Eingabe");
			showMenu();
		}
			break;

		}
	}

	private static void addToSpaceShips() {
		for(int i = 0; i < spaceShips.size(); i++) {
			if(spaceShips.get(i).getId().equals(currentSpaceShip.getId())) return;
		}
		spaceShips.add(currentSpaceShip);
	}
    /**
     * 
     * gibt die Liste aller gespeicherten Raumschiffe an
     * 
     */
	private static void selectSpaceShip() {
		boolean found = false;
		while (!found) {
			System.out.println("Bitte geben Sie das Raumschiff-ID oder 'z' für zurück:");
			String id = scanner.next();
			for(int i = 0; i < spaceShips.size(); i++) {
				if(spaceShips.get(i).getId().equals(id)) {
					currentSpaceShip = spaceShips.get(i);
					found = true;
				}
			}
			if(id.equals("z"))break;
			if(!found)System.out.println("falsche Eingabe ! Bitte vesuchen Sie noch einmal !");
		}
		
	}
	
	/**
	 * zeigt die Daten aller Raumschiffe an
	 * 
	 */

	private static void showSpaceShipsData() {
		for(int i =0; i< spaceShips.size(); i++) {
			System.out.println("spaceShips nummer " + (i+1) + ":");
			System.out.println();
			spaceShips.get(i).print();
			System.out.println();
			System.out.println("#############");
		}
		
	}

	/**
	 * zeigt die Lise des Spiels 
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
	
	/**
	 * 
	 * erstellt ein Raumschiff
	 * 
	 */

	private static void createSpaceShip() {
		System.out.println("Wie heißt Dein Raumschiff ?");
		String name = scanner.next();
		System.out.println("Wie alt ist es ?");
		int age = Integer.parseInt(scanner.next());
		System.out.println(" Kannst du uns vielleicht über Dein Raumschifff erzählen? Wir sind gespannt. ");
		String description = scanner.next();
		currentSpaceShip = new SpaceShip(name, description, age);
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