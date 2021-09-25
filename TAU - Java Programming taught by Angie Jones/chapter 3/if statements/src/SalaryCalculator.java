import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        // Init known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get unknown values
        System.out.println("How many sales did you make this week?");
        Scanner input = new Scanner(System.in);

        int sales = input.nextInt();
        input.close();

        // Quick detour for the bonus earners

        if (sales > quota) {
            salary = salary + bonus;
        }

        // Output
        System.out.println("Your pay is $" + salary);

    }
}

/* If Statements
All salespeople get a payment of $1000/week.
Sales people who exceed 10 sales get an additional bonus of $250.
 */