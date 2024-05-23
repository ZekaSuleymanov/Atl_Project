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

        Ulubaba akif = new Ulubaba();
        //Ulubaba abc = new Object();
        Object obj = new Ulubaba();

//        System.out.println(baba instanceof ulubaba);
//        System.out.println(baba instanceof Object);
//        System.out.println(baba instanceof String);
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
     Nümunə 4 - Ulubabadan new Baba yarada bilərik. 
     sout(baba instanceof ulubaba)
     sout(baba instanceof Object)
     sout(baba instanceof String)
*/
