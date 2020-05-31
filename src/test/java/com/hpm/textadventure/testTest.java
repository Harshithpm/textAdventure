package com.hpm.textadventure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTest {
    private final Player player = new Player(Player.PlayerType.KNIGHT, "Harshith", "bla");

    @Test
    void testStats() {
        assertEquals("{Magic=0, Attack=25, Defence=20} ", player.printStats());
    }
}