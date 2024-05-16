package Lesson_13;

public class Human extends Object{
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.getNickname() + "!");
        } else {
            System.out.println("I don't have a pet.");
        }
    }

    public void describePet() {
        if (pet != null) {
            String slyLevel = (pet.getTrickLevel() > 50) ? "very sly" : "almost not sly";
            System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old, he is " +
                    slyLevel + ".");
        } else {
            System.out.println("I don't have a pet.");
        }
    }

    @Override
    public String toString() {
        String petString = (pet != null) ? pet.toString() : "null";
        String motherName = (mother != null) ? mother.getName() + " " + mother.getSurname() : "null";
        String fatherName = (father != null) ? father.getName() + " " + father.getSurname() : "null";
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", mother=" +
                motherName + ", father=" + fatherName + ", pet=" + petString + "}";
    }
}
