package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CentipedeGame extends Application {
    @Override
    public void start(Stage stage) {
        Pane root = new Pane(); // Main container
        Scene scene = new Scene(root, 800, 600); // Set width and height
        stage.setTitle("Centipede Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
