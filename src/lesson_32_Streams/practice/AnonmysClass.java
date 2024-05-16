package lesson_32_Streams.practice;

import java.util.function.BiFunction;

public class AnonmysClass {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> biFunction = new BiFunction<>() {
            @Override
            public String apply(Integer integer, Integer integer2) {
                return integer + " " + integer;
            }
        };
    }
}
