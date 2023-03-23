package UnitTesting;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter m:");
        int m = sc.nextInt();
        System.out.print("Enter k:");
        int k = sc.nextInt();
        String result = splitChocolate(n,m,k);
        System.out.println(result);
    }
    public static String splitChocolate(int n, int m, int k){
        if (k<=n*m && (k%n==0 || k%m==0)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
