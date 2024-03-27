package com.totalityapi.totalityapi950.versusroom;

public enum VersusMatchSearchStatus {
    IDLE{
        @Override
        public void checkMatchStatus() {

        }
    },
    SEARCHING {
        @Override
        public void checkMatchStatus() {

        }
    },
    FOUND {
        @Override
        public void checkMatchStatus() {

        }
    };
    public abstract void checkMatchStatus();

    // method that takes in values from above and
    // and checks to see if the user is currently
    //searching for a match, if the user is not
    // then the method should display IDLE,
    // if he is searching it should display SEARCHING
    // and if the match is found, FOUND

}
