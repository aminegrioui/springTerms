package com.javaBrain.springObjectInjection;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

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

    @PostConstruct
    public void initializeCircle(){
        System.out.println("Init of Circle ");
    }

    @PreDestroy
    public void destroyCircle(){
        System.out.println("Destroy of Circle");
    }
}
