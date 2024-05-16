package lesson_11_Encapsulation_common_attacks.practice;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(4);
        System.out.println(person.getAge());


        person.setLength(5);
        System.out.println(person.getLength());
    }
}
