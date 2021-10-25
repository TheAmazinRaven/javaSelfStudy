public class searchMinMax {
    public static void main(String[] args) {

        int largeArray[] = {8, 11, 12, 13, 15, 25, 65, 2, 34, 54, 99, 76, 87, 10, 54}; // 14 elements

        int  smallest = largeArray[0];
        int  largest = largeArray[0];

        for (int i = 0; i <= 13; i++) {
            if (largeArray[i] < smallest)
                smallest = largeArray[i];
            if (largeArray[i] > largest)
                largest = largeArray[i];
        }

        System.out.println("The smallest value in the array is: " + smallest);
        System.out.println("The largest value in the array is: " + largest);

    }
}
