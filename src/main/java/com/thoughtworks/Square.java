package com.thoughtworks;

public
class Square {
    private int side;

    public
    Square(int side) {
        this.side = side;
    }

    public
    int area() {
        return side * side;
    }
}
