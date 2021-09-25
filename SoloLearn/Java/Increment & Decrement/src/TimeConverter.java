import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        System.out.println("Please enter number of days: ");
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        //your code goes here

        int daysSeconds = (days * 86400);

        System.out.println(daysSeconds);

    }
}

/* You need a program to convert days to seconds.
The given code takes the amount of days as input. Complete the code to convert it to seconds and output the result.

Sample Input:
12

Sample Output:
1036800
*/