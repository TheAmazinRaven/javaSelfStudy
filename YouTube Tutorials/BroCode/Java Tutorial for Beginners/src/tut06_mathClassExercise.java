import java.util.Scanner;

public class tut06_mathClassExercise {
    public static void main(String[] args) {
        // find hypotenuse of triangle

        double x;
        double y;
        double z;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = input.nextInt();

        System.out.println("Enter side y: ");
        y = input.nextInt();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("The hypotenuse is : " + z);

        input.close();
    }
}
