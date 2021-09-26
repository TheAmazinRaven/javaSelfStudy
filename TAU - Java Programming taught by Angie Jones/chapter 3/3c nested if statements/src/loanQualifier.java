import java.util.Scanner;

public class loanQualifier {
    public static void main(String[] args) {

        // init known values
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // get unknown values
        System.out.println("What is your yearly salary?");
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();

        System.out.println("How many years have you been employed?");
        double years = input.nextDouble();

        input.close();

        // make decisions
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congratulations, You qualify for a loan.");
            } else {
                System.out.println("Sorry, you must have worked for at least " + requiredYearsEmployed + " years.");
            }
        } else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan.");
        }

    }
}

/*
NESTED IFs:
To qualify for a loan, a person must make at least 30,000
and have been working at their current job ffor at least 2 years.
 */