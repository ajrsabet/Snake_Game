package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.GameScene;

public class SnakeGame extends Application {
    @Override
    public void start(Stage stage) {
        GameScene gameScene = new GameScene(); // Main container
        Scene scene = new Scene(gameScene.getRoot(), 800, 600); // Set width and height
        stage.setTitle("Centipede Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
