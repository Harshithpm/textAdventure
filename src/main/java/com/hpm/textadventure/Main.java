package com.hpm.textadventure;

import java.util.Scanner;

/**
 * Main class
 */
public class Main {

    static Player player;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to My Text Adventure");
        System.out.println("Let's make your character!");
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Describe your character: ");
        String description = in.nextLine();
        System.out.print("Player Type (Wizard, Rogue, or Knight): ");
        String playerType = in.nextLine();
        Player.PlayerType mainPlayerType = null;
        switch (playerType.toLowerCase()) {
            case "wizard":
                mainPlayerType = Player.PlayerType.WIZARD;
                break;
            case "rogue":
                mainPlayerType = Player.PlayerType.ROGUE;
                break;
            case "knight":
                mainPlayerType = Player.PlayerType.KNIGHT;
                break;
            default:
                System.out.println("Invalid Type!");
                break;
        }

        System.out.println("Creating character....");
        player = new Player(mainPlayerType, name, description);
        System.out.println(player.name + " " + player.description + " " + player.playerType.toString());
        System.out.println("Your health is " + player.hp);
        System.out.println("Your stats are " + player.printStats());

        System.out.println("You are stuck in a room, cold and dark.\nYou don't have any memories about yourself other than your name, " + player.name + ". You stand up.");
        boolean answer = false;
        String direction;
        while (!answer) {
            System.out.print("Where do you go? (North, South, East, West): ");
            direction = in.nextLine();

            switch (direction.toLowerCase()){
                case "north":
                    System.out.println("You find a door. Locked.");
                    break;

                case "south":
                    System.out.println("You find a window. Looking out all you see is a dark fog creeping in.");
                    break;

                case "west":
                    System.out.println("A door. When opened, you see another huge room. Looking around you see a man tied up to the wall by his arms.");
                    direction = "west";
                    answer = true;
                    break;

                case "east":
                    System.out.println("");
                    direction = "east";
                    answer = true;
                    break;
            }
        }

        System.exit(0);
    }
}
