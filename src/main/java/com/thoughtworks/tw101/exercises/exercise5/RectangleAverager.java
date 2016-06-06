package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float avg = 0;
        for (Rectangle r: rectangles) {
            avg += r.area();
        }
        return avg/rectangles.length;
    }
}
