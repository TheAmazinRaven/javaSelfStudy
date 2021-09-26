import java.util.Scanner;

public class ScholarshipCalc {

        public static void main(String[] args) {
            System.out.println("Please enter your GPA.");
            Scanner scanner = new Scanner(System.in);
            double score = scanner.nextDouble();
            // your code goes here
            if(score > 3.5) {
                System.out.println("Congratulations");
            } else {
                    System.out.println("Sorry");
                }

        }
    }

/* Students can apply for a scholarship if their average grade is higher than 3.5.
Write a program that prints “Congratulations” if the student meets the average grade requirement, and “Sorry” if not.

Sample Input:
2.9

Sample Output:
Sorry

should be a double
*/

