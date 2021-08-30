public class Hero extends Person{
//Continuing from Lesson 16

    private String nickname;
    private int heroID;
    private HeroType heroType;  //Allows items only from created list
    private int deedTime;

    //Non-arg constructor - for setting arguments by yourself
    public Hero(){
        heroType = HeroType.Hero;
    }

    //Arg constructor - to receive all the info
    public Hero(String name, String surname, String nickname, int heroID, HeroType heroType, int deedTime) {
        super(name, surname);
        this.nickname = nickname;
        this.heroID = heroID;
        this.heroType = heroType;
        this.deedTime = deedTime;
    }

    //method where hero level is calculated:
    //deedTime value is less than 20, the level is 1;
    //deedTime value is larger than 20 and less than 40, the level is 2;
    //deedTime value is larger than 40, the level is 3
    public int calculatedLevel(){
        if (deedTime < 20){
            return 1;
        }else if (deedTime >= 20 && deedTime < 40){
            return 2;
        }else if (deedTime >= 40){
            return 3;
        }else {
            return 0;
        }
    }

    //toString
    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", heroID=" + heroID +
                ", heroType=" + heroType +
                ", deedTime=" + deedTime +
                '}';
    }


    //Getters & setters

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public HeroType getHeroType() {
        return heroType;
    }

    public void setHeroType(HeroType heroType) {
        this.heroType = heroType;
    }

    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }
}

