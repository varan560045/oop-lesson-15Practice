package com.dmdev.lesson15Practice;

public class ShapeUtils {
    public static boolean isParallelogram(Figure figure) {
        return figure instanceof Parallelogram;
    }

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }
}
