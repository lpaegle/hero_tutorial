import java.util.Scanner;

public class HeroApplication {

    public static void main(String[] args) {

// Variable initialization
        String heroName;
        String heroCity;

        String heroPower1, heroPower2, heroPower3;

        boolean isEvil;

        double heroSalary;

        String realName;

        String universe;

// Variable assignment
        heroName = "AlieexpressMan";
        heroCity = "Dobele";
        heroPower1 = "Super discounts";
        heroPower2 = "Fast delivery";
        isEvil = false;
        heroSalary = 199.28;
        realName = "Sasha";
        universe = "Ours";

// Print out hero info card
        System.out.println("****************");
        System.out.println("Hero info card");
        System.out.println();
        System.out.println("Hero name: " + heroName);
        System.out.println("Hero city: " + heroCity);
        System.out.println("----------------");
        System.out.println("Hero's coolest power: " + heroPower2);
        System.out.println("Hero's another power: " + heroPower1 + ". $$$");
        System.out.println("It's " + isEvil + " that hero is evil.");
        System.out.println("Salary for greatest job: " + heroSalary + " $");
        System.out.println("Nobody knows hero's real name is " + realName);
        System.out.println("Universe hero lives: " + universe);
        System.out.println("*****************");

        //How many cookies can superhero purchase for their salary?
        //1 cookie costs = 1.29 EUR
//        System.out.println();
//        System.out.println("---- Financials ----");
//        // .floor - round down the number
//        int numOfCookies = (int) Math.floor(heroSalary / 1.29);
//        System.out.println("Hero can purchase " + numOfCookies + " cookies.");
//        double averageDailySalary = Math.round(heroSalary / 30 * 100) / 100;
//        System.out.println("Hero's average daily salary is " + averageDailySalary);

        if (isEvil) {
            System.out.println("Hero is a villain. ");
        } else {
            System.out.println("Hero is the protector of the city.");
        }

        switch (heroCity) {
            case "Ney York":
                heroSalary = 2000;
                break;
            case "Riga":
                heroSalary = 1200.91;
                break;
            case "Metropolis":
                heroSalary = 1000000;
                break;
            default:
                heroSalary = 1000;
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
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);

        switch(grade){
            case 'A':
//          For two cases with same output, you can write like this
//                System.out.println("Perfect! You are so brave!");
//                break;
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
                System.out.println("It is not good! You should choose your bad or good side!");
                break;
            case 'G':
                System.out.println("Bad, you are true villain");
                break;
            default:
                System.out.println("No such grade. Please check again!");

        }


    }
}


