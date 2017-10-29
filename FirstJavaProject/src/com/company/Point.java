package com.company;

public class Point implements Drawable {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double getDistanceFromOrigin(Point p){
        return Math.sqrt(p.getX()*p.getX()+p.getY()*p.getY());
    }

    @Override
    public void draw(int color) {
        
    }

    @Override
    public void setPosition(double x, double y) {

    }
}
