package lesson_11_Encapsulation_common_attacks;

public class Main {
    public static void main(String[] args) {
/*        // Nümunə 1
        Rectangle r1 = new Rectangle();

        r1.lenght = 5;
        r1.width = 3;


        Rectangle r2 = new Rectangle();

        r2.lenght = 7;
        r2.width = 2;
*/

        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        System.out.println(r1.getLength()); // 5.0 // int'i avtomatik double çevirdi
        // Nümunə2.1
        //r1.setHeight(7);

        // Nümunə 2.2
        // r1.setHeight(); // görünmür

        // Nümunə2.3
        r1.setH(4);

        // System.out.println(r1.getH());


    }

}

/*
        Encapsulation

        * Encapsulation 2 cür formada anlaşılır.  O məqsədlə istifadə edilə bilər amma onun özü deyil.
        * Encapsulation vasitəsi ilə datanın gizlədilməsini əldə edə bilərik. Lakin bu datanın gizlədilməsi DEYİL !!!
        İnkapsulasiya (Encapsulation) əlaqəli sahələrin və metodların bir araya toplanmasına aiddir. Bu məlumatların
        gizlədilməsinə nail olmaq üçün İSTİFADƏ edilə bilər. Lakin İnkapsulasiya özülüyündə məlumatların gizlədilməsi DEYİL !!!

        privete dəyərlər çevrilib olur public

        Encapsulation - bütün dataları (variablelları) tək vahid halında bir method içinə baağlama məntiqidir.

        * Qaydaları:
        1) Encapsulation istifadə ediriksə classın daxilindəki bütün dəyişənlər private olmalıdır (dəyişdirilməsin).
        2) Metodlar (getter və setter public olmalıdır)
        3) Java Beanların adlandırılasına uyğun davam etməliyik. boolean tipində is'dir. return DEYİL !!! Bean məntiqi - is get set

        Encapslation sayəsində əldə edilən immutable (dəyişməz) classı necə əldə edilir onu bilmək lazımdır


        OOP - obyekt class OOP'ə aiddir.

        OOP'nin 4 əsas konsepti var

        1) Polimorfism
        2) Abstract
        3) Inheritance
        4) Encapsulation



        // Nümunə 1

        * Biz hər dəfə bu classın fieldlarını istifadə edirik. Bir problem yaranır. Biz demişdikki class çertiyojunu 1 dəfə
        çəkərək, dəfələrlə fərqli obyektləri yarada bilərik. Burda kiçik nüans var. Bu gün length fieldı qoymuşuq adını
        Sabah isə adını dəyişib zeka. Proyektdədə bu classı fərqli yerdə istifadə etmişəm və width kimi istifadə etdiyim
        yerlər zeka ilə dəyişdiyim üçün xəta verdi (qızardı). Bunların ümumi dəyişilməsi məsələsi bir növ Encapsulation
        mövzusunda ortaya çıxır. Amma tamda ona qulluq etmir amma dediyimiz dəyişilməni edə bilirik
        Məsələn kapital bankın 600-dən çox microservisi var. Bu microservislərin ən çox hamısında User olur. Userdə nəsə
        dəyişsəm o zaman olduğu 600 yaxıb microservisdə dəyişməliyəmki buda milyon sətir kod edir. Bunun qarşısı aşağıdakı
        kimi alınır

        Biz set və get metodlarından istifadə edirik. Və əgər variable adı dəyişsəm, obeykti çağırdıyğım yerdə adını set..(),
        göndərdiyimiz parametri publiv void set...( parametr tipi, parametr özü(dəyişirəm)), this keyworduna bərabər etdiyim
        dəyəri dəyişəcəm. this.(classdakı variable) = ötürdüyüm dəyər (dəyişir)


        * Artıq biz Nümunə 1-dəki kimi variabelələri assign (təyin) etməyimiz biraz savadsız üsuldu. Bu belə OLMAMALIDIR !!!

        * Mən get və set'ə əsasən istədiyim məlumatımı burdan set edirəm (mənimsədirəm, içini doldururam). Metod kimi
        ötürürəm. Öz daxilində baş verir.
        set vasitəsi ilə içinə dəyər yazıram, get vasitəsi ilə onu oxuyuram.

        Classı dəyişməz etmək istəsəm fiel'da yazdığımız getter və settərdən - setteri silsəm. Geriyə get qalır. O zaman
        fieldın dəyərini dəyişə bilmərəm. Bu zaman classı dəyişməz edirəm.

        Bean / Pojo

        * Beans -
 */