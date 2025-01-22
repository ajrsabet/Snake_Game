package main;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class GameLoop {
    private Timeline timeline;

    public GameLoop(Runnable updater) {
        timeline = new Timeline(new KeyFrame(Duration.millis(16), e -> updater.run()));
        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    public void start() {
        timeline.play();
    }

    public void stop() {
        timeline.stop();
    }
}
