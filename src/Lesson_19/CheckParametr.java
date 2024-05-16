package Lesson_19;

import java.util.*;

public class CheckParametr {
    public static String scanNumberInArray(Collection<Integer> array, int number){
        return array.contains(number) ? "yes" : "no";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberToCheck;
        Set<Integer> numberSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        numberToCheck = sc.nextInt();
        System.out.println("Is " + numberToCheck + " in the Set? " + scanNumberInArray(numberSet, numberToCheck));


        List<Integer> numberList = Arrays.asList(6, 7, 8, 9, 10);
        numberToCheck = sc.nextInt();
        System.out.println("Is " + numberToCheck + " in the List? " + scanNumberInArray(numberList, numberToCheck));


    }
}

/*
    Metoda List gəlcəək.  Həm hashset həmdə listdə gəlib yopxlayaacaq
 */