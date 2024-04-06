package com.totalityapi.totalityapi950.versusroom;

import com.totalityapi.totalityapi950.interfaces.VersusSearchStatusInterface;

public enum VersusSearchStatusService implements VersusSearchStatusInterface {
    IDLE("IDLE"),
    SEARCHING("SEARCHING"),
    FOUND("FOUND"),
    ;

    final String searchStatus;

    VersusSearchStatusService(String searchStatus) {
        this.searchStatus = searchStatus;
    }

    @Override
    public String setSearchStatusToIdle() {
     //this method is called on fetched versus lobby with no action and on STOP SEARCH COMPONENT ON FRONT END
        // save the status to the database!!!
        return VersusSearchStatusService.IDLE.searchStatus;
    }

    @Override
    public String setSearchStatusToSearching() {
     //this is called on START SEARCH COMPONENT
        // implements SearchAlgorithm
        // this should replace the value of IDLE with SEARCHING in database
        return VersusSearchStatusService.SEARCHING.searchStatus;
    }

    @Override
    public String setSearchStatusToFound() {
      // THIS IS CALLED IF CONNECTION IS ESTABLISHED
        return VersusSearchStatusService.FOUND.searchStatus;
    }
}
