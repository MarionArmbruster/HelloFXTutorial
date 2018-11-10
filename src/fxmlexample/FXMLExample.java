 /***************************************************
 * File: FXMLExample.java                           *
 * Author: Marion Armbruster                        *
 * Date: 30 August 2018                             *
 *                                                  *
 * The beginning of any JavaFX program starts here  *
 * with setting up the stage and the scene.          *
 ****************************************************/

package fxmlexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXMLExample extends Application {

  // creates a blank windows with a title name in the title-bar - uses .css, Controller, and .fxml
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));

    // sets the scene; class Scene, and object scene; each "scene" can be different
    Scene scene = new Scene(root, 300, 275);

    primaryStage.setTitle("FXML Welcome");
    primaryStage.setScene(scene);

    // call to show function - makes the window actually appear
    primaryStage.show();

  }// end javaFX "start" method

  public static void main(String[] args) {
    launch(args);
  }// end main method

}

