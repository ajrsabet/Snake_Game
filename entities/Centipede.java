package entities;

import java.util.LinkedList;

public class Centipede {
    private LinkedList<Segment> segments;

    public Centipede(int length) {
        segments = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            segments.add(new Segment(100 + i * 20, 100)); // Adjust starting possition
        }
    }
}
