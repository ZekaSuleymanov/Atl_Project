package lesson_12_Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog a = new Dog("labrador"); // constructor kimi ötürmüşəm parametri, a.name = "labrador"; buna ehtiyac yoxdur
        System.out.println(a.name);
        // a.name = "labrador";
        a.display();

        // Nümunə 2

        Mercedes mercedes = new Mercedes();
        mercedes.brandName = "svarovski";



        Person person = new Person();
        person.namePerson = "ali";

        Student_İs_a_relationship student_i̇s_a_relationship = new Student_İs_a_relationship();
        student_i̇s_a_relationship.namePerson = "vali";
        student_i̇s_a_relationship.creditCard = "aa12";
        student_i̇s_a_relationship.surnamePerson = "Aliyev";
        System.out.println(student_i̇s_a_relationship.namePerson);
        System.out.println(student_i̇s_a_relationship.surnamePerson);
        System.out.println(student_i̇s_a_relationship.creditCard);


        // Nümunə 5 - Override
        Dog dog = new Dog("assa");
        dog.eat(); // Dog və Animal clasında olan eat methodlarılnı çağıracaq

        Student_Has_a_relationship studentHasARelationship = new Student_Has_a_relationship();

        studentHasARelationship.person.namePerson = "aftandil";
        studentHasARelationship.teacher.jobTitle = "iş";





    }
}



