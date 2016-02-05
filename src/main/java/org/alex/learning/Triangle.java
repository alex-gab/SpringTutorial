package org.alex.learning;

import java.util.List;

public final class Triangle {
    private final List<Point> points;

    public Triangle(final List<Point> points) {
        this.points = points;
    }

    public final void draw() {
        System.out.printf("Triangle drawn: %s.\n", points.toString());
    }
}
