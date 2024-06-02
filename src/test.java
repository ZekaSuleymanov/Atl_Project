import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);

        ArrayList<Integer> b = a;
        b.add(6);
        System.out.println("a= " + a + ", b=  " + b);


    }
}
