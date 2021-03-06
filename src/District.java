import java.util.ArrayList;

public class District {

    private String title;
    private String city;
    private int districtID;
    private ArrayList<Hero> heroesInTheDistrict = new ArrayList<Hero>();

    //non-arg constructor
    public District() {
    }


    //arg constructor
    public District(String title, String city, int districtID, ArrayList<Hero> heroesInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.heroesInTheDistrict = heroesInTheDistrict;
    }

    //add new hero
    public boolean addNewHero(Hero hero) {
        return heroesInTheDistrict.add(hero);
    }

    ///remove hero
    public Hero removeHero(int index) {
        return heroesInTheDistrict.remove(index);
    }

    //toString()
    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtID=" + districtID +
                ", heroesInTheDistrict=" + heroesInTheDistrict +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public ArrayList<Hero> getHeroesInTheDistrict() {
        return heroesInTheDistrict;
    }

    public void setHeroesInTheDistrict(ArrayList<Hero> heroesInTheDistrict) {
        this.heroesInTheDistrict = heroesInTheDistrict;
    }
}
