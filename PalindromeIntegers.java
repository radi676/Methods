package methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        while (!number.equals("END")) {
            reversed(number);
            System.out.println(reversed(number));

            number = scanner.nextLine();
        }

    }

    public static String reversed(String number) {
        String trueOrFalse = "";
        StringBuilder reversed = new StringBuilder();
        for (int i = number.length() - 1; i >= 0; i--) {
            reversed.append(number.charAt(i));
        }
        if (reversed.toString().equals(number)){
            trueOrFalse = "true";
        } else {
            trueOrFalse = "false";
        }
        return  trueOrFalse;
    }

}

