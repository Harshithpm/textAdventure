package com.hpm.java;
import java.util.ArrayList;

/*
    Name: Player.java
    Created: 30/05/2020 , 10:38 PM
    By: Harshith
*/

enum PlayerType {
    WIZARD,
    ROGUE,
    KNIGHT
}

// Carries data about player like HP, inventory, playerType, etc
public class Player {
    int hp;
    PlayerType playerType;
    ArrayList<Item> inventory = new ArrayList<>();
    String name;
    String description;

    public Player(PlayerType playerType, String name, String description) {
        this.playerType = playerType;
        this.name = name;
        this.description = description;

        if (this.playerType == PlayerType.KNIGHT) {
            this.hp = 60;
            this.inventory.add(new Item("Sword", 10, ItemType.ATTACK));
            this.inventory.add(new Item("Shield", 10, ItemType.DEFENCE));
        }
        else if (this.playerType == PlayerType.ROGUE) {
            this.hp = 70;
            this.inventory.add(new Item("Knife", 15, ItemType.ATTACK));
            this.inventory.add(new Item("Smoke Bomb", 1, ItemType.MAGIC));
        }
        else if (this.playerType == PlayerType.WIZARD) {
            this.hp = 80;
            this.inventory.add(new Item("Health Potion", 1, ItemType.MAGIC));
            this.inventory.add(new Item("Damage Potion", 10, ItemType.ATTACK));
        }
    }
}
