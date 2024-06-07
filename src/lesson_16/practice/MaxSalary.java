package lesson_16.practice;

import java.util.Scanner;

public class MaxSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maxSalary = -1; // -1 bizim salary ola bilməz
        double salary;


        while (sc.hasNext()){
           salary = sc.nextDouble();
           if (maxSalary < salary)
               maxSalary = salary;
        }
        System.out.printf("%2f", maxSalary);
    }
}
