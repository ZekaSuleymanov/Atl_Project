package lesson_12_Inheritance;

public class Animal {

    protected String name;

    protected void eat(){
        System.out.println("I can eat 1kg meat");
    }

    public Animal(String name) {
        this.name = name;
    }
}


