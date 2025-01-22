package entities;

import java.util.LinkedList;

public class Snake {
    private LinkedList<Segment> segments;

    public Snake(int length) {
        segments = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            segments.add(new Segment(100 + i * 20, 100)); // Adjust starting possition
        }
    }

    // get segments

    // move forward
    public void move(int dx, int dy) {

    }

    // move left
    public void moveLeft() {

    }

    // move right
    public void moveRight() {

    }

    // grow
}
