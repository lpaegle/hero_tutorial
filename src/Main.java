import java.util.ArrayList;

public class Main extends Person{
    public static void main(String[] args) {
        //a. Create seven Heroes as the objects, two Districts as the objects and three Villains as the objects.
        // 7 heroes
        Hero hero1 = new Hero("Mona", "Smith", "Crystal", 24, HeroType.Hero, 12);
        Hero hero2 = new Hero("Cacao", "Dream", "Powder Mess", 104, HeroType.Hero, 24);
        Hero hero3 = new Hero("Chris", "Bordo", "Happy House", 5, HeroType.Hero, 50);
        Hero hero4 = new Hero("Karl", "Nicksy", "Krak", 4, HeroType.Hero, 6);
        Hero hero5 = new Hero("Sam", "Wisker", "Sammy", 28, HeroType.Hero, 8);
        Hero hero6 = new Hero("Grunt", "Mess", "Bubbles", 58, HeroType.Hero, 48);
        Hero hero7 = new Hero("Rose", "Daniells", "Rossy", 62, HeroType.Hero, 38);

        // 2 districts ????????????????????
        //b. Add three Heroes in the first District and others in the second District.
        ArrayList<Hero> personsInDakota = new ArrayList<>();
        District dakota = new District("Dakota", "Bono", 14, personsInDakota);
        ArrayList<Hero> personsInCali = new ArrayList<>();
        District cali = new District("CaliFlower", "Milo", 6, personsInCali);
        dakota.addNewHero(hero1);
        dakota.addNewHero(hero2);
        dakota.addNewHero(hero3);
        cali.addNewHero(hero4);
        cali.addNewHero(hero5);
        cali.addNewHero(hero6);
        cali.addNewHero(hero7);

        // 3 villains
        Villain villain1 = new Villain("Dana", "Crystal", 12, 15, HeroType.Villain);
        Villain villain2 = new Villain("Rose", "Wesley", 5, 11, HeroType.Villain);
        Villain villain3 = new Villain("Paul", "Krakow", 42, 21, HeroType.Villain);

        //c.  Print out all information about each District.
        System.out.println("The first district: " + dakota.getTitle());
        for (int i = 0; i < personsInDakota.size(); i++) {
            System.out.println(personsInDakota.get(i));
        }
        System.out.println("The second district: " + cali.getTitle());
        for (int i = 0; i < personsInCali.size(); i++) {
            System.out.println(personsInCali.get(i));
        }


//        Hero[] metropole = new Hero[3];
//        metropole[0] = hero1;
//        metropole[1] = hero2;
//        metropole[2] = hero3;

//        //District sample
//        District district1 = new District();
//        district1.addNewHero(hero1);
//
//        System.out.println(district1.toString());
//        int counter = 0;
//        for (Hero hero : metropole) {
//            if (hero.calculatedLevel() == 1){
//                counter++;
//            }
//        }
//        System.out.println("There are " + counter + " level 1 heroes.");

    }
}
