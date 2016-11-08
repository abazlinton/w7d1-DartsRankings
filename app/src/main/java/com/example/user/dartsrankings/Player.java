package com.example.user.dartsrankings;

/**
 * Created by user on 07/11/2016.
 */

public class Player {

    private String name, nickname;
    private int ranking;


    public Player(String name, int ranking){
        this.name = name;
        this.ranking = ranking;
    }

    public Player(String name, String nickname){
        this.name = name;
        this.nickname = nickname;
        this.ranking = 0;
    }

    public Player(String name, String nickname, int ranking) {
        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public String getName(){
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Nickname: '" + nickname + "', Ranking: " + ranking;
    }
}

