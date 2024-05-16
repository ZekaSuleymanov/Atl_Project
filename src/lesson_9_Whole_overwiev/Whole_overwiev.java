package lesson_9_Whole_overwiev;

public class Whole_overwiev {
    public static void main(String[] args) {

        int a = 5;

        int b = 7;

        int c = 2;

        int d = 3;

        if (b > a || c == d) {
            System.out.println("duz");
        }else {
            System.out.println("yalnis");
        }
    }
}


/*
        JDK - Bütün developmen toolları, JRİ, compailer, heap, debugger və.s
        JRI - içində kitabxanalar - Java APİ
        JVM - Virtual Maşın - Java İnterpreter





        +---------------------------------------+
        |               Java Code               |
        +---------------------------------------+
                            |
                            v
        +---------------------------------------+
        |               Compilation             |
        +---------------------------------------+
                            |
                            v
        +---------------------------------------+
        |             Java Bytecode             |
        +---------------------------------------+
                            |
                            v
    +-----------+   +------------------------+
    |   JDK     |   |        JRİ             |
    |(Development|   |(Runtime Environment)   |
    |   Kit)    |   |                        |
    +-----------+   +------------------------+
                            |
                            v
                +-----------------------+
                |       JVM             |
                |(Java Virtual Machine) |
                +-----------------------+
                            |
                            v
                +-----------------------+
                |    Hardware & OS      |
                +-----------------------+


      & - Bütün operatorları yoxlayır (hər ikisini). Sonra binary'dir deyir.


 */