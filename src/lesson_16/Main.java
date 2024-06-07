package lesson_16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        double b = 5.65;

        // Nümnə
        Integer aobj = Integer.valueOf(a);
        Double bobj = Double.valueOf(b);

        if (aobj instanceof Integer){
            System.out.println("aobj Primitiv tipini Wrapper class tipinə çevirdik");
        }

        if (bobj instanceof Double){
            System.out.println("aobj Primitiv tipini Wrapper class tipinə çevirdik");
        }


        // Nümunə 2 - primitiv int tipinə çevirmə
        Integer a1Obj = Integer.valueOf(2);
        int a1 = a1Obj;

        // primitiv double tipinə çevimə
        Double b2Obj = Double.valueOf(5.55);
        double b2 = b2Obj;

        // Nümunə 3
        // ArrayList<int> list = new ArrayList<>(); // error

        ArrayList<Integer> list = new ArrayList<>(); // run uğurludur


        // Nümunə 4
        // int a2 = null; // error

        Integer a3 = null;

        // Nümunə 5
        ArrayList<String> programmingLanguage = new ArrayList<>();
        programmingLanguage.add("Java");
        programmingLanguage.add("Kotlin");
        programmingLanguage.add("Python");


        System.out.println(programmingLanguage);


        // Nümunə 9
        String str = programmingLanguage.get(1);
        System.out.println("Element at index 1: " + str);

        // Nümunə 10
        System.out.println("first variant: " + programmingLanguage);
        programmingLanguage.set(2, "JavaScript");
        System.out.println("Modified ArrayList: " + programmingLanguage);

        // Nümunə 11
        programmingLanguage.remove(2);
        System.out.println("remove: " + programmingLanguage);

        // Nümunə 12
        System.out.println(programmingLanguage.size());


        // Nümunə 13
        System.out.println(programmingLanguage.contains("Java"));

        // Nümunə 6
        String s = "Zəka";

        // Nümunə 7
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5); // 0-cı indeks
        numbers.add(6); // 1-ci indeks
        numbers.add(7);
        numbers.set(1, 9);


        // Nümunə 8
        int[] a4 = new int[10];
        a4[0] = 1;




    }
}



