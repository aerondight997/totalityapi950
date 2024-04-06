package com.totalityapi.totalityapi950.versus;

import com.totalityapi.totalityapi950.interfaces.ValidationInterface;

public class VersusValidationService implements ValidationInterface {
    @Override
    public void validateSelection() {
        // inject this method into displayOpponentSelection()
    }

    public void displayOpponentSelection() {
        // experimental method that will be a hook on frontend
        // grabs the opposing players selection and displays it
        // to the player, should implement websocket connection
        // probably just for this

        // THIS SHOOULD BE USED WITHING VALIDATE SELECTION
        // TO RETURN A SPECIFIC MESSAGE THAT CAUSES
        // OPPOSING PLAYER TO SEE CORRECT SELECTION OF A PLAYER
    }
}
