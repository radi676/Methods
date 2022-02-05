package methods;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (passwordLengthValidation(password) && isConsistOnlyLettersAndDigits(password) && isConsistOnlyLettersAndDigits(password)) {
            System.out.println("Password is valid");
        }
        if (!passwordLengthValidation(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isConsistOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isHaveAtLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static boolean passwordLengthValidation(String password) {
        return (password.length() >= 6 && password.length() <= 10);//true
    }

    public static boolean isConsistOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.toLowerCase().charAt(i);
            if ((symbol < 48 || symbol > 57) && (symbol < 97 || symbol > 122)) {//паролата е между всички цифри и между всички букви
                return false;
            }
        }
        return true;
        }

    public static boolean isHaveAtLeast2Digits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if ((symbol >= 48 && symbol <= 57)) { //цифра е
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }
        return false;
    }

}
