import java.util.Scanner;

public class GrossPayCalc {
    public static void main(String[] args) {

        // get number of hours worked
        System.out.println("Please enter the number of hours worked.");

        // get hourly pay rate
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();

        System.out.println("Enter the employee's pay rate.");
        double payRate = input.nextDouble();
        input.close();

        // multiply hours & pay rate
        double grossPay = (hours * payRate);

        // display result
        System.out.println("Your total paycheck is: " + grossPay);

    }
}

/*
        1. Get number of hours worked
        2. Get hourly pay rate
        3. Multiply hours and pay rate
        4. Display result
*/