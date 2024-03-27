package com.totalityapi.totalityapi950.versusroom;

public enum VersusSearchMatchmakingService implements VersusSearchMatchmakingInterface {
    IDLE("Player is not searching or match wasn't found"),
    SEARCHING("Player is searching for a match"),
    FOUND("Player has found the match"),
    ;

    final String searchStatus;

    VersusSearchMatchmakingService(String searchStatus) {
        this.searchStatus = searchStatus;
    }

    @Override
    public void setSearchStatusToIdle() {
     //this method is called on fetched versus lobby with no action and on STOP SEARCH COMPONENT ON FRONT END
        // save the status to the database!!!!
    }

    @Override
    public void setSearchStatusToSearching() {
     //this is called on START SEARCH COMPONENT
        // implements SearchAlgorithm
        // this should replace the value of IDLE with SEARCHING in database
    }

    @Override
    public void setSearchStatusToFound() {
      // THIS IS CALLED IF CONNECTION IS ESTABLISHED
    }
}
