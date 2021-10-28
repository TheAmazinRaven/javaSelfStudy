import java.util.Scanner;

public class tut10_logicalOperators_NOT {
    public static void main(String[] args) {
            /* logical operators = used to connect two or more expressions

                && = (AND) both conditions must be true
                || = (OR) eiter conditions must be true
                ! = (NOT) reverse boolean value of condition
         */

        // ! = NOT
        Scanner input2 = new Scanner(System.in);

        System.out.println("You are playing a game, press Q/q to quit");
        String response = input2.next(); // next stores next key pressed within a var

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game *pew pew*.");
        }
        else {
            System.out.println("You quit the game.");
        }
    }
}
