package UnitTesting;

public class CheckGivenNumbers {
    public static boolean checkGivenNumbers(int a, int b, int c) {
        return (a != b) && (a != c) && (b != c);
    }

    public static void main(String[] args) {
        /*int num1 = 7;
        int num2 = 7;
        int num3 = 9;*/

        boolean result = checkGivenNumbers(5, 7, 9);
        System.out.print(result);
    }
}
