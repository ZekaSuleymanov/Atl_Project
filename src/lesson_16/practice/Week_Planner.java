package lesson_16.practice;

import java.util.Scanner;

public class Week_Planner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] scedule = new String[7][2];

        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to course";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "go to film watch";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "play footbal";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "walking";
        scedule[5][0] = "Friday";
        scedule[5][1] = "boxing";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "sleeping";


        String days = sc.next();

        String upperCaseDays = days.toUpperCase();
        String lowerCaseDays = days.toLowerCase();

// scedule dizisini kontrol eden
        for (int i = 0; i < scedule.length; i++) {
            // scedule dizisinin i. satırının 0. sütunundaki değeri
            String dayInSchedule = scedule[i][0];

            // Eğer days değişkeni ile scedule dizisinin i. satırındaki değer eşleşirse
            if (dayInSchedule.equalsIgnoreCase(upperCaseDays) || dayInSchedule.equalsIgnoreCase(lowerCaseDays) ) {
                // İlgili saat bilgisini yazdır
                System.out.println(scedule[i][1]);
                // Eşleşme bulunduğu için döngüyü sonlandır
                break;
            }
        }





//        for (int i = 0; i < scedule.length; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.println(scedule[j][i]);
//            }
//        }
    }
}
