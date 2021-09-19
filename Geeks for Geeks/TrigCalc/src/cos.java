public class cos {
    public static void main(String[] args) {

        double degrees = 45.0;

        // convert degrees to radians

        double radians = Math.toRadians(degrees);

        // cos() method to get cosine value

        double  cosValue = Math.cos(radians);

        // prints cosine value
        System.out.println("cos(" + degrees + ") = " + cosValue);
    }
}
