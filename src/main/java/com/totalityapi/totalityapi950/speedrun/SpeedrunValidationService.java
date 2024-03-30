package com.totalityapi.totalityapi950.speedrun;

import com.totalityapi.totalityapi950.interfaces.ValidationInterface;

public class SpeedrunValidationService implements ValidationInterface {
    // instantiate class with imageSelection method,
    // imageSelection should be done with POST request where ID of image
    // is uploaded to the database, then via specific method its taken
    // from the database and used here as comparison

    // constructor that takes in getSelectedImageID
    @Override
    public void validateSelection() {
         // pseudocode:
        // if (imageSelectionID.equals(targetImagesID))
        //    correctSelectionCount++;

        // in Vue image component there should be a method
        // that will activate onClick called validateSelection
        //
        SpeedrunRoundDAO selection = new SpeedrunRoundDAO();
        selection.createCorrectSelectionCount();
    }
}
