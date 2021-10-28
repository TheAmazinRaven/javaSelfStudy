public class tut06_mathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        double a = Math.abs(y);
        double b = Math.sqrt(x);
        double c = Math.round(y);
        double d = Math.ceil(x);
        double e = Math.floor(x);

        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
