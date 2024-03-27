package com.totalityapi.totalityapi950.versusroom;

public enum VersusSearchMatchmakingService implements VersusSearchMatchmakingInterface {
    IDLE("Player is not searching or match wasn't found"),
    SEARCHING("Player is searching for a match"),
    FOUND("Player has found the match");

    final String searchStatus;

    VersusSearchMatchmakingService(String searchStatus) {
        this.searchStatus = searchStatus;
    }

    @Override
    public void setSearchStatusToIdle() {

    }

    @Override
    public void setSearchStatusToSearching() {

    }

    @Override
    public void setSearchStatusToFound() {

    }
}
