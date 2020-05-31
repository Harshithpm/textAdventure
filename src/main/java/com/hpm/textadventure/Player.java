package com.hpm.textadventure;

import java.util.ArrayList;
import java.util.HashMap;

/*
    Name: main.java.textadventure.Player.java
    Created: 30/05/2020 , 10:38 PM
    By: Harshith
*/

// Carries data about player like HP, inventory, playerType, etc
public class Player extends Character {

    public enum PlayerType {
        WIZARD("Wizard"),
        ROGUE("Rogue"),
        KNIGHT("Knight");
        private final String typeName;

        PlayerType(String typeName) {
            this.typeName = typeName;
        }

        @Override
        public String toString() {
            return typeName;
        }
    }


    PlayerType playerType;
    ArrayList<Item> inventory = new ArrayList<>();
    ArrayList<HashMap<String, Integer>> stats = new ArrayList<>();

    public Player(PlayerType playerType, String name, String description) {
        super(name, description);
        this.playerType = playerType;

        if (this.playerType == PlayerType.KNIGHT) {
            this.hp = 60;
            this.inventory.add(new Item("Sword", 10, ItemType.ATTACK));
            this.inventory.add(new Item("Shield", 10, ItemType.DEFENCE));
            HashMap<String, Integer> temp = new HashMap<>();
            temp.put("Attack", 25);
            temp.put("Defence", 20);
            temp.put("Magic", 0);
            stats.add(temp);
        }
        else if (this.playerType == PlayerType.ROGUE) {
            this.hp = 70;
            this.inventory.add(new Item("Knife", 15, ItemType.ATTACK));
            this.inventory.add(new Item("Smoke Bomb", 1, ItemType.MAGIC));
            HashMap<String, Integer> temp = new HashMap<>();
            temp.put("Attack", 20);
            temp.put("Defence", 15);
            temp.put("Magic", 10);
            stats.add(temp);
        }
        else if (this.playerType == PlayerType.WIZARD) {
            this.hp = 80;
            this.inventory.add(new Item("Health Potion", 1, ItemType.MAGIC));
            this.inventory.add(new Item("Damage Potion", 10, ItemType.ATTACK));
            HashMap<String, Integer> temp = new HashMap<>();
            temp.put("Attack", 15);
            temp.put("Defence", 20);
            temp.put("Magic", 25);
            stats.add(temp);
        }
    }

    private void Die() {
        System.out.println("You Die!");
        System.exit(0);
    }

    public String printStats() {
        StringBuilder string = new StringBuilder();
        for (HashMap<String, Integer> stat : stats) {
            string.append(stat);
            string.append(" ");
        }
        return string.toString();
    }
}
