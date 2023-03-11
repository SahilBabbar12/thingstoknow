package com.knoldus.task11.game;

public class Player
{
    String name;
    int score;
    int level;
    public void setPlayerDetails(String name, int score, int level)
    {
        this.name = name;
        this.score = score;
        this.level  = level;
    }
    public String getName()
    {
        return name;
    }
    public int getScore()
    {
        return score;
    }
    public int getLevel()
    {
        return level;
    }

}