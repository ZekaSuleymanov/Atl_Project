package lesson_10_OOP_Consepts_Access_Modifiers_Specifiers_Throwing_Excptions;

public class Main {
    public static void main(String[] args) {


        final int a = 5; // bunun artıq dəyərini dəyişə bilmərəm
        // a = 4; // exception

        Tree tree = new Tree();

        // Nümunə 1
        // tree.height;


        // Nümunə 2

        int a1 = 5;
        int b = 6;
        int c = 7;


        System.out.println(b+c);


        // Nümunə 3
        walk1(1, null);

        // Nümunə 4
        // walk1(1, null, null); // adresini qaytarır

        walk1(1, 2, 3, 4, 5, 6, 7, 8, 9);


        // Nümunə 5
        System.out.println("*****************************");

        // Nümunə 5
        int num = 4;

        System.out.println("Before value: " + num);

        changeNum(5);

        System.out.println("After value: " + num);


        System.out.println("******************");


        // Nümunə 6
        StringBuilder ad = new StringBuilder("Zəka");

        System.out.println("Before value: " + ad);

        changeAd(ad);

        System.out.println("After value: " + ad);


        System.out.println("************************");


        // nümunə 7
        String ad1 = "Elgün";

        System.out.println("Before value: " + ad1);

        changeAd1(ad1);


        System.out.println("After value: " + ad1);


        System.out.println("***************************");


        // Nümunə 8
        String ad2 = "Elgün";

        System.out.println("Before value: " + ad2);

        changeAd2(ad2);


        System.out.println("After value: " + ad2);
    }

    // walk1 və walk2 eyni şeydi
    public static void walk1( Integer a, int ... nums){ // String yazsaq və Nümunə 4 dəki kimi yazsaq Stringin adrsini çıxaracaq
        System.out.println(nums);
    }

    public static void walk2(int[] nums){

    }

    public static void changeNum(int num){
        num = 8;
        System.out.println("in method: " + num);
    }

    public static void changeAd(StringBuilder ad){
        ad.append(" Süleymanov");
        System.out.println("in method: " + ad);
    }


    public static void changeAd1(String ad1){
        ad1.concat(" Mahmudov");
        System.out.println("in method: " + ad1);
    }

    public static void changeAd2(String ad2){
        String c = ad2.concat(" Mahmudov");
        System.out.println("in method: " + c);
    }
}


