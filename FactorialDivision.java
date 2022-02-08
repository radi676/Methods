package methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        double result = 1.0 * calculateTheFactorial(num1) / calculateTheFactorial(num2);
        System.out.printf("%.2f", result);
    }

    public static long calculateTheFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;

    }
}