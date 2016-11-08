package com.example.user.dartsrankings;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Phil Taylor", "The Power");
    }

    @Test
    public void canGetName() {
        assertEquals("Phil Taylor", player.getName());
    }

    @Test
    public void canGetNickname() {
        assertEquals("The Power", player.getNickname());
    }

    @Test
    public void canSetName() {
        player.setName("Alex");
        assertEquals("Alex", player.getName());
    }

    @Test
    public void canSetNickname() {
        player.setNickname("The Assasin");
        assertEquals("The Assasin", player.getNickname());
    }

    @Test
    public void canGetRanking() {
        assertEquals(0, player.getRanking());
    }

    @Test
    public void canSetRanking() {
        player.setRanking(1);
        assertEquals(1, player.getRanking());
    }

    @Test
    public void canGetDetailedName() {
        String detailedString = player.toString();
        assertEquals("Name: Phil Taylor, Nickname: 'The Power', Ranking: 0", detailedString);
    }






}
