package com.javaBrain.Annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

    private Point center;

    public Point getCenter() {
        return center;
    }

    @Autowired
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Center : ");
        System.out.println("Center ("+ this.center.getX() + ", "+this.center.getY()+ " )");
    }
}
