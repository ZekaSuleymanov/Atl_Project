package lesson_28_Multithreading_2.practice;

import java.util.Objects;

public class Quadrilateral implements Shape {

    private int a;

    private int b;


    public Quadrilateral(int a, int b) {
        this.a = a;
        this.b = b;
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
        Quadrilateral that = (Quadrilateral) o;
        return a == that.a && b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public void setB(int b) {
        this.b = b;
    }


    @Override
    public int area() {
        return a * b;
    }

    @Override
    public int perimetr() {
        return a + b;
    }
}
