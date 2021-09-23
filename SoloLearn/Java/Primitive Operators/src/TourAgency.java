import java.util.Scanner;

public class TourAgency {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // complete this code

        System.out.println("Please enter your distance in meters.");
        int distance = read.nextInt();

        int km = (distance / 1000);
        int meter = (km % 1000);

        System.out.println(km + " km");
        System.out.println(meter + " m");
    }
}

// km is distance * 1000?

/* Complete this code to output the distance in km and meters on a new line.

1 km is 1000 m, therefore 3644 m is equal to 3 km and 644 m.

Use / operator for the km and % for the m.
 */