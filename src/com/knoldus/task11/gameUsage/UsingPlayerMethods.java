package com.knoldus.task11.gameUsage;

import com.knoldus.task11.game.Player;
public class UsingPlayerMethods
{
    public static void main(String args[])
    {
        //creating players and displaying their details
        Player player1 = new Player();
        player1.setPlayerDetails("Jasleen", 12, 1);
        System.out.println("The player 1 details are: "+player1.getName()+" "+player1.getScore()+" "+player1.getLevel());
        Player player2 = new Player();
        player2.setPlayerDetails("Riya", 14, 3);
        System.out.println("The player 1 details are: "+player2.getName()+" "+player2.getScore()+" "+player2.getLevel());
    }
}