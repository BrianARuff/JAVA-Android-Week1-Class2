package com.company;

public abstract class GraphicObject {
    double x,y;

    void moveTwo(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }

    abstract GraphicObject draw();

    abstract GraphicObject draw(double x, double y);

    abstract void resize(double factorX, double factorY);

}
