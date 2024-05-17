package lesson_38;

import java.util.*;
import java.util.function.BiFunction;

public class HashMap02App {
    public static void main(String[] args) {

        final String world = "Azerbaijan";
        char[] chars = world.toCharArray();

        Map<Character, Integer> hasMap = new HashMap<>();
        for(char c: chars){
            Map<Character, Integer> hashMap = new HashMap<>();

                hasMap.merge(c, 1, Integer::sum);
        }
        System.out.println(hasMap);
    }
}
