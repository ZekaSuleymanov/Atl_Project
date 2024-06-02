package lesson_14_Desing_Pattern_Interface_Abstraction.Builder;

public class User {
    private Long id;
    private Long id1;
    private Long id2;
    private Long id3;
    private Long id4;
    private Long id5;
    private Long id6;
    private Long id7;

    public User(Long id, Long id1, Long id2) {
        this.id = id;
        this.id1 = id1;
        this.id2 = id2;
    }

    public User(Long id, Long id5, Long id6, Long id7) {
        this.id = id;
        this.id5 = id5;
        this.id6 = id6;
        this.id7 = id7;
    }

    public User(Long id, Long id3, Long id4, Long id5, Long id6, Long id7) {
        this.id = id;
        this.id3 = id3;
        this.id4 = id4;
        this.id5 = id5;
        this.id6 = id6;
        this.id7 = id7;
    }

    /*
          Bizə belə Case lazım olduğu halda bu formada eybəcər bir kod ortaya çıxır. Lombok ilə işlədiyimiz zaman annotation
          @Builder qoyduqda bu problemi aradan qaldıracaq. Lombok kitabxanası Spring initializer'dən götürülür
     */
}



/*
        8 fərqli field'ın hər dəfəsində obyektlərini yaratmaq istəsəm 8 faktarial qədər constructorlarını yaratmalıyam
        Bunuda bizi yarada bilmərik, yaratsaqda düzgün idarə edə bilmərik.
        Bu problem üçün @Builder Desing Pattern var



          @Builder Desing Pattern'nin yaratdığı forma odurki obyekt yaradan zaman mənə hansı fieldlar lazımdırsa sırf o
          field'ı işlədir  (https://refactoring.guru/design-patterns/builder) ilk fotodakı kimi
          Hansı field'ı seçirəmsə ona uyğun constructor yaradır !!!

          Məsələn House'ım var. İçindədə müəyyən field'larım var. Birinci field ilə hovuzlu ev yaradıram İkinci field ilə
          qarajlı ev yaradıram. Üçüncü field ilə heykəlli ev yaradıram. Beşinci field ilə isə hovuzlu, qarajlı, fontanlı
          ev yaradıram. Necə yaranır??

            <----  +House(windows, doors, rooms, hasGarage, hasSwimPool, hasStatues, hasGarden) parametrləri --->

new House (4, 2, 4 true, null, null, null, ...)                                         new House (4, 2, 4 true, true, true, true, ...)
        4 pəncərə var                                                                       4 pəncərə var
        2 qapı var                                                                          2 qapı var
        3 otaq var                                                                          3 otaq var
        Qaraj var                                                                           Qaraj var
        Hovuz yoxdu                                                                         Hovuz var
        Heykəl yoxdu                                                                        Heykəl var
        Bağçsı yoxdu                                                                        Bağçsı var

        Bu düzgün DEYİL !!!. Belə obyekt YARATMIRLAR !!!. Çünki parametlər null gedir


        @Builder Desing Pattern özlüyündə constructor yarada bilir. Builder deyəndə mənə lazım olan obyelkti yaradır və verir
        Kod olaraq işləməyi: Bir Interface olur. Bütün fieldları Interface'də hamısını metod kimi çıxarır. Sonra konkret
        nələr lazımdısa seçir. Sonrada product1 və product2 yaradır
        Məsələn:

        Hansını istiyiriksə @Builder Desing Pattern ilə onu çağırıram

        SyllabusRequestDTo a = SyllabusRequestDTo.builder()
            .name: ("Zəka")
            .id: (4)
            .build();

        SyllabusRequestDTo qoyandaan sonra lazım olanları doldururam. Classdan nə ötürəcəmsə onu qaytaracaq


        @NoArgumentConstructor - bütün parametrsiz constructorları yarat
        @AllArgumentConstructor - bütün parametrli constructorları yarat
        @RequiredAllConstructor - mənə lazım olanlar hansıdırsa onu yarat
        @Data - getter və setterləri yaradır

*/