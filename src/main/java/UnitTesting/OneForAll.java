package UnitTesting;

public class OneForAll {
    public static String checkPositive(int a, int b, int c) {
        int count = 0;
        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }

        if (count == 1) {
            return "TRUE";
        } else {return "FALSE";
        }
    }

    public static void main(String[] args) {
        String result = checkPositive(0,-4,15);
        System.out.println(result);
    }
}
