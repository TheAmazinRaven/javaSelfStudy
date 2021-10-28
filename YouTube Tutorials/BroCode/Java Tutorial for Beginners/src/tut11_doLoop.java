import java.util.Scanner;

public class tut11_doLoop {
    public static void main(String[] args) {
        // do loop = runs until logical statement is true; will always perform block of code at least once
        Scanner input = new Scanner(System.in);

        String name = "";

        do {
            System.out.print("Please enter your name. ");
            name = input.nextLine();
        } while (name.isBlank());

        System.out.println("Hello, " + name + "!");
    }

}
