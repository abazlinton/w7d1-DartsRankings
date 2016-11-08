package com.example.user.dartsrankings;

import java.util.ArrayList;

/**
 * Created by user on 07/11/2016.
 */

public class Rankings {

    private ArrayList<Player> mplayers;

    public Rankings(ArrayList<Player> players){
        this.mplayers = new ArrayList<Player>(players);
    }

    public Player getPlayerByRanking(int ranking){
        for (Player player : mplayers)
            if (ranking == player.getRanking()) {
                return player;
            }
        return null;
    }

    public Player getPlayerByIndex(int index){
        return mplayers.get(index);
    }

    public int getListSize(){
        return mplayers.size();
    }

    public void replaceLastPlayer(Player player){
        mplayers.remove(getListSize() - 1);
        mplayers.add(player);
    }

    public Player findPlayerByName(String name){
        for (Player player : mplayers) {
            String nameLowerCase = name.toLowerCase();
            String playerNameLowerCase = player.getName().toLowerCase();
            if ( nameLowerCase.equals(playerNameLowerCase)){
                return player;
            }
        }
        return null;
    }

    public void movePlayerUpOne(String name){
        Player playerMovingUp = findPlayerByName(name);
        int oldRanking = playerMovingUp.getRanking();
        int newRanking = oldRanking - 1;
        Player playerMovingDown = getPlayerByRanking(newRanking);
        playerMovingDown.setRanking(oldRanking);
        playerMovingUp.setRanking(newRanking);
        reorderPlayersByGetRanking();
    }

    public void movePlayerDownOne(String name){
        Player playerMovingDown = findPlayerByName(name);
        Player playerMovingUp = getPlayerByRanking(playerMovingDown.getRanking() + 1);
        movePlayerUpOne(playerMovingUp.getName());
    }

    public void reorderPlayersByGetRanking(){
        ArrayList<Player> reorderedPlayers = new ArrayList<Player>();
        for (int i = 1; i < getListSize(); i++){
            Player tempPlayer = getPlayerByRanking(i);
            reorderedPlayers.add(tempPlayer);
        }
        mplayers = reorderedPlayers;
    }

}
