package lesson_13_Encapsulation_InstanceOf_Relationships;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Animal animal = new Animal();
        System.out.println(true); // cat instanceof animal
        System.out.println(animal instanceof Animal); // true
        String c = new String();
        System.out.println(true); // c instanceof a - true olmasının səbəbi

        // Nümunə 1
        // System.out.println(c instanceof Animal); // false // typecasting mövzusuna dayanır.

        //Nümunə 2
        byte d = 40;
        byte e = 50;

        byte x = (byte) (d * e); // d * e yazsaq error verəcək
        System.out.println(x);


        // Nümunə 3
        double myDouble = 9.78;
        int myInt = (int) myDouble;

        System.out.println(myDouble); // 9.78
        System.out.println(myInt); // 9


        // Nümunə 4
        Baba baba = new Baba();

        // Up-Casting
        Ulubaba akif = new Baba();
        // Ulubaba abc = new Object(); // <-bu error verir.  Daha doğrusu budur -> Ulubaba abc = (Ulubaba) new Object();
        Object obj = new Ulubaba();


        // Nümunə 5 - Up casting
        Object b = new Example();
        System.out.println(b.hashCode()); // Output: 1831932724

        // Nümunə 6 - down casting
        //Example example = (Example) new Object(); // <-- bu daha doğrudur   // Yalnışdır --> Ulubaba abc = new Object()
        // System.out.println(example.name); // ClassCastException - alacıyıq.

        // Nümunə 7
        Ulubaba ulubaba = new Ulubaba();
        // Baba babba = (Baba) ulubaba;
        // babba.otBicmek(); // ClassCastException verəcək. Baba Ulubaba ola BİLMƏZ !!!

        //Baba baba1 =  new Ulubaba();


        // Eyni şeydilər
        Ulubaba ulubaba1 = new Baba();
        Ulubaba ulubaba2 = baba;

        // Nümunə 8
        // Athlet athlet = new Greppler();
        // Runner runner = (Runner) athlet;
        //runner.run();


        Athlet athlet1 = new Runner(); // up casting polymorphism
        Runner runner1 = (Runner) athlet1; // down casting polymorphism
        runner1.run();


        // Nümunə 9
        Athlet athlet2 = new Greppler();


        // Nümunə 10
        Square s1 = new Square();
        s1.render();

        Circle c1 = new Circle();
        c1.render();


        // Nümunə 11
        Jjava j1 = new Jjava();
        j1.displayInfo();

        Language l1 = new Language();
        l1.displayInfo();


        // Nümunə 12
        Pattern d1 = new Pattern();
        d1.display();
        System.out.println("\n");

        d1.display('#');


        System.out.println(baba instanceof Ulubaba);
        System.out.println(baba instanceof Object);
        // System.out.println(baba instanceof String);
    }


}


