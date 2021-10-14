import java.util.Scanner;

public class mySweetProgram {
    public static void main(String[] args) {
        /*
        ICU

        Initialization
        Condition
        Update
         */

        System.out.println("Guess the password:");
        String password = "let me in";
        Scanner input = new Scanner(System.in);
        String guess = input.nextLine();

        while (!guess.equals(password)) {
            System.out.println("Guess the password:");
            guess = input.nextLine();
        }

        System.out.println("Congrats! You got in.");
        input.close();
    }
}
