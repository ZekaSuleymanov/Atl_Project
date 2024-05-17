package lesson_12_Inheritance;

import javax.print.attribute.standard.MediaSize;

public class Main {
    public static void main(String[] args) {
        Dog a = new Dog("labrador");
        a.name = "labrador";
        a.display();
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
    Amma super olduğumuz classdan bir başa bizi super classa aparır. a. yazdıqda Animalın (name, eat) dəyərlərinin çıxmasında
    səbəb odurki





     Has a relationship -





*/