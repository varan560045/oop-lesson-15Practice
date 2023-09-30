package com.dmdev.lesson15Practice;

public class FigureRunner {
    public static void main(String[] args) {
        Square square = new Square("Квадрат", 2);
        System.out.println(square.getName());
        square.areaCalculate();
        square.perimeter();
        Rectangle rectangle = new Rectangle("Прямоугольник", 2, 5);
        System.out.println(rectangle.isAreasEqual(square));
        System.out.println(rectangle.getName());
        rectangle.areaCalculate();
        rectangle.perimeter();
        Parallelogram parallelogram = new Parallelogram("Параллелограмм", 10, 4, 6);
        System.out.println(parallelogram.getName());
        parallelogram.areaCalculate();
        parallelogram.perimeter();
        System.out.println(ShapeUtils.isRectangle(parallelogram));
        System.out.println(ShapeUtils.isParallelogram(square));
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
        System.out.println(parallelogram.toString());

    }
}
