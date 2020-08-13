package entities;

import entities.enums.Color;

public class Circle extends Shape {

    private final Double radius;

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }
}
