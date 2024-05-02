package Lesson_23;

public class Testing {
    public static void main(String[] args) {
        System.out.println(5/0);
    }
}

/*
        1) Kod run edildikdən sonra alınan xətalar

       * Stackowerflow - xətası, sadə forması 2 metod yaradıb birini digərindən çağırıram və dayanmadan "Salam" sözünü
       çapa verərkən baza dolub daşır. Kod run edildikdən sonra yaşanan problemdir.

       * Code errors - Kod run'a verildikdən sonra yaşanır

       * iO exceptions - İnput Output faylları var mövcud olmayan faylların açılması

        - Məsələn. Mən documentlərdən daxil oluram Home/Document/Ingress-new-ui-nextjs-master/db belə bir passim var
        (yolum). Mən bu passda Home/Document/db belə yazdıqda kodu run etdikdə eror verəcək. Buda kodu run etdikdən
        sonra alınan xətadır

        * Bütün obyektlər Object klasını extend etdiyi kimi bütün errorlarda Throwable klasını extend edir.
        Throwable bu klasda obyekt klasını extend edir (çünki hər şey obyektdi)

        * Throwable özü 2 hissəyə bölünür: Errors and Exceptions

        - Errors - JVM tərəfindən alınan erorlardır. Buna yaddaşın dolması, yaddaşda olan problemlər (memory licks),
        stackoverflow xətası, kitabxanaların uyğunsuzluğu

        * Exceptions and Errors different - Exceptionslar o zaman baş verirki bir metod vasitəsi ilə olsun.
        Metod daxilində yeni bir obyekt yaradılır və o obyekt exception obyekti adlanır. Və orda exceptionun adı,
        çıxma səbəbi, hansı sətirdə olduğu və.s yazılır.

        * Exceptions-ların 2 növü var. (photo bax)



 */