package com.hpm.textadventure;

import java.util.Scanner;

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
        System.out.print("main.java.textadventure.Player Type (Wizard, Rogue, or Knight): ");
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
    }
}
