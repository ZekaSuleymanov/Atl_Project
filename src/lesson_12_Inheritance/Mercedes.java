package lesson_12_Inheritance;

public class Mercedes {
    // static variable
    static int door;

    // static variable
    static int wall;

    //non-static variable = instance
    String brandName; // instance variable

    // Nümunə 3
    public void sayHello(){
        int a = 0;
        System.err.println(a);
    }
}


// 1) static variable = class variable
// 2) non-static = instance = obyekt variable
// 3) local variable = method içində olan


/*
    1) Düşünəkki bizim bir binadan ev almaq istiyirk. Bu evi makler satır bizə və o evin mütləq qapısı və divarları olmalıdır
    default olaraqki billəkki bu evdir yəni. Və qapı pəncərəni static yazırıqqki bu classa yəni bina classına aid olsun
    obyektə aid olmasın. Yəni class variabledir

    Bu nümunədədə biz mersedes classını yaradırıq və bu maşının qapıları, matoru olmalıdır mütləq. Bunlarıda static ilə
    yazmalıyıq.
    2) a. (door wall) yazsam görə bilməz. Çünki mənim door və wall var. Çünki classlar run ediləndə birinci gedir bütün static
    field və blokları işə salır. Yəni bir ev obeytkini yaradanda ilkin variantda door və wall mütləq olmalıdır. Bunu staticlə
    bildiririkki obyekt yarananda door və wall olmalıdır. Obyektlərdə classlardan törədiyi üçün classlar bir çertiyojdur
    Çertiyojda artıq ilkin variantda nələrin olduğunu çəkirik.
    Artıq içinə brandName olaraq hasnı əşyaları dolduracağım isə istifadəçinin probleimidir. Şirkət binanı classın (çertiyojun)
    əsasında qapı və divarı (static dəyərlər ilə) ilə birlikdə tikir. İçini doldurmaq istifadəçinin problemidir
    Yada maşın. Defult olaraq zavod tərəfindən matorsuz və təkərsiz buraxılır. Bu ciddi problemdir. Lskin qapısıın olmamağı
    yada rənginin olmaması ciddi problem deyil. On görə zavod Car classının (çertiyojun) əsasında maşınları yaradanda static
    olaraq mator və təkərləri düzəldir. Digər dəyərlərin düzəldilməsi (aksesuar falan) istifadəçinin boynunadı.

    Eyniylə bizim Mercedes clasımızdakı kimi. wall və door üçün Obyekt yaratmağa ehtiyac yoxdu Mercedes. yazıb onları görə
    bilirəm.
    static dəyərləri clasın adı ilə, static OLMAYANLARI (instacne) isə obyektlə çağırıb işlətməliyəm.

    3) local variable isə metod içində yaradılandır. Biz static və instance variableleləri sout yazaraq metod içindən
    çağıra bilirik. Ok

    Nümunə 3
    Amma local variable təyin etdikdə bizdən dəyər mənimsətməmizi istiyir. deault dəyəri 0'dər. Ancaq heç olmasa buna 0
    mənimsətməliyikki defaulta 0'dır. Bunu methodun xaricində istifadə etmək OLMUR

    İnhertance mövzusuna yenə bir misal çəksək, oğul classı ata classını extend edir. Atanın odun doğrama bacarığı var
    Oğulunda komputerlə məşğul olma bacarığı var. Oğul classıda da Ata clasını extend etdiyi üçün Ata classının odun doğrama
    xüsusiyyətində alır (methodunuda alır) özünədə aid komputer bacarığl olur. Oğul clasında sub clası olan nəvə clasıda
    extend edir Baba classını və bizneslə məşğul ola bilir. O zaman nəvə həm odun doğraya həm komputerlə məşğul ola, həmdə
    bizneslə məşğul ola bilir

    Person, Student, Teacher məntiqi ilə baxsaq deyə bilərikki burada is a mıntiqi var. Personda insandır, teacher və studendə
    insandır. O zaman Student is a Person, Teacher is a Person. Sub classdan super classa


    Has a realtionship
*/