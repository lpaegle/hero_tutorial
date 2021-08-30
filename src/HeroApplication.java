import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeroApplication {

    // Function to add x in arr (for case 2)
    public static String[] addX(String heroArray[], String newHeroName) {
        int i;

        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));

        // Add the new element
        arrlist.add(newHeroName);

        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);

        // return the array
        return heroArray;
    }

    // Function to remove a hero from an array
    public static String[] removeX(String heroArray[], int heroIndexToDelete) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));

        // Find and remove a String from an array
        arrlist.remove(heroIndexToDelete);

        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);
        heroArray = Arrays.copyOf(heroArray, heroArray.length - 1);

        // return the array
        return heroArray;
    }

    public static void main(String[] args) {


        //VARIABLES
        String[] heroList = {"AliExpressMan", "DogoMom", "Oh Lora", "Garbage man", "ProblemSolver", "Blossom", "Bubble", "FlowerGirl", "SuperSnowFlake", "MuffinGirl", "STAR"};
        double[] heroSalaries = {100.00d, 1452d};
        String[] heroCities = {};


        //nested methods
        showMenu(heroList);


    }

    private static void showListOfHeroes(String[] heroList) {
        System.out.println("<------ List of heros ------->");
        for (String heroName : heroList) {
            System.out.println(heroName);
        }
        System.out.println();

    }

    private static void addNewHero(Scanner scanner, String[] heroList) {
        System.out.println("Enter hero's name: ");
        String newHeroName = scanner.next().toString();
        heroList = addX(heroList, newHeroName);

    }

    private static void showSpecificHeroInfo(Scanner scanner, String[] heroList) {
        //Shows info based on selected hero
        System.out.println("Which hero info you want to see?");
        int superheroIndex = scanner.nextInt();
//                    String superHeroName = scanner.next();

        System.out.println("Hero name: " + heroList[superheroIndex]); //...aaaand so on

        // Variable initialization
        String heroName;
        String heroCity;
        String heroPower1, heroPower2, heroPower3;
        boolean isEvil;
        double heroSalary;
        String realName;
        String universe;

        // Variable assignment
        heroName = "Disscounter";
        heroCity = "Dobele";
        heroPower1 = "Super discounts";
        heroPower2 = "Fast delivery";
        heroPower3 = "Color-changing hair";
        isEvil = false;
        heroSalary = 199.28;
        realName = "Sasha";
        universe = "Ours";

        // Print out hero info card
        System.out.println("****************");
        System.out.println("Hero info card");
        System.out.println("****************");
        System.out.println("Hero name: " + heroName);
        System.out.println("Hero city: " + heroCity);
        System.out.println("----------------");
        System.out.println("Hero's cool power: " + heroPower2);
        System.out.println("Hero's another power: " + heroPower1 + ". $$$");
        System.out.println("Hero's the coolest power: " + heroPower3);
        System.out.println("It's " + isEvil + " that hero is evil.");
        System.out.println("Salary for greatest job: " + heroSalary + " $");
        System.out.println("Nobody knows hero's real name is " + realName);
        System.out.println("Universe hero lives: " + universe);
        System.out.println("****************");

        ////How many cookies can superhero purchase for their salary?
        ////1 cookie costs = 1.29 EUR
        //        System.out.println();
        //        System.out.println("---- Financials ----");
        //        // .floor - round down the number
        //        int numOfCookies = (int) Math.floor(heroSalary / 1.29);
        //        System.out.println("Hero can purchase " + numOfCookies + " cookies.");
        //        double averageDailySalary = Math.round(heroSalary / 30 * 100) / 100;
        //        System.out.println("Hero's average daily salary is " + averageDailySalary);

        heroCity = "New Jersey";

        if (isEvil) {
            System.out.println("Hero is a villain. ");
        } else {
            System.out.println("Hero is the protector of the city.");
        }

        switch (heroCity) {
            case "Ney York":
                heroSalary = 20000;
                break;
            case "Riga":
                heroSalary = 990.91;
                break;
            case "Metropolis":
                heroSalary = 1000000;
                break;
            default:
                heroSalary = 10000;
        }

        System.out.println("Hero's new salary is " + heroSalary);
        System.out.println();
        System.out.println("---- Financials ----");
        // .floor - round down the number
        int numOfCookies = (int) Math.floor(heroSalary / 1.29);
        System.out.println("Hero can purchase " + numOfCookies + " cookies.");
        double averageDailySalary = Math.round(heroSalary / 30 * 100) / 100;
        System.out.println("Hero's average daily salary is " + averageDailySalary);

        System.out.println("------------------");

        //Create a char type variable which represents the grade level of the deed performed by hero,
        // for example ‘A’, ‘B’, ‘C’,..., ‘H’.
        //Using switch control, please print out how good the student was in the exam.

        System.out.println("Please enter Super Hero's grade: ");

        //Scanner for char
        //Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                //For two cases with same output, you can write like this
                //System.out.println("Perfect! You are so brave!");
                break;
            case 'B':
                System.out.println("Perfect! You are so brave!");
                break;
            case 'C':
                System.out.println("Good! But You can do better!");
                break;
            case 'D':
                System.out.println("It is not good! You should choose your bad or good side!");
                break;
            case 'E':
                System.out.println("It is really not good! You should choose your bad or good side!");
                break;
            case 'G':
                System.out.println("Bad, you are true villain");
                break;
            default:
                System.out.println("No such grade. Please check again!");

        }

    }

    static private void removeHero(Scanner scanner, String[] heroList) {
        System.out.println("Enter hero index you want to delete: ");
        int deleteHero = scanner.nextInt();

        heroList = removeX(heroList, deleteHero);

    }

    static private void showMenu(String[] heroList) {
        ///////////////////////MENU - Lesson 12
        // Business requirements
        //1. See a MENU to select different parts of superhero info card
        //2. A list of superhero
        //3. Add new superhero
        //4. Show specific hero info
        //5. Delete the hero from the list
        //6. Print info about heroes
        //7. Print info about districts
        //0.Exit

        int menuEntry;
        Scanner scanner = new Scanner(System.in);

        do {
            // EXIT == 0
            System.out.println();
            System.out.println("Welcome!");
            System.out.println("Please select the action.");
            System.out.println("1 - Show a list of superheros!");
            System.out.println("2 - Add a new superhero.");
            System.out.println("3 - Show specific hero info.");
            System.out.println("4 - Delete the superhero from the list.");
            System.out.println("5 - Print info about heroes.");
            System.out.println("7 - Print info about districts.");
            System.out.println("0 - Exit.");
            menuEntry = scanner.nextInt();

            switch (menuEntry) {
                case 1:
                    showListOfHeroes(heroList);

                    break;
                case 2:
                    addNewHero(scanner, heroList);

                    break;
                case 3:
                    showSpecificHeroInfo(scanner, heroList);

                    break;
                case 4:
                    removeHero(scanner, heroList);

                    break;
                case 7: // ---- ???
//                    Hero hero1 = new Hero("Dana", "Smith", "Crystal", 24, HeroType.Villain, 12);
//                    Hero hero2 = new Hero("Cacao", "Dream", "Powder Mess", 104, HeroType.Villain, 24);
//                    Hero hero3 = new Hero("Chris", "Bordo", "Happy House", 5, HeroType.Hero, 50);
//
//                    Hero[] metropole = new Hero[3];
//                    metropole[0] = hero1;
//                    metropole[1] = hero2;
//                    metropole[2] = hero3;
//
//                    //District sample
//                    District district1 = new District();
//                    district1.addNewHero(hero1);
//
//                    System.out.println(district1.toString());
//                    int counter = 0;
//                    for (Hero hero : metropole) {
//                        if (hero.calculatedLevel() == 1){
//                            counter++;
//                        }
//                    }
//                    System.out.println("There are " + counter + " level 1 heroes.");
//                    // ----- ????
//
//                    //Find out how many heroes are with level 1 in the Metropole
//                    int counter1 = 0;
//                    for (Hero hero : metropole) {
//                        if (hero.calculatedLevel() == 1) {
//                            counter1++;
//                        }
//                    }
//                    System.out.println("There are " + counter1 + " Level 1 heroes.");
//
//                    //Find out how many heroes are with the level which is larger than 1 in the Metropole
//                    int counter2 = 0;
//                    for (Hero hero : metropole) {
//                        if (hero.calculatedLevel() > 1) {
//                            counter2++;
//                        }
//                    }
//                    System.out.println("There are " + counter2 + " heroes with higher Level than 1.");
//
//                    //Find out if there is any hero with the name “John”
//                    boolean isJohn = false;
//                    for (Hero hero : metropole) {
//                        if (hero.getName().matches("John")) {
//                            isJohn = true;
//                            break;
//                        }
//                    }
//                    System.out.println("There is a hero with name 'John'.");

                    break;
                default:
                    System.out.println("Menu item doesn't exist! Menu is closed!");
            }

        } while (menuEntry != 0);
    }

}


