import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;

import javafx.application.Platform;

import javafx.scene.layout.BorderPane;

import javafx.scene.layout.HBox;

import javafx.scene.control.Button;

public class Main extends Application {

public void start(Stage stage) {

    Button quitButton = new Button("Quit");

    quitButton.setOnAction(e -> Platform.exit());

    HBox buttonBar = new HBox(quitButton);

    BorderPane root = new BorderPane();

    root.setBottom(buttonBar);

    Scene scene = new Scene(root, 100, 50);

    stage.setScene(scene);

    stage.show();

}

public static void main(String[] args) {

    launch(args);

}

}
