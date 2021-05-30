package com.javaBrain.springObjectInjection;

public class Traingle implements  Shape{

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println("Drawing traingle : ");
        System.out.println("PointA ("+ this.pointA.getX() + ", "+this.getPointA().getY()+ " )");
        System.out.println("PointB ("+ this.pointB.getX() + ", "+this.getPointB().getY()+ " )");
        System.out.println("PointC ("+ this.pointC.getX() + ", "+this.getPointC().getY()+ " )");
    }
}
