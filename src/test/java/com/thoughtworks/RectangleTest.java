package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public
class RectangleTest {

    @Test
    void shouldReturnAreaWhenRectangleHasGivenLengthAndBreadth() {
        Rectangle rectangle = new Rectangle(5, 4);
        int result = rectangle.area();
        assertEquals(20, result);
    }

    @Test
    void shouldReturnPerimeterWhenRectangleHasGivenLengthAndBreadth() {
        Rectangle rectangle = new Rectangle(5, 4);
        int result = rectangle.perimeter();
        assertEquals(18, result);
    }

    @Test
    void shouldReturnAreaOfSquareWhenSquareHasGivenSide() {
        Square square = new Square(5);
        int result = square.area();
        assertEquals(25, result);
    }

    @Test
    void shouldReturnPerimeterOfSquareWhenSquareHasGivenSide() {
        Square square = new Square(5);
        int result = square.perimeter();
        assertEquals(20, result);
    }

}
