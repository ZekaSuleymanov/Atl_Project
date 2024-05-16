package lesson_8_Method_Object_Constructor;

public class Main {
    public static void main(String[] args) {


        // Nümunə 2
        String a = "Zəka";


        String b = new String();

        System.out.println(b);

        // Nümunə 2.1
//        Apartment zeka = new Apartment();

//        zeka.picture = "Mona Liza";
//        System.out.println(zeka.picture);

        // Nümunə 2.2
//        Apartment ilqar = new Apartment();

//        ilqar.picture = "Tom Cruise";
//        System.out.println(ilqar.picture);
//        ilqar.table = 5;
//        System.out.println(ilqar.table);

        // Nümunə 2.3
//        Apartment hesen = new Apartment();

//        hesen.picture = "Rock Picture";
//        hesen.table = 1;


        Apartment.wall = 5;
        // zeka.wall = 4;  // Biz bunu Apartment.wall = 5; kimi yaza bilərəm  O zaman (zeka.wall = 4;) buna ehtiyac qalmır.
        // Bir başa klasın adı ilə çağırıram.
        //zeka.wall = 4; yazanda obyektini yaradıram sonra referansı ilə picture wall çağırıram sonra ona dəyər verirəm. Düzgün DEYİL !!!


        // Nümunə 3

        Apartment zeka = new Apartment("Mona Liza");

        System.out.println(zeka.picture);

        Apartment ilqar = new Apartment("Zeka", 5);
        System.out.println(ilqar.picture);
        System.out.println(ilqar.table);


        Apartment hesen = new Apartment("Rock Picture",2);



        // Nümunə 6
        System.out.println("****** Nümunə 6 *******");

        Tree apple = new Tree();

        apple.height = 2;
        apple.type = "apple";

        System.out.println(apple.height);
        System.out.println(apple.type);
    }
}


