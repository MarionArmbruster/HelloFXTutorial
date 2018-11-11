/*********************************************************
 *Controller.java file                                   *
 *                                                       *
 * File: FXMLExampleController.java                      *
 * Author: Marion Armbruster                             *
 * Date: 12 September 2018                               *
 *                                                       *
 * The control of the FXMLExample program.               *
 *********************************************************/

package fxmlexample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FXMLExampleController {

  @FXML
  private Text actionTarget;

  // A method that handles and controls what happens when the button is pressed
  @FXML
  protected void handleSubmitButtonAction(ActionEvent event) {
    actionTarget.setText("Sign in button pressed");
  }

}