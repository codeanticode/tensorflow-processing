package ml.model.ObjectDetector;

import processing.core.PVector;

public class DetectedObjectDJL {
    private String name;
    private float probability, width, height;
    private PVector upperLeft;

    public DetectedObjectDJL(String name, float probability, PVector upperLeft, float width, float height) {
        this.name = name;
        this.probability = probability;
        this.upperLeft = upperLeft; // value scaled from 0 to 1
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public float getProbability() {
        return this.probability;
    }

    public PVector getUpperLeft() {
        return this.upperLeft;
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }
}