package com.thoughtworks;

public
class Square implements IShapes{
    private int side;

    public
    Square(int side) {
        this.side = side;
    }

    public
    int area() {
        return side * side;
    }

    public
    int perimeter() {
        return 4 * side;
    }
}
