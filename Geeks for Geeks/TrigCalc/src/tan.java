public class tan {
    public static void main(String[] args) {

        double degrees = 45;

        double radians = Math.toRadians(degrees); // convert degrees to radians

        double tanValue = Math.tan(radians); // tan method

        System.out.println("tan(" + degrees + ") =" + tanValue);
    }
}
