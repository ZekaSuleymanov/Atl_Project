package lesson_8_Method_Object_Constructor;

public class Apartment {
    // Nümunə 1
    static int wall; //fiel state // static yazanda bu field özü bir başa classa assign (təyin) olunur. Class variable deyilir

    String  picture = "leopold"; // field state // non-static və ya instance variable

    int table;

/*
    Constructor
    Burda 3 useges - yəni 3 yerdə istifadə edilib. 3 dənə yaratdığım obyekt
    1) Apartment zeka = new Apartment(); 2) Apartment ilqar = new Apartment(); 3) Apartment hesen = new Apartment();

    public Apartment(){

    }
 */

    // Burdakı problem odurki mən burda parametrli obyekt yaratmışam amma o tərəfdəki obyektlərdə parametr yoxdur
    public Apartment(String picture, int table) {
        this.picture = picture;
        this.table = table;
    }


    // Nümunə 4
    public Apartment(String picture) {
        this.picture = picture;
    }

    public Apartment(int table) {
        this.table = table;
    }


    // Nümunə 5
    public Apartment(){
        picture = "asasas";
        table = 3;
    }


    public void sayHello(){
        int c = 5; // Local variable
    }
}


/*
        table niyə static deyil? - çünki bizim binamızda stol olada bilər olmayada bilər. Hələki ehiac yoxdur. Tələbdən asılıdır

        static int wall; - isə mütləqdirki o binanın ivarı olsun. Divarsız bina olmaz. Onda o static olmalıdır. Lazımlı fielddır

        Burda fieldlara dəyər yazanda 1 dənə olur və dəyişmək qeyri mümkündü. Lakin dəyər yazmayıb olduğu kimi saxlasaq ona
        maində istədiyimiz qədər Apartmentlər yarada və dəyərlər mənimsədə bilərik

 */