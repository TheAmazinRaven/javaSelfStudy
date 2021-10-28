import java.util.Scanner;

public class tut11_whileLoop {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as it's condition remains true; will first check condition & then execute if true

        Scanner input = new Scanner(System.in);

        String name = "";

        while (name.isBlank()) {
            System.out.print("Please enter your name. ");
            name = input.nextLine();
        }

        System.out.println("Hello, " + name + "!");
    }
}
