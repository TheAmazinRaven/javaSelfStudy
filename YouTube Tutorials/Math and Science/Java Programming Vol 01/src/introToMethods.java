public class introToMethods {

    public static void main(String[] args) { // void means will not return a value

        System.out.println("Program start. \n");

        printFirstName();
        printLastName();
        addNames();

        System.out.println("Program end.");
    }

    public static void printFirstName() {

        System.out.println("My first name is Raven. \n");
        // System.out.println("I love Spongebob & Sailor Moon. \n");
    }

    public static void printLastName() {

        System.out.println("My last name is Dickerson. \n");
    }

    public static void addNames() {

        int raven = 5; // all of these are local variables contained within this method until declared otherwise
        int dickerson = 9;
        int sum = raven + dickerson;

        System.out.println("The number of letters in my full name is " + sum + ".");
    }
}
