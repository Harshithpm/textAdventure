package com.hpm.textadventure;

/**
 * Carries data about every item in the game including durability and a name that
 * practically just describes the item
 * @author Harshith
 * @version 1.0.0
 */
public class Item {
    String name;
    int durability;
    ItemType itemType;

    /**
     * A constructor to initialize the data about the item
     * @param name Name/Description of Item
     * @param durability Durability or how much uses for the weapon
     * @param itemType The type of the item
     */
    public Item(String name, int durability, ItemType itemType) {
        this.name = name;
        this.durability = durability;
        this.itemType = itemType;
    }

    enum ItemType {
        ATTACK,     // Anything that deals damage
        DEFENCE,    // Anything that protects from damage
        MAGIC       // Anything that helps or supports anyone
    }
}
