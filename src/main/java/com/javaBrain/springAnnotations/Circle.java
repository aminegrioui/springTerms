package com.javaBrain.springAnnotations;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component
public class Circle implements Shape{
    private Point center;

    public Point getCenter() {
        return center;
    }


    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Center : ");
        System.out.println("Center ("+ this.center.getX() + ", "+this.center.getY()+ " )");
    }
}
