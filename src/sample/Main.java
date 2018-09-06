package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }// end main method

  // creates a blank windows with a title name in the title-bar
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("JavaFX Welcome");

    // accesses and customizes what goes in the "primary stage", the new blank window
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    // order of padding is top, right, bottom, left
    grid.setPadding(new Insets(25, 25, 25, 25));

    // make the button and set position, etc
    Button btn = new Button("Sign in");
    HBox hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hbBtn.getChildren().add(btn);
    grid.add(hbBtn, 1, 4);

    final Text actionTarget = new Text();
    grid.add(actionTarget, 1, 6);

    // makes the button action/event
    btn.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent e) {
        actionTarget.setFill(Color.FIREBRICK);
        actionTarget.setText("Sign in button pressed!");
      }
    });

    // title inside window with font specifications;
    Text sceneTitle = new Text("Welcome");
    sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    grid.add(sceneTitle, 0, 0, 2, 1); // column, row, column span, row span

    // creates label for an input box
    Label userName = new Label("User Name:");
    grid.add(userName, 0, 1);

    // creates the actual input box
    TextField userTextField = new TextField();
    grid.add(userTextField, 1, 1);

    // creates label for another input box
    Label passW = new Label("Password:");
    grid.add(passW, 0, 2);

    // creates another input box
    PasswordField pwBox = new PasswordField();
    grid.add(pwBox, 1, 2);

    // shows all grid lines
    //grid.setGridLinesVisible(true);

    // sets the scene; class Scene, and object scene; each "scene" can be different
    Scene scene = new Scene(grid, 300, 275);
    primaryStage.setScene(scene);

    // calls and makes the window actually appear
    primaryStage.show();
  }// end javaFX "start" method


  // the start function for javaFX that was for the 1st section; old stuff
  /*@Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Hello World!");
    Button btn = new Button();
    btn.setText("Say 'Hello World'");
    btn.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        System.out.println("Hello World!");
      }
    });
    // needs import scene.layout.StackPane
    StackPane root = new StackPane();
    root.getChildren().add(btn);
    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }*/
}