/*
    * Encapsulation nədir - Classda olan private fieldlara əlçatanlıq yaratmaq üçün istifadə edilən set və get methodları
    * Encapsulationları public yaradırıq. Methhodların adlandırılması, set il yazdığımız (daxil etdiyimiz) məlumatı götürmək,
    get ilədə daxil diləni götürülməsi əsasında olur
    Java Beanləri - set və get ancaq booleanda is və set olur. get OLMUR !!!. Mənası isə məsələn yaşı 32DİRMİ? kimi sual
    çıxır məntiqən
    * exdent anlayışı - varislik anlayışıdır. Əsas (ata, super, parent) class yaradırıq və ondanda sub classlar törüyür,
    onlarda extend ilə parentin xüsusiyyətlərini alır. Yaratdığımız bütün subclassslarda olacaq oxşar fieldləri (xüsusiyyətləri)
    super classda qeyd edirik və onunla işimizi asandlaşdırıb bütün subclasslarda çağırırq.
    * 2 relatinship var:
        1) is a relationship - Dog is a animal, Apple is a fruit
        2) has a relationship - classın özünü çağırmaq - bir Userin bir neçə taskı ola bilər. Taskın özü bir classdı onu
        gətirib bir başa Userin içinə qoyuram. Komputeer a CPU. CPU bir classda kompanentləri var gətirib onu komputer
        içinə qoymuşam. Cat is a Animal dedikdə Animalın subclassları mənasında deyirik. Has a isə onu bir başa özündə
        mövcud etməkdir



     İnstance of keywordu
     * Məntiq olaraq budurki biz görək bir class digər classın subclassımıdır ya yox. Bu birbaşa true olur. Bunu class və
     subclasslarda həmçinin interfacelərdə tədbiq edə bilərik. Müqayisə operatoru kimidir ancaq elə demək olmaz !!!
     * Javada bütün classlar Obyekt classından extend edir
     * false olduğu hallar isə obyekt null olarsa yada bir birindən əlaqəsiz classlar arasında baş verir

     Nümunə 1
     * typecasting məntiqi var burada

     Nümunə 2 - Widening casting
     *  Byte * byte vuranda int yada short alıram. Widening casting AVTOAMTİK baş verir. Çünki artıq kəmiyyəti artır və byte'a
     SIĞIŞMIR !!!. Kiçikdən böyüyə: byte -> short -> char -> int -> long -> float -> double
     * Qarısına byte verəndə problem yaratmır, ancaq bayaq demişdik kəmiyyəti artır və sığışmır. Bu vəziyyətlərdə compailer
     xətaları tutur. Typecasting'də isə JVM problem öz üzərindən götürüb mənə verir.
     Nümunə 3 - Narrowing casting
     * Birdə Narrowing casting var. Manual olur. Böyükdə kiçiyə çevirir. double -> float -> long -> int -> char -> short -> byte
     Kiçildəndə qarşısında istədiyimiz nədirsə onu verməliyik
     * Mən rəqəmləri artırsam 40 * 50 yazsam - 128 çıxacaq. Yada 41 * 50 yazsam 2 çıxacaq. Burda is

     Typecasting'i düşünək ki obyektlər üstündən edirik: Superclassdan subclasssa keçid narrow casting, subclassdan super
     classa keçid Widening castingdir



     Polymorphism

     Nümunə 4 - Variable polimorfism
     Up-casting edirik burda.  Ulubabadan new Baba yarada bilərik. Ulubabanın fieldlarını çağıra bilirik.
     * 37 və 39'cu sətirdəkilər up-casting adlanır. Ulubaba classı Baba classından böyük olduğu üçün Baba classsını sanki genişləndirirəm
     * Bu misal olaraq: CEO gedir xaricə iş görüşünə. Amma onun işlərini görmək lazım olur. CEO'da özü olmadığı üçün müəqqəti
     olaraq onun müavini müvəqqəti olaraq onun işini icra edir. Vəzifəəsini bir növ müvəqqəti böyüdürük
     * Burada Baba classı Ulubaba classı səviyyəsində deyil amma onun səviyyəsinə qaldırıram. Sanki özünü Ulubaba kimi aparır
     * 38'ci sətir isə down-castingdir. Biz böyüyü kiçildə BİLMƏRİK!!!, yəni sıxa BİLMƏRİK !!!
     * Düşünəkki 2l qab Objectdir, onun altındakılarda 1 litirlik qabdır. 38'ci sətirdədə sanki 1 litiklik qaba 2 litirlik
     su qoymağa çalışıram


      Nümunə 5 - Kiçikyi böyüyə mənimsədirəm

     Nümunə 6
     * ClassCastException almamazızın səbəbi - Obeykt classımız Bootstrap classloaderin əsas base classıdır. Yənki heç bir
     class Obyekt classından böyük ola bilməz.


    Nümunə 7 - 51-ci sətirdə Babanı up edib genişlədirəm və Ulubabaya bərabər edirəm. Yuxarıdakını cast edirəm kiçiyə


    Runtime Polimorfizm - Override - Var olanın üzərindən eni bir şey yaratmaq. Bir methodu əzib keçərək yeni
    methodu fərqli yazmaq
    * Məsələn: Animal methodumuzda Səs çıxrmaq metodumuz var. Bu method Dog, Pig, Cat classlarında fərqlidir. 3dədə var
    yəni ümumi methodu atırıq Animal classa. Subclassslarda (Dog, Pig, Cat) Animalı extend etdiyi üçün bu methodu Override
    edə bilirəmm (əzib keçirəm).
    * Nümunə 7'də bu məntiqdir. Normalda Ulubabanın obyektini yaradıb və Ulubaba.otBicmek() yazıb işlədə bilirəm. Problem
    yoxdur. Burda isə Ulubabanı cast edirəm Babaya (Babanı Ulubaba səviyyəsinə qaldırıram) Dolayı yolla Baba baba1 = new Ulubaba()


    Nümunə 9
    * Mən Runner classının içinə run və Grapplerin içinə grapple methodları qoymasam error verəcək. Qoysam əgər düzəlir
    və runnerin öz içindəkini çağırır. Athlet realda Grappler obyekti olmasına baxmayaraq özünü athlet kimi aparır


    Nümunə
    * Squareni qaldırıb (up edib) özünü Polgon kimi rəftar etdirə bilərəm. Onun içindəki render metodunu işlətsin çünki
    Squaradə özünü Poygon kimi apara bilmir (əvvəlki mənitqdəki kimi 1l qaba 2 l su tökmək).
    * Bu zaman Squara və Circle clasının içində render metodunu yenidən yazıram. Hər şey əla işləyir.
    * Amma əvvəl Up-casting, Down-casting ilə edəndə qarışacaq hansını çağıracağını blmirəm
    * Polimorfism biz net kod yaratmağda istifadə edirik. Mən 2 dənə fərqli renderSuqare() və renderCircle() meodları
    yarda bilərdim. Amma məntiq eynidir. Onda adını render qoy fərqli fiqurlarda işlət
    * print() metpoduda polimorfsmə nümunə göstərə bilərik. Fəqli data tipləri istiafə edirəm və nəticədə eyni nəticələr
    alıram. yəni print int char üçün nəyisə əzir keçir, yada long üçün başqa metodu əzir keçir yada String üçün başqa şeyi
    əzib keçir
    * Overriding məntiqi öyrnmişdikki Super classla sub class arasında olur


    Nümunə 11
    * Language classında olan metodu Jjava classında dəyişirəm. Mənim Override etdiyim displayInfo() adlı metodum, yəni
    OVERRİDE etdiyim metod polimorfizm həyata keçirir. Bu Runtime Polimorphizm adlanır.
    * Bəs necə edir ?. Kiçik subclassda olsam belə özümü Superclass kimi aparmağıma icacə verdi və heç bir Runtime error
     OLMADI !!! l1.displayInfo(); və j1.displayInfo(); özlüklərində fəqli yerlərə
    müraciət edirlər

                              l1.displayInfo();                   j1.displayInfo();
    Common English Language <-------------------- displayInfo(); -------------------> Jjava Programming Language

    * Compail time - Run düyməsinə basana KİMİ Compail time olur. Kod yazılan hissə insan dilinə yaxın olan yer
    * Runtime - isə run düyməsinə BASDIQDA baş verir və maşın dilinə yaxındır
    * Compail time zamanı sintaksis yoxlaması olur anında.

    * Overriding Runtime polimorphizmdir. Run mühitində 2 metod yaradır üst üstə qoyur və əzib keçir.
    * Overloading - Compail time Polimorpismdir. Düşünəkki 1 classda


    Nümunə 12
    * Burada
*/
