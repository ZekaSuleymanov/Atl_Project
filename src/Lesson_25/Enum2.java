package Lesson_25;

public class Enum2 {
    public static void main(String[] args) {
        Operation sum = Operation.Sum;

        System.out.println(sum);
        System.out.println(sum.toString());
        System.out.println(sum.ordinal());
        System.out.println(sum.name());
        System.out.println(sum.getC());

    }
}

