package Lesson_26;

public class Exception_3 extends RuntimeException{
    public static void main(String[] args) throws Exception {

        // Nümunə 1

/*      throw new Exception(); // super vasitəsi ilə daxilinə mesaj yazmaq olur
        throw new Exception("Salam mən Exceptionam");
        throw new RuntimeException();
        throw new RuntimeException("Salam mın RuntimeException");
*/

        // Nümunə 2

        try {
            System.out.println("salam");
        }catch (ArithmeticException e){
            System.out.println("Xəta: " + e.getMessage());
        }finally {
            System.out.println("Final");
        }


        // Nümunə 3
        
        class AnimalsOutForAwalk extends  RuntimeException{};
        class ExhibitClosed extends  RuntimeException{};

        class ExhibitClosedForLunch extends  RuntimeException{};

        // Məsələn biz zooparka gedirik və görürük ki heyvanlar yoxdur. Ya onları gəzintiyə buraxıblar yada görüş bağlıdır

        try {
            seeAnimal();
        }catch (AnimalsOutForAwalk e){
            System.out.println("catch block - 1");
        }catch (ExhibitClosed e){
            System.out.println("catch block - 2");
        }

    }

    private static void seeAnimal() {
    }


    // Nümunə 4
    public  class MyException extends Exception{
        public MyException(String msg){
            super(msg);
        }
    }


}


