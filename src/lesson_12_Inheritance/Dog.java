package lesson_12_Inheritance;

public class Dog extends Animal{

    public Dog(String name) { // name olmadan onun constructorunu yaradıram
        super(name);
    }

    // Nümunə 5
    @Override
    protected void eat() {
        System.out.println("A can eat 2kg in one day");
        super.eat();
    }

    public void display(){
        System.out.println("My name is " + name);
    }
}
