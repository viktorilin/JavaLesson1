package com.softserve.vilin;

public class Envelope {
    private double length;
    private double width;

    public Envelope(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Envelope{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}