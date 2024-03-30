package com.totalityapi.totalityapi950.speedrun;

public class SpeedrunRound {
    public int correctSelectionCount;
    public int incorrectSelectionCount;

    public int selection;
    long newSpeedrunDuration;
    long bestSpeedrunDuration;

    public int getCorrectSelectionCount() {
        return correctSelectionCount;
    }

    public void setCorrectSelectionCount(int correctSelectionCount) {
        this.correctSelectionCount = correctSelectionCount;
    }

    public int getIncorrectSelectionCount() {
        return incorrectSelectionCount;
    }

    public void setIncorrectSelectionCount(int incorrectSelectionCount) {
        this.incorrectSelectionCount = incorrectSelectionCount;
    }

    public long getNewSpeedrunDuration() {
        return newSpeedrunDuration;
    }

    public void setNewSpeedrunDuration(long newSpeedrunDuration) {
        this.newSpeedrunDuration = newSpeedrunDuration;
    }



    public long getBestSpeedrunDuration() {
        return bestSpeedrunDuration;
    }

    public void setBestSpeedrunDuration(long bestSpeedrunDuration) {
        this.bestSpeedrunDuration = bestSpeedrunDuration;
    }
    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }
}
