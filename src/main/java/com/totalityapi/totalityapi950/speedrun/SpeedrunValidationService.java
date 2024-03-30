package com.totalityapi.totalityapi950.speedrun;

import com.totalityapi.totalityapi950.interfaces.ValidationInterface;

public class SpeedrunValidationService implements ValidationInterface {
    // instantiate class with imageSelection method,
    // imageSelection should be done with POST request where ID of image
    // is uploaded to the database, then via specific method its taken
    // from the database and used here as comparison
    // after calls are done, increase correct or incorrect selection count
    // and return it to client, based on result turn style of component
    // into green or red
    // example
    // incorrectSelectionCount = validation.updateIncorrectSelectionCoutn()
    // return incorrectSelectionCount

    // constructor that takes in getSelectedImageID
    @Override
    public void validateSelection() {
         // pseudocode:
        // if (imageSelectionID.equals(targetImagesID))
        //    updatecorrectSelectionCount;
        //    return selection.updateCorrectSelection();
        //
        //

        // in Vue image component there should be a method
        // that will activate onClick called validateSelection
        //
    }
}
