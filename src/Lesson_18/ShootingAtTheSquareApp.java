package Lesson_18;

public class ShootingAtTheSquareApp {
    public static void main(String[] args) {
        String [][] arr = new String[5][5];

        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " | ");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + " | 0");
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " | ");
            }
            System.out.println();
        }
    }

}


/*
    Exercise link
    https://github.com/ilgarmustafayev22/java-atl-dma-1-courses/tree/main/src/main/java/az/atlacademy/module01/lesson18
 */
