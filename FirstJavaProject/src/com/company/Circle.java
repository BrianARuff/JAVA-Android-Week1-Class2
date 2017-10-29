package com.company;

public class Circle extends GraphicObject {

    @Override
    GraphicObject draw() {
        return null;
    }

    @Override
    GraphicObject draw(double x, double y) {
        return null;
    }

    @Override
    void resize(double factorX, double factorY) {
        this.x = this.x * factorX;
        this.y = this.y * factorY;
    }
}