/*

    Inheritance - mövzuunda 2 əsas class anlayışı olacaq. Biri subclass digəri superclass. Fərqli tərəfləri:
    1) Super class - bu clascdan irs ALINIR. Super classda hətda irs ala bilər.
    2) Subclass - irs ALIR

     Bütün classların super classı Obyekt classıdır. Car classı belə yaratsaq gedib Obyektə birləşir.
     Arxa fonda necə olduğunu və hansı formalarda necə istifadə edilir


     İs a relationship - Animal super classı var. Dog subclassı var. Burda Dog is a Animal kimi nümunə çəkmək olar. Yada,
     Cat is a Animal. Pig is Animal. Bmw is a car. Kurs is school. Balina is a məməli.
     Bu Animal'ların (heyvanların) ortaq bir xüsusiyyəti olur. Hər bir heyvan classlarının classının daxilində yazacam
     animal sleeping. Pişikdə itdə yatır. 3 dəfə təkrar etməmək üçün animal sleepingi içlərindən yığışdırıram və ümumi
     bir class yaradıram adını qoyuram Animal classı. 3-də o classa bağlıyıram. Bir yerdə yazmaqla hər yerdə istifadə edirəm
     Buda extends keywordu yazmaqla olur. Ümumi cəhətləri qeyd etməliyik Animal classında.

     Dog classının içindəki display methodu dog classının adını göstərmək üçündür. Əgər dog classın obyektini yaradıb
     sonra a.display() display daha qalın hərflərlə, name() və eat() metodları isə solğun hərflərlə çıxacaq. Çünki display()
     metodu dog classının (sub) əsas metodudur. name() və eat() isə super yox sub classın metodlarıdır. a.display() yazsaq
     "My name is nul" qaytaracaq. a.name() yazıb çağırsaq O zaman "My name is labrador" çıxacaq. a.name() gətirə bilməyimizin
     səbəbi dog clasına Animalı extend etmişik

     Əgər superclassda constructor varsa və bu name adlanırsa necəki superclassdakı hər şeyi götürüb işlədə bilirəmsə, eyniylə
     subclassda işlətməliyəm. Construcutoru animdaldakı kim yaratsaq (public Animal(String name) {this.name = name;})
     o zaman ora name'i classın obyektini yaradıb (Animal animal = new Animal("labrador")) ordan göndərirdim. Əvvəl animal.name
     deyib çağırırdıq amma bu üsulla birbaşa name çıxır. Amma burada elə yazıb göndərə bilmirəm, 2 problem olur.
     Default constructor yoxdursa, avtomatik olaraq boş obyekt yarada bilmirəm.

    Animal classının içində 1 parametrli constructorum var. Bu classın defafultla obyektini yarada BİLMİRƏM !!!. Dogdan
    parametsiz varianta (default) constructora müraciət edirəm.
    Dog içində parametli constructor yoxdursa Animalın constructoruna necə müraciət edə bilərəm?. (əvvəl müraciət edəndə
    yəni obyekt yaradanda animalın default constructoruna müraicət edirdim ki animal deyib onun fiellarına çatım)
    Animal'ın constructorunun birə bir əvəzləyicisi olmalıdır. Dogdan Animalın nəyinisə işlədirəmsə burda dog içindədə olmalıdır
    Cat'in içindədə olmalıdır. Bu necə baş verir?. this classın içindəki instance (non-static) variableyə gedir. (thisin
    2 növü var. 1) constructorlar bir birini çağırırdı olurda constructor overriding. 2) birdəki fieldaları çağırıram)
    Amma super olduğumuz classdan bir başa bizi olduğumuz clasdan super classa aparır. a. yazdıqda Animalın (name, eat)
    dəyərlərinin çıxmasında səbəb odurki, a. yazdıqda dog'un constructoruna müraciət edirəm, odaki super keywordu vasitəsi
    ilə Animala yönləndirir. super'ə click etsək Animala yönləndirəcək
    Ardıcıllıqla desək. Dog obyektinin içindəki labrador gedir Dog clasının constructoruna ordakı super keywordünə müraciət
    edir odakı bağlıdır Animal clasına. Çünki Dog clasının super clasıdır. Animaldakı constructorda parametr kimi gəlir
    labrador odaki this.name = labrador olur. Bu zaman a.name deyib çağırdıqda labrador gəlir.
    Constructora baxıram, odaname ötürməyimi tələb edir. name isə super classdan. super keywordu ilə gedib super classdan
    name dəyişənini götürürəm gətirib qoyuram Dog a = new Dog(name:)
    Biz Animal classındakı String name'i protected etməliyikki ancaq bu dəyişəni subclassları istifadə etsin. protected
    edilən dəyər gizli olsa belə Animal classını extend edən bütün classlar onu görür


    * İnhertance mövzusuna yenə bir misal çəksək, oğul classı ata classını extend edir. Atanın odun doğrama bacarığı var
    Oğulunda komputerlə məşğul olma bacarığı var. Oğul classıda da Ata clasını extend etdiyi üçün Ata classının odun doğrama
    xüsusiyyətində alır (methodunuda alır) özünədə aid komputer bacarığl olur. Oğul clasında sub clası olan nəvə clasıda
    extend edir Baba classını və bizneslə məşğul ola bilir. O zaman nəvə həm odun doğraya həm komputerlə məşğul ola, həmdə
    bizneslə məşğul ola bilir


    İs a relationship - one to one

    Person, Student, Teacher məntiqi ilə baxsaq deyə bilərikki burada is a mıntiqi var. Personda insandır, teacher və studendə
    insandır. O zaman Student is a Person, Teacher is a Person. Sub classdan super classa. İS a relationship mənitiqində
    Suoer classın xüssiyyətlərini ötürürdüm




    Has a relationship - Student_Has_a-relationship classında yazmışam

    Nümunə 4 Has a relation ship - məntiqində bir başa classın özünü gətirib field kimi qoyuram. Studentin övladıdır (subclass)
    sanki, extend OLMUR BURDA. İs a relationship əlaqəsində biz Personun xüsusiyyətlərini ötürürdüm. Burda isə özünü ötürürəm
    (studentHasARelationship.) yazanda name və surname ÇIXMIR çünki extend YOXDUR !!!. studentHasARelationship.person.name
    nəsə yazanda adı əldə etmiş oluram

    Nümunə 5 -

    Kapital bank  has a işçilər - one to many.

    KapitalBank kapitalBank = new KapitalBank();

    kapitalBank.employess.name  // Userin nameini gətirmək istəsəm edə bilirəm. Userin clasına çatmaq üçün

    Misal: Kataqoriya kimi baxaq. Userin assesmentləri (imtahan nəticəsi) var (one to many). Userin bir çox qiymətləndirilməsi
    olar. Userdə backend sahəsindədi. Ortada catagoriya yaradıram. Burda java, phtyon, go, ruby, linux, front, scrummaster,
    biznes analitik və s. Scrummasterdən 50 dəfə imtahanda verə bilərəm, 50 dənədə kataqoriyam ola bilər. Asisment və Catagoriya
    arasındada (many to many) əlaqə var. Hər catagoriyanın öz sub catagoriyaları olacaq (one to many). Javanında: OCA, OCP,
    OCE, OCI. katagoriyaları var. (one to many). Hər OCA imahanında içində sub catagoriyaları olan quiz'ləri, 1) start level,
    2) medium, 3) expert, 4) real case (OCE --> Quizlər one to many). Hər bir quiz'in özünün question'ları var (one to many)
    Questionlarında answer catagoriyası açılır. Bir sualın tək cavabıda olar (one to one) qapalı sual olar yəni. Yada bir
    sualın 2 və daha çox cavabıda olar (one to many). Bu zaman cavablardan question'a bağantıda olur (many to one).
    Single və multi olanlarında true və false catagoriyaları olur.
    Singe cavabda true və false catagoriyalar arasında ( bir cavab bir düz --> one to one & bir cavab çoxlu səhf --> one to many)
    Multi olanlarda isə false yazdıqlarımda ayrıdı true yazdıqlarımda ayrıdı. Bu Core Javada uzun formada olur


    Override etmək
    Nümunə 5 də olduğu kimi alt insert edib Overriding method seçirəm. Və Animal classında olan eat methodunu Dog clasında
    dəyişdirirəm. Sakni üzərindən əzib keçirəm
    Dog classının eat metdunda olan super super keywordunu silsəm
    Dog və Animal classında olan eat methodlarını public yada protected etsəm heç bir dəyişiklik OLMAZ !!!
    Biri public digəri protected olsa xəta olacaq
*/