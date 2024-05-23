package lesson_39;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] student = {
                new Student(1,23,"Jason"),
                new Student(2,20,"Chris"),
                new Student(3,19,"Ryan")};

        System.out.println(Arrays.toString(student));
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));


        System.out.println("******************************");
        Arrays.sort(student, new StudentNameDescComparator());
        System.out.println(Arrays.toString(student));

        System.out.println("*************************");
        Arrays.sort(student, Comparator.comparingInt(Student::getAge));
        System.out.println(Arrays.toString(student));
    }
}
