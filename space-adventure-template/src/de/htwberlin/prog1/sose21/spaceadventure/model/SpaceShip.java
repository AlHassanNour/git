package de.htwberlin.prog1.sose21.spaceadventure.model;

import java.util.UUID;

/**
 * 
 * wird benutzt um  ein RaumSchiff zu erstellen
 * @author nour-
 *
 *@param id
 *@param name
 *@param description
 *@param age
 *@param energy
 *@param experiencePoints
 *@param exists
 *
 */
public class SpaceShip {
	
	//Atributte
	private String id;
	private String name;
	private String description;
	private int age;
	private int energy;
	private int experiencePoints;
	private boolean exists;
	
    
	//Konstruktor 
	public SpaceShip(String name, String description, int age) {
		this.id = UUID.randomUUID().toString();
		this.experiencePoints = 0;
		this.energy = 3;
		this.exists = true;
		this.name = name;
		this.age = age;
		this.description = description;
	}
    
	//Getter und Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public void setExperiencePoints(int experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

	public boolean getExists() {
		return exists;
	}

	public void setExists(boolean exists) {
		this.exists = exists;
	}
    
	/**
	 *Stellt alle Attribute des Raumschiffs in einer ansprechenden 
	 *Form auf der Konsole dar
	 *
	 */
	public void print() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Beschreibung: " + this.description);
		System.out.println("Alter: " + this.age);
		System.out.println("Energie: " + this.energy);
		System.out.println("Erfahrungspunkte: " + this.experiencePoints);
		if(this.exists)
			System.out.println("Raumschiffe Situation: Lebendig");
		else 
			System.out.println("Raumschiffe Situation: Zerstört");
	}
	
	
	
	
}
