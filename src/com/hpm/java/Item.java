package com.hpm.java;

/*
    Name: Item.java
    Created: 30/05/2020 , 10:44 PM
    By: Harshith
*/

enum ItemType {
    ATTACK,     // Anything that deals damage
    DEFENCE,    // Anything that protects from damage
    MAGIC       // Anything that helps or supports anyone
}

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
}
