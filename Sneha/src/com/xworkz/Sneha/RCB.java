package com.xworkz.Sneha;

public class RCB {
    public void showStats(Team team) {
        System.out.println("Running RCB scores");
        if (team != null) {
            team.displayStats();
        } else {
            System.out.println("Team stats are null. Cannot display stats.");
        }
    }
}
