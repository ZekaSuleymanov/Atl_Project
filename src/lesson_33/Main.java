package lesson_33;

import java.io.*;

public class Main {
    public static final String RESOURCE = "src/lesson_33/resource/";

    public static void main(String[] args){

        File file = new File(RESOURCE + "text.txt");
        try {
             FileWriter fw = new FileWriter(file);
             BufferedWriter bw = new BufferedWriter(fw);
             bw.write("Hello World!");
             bw.close();
             fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        try {
            FileReader fr =  new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
