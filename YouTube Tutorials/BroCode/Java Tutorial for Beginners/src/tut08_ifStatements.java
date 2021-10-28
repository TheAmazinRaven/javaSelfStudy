import java.util.Scanner;

public class tut08_ifStatements {
    public static void main(String[] args) {
        // if statement a very basic form of decision-making; will perform a block of code if some condition is true

        System.out.println("Please enter your age.");

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age >= 76) {
            System.out.println("Okay boomer.");
        }
        else if (age >= 18) {
            System.out.println("You are an adult.");
        }
        else if (age <= 13) {
            System.out.println("You are a teenager, get outta here!");
        }
        else {
            System.out.println("You're too young!");
        }

        input.close();
    }
}
