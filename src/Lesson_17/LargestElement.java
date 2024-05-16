package Lesson_17;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        int biggestNumber = 0;
        int row = 0;

        for (int i = 0; i < size; i++) {
            int arrayElement = sc.nextInt();
            array[i] = arrayElement;
            if (biggestNumber < arrayElement){
                biggestNumber = arrayElement;
                row = i + 1;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Böyük olan birinci rəqəm: " + biggestNumber + " " + "Birinci böyük rəqəmin indeksi: " + row);
    }
}
