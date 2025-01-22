package main;

import ui.GameScene;
import entities.*;

public class InputHandler {
    public void attachToScene(GameScene scene) {
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case LEFT -> player.moveLeft();
                case RIGHT -> player.moveRight();
                case SPACE -> player.shoot();
            }
        });
    }
}
