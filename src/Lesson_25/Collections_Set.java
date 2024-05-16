package Lesson_25;

import java.util.*;

public class Collections_Set {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    public static void main(String[] args) {
        // Nümunə 1
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(3);
        System.out.println("HashSet: " + evenNumbers); // Output: HashSet: [2, 3]

        HashSet<Integer> numbers = new HashSet<>();

        // addAll() metodu istifadəsi
        numbers.addAll(evenNumbers); // Hamısını əlavə edir
        numbers.add(5);
        System.out.println("New HashSet: " + numbers); // Output: New HashSet: [2, 3, 5]


        // Nümunə 2
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> evenNumbers2 = new HashSet<>();
        evenNumbers2.add(2);
        evenNumbers2.add(4);
        System.out.println("HashSet: " + evenNumbers2);


        // Nümunə 3
        // Intersecton of two sets - 2 HashSet kəsişdirir
        evenNumbers2.retainAll(primeNumbers);
        System.out.println("Intersection is: " + evenNumbers2); // Output: Intersection is: [2]

        ArrayList<Integer> evenNumbers3 = new ArrayList<>();

        evenNumbers3.add(2);
        evenNumbers3.add(4);
        System.out.println("ArrayList: " + evenNumbers3);

        // Nümunə 4
        // Creating a LinkedHasSet from an ArrayList
        LinkedHashSet<Integer> numbers1 = new LinkedHashSet<>(evenNumbers3);
        System.out.println("LinkedHashSet: " + numbers1);


        // Nümunə 5
        //Creating an EnumSet using allOf() - allOf() ilə hamısını EnumSet içinə atırıq
        EnumSet<Size> sizes = EnumSet.allOf(Size.class);

        System.out.println("EnumSet: " + sizes);

        // Nümunə 6
        EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);

        System.out.println("Empty EnumSet: " + sizes1);

        EnumSet<Size> sizes2 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);

        System.out.println("EnumSet: " + sizes2);


        // Nümunə 8
        EnumSet<Size> sizes3 = EnumSet.of(Size.MEDIUM);

        System.out.println(sizes3);


        // Nümunə 9
        EnumSet<Size> sizes4 = EnumSet.allOf(Size.class);
        EnumSet<Size> sizes5 = EnumSet.noneOf(Size.class);

        sizes5.add(Size.SMALL);
        System.out.println(sizes5);

        sizes5.addAll(sizes4);
        System.out.println(sizes5);


        // Nümunə 10
        NavigableSet<String> numbers2 = new TreeSet<>();
    }
}



/*
    HashSet - Nümunə 1
    HashSet - Set interface'ni impelement edir. Set İnterface' Collection interface'ni extend edir
    Arraylist'i və HashSet'i demək olar eyni şeydi deyə bilərik. Amma ArrayList resizeable'dir. İçinə nə istəsək doldura
    bilərik. ArrayList'də elementləri index ilə accsess edə bilirəm

    HashSet - Nümunə 2
    HashSet Load factor prinsipi ilə işləyir. First parametr bizim kapasitemizdir. Burada 8 yerimiz var oda bölünür
    8'lik 2 hissəyə olur 16. Əgər bizim kapasite 16 olanda load factor onda 0.75dir. Buda edir 12. Yəni HashSetin içində
    12 (element qoyulanda) yer dolandan sonra bu özünün load factoru qədər özünü artıracaq yəni 16 dəfə. Oda edir 28 yer
    Gözləyir 28'in 75% dolmasını gözləyir yəni 21 yerin. O zaman özünün Load Factoru qədər yer artıracaq yəni 21 + 28 =49
    Məqsəd odurki Arraylist bizə konkret size vermir amma HashSet konret size verir. Hashsetdə istədiyim elementi tapmağa
    imkan verir. Hash table (Hash Code) ilə işlədiyinə görədir. Hamısına unique (xüsusi) tanınma verir. Əsas olacaq dublicate
    (eyni) element contain etmir. (tərkibində olmur) İki dənə 2 yazsam, bir dənə 2 çıxaracaq. ArrayListdə olar.
    HashSetdə heç birinin sırası olmur random məntiqi ilə işləyir və elementlərə hashcode verir, amma Arraylistdə sıra olur

    Set'dən implement edir
    * remove();
    *removeAll();
    * İterate'də var


    Nümunə 3
    İntersection of Set - 2 HashSet'in kəsişməsini tapırıq. İkisindədə eyni olan dəyəri çıxarır

    // Nümunə 4
    LinkedHashSet - burdada Load Factor prinsipi var.  ArrayList'in içindəkiləri LinkedHashSet'in içinə atır.
    Məqsədi hər hansı Collectiondan LinkedHashSet yaratmağa imkan verir. LinkedList'lər nodelarla işliyir. Burda işləmə
    prinsipi: Set'dən gəldiyi üçün doublecate olmur, Hashsetdə sıra bilinmir amma burada bilinir (indexləmə məntiqi)
    Metodları eynidi. Fərqi odurki hər şey Linklənmiş formadadı. Hamısının xüsusi İD'si olur.


    EnumSet allOf() - (Nümunə 5)
    EnumSet allOf()- Collection Frameworkda hər hansısa Enumları toplayır EnumSet içinə atır

    EnumSet noneOf() - Nümunə 6
    EnumSet noneOf() - Dolu Size boş Size edir. - EnumSize'da Enum type insert edəndə ancaq Size istifadə edə bilərəm

    range() - Nümunə 7
    range() - Containing of valularını yoxlamaq üçündür. Parametr kimi verdiyimiz 2 dəyərin arasında hansılar var onları göstərir

    of() - Nümunə 8
    of() - Xüsusi göstərilmiş elementi götürür və o dəyəri qaytarır.


    Nümunə 9
    add(); - Tək tək əlavə etmək
    addAll(); - grup şəklində birini digərinə əlavə etmək

    Union - 2 Enum'ın birləşməsi
    İntersection - 2 Enum'ın kəsişməsi

    Nümunə 10
    NaviableSet Interface - Navigasiya kimi bir məntiqi var. Bu Java SortedSetə bənzədiyir. Onun içindən götürür. SortedSetin
    metodlarının sanki Override olunmuş variantıdı. Java SortedSet içində headSet(), tailSet(), subSet() metodları var

    subSet(element1, element2) - 2 parametr veririk. Yəniki element 1, element2'i öz içində barındırırmı, yəni
    element2 element1'in içindədirmi

    hadSet() - xüsusi olaraq verdiyimiz elementdən əvvəl olanların hamısını qaytarır >=
    tailSet(element) - xüsusi olaraq verilmiş elementin özü və sonra gələnlərin hamısını qaytarır <

    tailSet(element, booleanValue) - true, false olmasınıda yoxlayıram. Məqsəd odurki mənim ona verdiyim elementdənsonrası
     varsa həm onları qaytarmağı həmdə true yada false verərək isə verdiyim dəyəridə geri qaytarıb, qaytarmamğımızı
     göstəririk. Verdiyim dəyərdən böyük dəyər versəm, özünü yox sonrakıları atır.

 */