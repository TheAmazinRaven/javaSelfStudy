public class addingParametersToMethodsAndReturningValues {
    public static void main(String[] args) {
        int num1 = 8, num2 = 7, answer1, answer2;
        int answer = multiNumbers(num1);
        boolean answer3;

        System.out.println("The result is " + multiNumbers(num1) + ".");

        answer2 = addNumbers(num1, num2);
        System.out.println("When we add num1 and num2, we get: " + answer2);

        answer3 = equalNumbers(num1, num2);
        System.out.println("are num1 and num2 are equal?: " + answer3);
    }

    public static int multiNumbers(int a) { // retuning an integer

        int answer = a * 7;

        return answer;
    }

    public static int addNumbers(int x, int y) {
        int ans = x + y;

        return ans;
    }

    public static boolean equalNumbers(int r, int t) {
        if (r == t)
            return true;
        else
            return false;
    }
}

// 10.22.21 I really liked this, I feel like I learned something