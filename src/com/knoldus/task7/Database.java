package com.knoldus.task7;

public class Database
{
    private static int numOfConnections = 0; // Static variable for the number of active database connections

    void onConnect(){
        numOfConnections++;
    }
    void onDisconnect(){
        numOfConnections--;
    }
    public static void main(String[] args){
        Database databaseUser1 = new Database();
        databaseUser1.onConnect(); // user1 connects
        Database databaseUser2 = new Database();
        databaseUser2.onConnect(); // user2 connects
        System.out.println("Number of active database connections: " + Database.numOfConnections);
        System.out.println("user1 disconnects...");
        databaseUser1.onDisconnect(); // user1 disconnect
        System.out.println("Number of active database connections: " + Database.numOfConnections);
    }
}