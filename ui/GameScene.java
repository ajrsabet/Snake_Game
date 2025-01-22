package ui;

import javafx.scene.layout.Pane;

public class GameScene {
    private Pane root;

    public GameScene() {
        root = new Pane();
        // Initialize game elements and add them to the root pane
    }

    public Pane getRoot() {
        return root;
    }
}