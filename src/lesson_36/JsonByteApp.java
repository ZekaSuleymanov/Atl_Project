package lesson_36;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JsonByteApp {
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
            Files.writeString(PATH, personJava);
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            List<String> strings = Files.readAllLines(PATH);
            System.out.println(strings);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
