package lesson_36;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class XmlApp {
    public static final String RESOURCE = "src/lesson_36/resource/";
    public static final Path PATH = Paths.get(RESOURCE + "person.txt");
    public static void main(String[] args) {
        Person person = new Person("Bob", "Doe", 35);

        String xmlPerson = "";

        try {
            XmlMapper xmlMapper = new XmlMapper();
            xmlPerson = xmlMapper.writeValueAsString(person);
            System.out.println(xmlPerson);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        System.out.println(person);

        try {
            Files.writeString(PATH, xmlPerson);
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            String string = Files.readString(PATH);
            System.out.println(string);
            List<String> strings = Files.readAllLines(PATH);
            System.out.println(strings);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
