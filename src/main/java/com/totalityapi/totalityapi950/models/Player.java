package com.totalityapi.totalityapi950.models;

public class Player {
    int userId;
    int comebackStatus = 0;
    int potentialComebackStatus = 0;
    String searchStatus;
    int roundsWon; // intra match variable for tracking victories
    int matchesWon;
    int matchesLost;
    int stompedMatches;
    int winStreak;



    

    public String getSearchStatus() {
        return searchStatus;
    }

    public void setSearchStatus(String searchStatus) {
        this.searchStatus = searchStatus;
    }

    public int getPotentialComebackStatus() {
        return potentialComebackStatus;
    }

    public void setPotentialComebackStatus(int potentialComebackStatus) {
        this.potentialComebackStatus = potentialComebackStatus;
    }

    public int getComebackStatus() {
        return comebackStatus;
    }

    public void setComebackStatus(int comebackStatus) {
        this.comebackStatus = comebackStatus;
    }
}
