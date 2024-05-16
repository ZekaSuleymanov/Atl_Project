package lesson_31_RDBMS;

public class DataBase_Fundamentals {
}


/*
    * RDBMS - Relational Database Management Systems deməkdir (Əlaqəli Database'in İdarə Sistemi). Bu bizə əlaqəli verilənlər
    bazası yaratmağa, silməyə və yeniləməyə imkan verən proqramdır. Relational Database sətir və sütun şəklində təşkil
    edilmiş cədvəl formatında məlumatları saxlayan və əldə edən verilənlər bazası sistemidir. Bu 1970-ci ildə E.F.Codd
    tərəfindən hazırlanmış DBMS-nin daha kiçik bir hissəsidir. SQL, My-Sql, ORACLE, kimi əsas DMBS-lərin hamısı əlaqəli
    DBMS prinsiplərinə əsaslanır

    * JDBS - Java DataBase Connectivity (Java Verilənlər Bazası əlaqəsi ) mənasını verir və Java programlaşdırma dili ilə
    Verilənlər bazası arasında müstəqil əlaqəni təmin edən bir API dır. API- Application Proframming Interface - bir
    application/servis/platformanın(Youtube, MailChimp, Facebook, Google, Wordpress, DigitalOcean, Grav, Nginx, Ubuntu, Android ...)
    sahib olduğu yetənəklərin(behaviors) xaricdən , icazə verilən məhdudlaşdırmalar daxilində  istifadəsini təmin edən bir interface-dir.


    * Relational Database Management Systems - aşağıdakı xüsusiyyətləri simulyasiya edərək məlumatların bütövlüyünü qoruyur

    * Müəssisənin bütövlüyü - Verilənlər bazası cədvəlinin heç bir iki qeydi heç bir yerdə təkrarlana bilməz. Bir bazada olan
    məlumat başqa bazada ola bilməz.

    * Referansial bütövlüyü - Yalnız həmin cədvəllərin digər cədvəllər tərəfndən istifadə edilməyən sətirləri silinə bilər.
    Əks təqdirdə məlumat uyğunsuzluğa səbəb ola bilər. Referans sözündən götürülüb. Referans anlayışı odurki, məsələn
    kapital bankın 50 işçisi ola bilər, 50 işçinin bir kaital bankı var. Yada Zəkanın 50 taskı var, 50 taskın 2 Zəkası var.

    * İstifadəçi tərəfindən müəyyən edilmiş bütövlük - Məxfilik və girişə əsaslanan istifadəçilər tərəfindən müəyyən edilən qaydalar

    Domen bütövlüyü - Verilənlər bazası cədvəllərinin sütunları default dəyərlərə, məlumat növünə və ya diapazonlara
    əsaslanan bəzi strukturlaşdırılmış məhdudiyyətlər daxilində əhatə olunmuşdur. Yəni bir Applicationum var və bu App
    üzərində ancaq ona aid database işləyir. Mənim application bura bağlıdır. Məsələn User mamangment sistemimiz var, və
    o bağlıdır məsələn ATL akademiyanın domen'nə, başqa yerdə istifadə edilə BİLMƏZ !!!


    Roll Number         Name            Section
    1                   Istiha          A
    2                   Yash            B
    3                   Istiha          A
    4                   Mallika         C

    Bu cədvəldə 3 sütun var. Burada Role Numberlər eyni ola bilmız. Çünki o istifadəçinin İD'dir təkdir (unique)/ Bu bazada
    məsələn 2-ci Role Number silinsə belə ondan sonrakı olan 3 onun yerinə KEÇƏ BİLMƏZ !!!. Bunu database özü idarə edir
    o əlavələri ed bilmərik



    SQL Commands
    * Structed Query Language (SQL) hamımızın bildiyi kimi verilənlər bazası dilidirki, ondan istifadə etməklə mövcud
    verilənlər bazasında müəyyən əməliyyatları yerinə yetirə bilərik və həmçinin verilənlər bazası yaratmaq üçün bu dildən
    istifadə edə bilərik. SQl tələb olunan tapşırıqları yerinə yetirmək üçün CREATE, DROP, İNSERT, və.s kimi müəyyən
    əmrlərdən istifadə edilir. SQL daxilində müəyyən tapşırıqları yerinə yetirmək üçün müəyyən hissəciklər var

    * SQL əmrləri 4 kataqoriyaya bölünür:  5də deyə bilərik çünki Burada TSL var Transaction Control Language



                                        SQl Commands

         DDL             DML            TCL             DQL             DCL
      -> Create       -> Insert      -> Commit       -> Select       -> Grant
      -> Drp          -> Update      -> Savepoint                    -> Revoke
      -> Alter        -> Delete      -> Rollback
      ->Truncate      -> Call        -> Set
                      -> Explain        Transaction
                         Call        -> Set
                      -> Lock           Constraint


    DDL - Data Definition Language - Ancaq table işləyirik
    DQL - Data Query Language - Sorğu. Datalara sorğu atıb seçib gətirmək
    DML - Data Manipulation Language - Dataların manipulyasiyası. Yaradılması, dəyişilməsi, Silinməsi
    DCL - Data Control Language



    * DDL - verlənlər bazasının sxemini qurmaq üçün istifadə edilir, SQL əmrlərindən ibarətdir. Sadəcə olaraq verilənlər
    bazası sxeminin təsvirləri ilə məşğul olur və verilənlər bazasında, verlənlər bazası obyektlərinin strukturunu yaratmaq
    və dəyişdirmək üçündür. Verilənlər bazasında struktur yaratmaq üçündür, lakin verilənlər DEYİL!!!.

    * CREATE - Bu əmr verilənlər bazası və onun obyektlərini (cədvəl, indeks, funksiya, görünüş, mağaza proseduru tetikleyicilər
    kimi) yaratmaq üçün istifadə edilir
    * DROP - Bu əmr verilənlər bazasında obyektləri silmək üçün istifadə edilir. Ümumiyyətlə cədvəli silir
    * ALTER - Bu verilənlər bazasının strukturunu dəyişdirmək üçün istifadə edilir
    * TRUNCATE - Bu qeydlər üçün ayrılmış bütün boşluqlarda daxil olmaqla, cədvəldən bütün qeydləri silmək üçündür.
    Cədvəlin içindəki məlumatları silmək
    * COMMMET - şərh əlavə etmək
    * RENAME - verilənlər bazasında mövcud olan obyektin adını dəyişdirmək üçündür



    * DQL (Data Query Language)

    * SELECT - Data base'dəki bütün məlumatları gətirmək üçündür.


    * DML (Data Manipulation Language) - verilənlər bazasında mövcud olan məlumatların manipulyasiyası ilə məşğul olur
    Bu əsasən SQL əmrlərinin əksəriyyətini əhatə edir. Məlumata və verilənlər bazasına giriş idarə edən SQL ifadəsinin
    kompanentidir. Əsasən DCL ifadələri DML ifadələri ilə qruplaşdırılır

    * İNSERT - Cədvələ verilənləri daxil etmək üçün istifadə olunur
    * UPDATE - Cədvəl daxilində mövcud məlumatları yeniləmək üçün istifadə edilir
    * DELETE - Verilənlər bazasından qeydləri silmək üçündür
    * LOCK - Cədvəl nəzarəti paralelliyi. Bir cədvəldə Update olunmamış, digər cədvəldə hər hansısa məlumat Update ola bilməz
    * CALL - PL/SQL və ya JAVA alt programına çatmaq üçün (access)
    * EXPLAİN PLAN - məlumata giriş yolunu təsvir edir



    * DCL (Data Control Language)

    * GRANT - İstifadəçilərə verilənlər bazasına giriş imtiyazları verir
    * REVOKE - İstifadəçinin GRANT əmrindən istifadə edərək verilən giriş imtiyazlarını geri götürür

    * List of TCL commands

    * COMMİT - Tranzakşınlar bitdiyi zaman (commit) şərh olmalıdır. finally blokunda yazılır. Üçnki Tranzaskiya prosesinin
    Rollback olub-olmamasından asılı olmayaraq tranzaksiya bağlanmalıdır (ona id verə bilirik) və buna bildirməliyik
    * ROLLBACK - əgər hər hansısa error olarsa rollback olunmalıdır. (Məsələn işıq sönərsə göndərilən tranzaksiya ünvana
    çatmadığı üçün geri qayıdır. catch blokunda yazılır
*/