package lesson_13_Encapsulation_InstanceOf_Relationships.practice;

public class HappyFamily {
    public static void main(String[] args) {
        Pet dog = new Pet("Fluffy", "Tom", 8, 25, new String[]{"swimming", "playing", "running"});
        Human mother = new Human("Mother", "Doe", 60);
        Human father = new Human("Father", "Doe", 65);
        Human person = new Human("John", "Doe", 42, 75, dog,
                mother, father);

        System.out.println(dog);
        dog.eat();
        dog.respond();
        dog.foul();

        System.out.println(person);
        person.greetPet();
        person.describePet();
    }
}
