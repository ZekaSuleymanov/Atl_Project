package Lesson_23.Practice;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] arrNumber = {5, 2, 8, 4, 3};

        int temp;
        for (int i = 0; i < arrNumber.length-1; i++) {
            for (int j = 0; j < arrNumber.length - i - 1; j++) {
                if (arrNumber[j] > arrNumber[j + 1]){
                    temp = arrNumber[j];
                    arrNumber[j] = arrNumber[j + 1];
                    arrNumber[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(arrNumber));
        }
    }
}
