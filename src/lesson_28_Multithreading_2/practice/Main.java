package lesson_28_Multithreading_2.practice;

import lesson_28_Multithreading_2.practice.Quadrilateral;
import lesson_28_Multithreading_2.practice.Shape;
import lesson_28_Multithreading_2.practice.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quadrilateral quadrilateral = new Quadrilateral(5, 8);

        Triangle triangle = new Triangle(6, 8, 2);

        ArrayList<Shape> shapes = new  ArrayList<>();
        shapes.add(quadrilateral);
        shapes.add(triangle);

        shapes.forEach(x -> {
            System.out.println(x.area());
            System.out.println(x.perimetr());
        });
    }
}