/*
        Collections'lar ilə Collection Framework fərqləri

        Collection - Obyektləri organize (təşkil) və manage (idarə) edib qruplaşdırmaq üçündür. Obyektlərin qruplaşdırılmasıdır
        Özü Interface'dir. Parent Interface'dir. Digərləri bundan extend (implement) edir.
        Collection  Interface'də Java Collections Framework'nun  ROOT (kök) Interface'dir. Collection Framework'nun əsasıdır


        Collections Framework - Ümummi arxitekturadır ki öz daxilində toplu şəkildə Java Interface'ləri var. Hansıki müəyyən
        implementasiyalar, alqoritmlər, collectionların özünə xas işləmə məntiqi var. Data strukturları və alqoritmlər
        mövzusuna dayanır. Collections Framework'lər nə üçün istifadə edilir və hasnı növləri var??
        Interface'lər toplusudur. Java Collection Interface'i nədir ?.


        Collections və Collections Framework tamamilə fərqli formalardı.

        Collections                                                         Collection Framework
        Sadəcə hər hansısa obyekt qrupuna xas olan bir şeydi.               Strukturlaşdırılmış bir Frameworkdur. Spring kimi bir şeydi
        Obyektlərin qrupları ola bilər.                                     Özünün irerxiyası var (classları və interface'ləri).
        Ad olaraq Ümumi konseptdi                                           Ümumi operationlar metodlar VAR
        Operationlar metodlar YOXDU !!!                                     Data strukturlarını buradan provide (təmin) edirik
        Data struktur YOXDU !!!                                             Alqoritmlər və müəyyən metodlar verir
        Alqoritm YOXDUR !!!
        Az organize (təşkil) olunub, consistent'dir (ardıcıldır)


        Collections Framework - Interface'lər toplusu verir və bunun sayəsində data strukturları və alqoritmlər istifadə
        edə bilirik.

        Collections Framework içində fərqli Interface'lər var. Bununda içində Collection dediyimiz əsas root Interface var
        Ən başda duran budu yəni ilki. Bunuda implement edən başqa Interface'lər var. List, Set, Queue, Dequee, Map


                       Java Collection Framework

      --> Collection (interface) <-----                   Map         Iterator
      ^           ^              ^                         ^             ^
     List        Set            Queue                  SortedMap      ListIterator
      ^           ^              ^
  ArrayList    Sorted Set      Deque
      ^
  LinkedList
      ^
    Vector
      ^
    Stack




          Collection Interface - root interface'dir. Onun daxilindən yuxarıda göstərildiyi kimi bu metodlar'lər gəlir
          Colletion Interface içində belə şeylər yoxdu, odan implement edib götürürük.

          Collection Frameworkdunda bunlardan əlavə olaraq Map və İterator adlı interface'lər var. Bunlar birə bir
          Collection Interface'nə xas DEYİLLƏR !!!. Sadəcə çox bağlıdırlar bir birlərinə. Hamısı birlikdə Collections Framework'nü
          əmələ gətirir


          1) List İnterface - Ən çox istifadə edilir. Daxilində də sub Interface'lər var:
                * ArrayList
                * LinkedList
                * Vector
                * Stack

        Stack və Heap'in işləmə məntiqindəki Stack buradan yaranır.

        * List Interface'də hər şey sıralı qaydadadır. Sıralı qaydada olduğuna görə Set ilə fərqi var
        * List Interface'dir deyə onun obyektini yarada BİLMİRƏM !!!. Lakin onu müxtəlif listlər vasitəsi ilə Interface
        şəklində istifadə edə bilərəm. Necə??

       1.1) ArrayList

            Collection
                ^
                ^ extend
                ^
              List
                ^
                ^ implements
                ^
             ArrayList

         Listin içində Collection Interface'i var. List özü Collection Interface'indən extend edir. ArrayList'i isə implement
         edir

         ArrayList ilə Array fərqli - Array bizə fix size (müəyyən ölçü) VERMİR !!!. Bunun ölçüsünü azaldıb artıra BİLMİRƏM !!!
         Gərək bir-bir silib yazasan. İndex'lənmə məntiqi OLMUR !!! Buda mənfidir. Bunun üçün biz ArrayList'dən istifadə
         edirik. ArrayList'in verdiyi imkanlar: Biz bunu dinamik Array'lər kimi adlandıra bilərik. Dinamik Array'lər nədir??
         Hesab edək ki  String'in içinə 100 ölçülü Array daxil edə bilərik. 54-cü adam Zəkadır. Onu sil və yenidən onu çağır

         Bu arada Arrayda bunu etsək yəni 53 silib yenidən ÇAĞIRAMMIRIQ. Məsələn şəxsiyyət vəsiqəsindəki nümunədən baxaq
         AA5088888 şəxsiyyət seriyalı şəxs vəfat etdi. Məndədə 1 vahid çox AA5088889 -du mən onun aldığı seriyanı ala BİLMƏRƏM !!!
         Array ilə biz dinamik formada heçnəyi idarə edə BİLMİRİK !!!. Ölçü öz özünə avtomatik artıb, azalıb, dəyişilə BİLMİR !!!
         ArrayList anlayışından istifadə edəndə ona dinamik array'lər  deyirik. Özü idarə olunur, dinamikdir

         ArrayList<List> arrayList = new ArrayList<>() --- <> Angel break. İçinə hər hansısa type və yaxud classın özünü
         ötürə bilərəm. Classların fieldlarını yığsın içinə

         Integer tipli arrayList
         ArrayList<Integer> arrayList = new ArrayList<>()

         String tipli arrayList
         ArrayList<String> arrayList = new ArrayList<>()


        Nümunə 1
        Primitiv tiplərin Wrapper Classları: Byte, Boolean, Character, Double, Float, Integer, Long, Short. Hamsı böyüklə
        Primitiv tipləri Wrapper obyektlərə çeviririk

        Bu adlanır Boxing and Unboxing məntiqi

        Boxing - Pirimitivi çevirirəm qoyuram bir qutunun içinə, çevirirəm Wrapper classa. Kiçiyi böyütmək


        Nümunə 2
        Unboxing - Wrapper classı primitiv tipə çevirdim. Böyüyü kiçiltmək. Wrapper obyekt olduğu üçün kiçildə BİLMİRƏM !!!
        Wrapper classın içindən çıxarmaqdır. Integerin içindən int'ə çevirməkdir


        Wrapper tipə çevirməkdə məqsəd ArrayList içində işlətməkdir. Sanki eynək qırılmasın deyə qoyuram qabın içinə. int
        dəyərini götürüb bürüyür, saxlayır böyük kimi. Sanki o obyketdir. Və onu angel break'lərin <> içində saxlaya bilirəm
        Çünki angel break'in içinə class qoymalıyam !!!



        Nümunə 4
        Primitiv tipə null dəyər mənimsətmək OLMUR !!!. Wrapper classsa null dəyər mənimsətmək olur. Çünki artıq o OBYEKTDİR

        Primitiv tiplər obyektlərə nisbətdə daha yaxşıdı istifadə etməkdə. Çünki obyekt bəzən başqa yerlədə problemlər
        yarada bilir

        ArrayList<E> - E burada hər hansısa elementin olacağını göstərir.
        Məsələn int dəyərini class kimi yəni Integer formada ötürürəm. Angel break'in içinə class qoymalıyam !!!


        Nümunə 6
        Burdakıda Nümunə 5'in eynisidir. Sadəcə olaraq list (Array) formasındadı, çoxlu String olacaq


        Nümunə 5
        programmingLanguage. yazdıqda ArrayList'in içindən metodlar gəlir. Bunlardan biridə add(String e) Bu odurki String
        formada elementlər daxil edə bilərəm

        Nümunə 8
        Əvvəl belə yazırdıq. Ya mən bunun konkret ölçüsünü (size) verməli idim, yadakı A NumbersArray işlətsəm belə bir
        bir indekslərini yazmalı idim.  Öncəki nümunə demişdik axı 88-ci insan remove olunsa, mən 89-yu  88-ci yerə qoymaq
        istəsəm, 1-dən 88-ə qədər hamını 1 vahid azaltmalıyam. Milyonlarla insanı düşünsək.... gərək hər insan öləndən 1-dən
        milyona qədər bi-bir azaldım

        ArrayList isə birə-bir Arraydir. Dinamik array adlanır. Demək olar eynidir. Üstünlüyü isə metodlar ilə istədiyim
        qədər add (əlavə) edə bilirəm

        set və get metodları var içində.

        set - ilk parametrinə yazacağım dəyərin  YERİNİ bəlirliyirəm. 2-ci parametrə isə əlavə edəcəyim dəyərin özünü yazıram
        Məsələn 1-ci yerə 9-cu dəyəri mənimsət.

        Bu zamanda 1ci indeksdəki element yəni 6 dəyişir olur 9.


        ArrayList'in Base Operatorları: add, access, change, remove

        1) add - Dəyər əlavə edir,  az öncə gördüyümüz kimi

        2) access - (get) Hər hansı elementi access (əldə) etmək üçün ik öncə String'ə mənimsədirəm. Çünki bir dənə String'i
        get edəcəyimi anlasın. Sonra onun elementini get edirəm. Göstərirəmki məsələn 1ci indeksdə nə var. ArrayList'in
        məntiqi odurli array'lə konfilktlər yaşamıyasan deyə qısa konkret get edib işimi görüm (Nümunə 9)

        3) change - (set) Hər hansı elementi change (dəyişmək) istəyirəmsə onu set edirəm Yuxarıda vurğuladığım kimi. İLk
        öncə yerini (1-ci parametr) sonra hansı dəyərlə dəyişəcəm o dəyəri verirəm (2-ci parametr) (Nümunə 10)

        4) remove - Hansı dəyəri istiyirəmsə onu silirəm (Nümunə 11)


        5) size() - Ölçüsünü almaq üçündür (Nümunə 12). Ümumi ölçünü yoxlayır - ArrayList'də length YOXDUR !!! size metodu ilə

        6)  sort() - sıralamaq üçündür

        7) clone() - bir ArrayList'i digər ArrayList'ə klon edirsən

        8) contains() - ArrrayListin içində təyin etdiyim dəyərin olub-olmadığıı yoxlayır (Nümunə 13)
        ArrayList'in 3 cür yaradılma forması var. Əgər mən rəqəmlər olan ArrayListmi yoxlayacamsa o zaman yoxlamaq istədiyim
        rəqəm yəni contains metoduna mənimsətdiyim dəyər Obyektdir. Çünki o Integerdən gəlir. ArrayList'in içindəki dəyərlər
        bir tip ola bilər !!!. String olan ArrayList'də İnteger axtarmaq düz DEYİL !!!

        9) isEmpty() - ArrayList'i boş olub olmadığını yoxlayır

        10) indexOf() - Elementin indeksini çıxarır


        1) ArrayList list1 = new ArrayList();
        2) ArrayList list2 = new ArrayList(10); - İçində 10-dan artıq doldura bilmərəm. .size() yazsaq belə ölüçüsünü 10 göstərəcək
        3) ArrayList list3 = new ArrayList(list2);

        Array'i declare edə bilərəm. Amma Intelized (inşalayz) edə bilmərəm

        Array fix size DEYİL !!!


        ArrayList içində dublicate (kopyalanmış) elementlər yaza  


*/