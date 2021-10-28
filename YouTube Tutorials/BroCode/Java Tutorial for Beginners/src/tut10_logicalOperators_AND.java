import java.util.Scanner;

public class tut10_logicalOperators_AND {
    public static void main(String[] args) {

    /* logical operators = used to connect two or more expressions

                && = (AND) both conditions must be true
                || = (OR) eiter conditions must be true
                ! = (NOT) reverse boolean value of condition
         */

        // && = AND
        int temp = 66;

        if(temp > 30) {
            System.out.println("It is hot outside.");
        }
        else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside.");
        }
        else {
            System.out.println("It is cold outside.");
        }


    }
}