/*
    Exceptionun alınmasının 2 səbəbi var
    1) Özü yaransın

    Nümunə 1

    2) Exceptionu özümün atmağım. Buda Throwing an Exception adlanır. Biz new Exceptionu fırladarkən mesaj olaraq String
    parametrdə göndərə bilərik yada default olaraq parametr

    Runtime Exception - alınması - bizim əsas klasımızın (Exception) bir alt klasıdı - Bunu catch (tutmaq) olar - handle
    etməyə OLMUR !!!
    (RuntimeException özü var klas olaraq, biridə var Runzamanı yaranan exceptionlar

    Checked Exception - alınması - Exceptionun alt klasıdır - lakin RuntimeExceptionun alt klası DEYİL!!! - Bunu catch
    etmək olur - handle etmək olur

    Error - Error'un alt klasıdır - catch ilə tutmaq OLMUR !!! - handle etmək OLMUR !!!


    Nümunə 2

    * try catch ifadələrində tək sətirlik kod bloku olsa belə {} bunlar YAZILMALIDIR

    * try bloku təklikdə işlənə bilmir, ondan sonra ya catch yada finaly bloku gəlməlidir


    * catch yazmadan try edə bilmərik. Amma istisna kimi finaly ilə olan variantıdı. Finaly bloku try ifadəsinin sonunda gəlir
    try catch 3 hissədən ibarət olur: 1)try  2)catch 3)finaly

    * finally - məqsədi Exception yaransada, yaranmasada bu kodu icra et. Normalda try catch olmadan işləmirdi, bunun olma
    səbəbi odurki mən məcburamki finaly blokunu istifadə edəndə bu 100% icra olunsun. Yəniki try finally olanda imkan yaradırki
    bəlkə catch OLMASIN. Səbəbi isə finally zatən catch'in gördüyü işi görəcək, Exceptionu tutacaq


    Fəqli tiplərdə olan Exceptionların tutulması

    Biz Polimorfizm'dən istifadə ediriksə biz Class Cast Excepion ala bilərik. Klasın içindədə bir iş görürüksə, məsələn
    5/0 yazırıqsa o zaman ArithmeticException ala bilərik, yada fayl tapılmaya bilər. Biz əgər try yazıb ArithmeticException
    catch ediriksə ancaq onu tutub saxlayır. Yəni catchda ArithmeticExceptionheç bir mənası yoxdu. Biz bir neçə type'da
    olan Exceptionun tutulmasını bacarmalıyıq


    Nümunə 4
    Biz özümüzdə Excaption klasları yarada bilərik. Bunun üçün digər klaslardakı məntiqi burada tədbiq etməkdir. Tək fərq
    biz real proyektdə hər exception üçün bir klas YAZMIRAM !!! Bir common (ümumi) exception yaradıram sonra isə hər
    bölüm üçün ayrıca sırf o bölümdə çıxa biləcək exceptionlar üçün ayrıca klas yaradıram. Yaratdığımız klaslardakı
    Exceptionlarıda enumla vasitəsi ilə yaradıram və onu implement edirəm


    Runtime exception'lar RuntimeException clasından törəmiş exception'lardır. Bu exception'lar handle və declare olunmağı
    tələb ETMİR !!!. Həm prorqamçı həmdə JVM tərəfindən idarə oluna bilər. Ən çox istifadə olunan RuntimeException'lar:

    1) Arithmetic Exception
    Sıfıra bölmə əməliyyatı zamanı baş verir və JVM tərəfindən idarə edilir. Yəni riyazi əməlyyatlar zamanı

    int result = 7 / 0;

    Output: Exception in thread "main" java.lang.ArithmeticException: / by zero

    2) ArrayIndexOutOfBoundsException
    Massivin doğru indexsinə müraciət etmədikdə baş verir və JVM tərəfindən idarə olunur

    int arr[] = new int[3];

    for(int = 0; i <= arr.length; i++){
        System.out.print(arr[i] + " ");
    }

    Output: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3

    3) ClassCastExcaption

    Uyğn olmayan tipləri bir-birinə cast (atmaq) edən zaman yaranır və JVM tərəfindən idarə olunur. Bəzən kompilyator
    qeyri-mümkün castların qarşısını alır:

    String type = "number";
    Integer = number = (Integer)type; // Does Not Compaile

    Integer String'in subklası deyil, ona görədə kompayl xətası baş verir. əgər biz String referansını əvvəlcə Object
    tipinə, sonra İnteger tipinə cast etsək kompayl xətası baş verməyəcək, amma ClassCastExcaption xətası çıxacaq

    String type = "number";
    Object obj = type;
    Integer number = (Integer)obj;

    Output: Exception in thread "main" java.lang.ClassCastExcaption: java.lang.String cannot be cast to java.lang.Integer


    4) IllegalArgumentException
    Çox vaxt metoda düzün parametr göndərməyəndə olur və proqramçı tərəfinfən tutulur. Məsələn setter metodumuz var və mənfi
    parametr ala bilməz

    public void setCountStudents (int countStudents){
        if(countStuents >= 0)
            this.countStudents = countStudents
    }

    Bu kod normal işləyəcək, lakin mənfi parametr göndərəndə requestdən imtina (ignore) edilir və bu metod çağıranın (caller)
    bundan xəbəri olmur. Amma istəyirik ki, baş verən problemdən proqramçını xəbərdar edək və bu problemi həll etsin.
    Bu zaman IllegalArgumentException istifadə edilir

    public void setCountStudents (int countStudents){
        if (countStudents < 0)
            throw new IllegalArgumentException("# count must not be nagative")
        this.countStudents = countStudents
    }

    Əgər metoda mənfi parametr göndərilsə o zaman aşağıdakı kimi xəbərdarlıq çıxacaq:

    Output: Exception in thread "main" java.lang.IllegalArgumentException: # count must not be negative


    5) NullPointerException

    Instace dəyişən və metodlar null referans üzərindən çağırılan zaman baş verir və JVM tərəfindən idarə edilir

    Nümunə 1
    String nameı

    public void  printlength() throw NullPointerException{
        System.out.print(name.length());
    }

    Nümunə 2

    class TestClass {
        public static void main (String args[] throw Exception {
            Exception e = null;
            throw e; // throws NUllPointerException
        }
    }

    Output: Exception in thread "main" java.lang.NullPointerException


    6) NumberFormatException

    * Uyğun formatda olmayan Stringi' numeric tipə çevirəndə olur və proqramçı tərəfindən tutulur. Yəni String tipində yazılan
    "5"'i parseİnt edib İntegere çevirmək olmur.NumberFormatException clası IllegalArgumentException'nun subclassıdır

    Integer.parseInt("num");

    Output: Exception in thread "main" java.lang.NumberFormatException: For input string: "num"

    7) Checked Exceptions

    * Exception və ondan törəyən bütün subclasslar (RuntimeException classı istisna olmaqla) bu exceptiona daxildir. Mütləq
    handle və ya declare olunmalıdır. Proqramçı və JVM tərəfindən tutla bilər. Ən çox istifadə edilənləri

    8) IOException

    * Faylın oxunması və ya yazılması zamanı problem baş verdikdə yaranır (proqramçı tərəfindən fırladılır)


    9) FileNotFountException
    * Mövcud olmayan fayla müraciət edən zaman baş verir. İOExceptionun subclassıdır. Proqramçı tərəfindən tutulur


    ERRORS

    * Errorlar Error clasından törəyir və JVM tərəfindən tutulur. Declare və handle olunmağı məsləhət deyil. Nadir hallarda olur

    1) ExceptionInitializerError

    * Static intializer blokda exception baş verdikdə və handle olunduqda yaranır və JVM tərəfinfən tutulur.
    ExceptionInitializerError ona görə error hesab olunurki, Java bütünlükdə classın yüklənməsini dayandırır. Çünki klasa
    müraciət edilən zaman ilk olaraq static intializer blok işə düşür və əgər həmin blokda exception baş versə, java classdan
    istifadəyə başlaya bilmiExceptionInitializerErrorr

    public class  ExceptionInitializerError{
        static {
            int[] numbers = new int[3];
            int num = numbers[-1];
        }
        public static void main (String[] args){]
    }

    Output: Exception in thread "main" java.lang.ExceptionInitializerError
    Caused by: java.lang.ArrayIndexoutOfBoundsException: -1

   * Exception statik blokda baş verdiyinə görə ExceptionInitializerError alırıq. Amma bu errorla bağlı məlumat problemi
   həll etmək üçün yetərli deyil və statik blokda olan exceptionla bağlı məlumatda əlavə göstərilir


   2) StackOverflowError

   * Əsasən metod özü özünü çağıraraq sonsuz dövrə düşdüyündə (infinite recursion) baş verir və əsasan JVM tərəfindən tutulur

   public static void recursiveMethod(int i){
        recursiveMethod(7);
   }

   3) NoClassDefoundError

   * Kompayl vaxtı mövcud olan classın icra vaxtı tapılmamsı zamanı baş verir və JVM tərəfinfən tutulur. Bu error kod daxilində
   olmur



   Calling Methods That Throw Exception

   * Əgər metod exception fırladırsa, həmin metodu çağıran zaman bəzi qaydalara əməl edilməlidir

   classs NoCarrotexception extends Exception {

   public class Bunny {
        public static void main (String[] args) {
            eatCarrot(); // Does Not Compail
        }
        private static void eatCarrot() throws NoCarrotException{}
   }


   * Kodda kompayl xətasının baş verməsinin səbəbi NoCarrotexception checked exceptiondur. Checked exceptionlar mütləq handle
   olunmalıdır. Əgər main metodu aşağıdakı formalarda dəyşsək kod kompayl olacaq

   public static void main(Strng[] args) throws NoCarrotexception { declare
        eatCarrot();
   }

   * handle try catch ilə, declare isə throws ilə edilir. Əgər multiple bloklar işlədəndə try catch istifadə edilir. Bir dənə
   olanda throws istifadə edilir. Metodun qarşısında bir növ declare edirəmki burada bu xəta çıxa bilər.


   * throws ilə throw fərqi.
   * throws - Metodun qabağında bunu yazıramki belə bir Exception çıxa bilər (try catch kimi). Qarantiyası yoxdu
   * throw - Konkret olaraq o xətanı atmasını istiyirəm



*/