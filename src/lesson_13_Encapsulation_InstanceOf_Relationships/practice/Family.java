package lesson_13_Encapsulation_InstanceOf_Relationships.practice;

public class Family {
    private Human mother;

    private Human father;

    private Human [] children;

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getMypet() {
        return mypet;
    }

    public void setMypet(Pet mypet) {
        this.mypet = mypet;
    }

    private Pet mypet;




}
