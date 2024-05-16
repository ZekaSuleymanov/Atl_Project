package Lesson_17;

import java.util.Arrays;
import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Array count:");
        int size = scanner.nextInt(); //

        int[] array = new int[size];

        System.out.println("Array element include:");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ".ci");
            array[i] = scanner.nextInt();
        }

        // Dizi elemanlarını ekrana yazdırma
        System.out.println("Array elments:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1]) {
                count++;
            }
        }

        System.out.println("count: " + count);
    }
}
