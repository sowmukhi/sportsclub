package com.neoteric.sportsClub;

public class Player {
    public String playerName;
    public int playerId;
    public String country;
    public String sportsClub;
//Assigns default values.
    public Player() {
        this.playerName = "Unknown";
        this.playerId = 0;
        this.country = "Not Provided";
        this.sportsClub = "Not Assigned";
    }
//Represents minimal player information.
    public Player(int playerId, String country) {
        this.playerName = "Unknown";
        this.playerId = playerId;
        this.country = country;
        this.sportsClub = "Not Assigned";
    }
    //Links the player to a club.
    public Player(int playerId, String country, String sportsClub) {
        this.playerName = "Unknown";
        this.playerId = playerId;
        this.country = country;
        this.sportsClub = sportsClub;
    }
//Allows complete player registration.
    public Player(String playerName, int playerId, String country, String sportsClub) {
        this.playerName = playerName;
        this.playerId = playerId;
        this.country = country;
        this.sportsClub = sportsClub;
    }

    public void displayDetails() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Player ID: " + playerId);
        System.out.println("Country: " + country);
        System.out.println("Sports Club: " + sportsClub);
    }
}
