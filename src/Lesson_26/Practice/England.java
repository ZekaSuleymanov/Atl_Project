package Lesson_26;

public class England extends AbstratCountry {
    public England(String continent, int area){
        super(continent,area);
    }

    @Override
    public void militaryStrength() {
        System.out.println("Very strength !!!");
    }

    public String goverment;
    @Override
    public void countryInfo(){
        System.out.println("Hökumətin idarə forması: " + goverment);

    }
}
