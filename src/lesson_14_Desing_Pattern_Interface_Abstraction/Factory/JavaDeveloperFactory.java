package lesson_14_Desing_Pattern_Interface_Abstraction.Factory;

public class JavaDeveloperFactory  implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
