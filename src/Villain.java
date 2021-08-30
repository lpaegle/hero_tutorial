public class Villain extends Person{

    private int villainID;
    private int numberOfCrimes;
    private HeroType heroType;

    //non-arg constructor
    public Villain() {
        heroType = HeroType.Villain;
    }

    //arg constructor
    public Villain(String name, String surname, int villainID, int numberOfCrimes, HeroType heroType) {
        super(name, surname);
        this.villainID = villainID;
        this.numberOfCrimes = numberOfCrimes;
        this.heroType = heroType;
    }

    //

    //toString method
    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", villainID=" + villainID +
                ", numberOfCrimes=" + numberOfCrimes +
                ", heroType=" + heroType +
                '}';
    }

    //getters & setters
    public int getVillainID() {
        return villainID;
    }

    public void setVillainID(int villainID) {
        this.villainID = villainID;
    }

    public int getNumberOfCrimes() {
        return numberOfCrimes;
    }

    public void setNumberOfCrimes(int numberOfCrimes) {
        this.numberOfCrimes = numberOfCrimes;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }
}
