package com.neoteric.sportsClub;

public class Tournament {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player(301, "Brazil");
        Player player3 = new Player(302, "Spain", "Gusac");
        Player player4 = new Player("Lakshmi", 303, "Argentina", "Sangarsh");
        player1.displayDetails();
        player2.displayDetails();
        player3.displayDetails();
        player4.displayDetails();

    }
}
