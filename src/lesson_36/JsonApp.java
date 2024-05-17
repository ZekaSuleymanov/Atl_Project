package lesson_36;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.source.tree.NewArrayTree;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonApp {

    public static final String RESOURCE = "src/lesson_36/resource/";
    public static final Path PATH = Paths.get(RESOURCE + "person.txt");
    public static void main(String[] args) {
        Person person = new Person("Bob", "Doe", 35);

        String personJava = "";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            personJava = objectMapper.writeValueAsString(person);
        }
        catch (JsonProcessingException e){
            e.printStackTrace();
        }
        System.out.println(personJava);

        try {
            Files.write(PATH, personJava.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            byte[] strings = Files.readAllBytes(PATH);
            System.out.println(Arrays.toString(strings));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
