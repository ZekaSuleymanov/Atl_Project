package lesson_11_Encapsulation_common_attacks;

public class Rectangle {

/*
    // Nümunə 1'ə aid

     public double width;  // sonra width dəyərini zəka ilə dəyişmək istəsəm
     public double lenght;

    // Burda yuxarıdakı width'i qaytarır
    public double getWidth() {
        return width;
    }

    // İçinə parametr ötürüb set edirəm
    public void setWidth(double width) {
        this.width = width;
    }

    // lengt'i qaytarır, yəni uzunluğu return edir
    public double getLenght() {
        return lenght;
    }

    // Onun uzunlğunu təyin edir
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
*/
    // Hamını publicdən private'ə keçirdim. Çünki 2 ci dərsə öyrəndimki Encapsulation məntiqində fieldlar private metodlar
    // publicdir. Springdə biz anotation sayəsində bir düymə ilə publicləri private ilə dəyişəciyik
    // public double w;
    private double w;

    // public double l;
    private double l;

    // public double height;
    private double height;

    // Nümunə 4
    // public boolean turnOn;
    private boolean turnOn;


    public double getWidth() {
        return w;
    }

    public void setWidth(double width) {
        this.w = width;
    }

    public double getLength() {
        return l;
    }


    // Ordakı r1.setLength(5); edib ötürdüyüm 5 gəlir (double length) qismindəki length yerinəd oturur. Sonra 5 ordan düşür
    // this.l = length; ifadəsindəki length yerində durur. l olur 5. public double l = 5 olur. Sonra onu get edib oxudanda
    // l yerinə sout'da bizə 5'i qaytarır
    public void setLength(double length) {
        this.l = length;
    }

    public double getHeight() {
        return height;
    }

/*  Nümunə 2.1
    public void setHeight(double height) {
        this.height = height;
    }

*/
    // Nümunə 2.2
    public void setH(double h) {
        this.height = h;
    }

/*

    Nümunə 3
    public  double getH(){
        return height;
    }
*/

/*
    Nümunə 3 - bu kod səhfdir nümunə üçündür
    public  void signIn(){
        Rectangle a = new Rectangle();
        System.out.println(a.getLength() == a.getHeight());
        System.out.println("Success login");
    }
 */

    // Nümunə 4
    // is boolean
    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
}

