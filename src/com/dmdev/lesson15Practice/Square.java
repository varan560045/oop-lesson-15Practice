package com.dmdev.lesson15Practice;

public class Square extends Figure implements CalculatingPerimeter, CalculatingArea {
    private int side;
    private final int area;

    public Square(String name, int side) {
        super(name);
        this.side = side;
        this.area = areaCalculate();
    }

    @Override
    public int areaCalculate() {
        return side * side;
    }

    @Override
    public void perimeter() {
        System.out.println("Периметр " + getName() + "а: " + 4 * side);
        System.out.println();
    }

    @Override
    public boolean isAreasEqual(Figure figure) {
        if (this == figure) return true;
        if (figure == null) return false;
        return area == figure.getArea();
    }

    public String toString() {
        return "Квадрат{ сторона = " + side + " }";
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return area;
    }

}