/*
        Nümunə 1
        static -  Bir başa classa aiddir. Hər hansı classı yaradıb run etdikdə fərq olaraq 1 ci hansı dəyərlər yaranır,
        sonra konstructorlar yaranır, sonra static dəyərlər yaranır. 1 ci bilmək lazımdırki proyekti run edəndə JVM daxilində
        class loaderlər var. Bunlar vasitəsi ilə class yüklənir (ilkin variantda class loader olmur) və bu zaman static
        dəyərlər onla birlikdə yaradılır. Birdə var instance (non-static) dəyərlər. Bunlar obyektə aid dəyərlər idi. Bunlara dəyərdə
        verə bilərik VERMƏYƏDƏ bilərik, istifadə olaraq dəyişədə bilərik dəyişməyədə bilərik. Ümumiləşdirsək static, classdakı
        field metodun vacibliyini göstərir. Mütləq istifadə ediləcəyini, classın bir parçası olduğunu. Classı digər classda
        onun obyektini YARATMADAN !!! classın adını yazıb arxasınca metodu yada dəyişənin  çağırıb dəyər mənimsədə yada
        istifadə edə bilərik



        Variable 3 növü var:

        1) Class variable - static int wall;

        2) Non-static, instance variable - int table;

        3) Lokal variable - Metod içindəki variable'dır

        public void sayHello(){
            int c = 5;
        }


        String b = new String(); - bunun içindəkiləri (metod, field) istifadə edə bilirəm

        class məntiqi sanki mən nəyinsə çertyojunu çəkirəm və onu dəfələrlə istifadə edirəm

        Yəniki class çertiyojdu, onun vasitəsi ilə yaradılanlar obyektlərimizdi


        Class 2 hissədən ibarətdir: 1)fields (states) and 2) behavior

        Fields (məsələn: int height;)

        Behavior - Hərəkətləri,

        Structur - 1) package 2) import 3) class

        import - Digər fayllardakı kodu bir faylda istifadə etməkdir. Məsələn başqa faylda yaratdığımız metodları və
        dəyişənləri mövcud faylımızda istifadə etək üçün import əmrini istifadə edə bilərik

        Apertmentdəki String picture - non-statikdir. Non-statik dəyər yəni bu olada bilər olmayada bilər, istifadə edədə
        bilərik, etmiyədə bilərik. Bunları necə istifadə ediriksə necə edəciyik?. Apartment classının obyektini yaradıb
        elə çağıra bilərik. Çünki picture (həçmçinin table) static DEYİL !!!

        static olanları bir başa classın adı ilə çağırırıq. Non-staticləri nəyəsə asign (təyin) etdikdən sonra çağırırıq

        // Nümunə 2.1, 2.2, 2.3'də gördüyümüz kimi Apertment classını çağrırıb dəfərlər istifadəklas edə bilirəm. Fərqli evlər
        yaradıram. Obyekt sanki çertiyojdur. Mən o classın çertiyojunu çəkdikdən (obyektini yaratdıqdan) sonra artıq hər
        bir məlumat obyektlər sayəsində fərqli fərqli formatlarda yaradıla və saxlanıla bilər


        Fərqli bir nümunə: Bir proyektdə userlər olacaq və qeydiyyatdan keçdikdə 5 manat qazanacaqlar. Userin balansına
        5 manat əlavə etdiyim hissə paymentservice'dir. Paymentservice'ə mən Useri dartıb gətirməliyəmki User sən filankəssən
        və paymentservicedə filan iş icra edəssən. O Useridə gətirmək üçün onun obyektini yaratmalıyam. Yəni onu gətirib
        bir növ paymentservice classının içinə qoymalıyam
        Fərqli bir nümunə: 10 Komputer var. Çertiyojları eynidi. Fərqləndirən cəhətləri adları (lenovo, hp, acer),
        RAM fieldi var (3, 46, 16). Monitor (lg, dell) Öz obyektimizdə yeni dəyərlər olur. Hərəsində ayrı ayrıdı amma
        çertiyoja vahiddi unique'dir

        Məsələn qum var və mən o qumdan fərqli fərqli şüşədən olan mallar düzəldə bilərəm. Ayna, eynək, vaz və.s
        Çertiyoj qumun üzərindədir, qum classıdır. Referance aldığı qumdur.
        Bir şablon yaradırsan və onu modifikasiya edirsən.

        static dəyər olanda isə - o klasın stattik yəni bütün çertiyojlara tədbiq ediləcək mütləq bir dəyəri olacaq.
        Məsələn bir telefon yaradıram. Static dəyəri onun mövcudluğudu, non-static dəyəri isə əməliyyat sistemidir.


        wall burada Apartment classına aiddir
        picture və table isə Apartment classının içində yazılmasına baxmyaraq ona aid DEYİL !!!. Onları sonradan yaradacağım
        üçün Apartment OBYEKTİNƏ aid olacaqlar.

        zəka.wall yazsam çox əlaqəsiz olacaq zatən classın özündən çağıra bilirəm. Onun obyekinidə yaradıb çağıra bilərəm,
        amma düzgün üsul DEYİL !!! zatən classın içindən gəlirdə ehtiyac yoxdur

        Apartment.picture yazsam onu gətirə BİLMİRƏM!!!. Çünki o obyektə aiddir. Bunu hardan bilirəm ? static deyil


        Təkrar, qarışıq kodların qarşısını almaq

        Bir universited düşünək. Tələbələr rektor və starosta. Burada starosta nə edir?. Tələbələr ilə rekor arasında əlaqə
        yaradır. Şardlərin tələblərini rektora, retorun tələbini şagirdlərə çatdırır. Starosta vasitəçidir.


        CONSTRUCTOR

        Bizim obyektləri yaratdığımız zaman ortada bir vasitəçi olur, bu vasitəçi Constructordur


        Constructor - is a special method - Method - bir kod parçasıdırki istdiyim yerdə çağırıb icra edə bilərəm

        Constructor nədir və nə üçün istifadə edilir? Konstruktorlar hər dəfə obyekt yaratdığınız zaman avtomatik icra
        olunan metodlardır. Konstruktorun məqsədi obyekt qurmaq və obyektin üzvlərinə qiymətlər təyin etməkdir. Konstruktor
        aid olduğu class ilə eyni adı alır və heç bir dəyər QAYTARMIR.

        * Constructorda məntiqi - Metod olaraq Konstructor adında metodumuz var. Mən bunu çağıranda bu sırf Main ilə Apartment
        arasındakı əlaqəni qurur, misal üçün yada data base ilə mənim aramda əlaqə qurur.

        * Class daxilində value type yaradarkən həmin value typeların dəyəri heapdə saxlanılır. Referans typler heap də saxlanılır
        * Klass xaricində Value typelar stackda saxlanılır
        * Mən klasın obyektini constructorun köməyi ilə yaradıram. Abstract klasların instanslarını (obyektlərini) yarada BİLMİRƏM !!!

        Klasın özünün boş consructoru olur.


        Constructorun 2 şərti olur.
        1) Metodun adı birə-bir klasın adı ilə eyni olmalıdır. Ona görə special metoddur

        2) Obyektini yaratmaq istiyirəmsə public olmalıdır




        Constructor klaslar arasındakı konstruksiyanı qurur sanki.

        No-statik dəyər sırf obyektlə işləyir, statik bir başa klasın özü ilə işləyir. Aralarındakı əsas fərq.

        Bizim 3 obyektimiz var (Apartment zeka = new Apartment(); 2) Apartment ilqar = new Apartment(); 3) Apartment hesen = new Apartment();).
        Hər birinin Apartment klası ilə əlaqələnməsi üçün bir referansı (zeka, ilqar, hesen) olur. Klasların construcsiyalarının
        yaradılması üçün obyektin yaradığı hissə (new Apartment()) buradır.

        Klasın tipi -- referans(bizi main klasının içindən Apartment klasına aparan pointerdir) ---  obyektin yarandığı hissə
        Apartment          zəka       =                                                             new Apartment();

        Burdakı obyektin yarandığı hissə Apartment klasındakı (public Apartment() {}) constructorun hesabına yaranır
        Bu isə default Constructor adlanır. Biz onu yaratsaqda, yaratmasaqda arxa prosesdə gözlə görülməyən formada
        default constructor var. Parametrsiz olur, içində heçnə yazılmır. Obyekt yarada bilməyimiz üçündür

        Obyekt yaratmaqda məqsəd

        Constructorun 3 növü var
        1) Parametrli
        2) Parametrsiz
        3) Default

        Default ilə parametrsiz fərqi - Heç bir constructor yaratmadığım müddətcə, JVM arxada yaratdığı default constructordu
        Yəniki JVM deyirki sən constructordan xəbərdarsan sadəcə yaratmırsan, sadəcə obyekt yaradıb işini görürsən. Əgər
        mən gəlib hər hansı parametrli yada parametrsiz constructor yaradanda yada Obyektləyərə argument ötürəndə JVM
        anlıyırki mənim constructor anlayışındandan xəbərim var və default olanı silir. Öhdəliyi öz üzərindən atır,
        öhdəlik mənim üzərimə düşür.



        Nümunə 3
        Burda mən Elgün.picture və onu çap etməkdən azad oldum. Bunların sayı çox ola bilər. Constructorun içində fieldları
        metod kimi yazıram

        Nümunə 4 - də yazdığım kimi mən istəyərmki ancaq onun picturesi olsun table olmasın. Ayrıca 2 dənə olan parametrli
        metodum var. İkisində istədiyim kimi işlədə bilərəm. ya tək parametrli yada cüt, yada parametrsiz. Constructorlarını
        yaradıram və obyektlərdə onları istədiyim kimi istifadə edirəm. zəka obyekti gedir Nümunə 4 dəki constructora müraciət
        edir. Çünki onun strukturuna aid constructor yazmışam. Əgər iki dəyər ötürsəm 2 argument gözləyir və o zaman 2
        parametli constructora müraciət edəcək. Hansı obyektimizdə hansı argument argumentlər varsa o, öz parametrinə
        vəya parametrlərinə uyğun olan constructora müraciət edir. Məsələn picture argumentinə dəyər ötürmüşəmsə gedir picture
        parametrini ötürdüyüm constructora müraciət edir, ya argument kimi table ötürmüşəmsə obyektimə o  zaman gedir
        parametrinə table ötürülən constructora müraciət edir. Əgər 2 parametli konstructor yaradıramsa o zaman constructorda
        göstərdiyim parametlərə uyğun obyektlər yaratmalıyam məcbur şəkildə.   3 halımız var.

        1) picture, table 2) picture 3) table
        Picture, table olanı yazsam -  public Apartment(String picture, int table) { this.picture = picture; this.picture = picture; } bunun içünə düşür
        Picture olanı yazsam -  public Apartment(String picture) { this.picture = picture; } bunun içünə düşür
        Table olanı yazsam - public Apartment(int table) { this.table = table; } bunun içünə düşür

        this keyword'u instance variable'a (yəni obyektə aid olan variable'ları) çatmaq üçün istifadə edilir.

        Heç bir parametr olmadan obyekt yaratmaq istiyirəmsə default constructor'a müraciət edir


        DUMY CONSTRUCTOR - Nümunə 5
        Dummy constructor - Constructorun məqsədi nə idi? Parametrinə dəyər qoyub ötürürəm, assign edir ötürdüyüm müvafiq classa
        Constructoru yaratmaq məqsədim, içinə parametr ötürürəm. Məndə götürmüşəm (Nümunə 5) demişəmki hər dəfəsində
        obyekt yarananda bunun içindəki (Nümunə 5) dəyəri götür yaradılan obyektə mənimsət. Bu Dummy Constructor adlanır
        Yəni işə yaramayan



        Nümunə 6

        Əgər mən  (apple.height = 2; apple.type = "apple";) bunları silsəm Tree klasında ötürdüyüm konstructorun parametrlərini
        ötürəcək (ananas və 15). Həmçinin Tree klasındakı constructoruda silsəm o zaman int'n default dəyəri 0, Stringin
        default dəyəri null çıxaracaq. Tree klasındakı constructor Dummy constructor adlanır

        Nümunə 7
        Dummy qarşısını almaq üçün  ya içini boş qoyuram, ya obyekti çağırdığım yerdə tək-tək əllə yazıram ki bu doğru variant deyil,
        yadaki parametrli constructor kimi yazıram ki, bu ən doğru variantdı

        this keyword
        Parametrli konstructorun içindəki this keywordu, olduğu klasın içindəki fieldları göstərir
        this.height yazanda, int height; field'nı gətirir
        this - constructor metodumun ayrılmaz bir hissəsidir. Bizim klasımızdakı field'larımızı göstərir. Fieldlarımıza
        əlçatanlıq üçündür.

        Nümunə 8
        Constructorlar bir-birlərinə müraciət etmək üçündə this()'dən istifadə edə bilər. Mən 1 parametrli olan constructorla
        ümumi olana (üstdə olana) müraciət edirəm. Bir parametr default olaraq yazılır, digər ötürülən parametr (ata constructorun)
        özününkü olur. Yəni hansı constructordan this deyib çağırmışamsa ordakı parametr özü stabil olaraq qalır, ona dəyər ötürülür.
        Digər parametr default olaraq yazılır. Belə düşünə bilərikki öncə ana constructor yaradıram, sonra onu hissələrə
        bölürəm, paylıyıram Ondan sonra artıq type = type, height = 5 falan YAZMIRAM !!!
        Real həyatdan nümunə desək. Mən gedirəm ağac əkməyə. Mənə toxum verirlər bu bəllidirki apple olacaq. Lakin hündürlüyü
        bəlli deyil, mənim sulamağımdan asılıdır. O zaman bu Nümunə 8.2'yə uyğundur. Biridə var mənim alacağım toxumların
        hündürlükləri bəllidirki bunlar böyüyəndə 1 metr olacaq sulasanda sulamasanda. Lakin aldığım toxumlar bəlli deyil,
        buda Nümunə 8.1 uyundur. Bunların ata constructorda isə hansı toxumu götürəcəyimi özüm seçirəm, necə qulluq edib
        boyunun çıxmağınıda özüm seçəcəm


        Compail nədir - javac'i .java faylını çevirdi byte code'a. Bu (byte code zamanı) anda olur .class faylı. Düşür
        JİT içinə, sonra interprestasiya olur


        Smart Constructor - Constructorun parametrli variantıdır

         Constructor 3 hissəyə bölünür

         1) No-Arg Constructor - Argumenti olmur. Parametri yoxdur, İçində nəsə yaza bilərəm
         2) Parameterized Constructor - Smart Constructordur, Parametrlidir və Parametli konstructorun daxilinə field ötürməklə olur
         3) Default Constructor - Obyekt Yaratsanda, yaratmasanda var. Bir constructor daxil edirəmsə default yığışdırılır

         Constrcuorda dəyər ötürməsəm default olaraq qaytaracaq dəyərlər

         boolean        false
         byte           0
         short          0
         int            0
         long           0L
         char           \u0000
         float          0.0f
         double         0.0d
         object         Referance null
         String         null  - Stringd' obyekt olduğu üçünn null qaytarır



        public static void main(String[] args) - Bu metod run etmək üçündür. main olmasının səbəbi static olmasıdır
        Çünki static olması Main clasına adi olduğunu göstərir. Mənə orginal giriş nöqtəsi (entery point) verir.


*/