package lesson_14_Desing_Pattern_Interface_Abstraction;

public class Main {
    // Nümunə 1
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);

        // Nümunə 2
        ProrammingLanguage pl = new ProrammingLanguage();
        pl.getName("Java"); // daxilinə set etdiyim meodu götürürəm
    }

}


/*
        Interface özü abstract class adlanır. Abstract classın qarşısında public abstract class yazılır
       * Abstract classın digər classlardan fərqi:
       1) Abstract classın (Interface'in) obyektini yaratmaq OLMAZ !!!

       * Abstract metodu dedikdə (interface) dedikdə xəyal kimi bir şey nəzərdə tutulur. Bunu necə düşünə bilərik ?
       Məsələn Atlet classımız var və içində hasnı metodlar ola bilər?. Üzmək, qaçmaq və güləşmək. Problem nədir?
       * Biz Inhertance'dan (varislik) istifadə etdiyimiz zaman ehtiyac duyduqca Override edirdik. Yəni məcburiyyət yox idi
       * Classın qarşısında İnterface yazıb qeyd edirik və hər hansı metod yazırıq  (Polygon interface'indəki kimi)
       * Interface məqsədi odurki yazdığımız metodların heç birinin body'si olmur. Ona görə biz bunu xülya (xəyal) kimi
       adlanıdırırq. Yəni orda var amma heç bir rolu yoxdu, heçnə vermir bizə
       * İstifadə məqsədi: Mənim fərqli yerlərdə istifadə edilən ümumi bir metodum olur. Bunu çıxardıram Interface'ə və
       onu yazıb saxlıyıram. Interface'dən onu dəfələrlə implement edib istifadə edirəm.
       Məsələn: getArea() adlı metodum var. Və fiqurların sahəsinin hesablanma məntiqi fərqli ola bilər. Onun üçün getArea()
       metodunu Interface çıxarıram. Interface daxilində adını qoymuşam (Polygon interface'ində). Sonra o Interface'dən
       istifadə edən bütün classların hər birndə getArea() metodunu görüb işlədə bilərəm. Hər classda ehtiyac duyduqca onu
       implement edib çağıracam və artıq metodun bodysini yazaraq funksiyonallıq əlavə edirəm (istifadə edəcəm)

       * Interface'ilə Inhertance əsas fərq: (Interview sualıdır) Nümunə 3
       1) Interface'lər multiple implement təsdiqləyir. Vergül ilə bir classdan 2 dənə Interface'i implement edə bilirəm.
       Bu Inhertace'də bu YOXDUR !!!. Ancaq 1 dənə implement (extend) edə bilərəm

       * Inhertance'də bizə parentdən nə verilirsə onu götürürük, yada bir başa nəyisə çağıranda içindəkilər verilir
       * Interface'də isə içi boş metodlardı və metodu ancaq adı var

       interface A{
          // members of A
       }

       interface B{
          // members of B
       }

       class C implements A, B {
        // abstract members of A
        // abstract members of B
        *

       * Code to İnterface - çalışmalıyıqki bütün kodları interface'lər üzərindən aparaq



     Nümunə 4

public interface CanRun {

    public static final int a = 3;

    public abstract void run();
}



       Nümunə 4 - public abstract void run(); - yazdığım metod arxada default olaraq bu formada olur. interface'in metodları
       bu formada yazılmalıdır. Lakin buna çoxda ehtiyac duyulmur. Çünki interface deyirki səni anlıyıram və interface özü
       full abstract class olduğu üçün, asbtract olaraq bütün keywordları öz qabağına qoyur. İnterface məqsədidə başqa
       classlardan onu işlətməkdir deyə public keywordunuda yazacaq. sən narahat olma. Sadəcə olaraq void run() yaz bəsdir
       (Aşağıdakı kimi)


public interface CanRun {

    int a = 3;

    void run();
}


       Interface'lərin bir problemi var. Gərək hər interface daxilində bir metod yazaq. Bu prinsipdir. Məsələn 2 metodum
       var child classda tələb etmir yazılan metodu. Child class onu tələb etmir ki işlədim metodu. Nümunə olaraq Atlet
       parent classım var, child classlar isə grappler, swimmer var. Hesab edəkki parent classını interface etsəm və
       onu child classlarda onu mütləq implement etməliyəm və içinidə doldurmalıyam.
       Sual: niyə tələb etdi və  tələb edəndə hansı məntiqsizlik baş verir ?
       Bayaqki nümunədən yola çıxsaq Atlet interface'in içindədə canSwim(), canRun(), canGrappler() metodlarım var.
       3 dənə classım var. Paraolimpik idmançı, Grappler, Swimmer. 3də Atlet clasınl'ni implement etməlidir. Burada olan
       prosesdə olan mənfiki - Para olimpiyaya ilə məşğul olan şəxs fiziki məhdudiyyətlidi. Para olimpiyaçıdanda məcbur
       şəkildə tələb edir Override etməyimi. Amma Inhertance istifadə etsəm problem YOXDUR, TƏLƏB ETMİR !!!
       Interace istifadə etsəm amma məcbur implement edib işlətməyimi istiyir. Para olimpik idmançıda Atlet classımızı extend
       edir. Bu zamanda tələb olunurki bütün metodları implement etməlidir. Oda gedir canRun() metodunu implement edir.
       Ammaki para olimpik idmançınında ayaqları yoxdur, və ona canRun metodunu assign (təyin) etmişəm. Belə bir məntiq
       ola bilməz kodda məntiqsizlikdir.
       Yada Swimmer'də yaxşı üzür amma güləşə blmir. Amma ona canGrappler() metodunu implement etdirir
        

        Nümunə 5
        Yaratdığım Atlete və Swimmer nümunəsinə baxaq. Atlet interface'də olan doExercise metodu yaza bilirəm. Swimmerdən
        onu implement edəndə metodun metodun Override olunmasını tələb edir. Sonradan mən gəlib Atletə void run() metodu
        yazsam məntiq xətası olacaq axı. Swimmerin işi qaçmaq deyil ammma mütləq şəkildə implement-Override olunmasın tələbi
        var. Interface'də nə varsa istifadə olunmalıdır

        Interface'lər nəyə görə önəmlidir: Məsələn biz Student classını yaratsaq və istəsəkki onun run metodu olsun. Abstract
        Athlete classından extend əvəzinə CanRun interface'inən implement etməyi daha doğrudur. Həm ierarxiya baxımından
        həmdə burada SingleResponsibilty prinsipini qorumuş oluruq (Interface özü full abstractdır)

        Bir dənə metodum olur

        S.O.L.İ.D Principles

        1) S - Single Responsibility Principles - Bir class yalnızca özünə aid ola işlərə qulluq etməlidir. Əgər TaskService
        yazırıqsa orada UserUpdate və.s OLMAMALIDIR !!!. Əlavə olaraqd əgər Animal class varsa bu sadəcə Animal classa aid
        olmalıdır Car classına yada digər classlara aid ola bilməz.

        2) O - Open-Closed Principle - İstifadə və modikiyasiyaya bağlı olmalıdır, lakin extnsiona açıq olmalıdır

        3) L - Liskov Substitution Principle - canFly(), canSwim(), canRun(), - Fish can only swim but not can run or fly
        Liskov deyirki implementasiya varsa bunların hamısı dəyər qaytarmalıdır, canSwim varsa mütləq canRun olacaq. Sonra
        Segregation Principle'da bizə dyirki 3 dənə belə metod yazıb hardasa exception almaqdansa götür hamısı üçün ayrıca
        class yarat, canSwim interface yarat içində canSwim metodu olsun məsələn. Mənə canSwim metodu lazım olsa ordan implement
        edib istifadə edim. Qısacası: Bir dənə yarat hər yerdə çağır(İmplement etdiyim metodlara body verməliyəm)

        4) İ - İnterface Segregation Principle - Segragation isə bizə deyirki bir Interface olub min metod olana kimi, ondansa
        min Interface hamısının daxilində bir metod
        (Bir bir yarat hər yerdə istifadə et)

        İnterview sualı:
        Liskov Substitution ilə İnterface Segregation bir biri ilə əlaqəlidir. 4 POZULANDA 3 POZULUR !!!

        Nəyə görə Interfacelərə default metodlar gəlib?
        Çünki bir müddət sonra Interface'ə yeni metod əlavə etsək ondan implement edən bütün classlar məcbur olaraq metodu
        implement etməlidir. Lakin default metodla bunu aradan qaldırmaq olar. Başqa bir nümunə isə Java 8-də Stream APİ gəldi





        Desing Pattern

        Desing Pattern - Hər hansı problemlərin common həll üsullarıdır. Əgər hər hansı işlə məşğul olansansa o işin həll
        yolunun standart dizayn forması olur. Desing Pattern'ların bir neçə fərqli növləri var. İç patternlər özü bluprintlərdir
        (çertiyojlardır). Hər biri hər hasnı problemi həll etmək üçün istifadə edilir.

        Patternlər özü algoritmlərdir və o alqoritmlər üzərindən fərqli strukturlar qurusan

        * Creational Desing Patterns 5 növü var

        1) Singleton -  databasa ilə connection yaratmaq üçün obyektin təkrarən yaradılmasının qarşısını alır.
        getDbconnection metodu yaradıram və orada yoxlayır ki həmin classın instance'ı (obyekti) varsa yeni obyekt YARATMIR !!!
        həmin obyekti return edir. Yoxdursa yeni obyekt yaradır və oni return edir
        Şərtləri:
        1) Constructor private olmalıdır
        2) Static metod olmalıdır, hansıki içində obekt yaradırıq - həmin classın obyektini yəni
        Mənə imkan verirki, elə bir class (instance) ola bilərki mən ondan 50 dənə obyekt yaradıram. Ammaki bu 50 obyekt
        düzgün variant DEYİL !!!. Çünki 50 obyekt yaratdığım an database qoşulmaq istiyirəm. Mən 50 dəfə database'i implement
        edib hardasa yaradanda hər dəfə refresh olur. Düşünəkki 1-ci dəfə database yaratmışam, içinə 10 dənə data düşüb.
        Bir müddət sonra biri gəlib yenə obyektini yaradır o anda yeni database yaranır və içinə 10 dənə data düşüdü.
        Və belə belə davam edir. 100 dənə data varsa hərəsidə bir obyektin içindədi. Bizə belə şey etməliyiki database
        başqa heç yerdə yaratmaq OLMASIN !!!
        Bir class düşünək. Elə etməliyəmki classın nə qədər obyektini yaradıramsa yaradım Hashcode'u dəyişilməsin. Yəni
        yeni obyekt yaratsam belə yeni yaranmış OLMASIN !!! Mənə ancaq kopyasını yaratsın. Yəni ortada biri əsas olmalıdır
        ətrafıdakılar kopyasıdır (https://refactoring.guru/design-patterns/singleton) bu linkdə olan 1ci fotodakı kimi

        50 dənə obyekt yaratsam və Hashcode'larını yoxlasam hamısın fərqi olacağını görəcəm. Ammaki Sigleton istəyirki
        nə qədər obyekt yaradıramsa yaradığım yenədə mənə eyni hashcode'da olan obyekt qayıtmalıdır

        Məntiq odurki database'im var və hal-hazırda işləyir. Mən obyekti gedib bir daha yaradıram o zaman yeni bazaya
        qoşulur. Bir bazada gündə 50 dəfə yenilənədə BİLMƏZ !!!. Məsələn Kapital Bank yarandığı gündən eyni obyektin üstündə
        işləyir. Gündə bir obyekti YARANMAMALIDIR !!!. Yaransa belə içindəki datalar yeni obyektə köçürülür referansım oradı

        Ardı Singleton package içindədi ---->



        Dəyişilməz class yaratmaq üçün Singleton üsulundan istifadə edilir. Singleton əsas olaraq bizim Bean'lərin scope'dur
        (əhatə dairəsidir). Proyekt yarananda databas'nın connection obyektini bir dəfə yaratsın



        Singleton müsbət tərəfləri:
        1) Classımın yalnız 1 instance (obyekti) olur
        2) Global accessi (icazəsini, əldə etməni) bağlıyıram
        3) Singleton obyekt hansıki lazım olduğu an 1-ci initialized (mənimsədilən) olan obyekt olur. Çünki database connnection
        1-ci olmalıdırki mənim proyektim run olanda onun içinə məlulmatlar gedə bilsin. Onun üçün Singleton işə düşür

        Singleton mənfi tərəfləri:

        1) Single responsibilty prinsipini pozur - çünki bir class həm database yaradılmasına qulluq edir eyni zamanda
        Singleton işinə qulluq edir.
        2) Multithreading envoriment (mühit) olanda biz Singleton obyektlərini bəzən create (yarada) edə bilmirik. Çüki
        Multithreading envoriment'də eyni zamanda 100.000 işçi işləyir (100.000 run düyməsi olur). O zamnda hərəsinə click
        edəndə hər dəfə yenidən yaradır. Ona görədə Multithreading envoriment'də Singleton Desing Patterndən istifadə EDİLMƏMƏLİDİR !!!



        Builder Desing Pattern

        Builder package'ə bax --->


        Factory Method -
        Uber aplicationunda ancaq əvvəl taxı vardı. Sonra eco, standart, biznesclass yarandı. Mənimdə logistic var. Sonradan
        logistika arta bilər. O zamanda aləm bir birinə dəyir. Update etməliyəm. Bunun üçündə Logistics Interface'ni yaradıram
        Sonrada Interface'lər vasitəsi ilə sadə metodlarını parçalaya bilirəm (CreateTransport yaradıram və retrun edirəm track,
        sonra ship və.s).

        Düşünəkki kurs zavoddur və çoxlu tələbə buraxır. Xammal olaraq tələbə gəlir onu işləyib developer kimi buraxır.
        Developerin məqsədi kod yazmaqdır. Developer Factory'in məqsədi developer yaratmaqdır Bax Factory package -->


 */