/*
        Metodun dizaynı

        public final void nap(int minutes) throws InterruptException{
            take a nap
        }

        * public - Access modifier
        * final - optional specifer
        * void - return type - void geriyə heçnə qaytarmır. void yerinə data tipləri yazıla bilər (int, String, boolean, float)
        * nap - method name
        * int minutes - parametrlərin siyahsı
        * throw - excepion
        * take a nap - method body


        Access Modifier - İcazəni modifikasiya etmək. Bir növ "kapsama alanımızı" bəlirliyir. Yəni method bu package içində
        olar amma başqasında olmaz, bütün klasların içindən əl çatan ola bilər ya ancaq bir klasın içində əl çatanlıq ola bilər

        Access (Optional) Specifier - field və metodlara xüsusiyyət verir. Məsələn dəyişilməzlik

        final - variable'yə yazsaq, biz onun dəyərini dəyişə bilmərik. Məsələn default olaraq pi'nin (3.14) dəyərini dəyişəmmərik
        pi dəyişəninə final verilir o zaman

        return type - geriyə göndərəcəyi dəyərin tipini bildirir, void isə geriyə dəyər qaytarmır. Metodun geri döndərəcəyi
        dəyərin tipinin geri qayıtmasını istiyirəmsə, o zaman geri dönüş tipini yazıram

        Metod name ilə parametr name olan hissə metod signature adlanır  (nap(int minutes)) - Burdan parametr hissəni
        silsək belə, yenədə bu metod signature adlanır.

        Exception - mən böl və  topla metodu yazsam böl metodunun qabağında throws ArithmeticException yazmalıyamki
        o başa düşsünki mən əvvəlcədən bildirirəm metodum hansı problemləri yarada bilər. throws ArithmeticException
        bunun vasitəsi ilə yarana biləcək xətanı tutur və proqramın icrası davam edir, DAYANMIR !!!



        Access Modifiers

        1) public - Metodu İSTƏNİLƏN klasın və package daxilindən çağıra bilərik
        2) private - Heç bir klass ya da package içindən çağıra BİLMİRƏM !!! Ancaq olduğu klasın içindən çağıra bilərəm
        3) protected - bir-biri ilə əlaqədə olan classlar arasında görünür. Yəni classı, ancaq öz subclassları görəcəyi
        bir qorumalı qaba qoyuram. super classın özündə və subclasslarda istifadə edə bilərəm
        4) default (package private) - eyni package içində olanda, package içində hər yerdə (müxtəlif classlarda) çağıra bilirik


        Nümunə 1
        private -Burda biz klasın obyektini yaradıb fieldlarını çağırmaq istəyəndə ancaq height gələcək. Digəri private'dır
        private ilə bir klasın içindəki məlumatları gizlədirik. Ancaq olduğu class daxilində çağırılır. Yəni bu classslar
        arasında əl çatanlığın qarşısını alır


        default (package private) - Tree klasındakı int height isə defaultdur. Ancaq bir package daxilində çağırmaq OLAR
        package'lər arasındakı əl çatanlığın qarşısını alır

        protected - Məsələn bir İdmançı classı var. Və onun sub classları var: Üzgüçülük, basketboll, güləşçi və.s. Bunlarda
        İdmançı classının bütün xüsusiyətlərin alırlar. Protected keyword yazmaqla yalnızca bir biri ilə əlaqədə olan classlar
        arasında görünür.

        private idmanEtmek()
        // swimmer
        // grappler

        Swimmer və grappler classları idmanEtmek() clasından istifadə edirlər. Amma idmanetmək privatedir. Bu zaman subclasslar
        (swimmer grappler) idmanEtmək clasının xüsusiyyətlərini götürə bilmədilər. Protected etsəm əgər ona qorunaqlı qab
        yaradıram. Yəni deyirəmki, idmanEtmək classının xüsusiyətlərni subclassları isifadə edəcək. İstisna yaradır yəni




        Optional Specifiers

        * static - classa aid olduğunu bildirir. Yəniki static dəyişən yaratsaq həmin dəyişənin obyektini yaratmağa ehtiyac yoxdur
        * abstract
        * final - ilə dəyişilməzlik əldə edirəm
        * synchronized - Core Javada istifadə edilmir
        * native -
        * strictfp

        Optional Specifiers Examples

        public void walk1() {} - Ən başda bildiyimiz metod

        public final void walk2() {} - dəyişdirə bilmərik

        public static final void walk3() {} - acces modifier və access specifier var, final ilə onu dəyişdirə (Override edə) bilmərik

        public final static void walk4() {} - return type və method signature

        public modifier void walk5() {} // Does Not Compile - modifier yaza bilmərik. Modifierlərin zatən adları var

        public void final walk6() {} // Does Not Compile - return type metodun adının yanında gəlir MÜTLƏQ !!!

        final public void walk7() {} - yerlərini dəyişə bilərəm


        Overload - parametr dəyşmək
        Override - Oğul classı, ata classı və baba classı var. Baba meşədə 1 saata 1 ağac doğrayır. Oğul classı ata clasından
        baba classını varislik kimi götürürəm (xüxusiyyətini). Baba classında metodun içində 1 saata 1 ağac doğramaq var
        Ata classında metodun adı eynidi, baba clasından götürdüyü yazılıb. Burda amma Ata metodun 1 saata 2 ağa doğrayır
        Metodun içini dəyişilir. Bu Override adlanır. Sonra oğul classında extend edirəm və yenə override edirəm (dəyişirəm)
        final yazdıqda isə onu override edə BİLMİRƏM !!!. Dəyişə BİLMİRƏM !!! Yəni method override olunması budur və qarşısını
        final ilə almaq olur
        Yenə bir misal olaraq: Hovuzu 1 boru doldur 3 saata. Biz tez doldurmasını istəyirik. Suyun sürətinidə artıra bilmirəm
        maks limitdədi. Mən borunu dəyişə bilərəm ancaq. Amma mən final ilə qoymuram borunu dəyişməyə

        Nə zamanki classı final ilə elan etsək o zaman o class extend oluna bilmir.

        Javada final ilə elan olunan dəyişənlərin adları böyük hərflə yazılır (yəni capital case)



        Return Type

        public void walk1() {}

        public void walk2() { return; } -  Nümunə 2 də a1'i istifadə etmədiyimiz üçün proqram onu silməyimizi istyəcə.
        Hımçinin geri dönüş tipini void (geriyə heç bir tip qaytarma yəni) verib return yazsaq proqram onu silməyimizi istəyəcək
        return məntiqi odurki o metodun bitdiyini göstərir. Bunun 1 ci nümunə ilə fərqi yoxdur ikisidə eynidir

        public String walk3() { return ""; } - "" içində heçnə olmasa belə String ("") ötürmüşəm deyə compail olur

        public String walk4() {} - Does not Compile - return yoxdur deyə compail olmur

        public walk5() {} // Does Not Compile

        String walk6(int a) {if (a == 4) return ""; } // Does Not Compile. - səbəbi bizim a'ya ötürdüyümüz dəyərə baxır
        a 4 olsa compail olacaq amma 5 olsa compail olmayacaq . if verədəndə return yazırıq.


        Method Name

        public void walk1() {}

        public void 2walk() {} - Does Not Compile - metod variable adları rəqəmlə başlay bilməz

        public walk3 void () {} - Does Not Compile - void reserve olunmuş keyworddur. Ad kimi İŞLƏNMƏZ

        public void Walk_$() {} - kiçiklə yazsaq daha doğru olar

        public void() {} // Does Not Compile - ad yoxdur. Ada void'i mənimsədib


        Parametr List

        public void walk1() {}

        public void walk2 {} - Does Not Compile - () yoxdur

        public void walk3(int a) {} -

        public void walk4(int a; int b) {} - Does Not Compile - parametrlər arasında ; OLMAZ !!!

        public void walk5(int a, int b) {}


        Method Body

        public void walk1() {}

        public void walk2 - Does Not Compile - () və {} yoxdur

        public void walk3(int a) { int name = 5;}



        Working with Variable arguments

        Nümunə 3
        Parametrləri bir-bir ARTIRMIRAM !!!. İstdiyim qədər limitsiz yazıram. Ad olaraq 1 dənə variable adı olur yəni referans,
        ancaq yaratdığım variabel'lərin sayı yoxdur. Metodun parametrinə variable'ları Array kimi ötürürəm.


        public void walk1(int... nums) {}

        public void walk2(int start, int... nums) {}

        public void walk3(int... nums, int start) {} - Does Not Compile

        public void walk4(int... start; int... nums) {} - Does Not Compile - Birinci field kimi variable argumenti qoya
        bilmirəm. Variable argument 1 dənə olur və ən sonda olmalıdır


        Hər bir Primitiv tipin özünün Wrapper class'ı var. Məsələn: int = Integer, double = Double və.s. Argument kimi

        public static void walk (int start, int... nums){
            sout(nums.length);4
        }

        public static void main(String[] args){
        walk(1);        // 0  // buarada 1 qoyanda bu starta aiddi.  Amma int... nums yaradılıb ama inşalayz OLUNMAZYIB !!!
        Ancaq declare edilib ona görə nums.length yazanda 0 göstərir
        walk(1, 2);     // 1  // Burada artıq Arrayə 2 ötürülüb deyə uzunluğu 1'dir
        walk(1, 2, 3)  // 2  // 1-i int kimi tanıyır, 2 və 3 argument vaiebale kimi tanıyır
        walk(1, new int[] {4, 5})  // 2  // Array int kimi bir başa obyekt ötürür. içində 4 və 5 olduğu üçün 2 dənə sayır
        walk(1, null) // throws a NullpointerException - obyektdi deyə (Array clasından gəlir) onda xəta verir. Clasın içini
        boş göndərmişəm. Səhf anlaşılmasın null keywordu YOX, null dəyərlərdir nəzərdə tutulan !!! Yəni mən null keywordunu
        yazıram hansıki javanın standart cədvəlindəki. Mən o keywordu dəyərlər kimi Array içinə yığa bilərəm. Amma burada
        mən int (int... nums) variantında null ötürəndə onu int tipi kimi qəbul edir. Mən sout içində nums yazanda referansını
        çağırıram. Amma nums.length yazanda artıq obyektini gətirirəm. Primitiv tipindən çıxıram
        }


        pass by referance  &  pass by value

        Nümunə 5
        Birinci main metod metodundakı işə düşəcək və num'a 4 mənimsədir olur dəyəri 4. changeName metodunu çağırıram və
        num'a 5 dəyəri ötürürəm.O ötürülür metodun parametrinə. Oldu num 5. Sonra num 8 mənimsədirik. Düşür bazaya 8 kimi
        Çapa verir 8 kimi. Burdakı məntiq pass by value məntiqidir.

        photo 5 bax
        value olanda stəkanı verirəm, içinə maye doldurub doldurmayacağımın adiyyatı yoxdur.

        pass by referance'da məntiq - mənim ötürdüyüm dəyərlər yazılır referansa. Referans sonra hara müraciət edirsə
        onu qaytarır. Yəni dəyərin orginalını ötürürəm. Yoldaşımın mənə ötürdüyü dəyərin orginalını mənə ötürür və üzərində
        dəyişiklik edib dəyişirəm. Burda isə orginal içi dolu stəkanımı verirəm və o stəkanımın içini dəyişir
        Yəni dəyərlə yaddaşda referanslara əsaslanaraq durur. və mən onun olduğu yeri dəyişirəm bu məntiqlə

        pass by value məntiqi - tutaqki yoldaşımn mənə ötürdüyü dəyərin kopyası var. Orginalı YOXUDUR!!!. Orinala təsir
        edə BİLMİRƏM. Ancaq copy value'ya təsir göstərirəm. İstəsəm 4'ü 8 edərəm, istədəm 800
        Birinci stəkan içi dolu stəkanımın kopyasını yaradıb verirəm yoldaşıma onu isədiyi kimi içənə nə qədər istəsə maye
        doldurar yada boşaldar
        Burada isə məntiq dəyərin kopyasını verirəm. Referansı özündə qalır. Referansındada orginalı durur



        Nümunə 7
        Stringin referansı 1 dəfə yaradılır və onu dəyişə bilmirik. Bu immutable'dir. yəni DƏYİŞMƏZDİR !!!
        StringBuilder isə mutable'dir. Yəni Dəyişdirilə bilən
*/