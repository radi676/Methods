package methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        min = getMin(scanner, min);
        System.out.println(min);
    }

      static int getMin(Scanner scanner, int min) {
        for (int i = 0; i < 3 ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
