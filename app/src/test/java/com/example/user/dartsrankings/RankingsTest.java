package com.example.user.dartsrankings;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/11/2016.
 */

public class RankingsTest {

    Rankings rankings;
    Player player1, player2, player3, player4, player5, player6, player7, player8, player9, player10;

    @Before
    public void before(){

        ArrayList<Player> players = new ArrayList<Player>();
        player1 = new Player("Tom", "The Tiger", 1);
        player2 = new Player("Ross", 2);
        player3 = new Player("Adrian", 3);
        player4 = new Player("Claudia", 4);
        player5 = new Player("Bobby", 5);
        player6 = new Player("Carlos", 6);
        player7 = new Player("Max", 7);
        player8 = new Player("Kate", 8);
        player9 = new Player("Craig", 9);
        player10 = new Player("Keith", 10);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);
        players.add(player8);
        players.add(player9);
        players.add(player10);
        rankings = new Rankings(players);
    }

    @Test
    public void canGetPlayerByRanking(){
        Player returnedPlayer = rankings.getPlayerByRanking(3);
        assertEquals("Adrian", returnedPlayer.getName());
    }

    @Test
    public void canGetPlayerByIndex(){
        Player returnedPlayer = rankings.getPlayerByIndex(1);
        assertEquals("Ross", returnedPlayer.getName());
    }

    @Test
    public void canGetRankingListSize() {
        assertEquals(10, rankings.getListSize());
    }

    @Test
    public void canReplaceLastPlayer(){
        Player player11 = new Player("Bertie", 10);
        rankings.replaceLastPlayer(player11);
        Player returnedPlayer = rankings.getPlayerByRanking(10);
        assertEquals("Bertie", returnedPlayer.getName());

    }

    @Test
    public void canFindPlayerByName(){
        Player returnedPlayer = rankings.findPlayerByName("Max");
        assertEquals(7, returnedPlayer.getRanking());
    }

    @Test
    public void canFindPlayerByNameWhateverCase(){
        Player returnedPlayer = rankings.findPlayerByName("cARloS");
        assertEquals(6, returnedPlayer.getRanking());
    }

    @Test
    public void canMovePlayerUpOne() {
        rankings.movePlayerUpOne("Bobby");
        int newBobbyRanking = rankings.findPlayerByName("Bobby").getRanking();
        Player newBobbyPlayer = rankings.getPlayerByIndex(3);
        int newClaudiaRanking = rankings.findPlayerByName("Claudia").getRanking();
        Player newClaudiaPlayer = rankings.getPlayerByIndex(4);
        assertEquals(4, newBobbyRanking);
        assertEquals(5, newClaudiaRanking);
        assertEquals("Bobby", newBobbyPlayer.getName());
        assertEquals("Claudia", newClaudiaPlayer.getName());
    }

    @Test
    public void canMovePlayerDownOne() {
        rankings.movePlayerDownOne("Bobby");
        int newBobbyRanking = rankings.findPlayerByName("Bobby").getRanking();
        Player newBobbyPlayer = rankings.getPlayerByIndex(5);
        int newCarlosRanking = rankings.findPlayerByName("Carlos").getRanking();
        Player newCarlosPlayer = rankings.getPlayerByIndex(4);
        assertEquals(6, newBobbyRanking);
        assertEquals(5, newCarlosRanking);
        assertEquals("Bobby", newBobbyPlayer.getName());
        assertEquals("Carlos", newCarlosPlayer.getName());

    }






}
