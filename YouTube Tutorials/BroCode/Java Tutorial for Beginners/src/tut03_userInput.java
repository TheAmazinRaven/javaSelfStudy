import java.util.Scanner;

public class tut03_userInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();
        input.nextLine(); // added this to clear the next scanner

        System.out.println("What is your favorite food?");
        String food = input.nextLine(); // not able to input anything bc of the next line method

        System.out.println("Your name is " + name + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite food is " + food + ". I like " + food + " too.");
    }
}
