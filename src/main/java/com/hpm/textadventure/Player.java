package com.hpm.textadventure;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Player.java
 * A class carrying data about the player such as the hp, playerType, name, etc.
 * @author Harshith
 * @version 1.1.0
 */
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

    /**
     * Constructor that initializes all data and also sets up inventory, hp and stats of the
     * player depending on PlayerType
     * @param playerType The type of Player (WIZARD, ROGUE, or KNIGHT)
     * @param name The name of the character
     * @param description A fitting description for the character
     */
    public Player(PlayerType playerType, String name, String description) {
        super(name, description);
        this.playerType = playerType;

        if (this.playerType == PlayerType.KNIGHT) {
            this.hp = 60;
            this.inventory.add(new Item("Sword", 10, Item.ItemType.ATTACK));
            this.inventory.add(new Item("Shield", 10, Item.ItemType.DEFENCE));
            HashMap<String, Integer> temp = new HashMap<>();
            temp.put("Attack", 25);
            temp.put("Defence", 20);
            temp.put("Magic", 0);
            stats.add(temp);
        }
        else if (this.playerType == PlayerType.ROGUE) {
            this.hp = 70;
            this.inventory.add(new Item("Knife", 15, Item.ItemType.ATTACK));
            this.inventory.add(new Item("Smoke Bomb", 1, Item.ItemType.MAGIC));
            HashMap<String, Integer> temp = new HashMap<>();
            temp.put("Attack", 20);
            temp.put("Defence", 15);
            temp.put("Magic", 10);
            stats.add(temp);
        }
        else if (this.playerType == PlayerType.WIZARD) {
            this.hp = 80;
            this.inventory.add(new Item("Health Potion", 1, Item.ItemType.MAGIC));
            this.inventory.add(new Item("Damage Potion", 10, Item.ItemType.ATTACK));
            HashMap<String, Integer> temp = new HashMap<>();
            temp.put("Attack", 15);
            temp.put("Defence", 20);
            temp.put("Magic", 25);
            stats.add(temp);
        }
    }

    /**
     * This is called to kill the character
     */
    private void Die() {
        System.out.println("You Die!");
        System.exit(0);
    }

    /**
     * Returns the stats of the character in a readable format
     * @return The stats of the player
     */
    public String printStats() {
        StringBuilder string = new StringBuilder();
        for (HashMap<String, Integer> stat : stats) {
            string.append(stat);
            string.append(" ");
        }
        return string.toString();
    }
}
