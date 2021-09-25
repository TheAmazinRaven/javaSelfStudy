import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        // declare scanner

        Scanner input = new Scanner(System.in);

        // ask for season of the year
        System.out.println("Please enter a season of the year.");
        String season = input.nextLine();

        // ask for adjective
        System.out.println("Please enter an adjective.");
        String adj = input.nextLine();

        // ask for whole number
        System.out.println("Please enter a whole number.");
        int wholeNum = input.nextInt();

        input.close();

        // print madlib
        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + wholeNum + " cups of coffee.");

    }
}

/* Create a program that aks a user for the season of the year, then a whole number, then an adjective. Use the input to complete the sentence below then output the result:

"On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups off coffee."

 */