/*
        Alt İnsert edəndə (genrate) niyə getter və setter ayrı-ayrı və bir yerdə var idi?. Çünki elə məlumat ola bilərki
        biz onu ancaq daxil etmək istəyirik. Həm daxil edib həmdə göstərmək istəsək set sonra get edirik

        Get edəndə sadəcə məlumatları toplayıram. setWidth olmasa mən məlumatları set edə bilmirəm. Sadəcə olsa idi getWitdht
        və setWidth olsa idi həm məlumatları toplayıram həmdə set (göstərirəm). Necə baş verir?
        width keçirirəm w, length isə keçirərəm l vəziyyətinə.

        150 dənə field olsa 150 dənə getter setter olacaq

        get void ola BİLMƏZ !!!. Çünki return var. Məqsədi odrki mənim verdiyim field'a əsasən metod yaradır. Verdiyim
        variable'da bir tipi olur axı. Hər variable üçün getter setter düzəltməliyik MÜTLƏQ !!!

        Bundan sonra biz rahat dəyişdirə bilərik məlumatı.


        Obyektin adını, parametri kimi ötürdüyüm variableyi dəyişsəm və onu set edəndə onun adını görmürəm Nümunə 2.2
        r1. yazsaq çıxmayacaq.
        Onun üçün adını dəyişəndə burda gəlib 3 yerdə dəyişməliyik. Obyekt adını, parametrini və thisdəki w
        1) obyektin adını setH() 2) double h 3) this.height = h;. Nümunə 2.3 dəki kimi

        Burda deyirəmki clasın içində this.height deyilən şey var adını dəyiş et h onuda ötür parametr kimi içinə.
        returnn height yazdığım classın daxilində yazdığım height'di (public double height). Buna görə clasımın daxilindəki
        məlumatı return edirəm. Məqsəd mən həmin məlumatı return edəndə o məlumatı görmürəm

        Əgər biz metodun adını setHeight() qoysam digər tərəfdədə setH() olsa məlumat digər tərəfdə oxunmayacaq. O zaman
        setHeight() bunun içinə ötürüləcək dəyərin nə olduğunu bilmirəm. Mən  burda nəyin içini doldurduğumdan xəbərdar
        deyləm. Ola bilərdiki double h içindəki hündürlük deyil finkoddu. Bu hal necə olur.
        Misal üçün public double h edirəm. Onda gərək getHeight() və setHeight(double h)'dəki height'lər dəyişir olur.
        Amma metoduların adları (getHeight() və setHeight(double h)) olduğu kimi qalır. Amma mənim ötürdüyüm data fincoddur
        İlk əvvəl demişdizki əsas məlumatları digər tərəfdə gizlədə bilərik.
        Məsələn mən heç birini dəyişəmmirəm. Mənə lazımdıki məlumatı (məsələn finkodu) set etmək lazımdır. Daxil etmək
        Bunu istifadəçi interfeysinə çıxaranda işçilər məlumatı set (daxil) edə bilər. Mən set etdiyim məlumatın get metodunu
        silsəm artıq setHeight olanı görürım amma getHeight görmürəm. Zəkanın kartı yaranan zaman hər hansı kart nömrəsini
        üzərinə set edə bilirəm. Operatorla danışanda kartın ya son nömrələrini yada tarixini soruşur. O məlumatların ancaq
        son hissəsini set edib sonra get edib baxa bilir. Biz kart nömrəsinin full get etməyə icazə VERMƏMİŞİK !!!, ancaq
        son hissəsini get etməyə icazə vermişik. Bu prosesidə filter validationlar vasitəsi ilə edirik (gəlcək dərslərdə biləciyik)

        Nümunə 3'ü yazmasaq setH() metodundakı dəyəri göndərəcəyik, lakin onu get edə bilməyəcəyik


        Bir sual çıxırki, məsələn User clasının içində 20 field var. O zaman 20 dənə getter setter yaradacam və 2yə vursam
        40 dənə metod yaradacam. Burdada kod təkrarı olur. Amma bunu Javada resolve edə bilmirik. Springdi belə bir anatation
        var - @Data - var. Bununla 20 min dənə fieldlarım olsa belə hamısı üçün arxada getter setter yaradır gizli şəkildə
        Bununla arxada lazım olan bütün konstructorları, getter və setterləridə yaradır. Lazım olanları yaradır. Hər hansınısa
        remove etmək istəsəm @Data anatotionu silirəm, orda gördüyüm anatotinları qoyuram (@Getter, @Setter)

        Entity və Dto fərqi. Entity klasın özüdü, Dto göstərmək istədiyim dəyərdi. Entity table (baza) ilə əlaqəli olan classdı
        Onun içində bizə fieldləri yerləşdirmək lazımdı. Göstərəcəyimiz fieldlər, datalar yəni. User clasındadılar. Onları
        biz Hr clasına əlavə edirik Entity ilə əlaqələndiririk. Entity'ə set edirik. İstiyirksə User bəzi məlumatları görməsin
        Dto deyirkki göstərdiklərimizi görə bilər User.

        Dto - Data Transfer Object - Datanın transfer olunması üçün yaradılan obyektdi. İçində User clasında 20 fieald var
        elə məlumatlar varki onu User görməməlidir. Mən bilmirəmki instadakı id nədir. Onun üçün istifadə edilir. Yəni
        User request göndərəndə ora göndərir. yəni User clasında olan passorword login'i istifadəçiyə göstərirəm amma
        DTO göstərmirəm. Burdada 2 class yaratmalıyam. Bir əsas Entity clası birdə onun DTO olanıki lazım olanları göstər

        Bir sorğu göndərirəm oda aparır Entity'də yoxlayırki elə bir şey orda varmı. Tutaqki 20 fielddan 2sini yoxlayır.
        DTO 2 məqsədi var. Biri datanı parçalıyıb istədiyimizi yoxlayır. Bunu DTO keçirməklərinin səbəbi?

        Nümunə 3
        Burada göstərdiyim şərt ödənsə uğurlu giriş olacaq applicationa. 2 parametr ötürürəm double length və double height.
        Mənə artıq 50 field'ın içini doldurmaq lazım olmadı, 2 field işlətdim ş həll oldu. 50 field dura dura niyə mən gedib
        kopya clasını yaradıram və hər şeyi təzədən yazıram? Bununla Core Javada yox Ms də rastlaşıram.
        Problem odurki Rectange classımız databasedəki əsas obyektimiz olacaq. Databasedə olan məlumatlar bunun içində olacaq
        Bu Entity (mənbə) bir başabase ilə əlaqəlidir deyə ciddi problem olacaq. CORS ilə kiberattack ola bilər. Mən birbaşa
        əsas klasa bağlanmışam axı (əsas classın obyektini yaratmışam çünki).  

        Dao - Data Access Object


        Nümunə 4 - dəki kimi boolean tipində dəyər yazsanda isTurnOn alırıq. Encapsulationda bu qanun ancaq adiddir
        boolean dəyərlərə. Boolean məntiqi ilə baxsaq məsələn zəka hal hazırda sinifdədir. Boolean olaraq sinifədidrsə
        true deyilsə false qayıdacaq. Burda boolean məntiqində proyektor qoşuluDUR? kimi bir məntiq yaranır. Yes yada no
        Burda sualın qoyuluşu dəyişir. Proyektor qoşuluDURMU?. return edəndə set olduğu kimi qalır amma get yerinə is olur





}
*/