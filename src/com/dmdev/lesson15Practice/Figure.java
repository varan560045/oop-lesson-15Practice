package com.dmdev.lesson15Practice;

public abstract class Figure {
    private String name;
    private int area;

    public Figure(String name) {
        this.name = name;
    }

    public abstract boolean isAreasEqual(Figure figure);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }
}
