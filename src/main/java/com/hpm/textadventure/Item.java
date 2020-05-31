package com.hpm.textadventure;

// Carries data about every item in the game
public class Item {
    String name;
    int durability;
    ItemType itemType;

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
