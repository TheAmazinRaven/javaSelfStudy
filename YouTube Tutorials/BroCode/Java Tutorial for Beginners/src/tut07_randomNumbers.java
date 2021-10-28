import java.util.Random;

public class tut07_randomNumbers {
    public static void main(String[] args) {

        Random randy = new Random();

        int x = randy.nextInt(6) + 1;
        double y = randy.nextDouble();
        boolean z = randy.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
