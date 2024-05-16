package lesson_32_Streams;

public class Input_Output_Streams {
    public static void main(String[] args) {
        System.out.print("salam");
        System.out.print(" eleykim");

        int a = 10000;

        System.out.printf("%, d%n", a);


        double b = 3.14159265359;

        System.out.printf("%f\n", b);
        System.out.printf("%5.4f\n", b);
        System.out.printf("5.2f\n", b);

        int a1 = 10;
        Boolean b1 = true, c = false;

        Integer d = null;

        System.out.printf("%b\n", a1);
        System.out.printf("%B\n", b1);
        System.out.printf("%b\n", c);
        System.out.printf("%B\n", d);

        char c1 = 'g';

        System.out.printf("%c\n", c1);

        System.out.printf("%C\n", c1);
    }
}



/*
             Java istifadəçiyə giriş çıxış əməliiyatlarını yerinə yetirməyə kömək edən I/O paketi tanımlayır. BU I/O paketi
        içində müxtəlif Streamlər (axınlar) var. Bu Streamlar I/O əməliyyatlarını tam yerinə yetirmək üçün bütün növ
        obyektləri, məlumat növlərini, simvolları, faylları və.s dəstəkləyir


                Inputstream                    Outputstream
        SOURCE  ------------> Java Application ------------> Destination
                    READ                           WRITE

        Mənbədən input edirik java application içinə (nəyisə gətiririk). Bu READ adlanır
        Və sonra java applicationdan output edirik. Bu WRİTE adlanır



                        System.in
                           |
                           |     keyboard
                           ^
                        Program
                           |
                  screen   |    screen
   System.out <------------|-------------> System.err

            Standart I/O Streams in Java


   3 fərqli Streamlər var


   1) System.in - // input  // sistemə istifadəçi tərəfindən nəyisə daxil etmək. Yəni Klavyaturadan yada hər hansı digər
   standart daxiletmə qurğusundan simvolları oxumaq üçün istifadə edilən standart giriş axınıdır. (input streams)

   2) System.out - // output // komputer ekranı kimi çıxış cihazında proqramın nəticəsini yaratmaq üçün istifadə edilən
   standart çıxış axınıdır. Burda ifadələri çıxarmaq üçün istifadə etdiyimiz müxtəlif çap funksiyalarının siyahısı verilmişdir

   * print() - bir sətirdə çıxardır. Mütləq argument (parametr, dəyər) Olmalıdır !!! Nəsə ötürməliyəm içinə
   * println() - hər birini yeni sətirdə verir. Argumentsizdə (parametr, dəyər) çalışır
   * printf() - yazılış formatıdır. Datadan aldığımız məlumatların içində dəyişiklik etmək üçündür. Format specifiers'ları
   istifadə edir

        * For Number Formating
        * Formatting Decimal Numbers
        * For Boolean Formatting
        * For String Formatting
        * For Char Formatting
        * For Date and Time Formatting

   3) System.err -

 */