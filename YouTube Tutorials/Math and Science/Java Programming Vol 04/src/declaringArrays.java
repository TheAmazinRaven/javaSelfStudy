public class declaringArrays {
    public static void main(String[] args) {

        /* int jason = 5;
        int jessica = 3;
        int dylan = 5; */

        // I separated them by declaration, so I could better understand, but I am aware that this is not required

        int ages[] = new int[5]; // assign memory for this type int, 5 elements of the array

        // ------------------ ages

        ages[0] = 4;
        ages[1] = 5;
        ages[2] = 3;
        ages[3] = 5;
        ages[4] = 7;

        System.out.println("The first child's age is " + ages[0] + ".");
        System.out.println("The second child's age is " + ages[1] + ".");
        System.out.println("The third child's age is " + ages[2] + ".");
        System.out.println("The fourth child's age is " + ages[3] + ".");
        System.out.println("The fifth child's age is " + ages[4] + ".");


        // ------------------ heights

        double heights[] = new double[5];

        heights[0] = 4.7;
        heights[1] = 3.7;
        heights[2] = 6.5;
        heights[3] = 2.9;
        heights[4] = 4.0;

        System.out.println("The first child's height is " + heights[0] + ".");
        System.out.println("The second child's height is " + heights[1] + ".");
        System.out.println("The third child's height is " + heights[2] + ".");
        System.out.println("The fourth child's height is " + heights[3] + ".");
        System.out.println("The fifth child's height is " + heights[4] + ".");

        // have only assigned memory for 5 elements; always starts at 0


    }
}
