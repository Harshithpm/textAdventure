package com.hpm.textadventure;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    void testPlayerInit() {
        Player player = new Player(Player.PlayerType.KNIGHT, "test", "test");
        ArrayList<HashMap<String, Integer>> stats = new ArrayList<>();
        HashMap<String, Integer> temp = new HashMap<>();
        temp.put("Attack", 25);
        temp.put("Defence", 20);
        temp.put("Magic", 0);
        stats.add(temp);
        assertEquals("test", player.name);
        assertEquals("test", player.description);
        assertEquals(Player.PlayerType.KNIGHT, player.playerType);
        assertEquals("test", player.description);
        assertEquals(60, player.hp);
        assertEquals(stats, player.stats);
    }
}
