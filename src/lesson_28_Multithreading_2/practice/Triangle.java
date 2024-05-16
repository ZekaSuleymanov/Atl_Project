package lesson_28_Multithreading_2.practice;

import java.util.Objects;

public class Triangle implements Shape {

    private int a;

    private int b;

    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public int area() {
        return (a + b + c)/2;
    }

    @Override
    public int perimetr() {
        return a + b +c;
    }
}
