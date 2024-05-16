package Lesson_26.Practice;

public abstract class AbstratCountry {
    private int area;

    private String continent;

    public AbstratCountry(String continent, int area){
        this.continent = continent;
        this.area = area;
    }

    public abstract void militaryStrength();

    public abstract void countryInfo();

}
