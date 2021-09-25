import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {

        // init known values
        int quota = 10;


        // get unknown values
        System.out.println("How many sales did you make this week?");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        input.close();

        // make aa decision on the path to take - output
        if (sales >= quota){
            System.out.println("Congratulations! You met your quota. Slayyyy.!");
        }
        else {
            int salesShort = (quota - sales);
            System.out.println("You did mot meet your quota. \n You are short " + salesShort + " sales.");
        }


    }
}

/*
IF ELSE
All salespeople are expected to ake at least 10 sales each week.
For those who do, they receive a congratulatory message.
For those who don't know, they are informed how many sales they were short.
 */
