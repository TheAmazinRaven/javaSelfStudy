public class exercise02xArrayLoops {
    public static void main(String[] args) {
        int squares[] = new int[101];

        int i;

        for (i = 0; i <=99; i++) {
            squares[i] = i*i;
        }

        for (i = 0; i <= 99; i++) {
            System.out.println("The square of " + i + " is " + squares[i] + ".");

        }
    }

}

/*
Exercise 1

Create an array with 100 elements that will hold integer values. Loop through the array and for each element, store the square of the element index. For example, for element [2], you should store a value of 4 in the parameter. Print out the element number and the contents of the array to the screen as follows:

The square of 0 is 0.
The square of 1 is 1.
The square of 2 is 2.
---- & so on.
 */