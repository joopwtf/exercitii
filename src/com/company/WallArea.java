package com.company;

public class WallArea {
    private double width;
    private double height;

    public WallArea(double width, double height) {
        this.width = width < 0 ? 0 : width; //tenary operator if (width < 0) {this.width = 0; } else {this.width = width; }
        this.height = height < 0 ? 0 : height;
    }

    public WallArea() {
        this(0, 0);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public double getArea() {
        return width * height;
    }
}