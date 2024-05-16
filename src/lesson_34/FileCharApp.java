package lesson_34;

import java.io.*;
import java.util.Arrays;

public class FileCharApp {

    public static final String RESOURCE = "src/lesson_34/resource/";
    public static void main(String[] args) throws IOException {
        // Person person = new Person("A","B");

        try {
            // BufferedOutputStream - Zəkanı çevirir rəqəmlərə arxa fonda
            FileOutputStream fos = new FileOutputStream(RESOURCE + "a.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Zəka".getBytes());
            bos.close();
            fos.close();
        }catch (IOException e){
            e.getMessage();
        }


        // BufferedInputStream - bayaq çevrilən rəqəmləri hərfə çevirir mənə qaytarır
        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "a.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
        }catch (IOException e){
            e.getMessage();
        }
    }
}
