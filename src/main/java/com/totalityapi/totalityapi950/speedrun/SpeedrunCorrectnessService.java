package com.totalityapi.totalityapi950.speedrun;

import com.totalityapi.totalityapi950.interfaces.CorrectnessInterface;

public class SpeedrunCorrectnessService implements CorrectnessInterface  {
    @Override
    public String assignCorrectSelection() {
        return "correct";
    }

    @Override
    public String assignIncorrectSelection() {
        return "incorrect";
    }
}
