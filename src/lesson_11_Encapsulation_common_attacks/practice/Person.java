package lesson_11_Encapsulation_common_attacks.practice;

public class Person {
     private int age;

     private int length;




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 2){
            this.length = length - age;
        }
    }
}
