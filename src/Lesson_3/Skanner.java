package Lesson_3;

public class Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int divider = num/100;
        int residue = num%10;

        if (divider > residue){
            System.out.println(divider);
        } else if (residue > divider) {
            System.out.println(residue);
        } else {
            System.out.println("=");
        }

    }
}
