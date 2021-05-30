package com.javaBrain.springObjectInjection;

public class Circle implements Shape{

    private Point center;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Center : ");
        System.out.println("Center ("+ this.center.getX() + ", "+this.center.getY()+ " )");
    }
}
