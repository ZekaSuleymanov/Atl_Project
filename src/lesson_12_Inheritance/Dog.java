package lesson_12_Inheritance;

public class Dog extends Animal{

    public Dog(String name) { // name olmadan onun constructorunu yaradıram
        super(name);
    }

    public void display(){
        System.out.println("My name is " + name);
    }
}
