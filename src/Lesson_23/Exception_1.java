package Lesson_23;

public class Exception_1 {
    public static void main(String[] args) {

        // Nümunə 1
         //System.out.println(5/0); // runtime error  //Exception in thread "main" java.lang.ArithmeticException: / by zero


        // Nümunə 2
        try {
            int divideByZero = 5 / 0;
            System.out.println(divideByZero);
            System.out.println("Rest of code in try block");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        System.out.println("Salam");
    }
}

/*
        1) Kod run edildikdən sonra alınan xətalar

       * Stackowerflow - xətası, sadə forması 2 metod yaradıb birini digərindən çağırıram və dayanmadan "Salam" sözünü
       çapa verərkən baza dolub daşır. Kod run edildikdən sonra yaşanan problemdir.

       * Code errors - Kod run'a verildikdən sonra yaşanır

       * iO exceptions - İnput Output faylları var mövcud olmayan faylların açılması.
       input faylın alınması və oxunması, output faylın göstərilməsi (qaytarılması)

        - Məsələn. Mən documentlərdən daxil oluram Home/Document/Ingress-new-ui-nextjs-master/db belə bir passim var
        (yolum). Mən bu passda Home/Document/db belə yazdıqda (və yaxud pass'də hər hansı bir səhflik etsəm) kodu run etdikdə
         eror verəcək. Buda kodu run etdikdən sonra alınan xətadır

        * Bütün obyektlər Object klasını extend etdiyi kimi bütün errorlarda Throwable klasını extend edir.
        Throwable bu klasda obyekt klasını extend edir (çünki hər şey obyektdi)

        * Throwable özü 2 hissəyə bölünür: Errors and Exceptions

        - Errors - JVM tərəfindən alınan erorlardır. Buna yaddaşın dolması, yaddaşda olan problemlər (memory licks),
        stackoverflow xətası və kitabxanaların uyğunsuzluğu

        * Exceptions and Errors different - Exceptionslar o zaman baş verirki bir metod vasitəsi ilə olsun.
        Metod daxilində yeni bir obyekt yaradılır və o obyekt exception obyekti adlanır. Və orda exceptionun adı,
        çıxma səbəbi, hansı sətirdə olduğu və.s yazılır.

        * Exceptions-ların 2 növü var. (photo bax)

         - Runtime zamanı baş verən Exceptonslar "unchecked" exceptionslar, Compile time zamanı baş verən exceptionlar
         "checked" exceptionlar adlanır
        * unchecked exceptionlar - run düyməsinə basdığımız an ortaya çıxanlardı, compail exceptionlardı. warninglər buna aiddir

        Compail time -run'u BASMADIĞIMIZ !!! andır
        Runtime - run'u basdığımız andır

        * checked exceptions - isə bizi məcbur etdirirki bunu yoxlayaq. Yəni onu manuel yoxlayaq

        Errorları - JVM özü idarə edir. Checked Exceptionları özümüz mauel idarə etməliyik

        Exception handling'in (maunel idarə etmənin) 3 növü var
         - try...catch block
         - finally block
         - throw and throws keys

        * Try...catch
         Bu kod bloku odurki try içində kod yazırıq və deyirikki düşün ki catch'da yazdığımız exceptionu tuta bilərsən

        Nümunə 2 - də bura try bizim kodu yoxlayır əgər xəta çıxsa belə proqramın icrasını davam etdirir. try sadəcə
        kodu yoxlayır, catch isə çıxa biləcək xətanı tutur və catch öz içində saxlayır və kodlar sona kimi oxunur, kod
        dayanmır.
        Əgər biz bunu yazmasaq bildiyimiz kimi xəta çıxdıqda kod oxunması qırılır və proqram dayanır. Nümunə 1 - də olduğu kimi

        Ümumiləşdirsək try-da biz kod blokumuzu yazırıq, catch-da isə onun çıxa biləcəyi Exceptionun NÖVÜNÜ yazırıq

        catch -qismimdə  onun içinə parametr ötürürəm, o parametridə klas kimi ötürürəm (Məsələn String (Surname))
        sanki onun obyektini yaradıram (e-nin əvəzinə istədiyimi yaza bilərəm yəni) e.getMessage() yazıram
        Burda exception çıxmasa kodu dağıtma, çıxsa belə mənə xəbərdar etməyi üçündür. O xətanıda e.getMessage()
        sayəsində gətirir. Hər Exception klasın içində e.getMessage() var.

        ArithmeticException - isə Hər şey şey obyektdən extend edir throwableda obeyktdən extend etdiyi üçün.
        Throwable içindədə  İOException, SQLException, ArithmeticException, BrokenBarrierException, NullPointerexception
        Bunlarda ordan extend edir. Görünməzdir importu göstərmir

        checked exceptionlar - səni məcbur edirki kodu yoxlayasan, unchecked exceptionlarda isə məcburiyyət yoxdur yəni
        error çıxada bilər çıxmayada bilər

        (ardı lesson_26 Exception_3) dərsində
 */