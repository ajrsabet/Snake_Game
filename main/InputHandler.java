package main;

import ui.GameScene;
import entities.Snake;

public class InputHandler {
    public void attachToScene(GameScene scene) {
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case LEFT -> Snake.moveLeft();
                case RIGHT -> Snake.moveRight();
            }
        });
    }
}
