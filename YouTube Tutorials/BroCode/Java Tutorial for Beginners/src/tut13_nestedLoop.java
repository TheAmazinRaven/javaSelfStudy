import java.util.Scanner;

public class tut13_nestedLoop {

    public static void main(String[] args) {

        // nested loop = a loop inside a loop

        Scanner input = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = input.nextInt();

        System.out.println("Enter number of columns: ");
         columns = input.nextInt();

        System.out.println("Enter symbol to use: ");
        symbol = input.next();

        for (int index = 1; index <= rows; index++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}
