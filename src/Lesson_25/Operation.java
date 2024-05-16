package Lesson_25;

public enum Operation {
    Sum('+'), // Sum'a dəyər mənimsədir
    Subtrack('-'),
    Multiply('*'),
    Divide('/'),
    Modules('%'),
    Default('%');

    private  char c;

    Operation(char c){

    }
    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    // Operationu almaq üçün. nə olduğunuda görmək üçün (Sum yada başqa şey)
    public static Operation getOperation(char c){
        if (c == '+') return  Operation.Sum;
        else if (c == '-') return Operation.Subtrack;
        else if (c == '*') return Operation.Multiply;
        else if (c == '/') return Operation.Divide;
        else if (c == '%') return Operation.Modules;
        else return Operation.Default;

    }


}


/*
        Konstructorlu Enumlarda - Konstructor daxilində parametr ötürürk və parametr əsasında lazım olanları bir-bir
        daxil edirik.
        Default konstrctor isə - heç bir dəyər daxil etməriksə əgər
        * İçinə ötürdüyümüz parametrlərin hər biri  Konstructordan gəlir.
        * İçi boş nəsə varsa boşluq ötürməmək üçün ayrıca onun üçün default konstructor yaradıram. Və ordan deaultu get
        edə bilirəmki mənim verdiyim karakter nədir

        Öncəki Enumlar:

        public final class Operation{
            public static final Operation SUM = new Operaton(c'+') // Sum'ı seçir və obyekt kimidisə '+' parametr ötürür
            public static final Operation SUBTRACK = new Operaton(c'-')
            public static final Operation MULTIPY = new Operaton(c'*')
            public static final Operation DIVIDE = new Operaton(c'/')
            public static final Operation DEFAULT = new Operaton()
        }


        Enumların içindəkilərin hər biri public static final'dır. Bunlarla paralel bunlar final'dır
        Çünki onun dəyərini DƏYİŞDİRƏ BİLMİYİM. 2'dənə konstructor yaradıram  defaut üçün ayrı karaterlər üçün ayrı yazıram
        Obyektləri yaradıb içinə karakter ötürürəm, kararakterimdə char c olaraq geri dönüş edir

        Əgər kimsə başqa nəsə  məsələn vergül daxil etsə null qaytarır buda başqa xəta yaradır

        Enum özü public final klasdır
        İçində yazdığımız bütün dəyərlər public static final. final'da görmədiyimiz üçün dəyişədə bilmirik zatən
        char ilə onun xarakterini verirəm

        Məsələn biz otel otağıının tipini nəyinsə ölçüsü, yadaki məktəbdə olan rollar. User Teacher Supervizor

        char burada onun xarakteridir. Məsələn pizzanın ölçülərini veririk Enumla. Və onun acılı acısız olmasını char ilə
        veririk.
        Enumların içinə parametrli parametrsiz formada ümumi common kodları saxlaya bilərik. Və içinə paramter ötürə bilərəm
        Məsələn Delux otaq götürürəm (Enum) və içinə bir default konstructor və birdə parametrli (string, int, yada char'dı).
        String içində də bəzəkli, bəzəksiz yazıram
        Enum Dəyərlərimdə böyük hərflə olacaq

        Ümumiləşdirsək c onun parametridir. Onun xarakteristikasıdır. Olada bilər olmayada bilər

        Enumla həm dəyişilməzliyi əldə edirəm, həm bir qəlib yaradıramki bunların, yəni yaradıqlarımın üzərində işləyəcəm,
        ən əsasıda odurkiEnum klasını heç kim dəyişdirə bilməyəcək

        Enumlara implement edə bilirik amma extend edə bilmirik çünki final'dır. Enumla has a relationship qura bilirik ancaq

        Enum dəyişilməzdir. Onu hər hansısa klasın içində extend edəndə, extend etdiyim klasın içində orada dəyişiklər oluna bilər
        və bu problemdir. Lakin implement etdiyimiz yerdə dəyişiklik etməyəciyik deyə bu doğru məntiqdir
        İnterface'də ancaq metod qeyd edirəm. Dıyişiklik etsəm belə ancaq adını dəyişirəmki buda Enum məntiqini pozmur
        İmplementdə dəyişmək olmur deyə implement edə bilərəm, extenddə dəyişiklik olur deyə extend edə BİLMİRƏM

        1) Enum bir növ menu'dur (dəyişilməzdir). Net seçimlər etməyizimiz üçündür
        2) Mənə net dəyərlər verir. Verdiyim dəyərlər bəllidir, həmçinin return etdiyim dəyərlərdə bəllidir
        3) Parametsiz konstructor yaratmaqla imkan verirki default olaraqda nəsə mənimsədək. Və defualtda gəlsə istədiyimiz
        nəyi qaytaracğını yazırıq
        4) Constructoru default olaraq private'dir
        5) Daxilində qeyd olunanlar public static finialdır
        5)İstifadə məqsədləri fərqlidir
        6) Enum dəyişilməz klasır, extend edə bilmir, implement edə bilir. İmplement etməkdə məqsəd odurki nəyisə qeyd etməkdirki
        nəyisə götürüb overide edib işlətdim


        Fieldlar
        Enumlar sanki Singleton Patternlərə oxşuyur. Singleton'a tədbiq edilən məntiq Enumla eynidir.
        Singleton'nun məntiqi bir problemin həll üsuludur

        Enumlar ilə Constantlar fərqi - Enum İnterface constantlarını dəyişə bilməz.
        Constantın özü sanki Enum type'dan nəsə alır. Enum type da Enuma mənimsədəndə Compail error verir

        Enum Interface'ləri implement edə bilir və İnterface'lərin içində metodlar olur (default metodda ola bilər)
        Enumlar ilə Interface'dəki default metodu override edə bilmərsən. Çünki default metodu çağıranda superklasının
        içindəkini gətirir bu zamanda Enum klası modidie edilir

        Enum klasının İnterface'i override etməsən (default metodu) gedib İnterface'in içindəkini çağıracaq. Buda Enum
        klasa qıraqdan toxunuş olur.

        Enum'ın - konstructoru const private
        Enum fileds - public static final

 */
