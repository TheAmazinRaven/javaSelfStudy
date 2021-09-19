public class sin {
    public static void main(String[] args) {

        double degrees = 45.0;

        // convert degrees to radians
        double radians = Math.toRadians(degrees);

        // sin () method to get sine
        double sinValue = Math.sin(radians);

        // prints the sine value
        System.out.println("sin(" + degrees + ") = " + sinValue);
    }
}

// 9.18.21 Math class contains methods for performing basic numeric operations.
// The value of these functions should always be in radians.