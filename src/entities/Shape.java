package entities;

import entities.enums.Color;

public abstract class Shape {

    private final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract Double area();
}
