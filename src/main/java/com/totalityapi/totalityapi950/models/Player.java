package com.totalityapi.totalityapi950.models;

public class Player {
    int comebackStatus = 0;

    int potentialComebackStatus = 0;

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
