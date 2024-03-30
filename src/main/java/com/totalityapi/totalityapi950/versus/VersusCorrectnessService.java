package com.totalityapi.totalityapi950.versus;

import com.totalityapi.totalityapi950.interfaces.CorrectnessInterface;

public class VersusCorrectnessService implements CorrectnessInterface {
    @Override
    public String assignCorrectSelection() {
        return "correct";
    }

    @Override
    public String assignIncorrectSelection() {
        return "incorrect";
    }
}
