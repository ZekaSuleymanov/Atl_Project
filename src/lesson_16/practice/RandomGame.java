package lesson_16.practice;

import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100);
        System.out.println(randomNum);

        Scanner sc = new Scanner(System.in);

        System.out.println("Adınızı daxil edin: ");
        String name = sc.nextLine();

        System.out.println("Ədədi daxil edin");




        while (true){
            int num = sc.nextInt();
            if (num == randomNum){
                System.out.println("Təbriklər!!! Gizli ədədi tapdınız");
                break;
            }else if (num < randomNum){
                System.out.println("Təəssüfki ədənin gizli ədəddən kiçikdir");
            }else {
                System.out.println("Təəssüfki ədədin gizli ədəddən böyükdür");
            }
        }

    }
}
