package com.totalityapi.totalityapi950.speedrun;

import com.totalityapi.totalityapi950.interfaces.RoundServiceInterface;

public class SpeedrunRoundService implements RoundServiceInterface {
    @Override
    public int calculateRoundDuration() {
        return 0;
        // create timer that starts on post request in controller
        // elapsed time is calculated based on selection count methods from SpeedrunDAO
        // if  count is equal to three, the timer is done and method returns elapsed time
        // and saves it into the database


        //this service calls setNewSpeedrunDuration()
    }
}

