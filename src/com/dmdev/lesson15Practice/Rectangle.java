package com.dmdev.lesson15Practice;

public class Rectangle extends Figure implements CalculatingPerimeter, CalculatingArea {
    private int sideA;
    private int sideB;
    private int area;

    public Rectangle(String name, int sideA, int sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        area = areaCalculate();
    }

    @Override
    public int areaCalculate() {
        return sideA * sideB;
    }

    @Override
    public void perimeter() {
        System.out.println("Периметр " + getName() + "а: " + 2 * (sideA + sideB));
        System.out.println();
    }

    public String toString() {
        return "Прямоугольник{" +
                " сторона А = " + sideA +
                ", сторона В = " + sideB +
                "}";
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getArea() {
        return area;
    }

    @Override
    public boolean isAreasEqual(Figure figure) {
        if (this == figure) return true;
        if (figure == null) return false;
        return area == figure.getArea();
    }
}
