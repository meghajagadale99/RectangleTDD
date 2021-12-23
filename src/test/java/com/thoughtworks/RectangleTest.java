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
}
