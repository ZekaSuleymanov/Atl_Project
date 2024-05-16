package lesson_8_Method_Object_Constructor;

import java.security.PublicKey;
import java.util.Objects;

public class Tree {
    String type;
    int height;

    public Tree(){
        // type = "ananas";
        // height = 15;
    }

    // Nümunə 7
    public Tree(String type, int height){
        this.type = type;
        this.height = height;
    }

    // Nümunə 8
    // Nümunə 8.1
    public Tree(String type){ // type dəyişmək istəsəm buna müraciət edirəm. height standart olaraq yazıram, type dəyişirəm
        this(type, 1);
        // Ehtiyac yoxdue
        // type = type;
        // height = 1;
    }

    // Nümunə 8.1
    public Tree(int height){  // height dəyişmək istəyirəmsə buna müraciət edirəm. Type standart olaraq yazıram height dəyişirəm
        this("pear",height);
        //Ehtiyac yoxdur
        // type = "pine";
        // height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return height == tree.height && Objects.equals(type, tree.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, height);

    }
}
