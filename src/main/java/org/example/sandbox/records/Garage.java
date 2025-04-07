package org.example.sandbox.records;

public record Garage(double length, double width, double height) {

    public Garage {
        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive");
        }
    }

    public double volume() {
        return length * width * height;
    }


}
