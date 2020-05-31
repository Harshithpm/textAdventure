package com.hpm.textadventure;

/**
 * The main character class from which the player data and the NPC data is taken
 * @author Harshith
 * @version 1.0.0
 */
public class Character {
    int hp;
    String name;
    String description;

    /**
     * A pretty simple constructor to initialize all properties of the Character
     * @param name The name of the character
     * @param description A description of the character
     */
    public Character(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
