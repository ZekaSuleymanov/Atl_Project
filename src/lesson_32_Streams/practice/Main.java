package lesson_32_Streams.practice;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Human human = new Human("Zəka", "Süleymanov",14);


        Object age;
        Field fields = human.getClass().getDeclaredField("age");
        fields.setAccessible(true);
        fields.set(human, 24);
        System.out.println(human.getAge());




    }
}
