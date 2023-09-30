package com.dmdev.lesson15Practice;

public class Parallelogram extends Figure implements CalculatingPerimeter, CalculatingArea {
    private int width;
    private int height;
    private int slantedLine;
    private int area;

    public Parallelogram(String name, int width, int height, int slantedLine) {
        super(name);
        this.width = width;
        this.height = height;
        this.slantedLine = slantedLine;
        area = areaCalculate();
    }

    @Override
    public int areaCalculate() {
        return width * height;
    }

    @Override
    public void perimeter() {
        System.out.println("Периметр " + getName() + "а:" + 2 * (width + slantedLine));
        System.out.println();
    }

    @Override
    public boolean isAreasEqual(Figure figure) {
        if (this == figure) return true;
        if (figure == null) return false;
        return area == figure.getArea();
    }

    public String toString() {
        return "Параллелограмм{ ширина = " + width + ", наклонная сторона = " + slantedLine + ", высота = " + height + " }";
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSlantedLine() {
        return slantedLine;
    }

    public int getArea() {
        return area;
    }
}
