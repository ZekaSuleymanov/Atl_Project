package lesson_14_Desing_Pattern_Interface_Abstraction.Singleton;

public class Main {
    public static void main(String[] args) {
/*
        Nümunə 6.1
        DbConnection a = new DbConnection(); // Burda yeni obyekt yaratmağa imkan vermir

        Əgər obyektini yaratsam (ki mən bunu constructoru public yada default etməklə əldə edə bilərəm) və hashcode'larını
        alsam, fərqli hashcode'lar verər

        System.out.println(a.hashCode()); // 1175962212

        DbConnection v = new DbConnection();
        System.out.println(v.hashCode()); // 2003749087

        DbConnection c = new DbConnection();
        System.out.println(c.hashCode());  // 1324119927

        DbConnection f = new DbConnection();
        System.out.println(f.hashCode()); // 1324119927

        DbConnection d = new DbConnection();
        System.out.println(d.hashCode()); // 1324119927
*/



        // Həll yolu - Bir Connection clası yaradıram və göstərirəmki bu connectionun olması üçündür
        DbConnection.getDbConnection(); // Output: Singleton.Main
    }

    /*
            1) Burada private olması ilə DbConnection classının obyektinin yaradılmasının qarşısını aldım
            2) static metod ilə DbConnection qoydum hansıki DbConnection classının obyektini yarada bilirəm. Yoxdursa
            yenisini yaradır. Varsa olanı return edir
            Yeni Obyektə heç bir xüsusiyyətlər VERMİR

            DbConnection a = new DbConnection(); ilə normalda obyekt yarada bilirdik. Lakin Constructoru private etdiyim
            üçün yarada bilmirəm. Obyekti öz classımın daxilində yaradıram:

    public static  DbConnection getDbConnection(){
        if (dbConnection == null) dbConnection = new DbConnection();
        return dbConnection;
    }

            Burdan onu anlamaq olarki fərqli-fərqli obyektlər yaratmaqla düzgün iş görmürəm. Fərqli-fərqli obyektlər yaradanda
            mən bazaya hər dəfəsində fərqli yerdən müraciət etmiş oluram, yəni bazanı hər dəfəsində refresh və start edirəm
            Bunuda etmək OLMAZ !!!

            Bununda qarşısını almaq üçün DbConnection clasından DbConnection.getDbConnection(); - metodunu çağırıram

            Proyekt yaradılanda root database yaradılır və onun üzərində işləyirlər
*/
}
