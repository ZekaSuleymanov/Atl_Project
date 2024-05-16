package lesson_35;

import java.io.*;
import java.util.List;

public class FileObjApp {

    public static final String RESOURCE = "src/lesson_35/resource/person.ser/";

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 43);

        try (FileOutputStream fos = new FileOutputStream(RESOURCE + "person.ser");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)){
            oos.writeObject(person);
        } catch (IOException e) {
            e.getMessage();
        }

        try (FileInputStream fis = new FileInputStream(RESOURCE + "person.ser");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis)) {
           Object object = ois.readObject();
           if (object instanceof Person){
               System.out.println(object);
           }
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }


    }

}
