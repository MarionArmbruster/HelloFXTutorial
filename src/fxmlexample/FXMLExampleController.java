/*********************************************************
 *Controller.java file                                   *
 *                                                       *
 *                                                       *
 *********************************************************/

package fxmlexample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class FXMLExampleController {

  @FXML
  private Text actionTarget;

  // method that is supposed to handle and control what happens when the button is pressed
  // however, unable to complete method call and "unused method" results
  @FXML
  protected void handleSubmitButtonAction(ActionEvent event) {
    actionTarget.setText("Sign in button pressed");
  }

}