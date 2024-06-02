package lesson_14_Desing_Pattern_Interface_Abstraction.Factory;

import java.util.List;

public class Software {
    public static void main(String[] args) {
        // new JavaDeveloper yazsaq DRY pozulur o səbəbdən Builder pattern ->
        //2
        // Əgər biz istəyiriksə bu datanı bir erə toplayaq mütləq list istifadə etməliyik lakin belə bir eybəcər kod ortaya çıxır
        // Bunları yaratdıqca hissə hissə bölə bilirəm
        List<JavaDeveloper> javaDevelopers;
        List<PhytonDeveloper> phytonDevelopers;
        List<KotlinDeveloper> kotlinDevelopers;

        //3
        // 100'lərlə developerimi var məsələn hər biri kod yazmalıdır. Onları bir yerə yığıb foreach edə bilirik
        List<Developer> developers = List.of(new PhytonDeveloper(), new JavaDeveloper(), new KotlinDeveloper());
        developers.forEach(Developer::writeCode);

        // Bu hissə əlavədir

        // Bu halda change edə bilərik bir-bir build edə bilirəm // Bura request
        // 1
        var developerFactory = createDeveloperFactoryByLanguage(ProgrammingLanguage.KOTLIN); // inputda aldığımız parametr hesabına istifadə edirəm
        var developer = developerFactory.createDeveloper();
    }

    private static DeveloperFactory createDeveloperFactoryByLanguage(ProgrammingLanguage programmingLanguage){
        return switch (programmingLanguage){
            case JAVA -> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
            case PHYTON -> new PhytonDeveloperFactory();
        };
    }
}
