package lesson_12_Inheritance_OOP_principles;

public class Animal {

    protected String name;

    protected void eat(){
        System.out.println("I can eat 1kg meat");
    }

    public Animal(String name) {
        this.name = name;
    }
}


