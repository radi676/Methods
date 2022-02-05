package methods;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        printVowelsCount(text);
    }

    public static void printVowelsCount(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.toLowerCase().charAt(i);
            if (symbol == 97 || symbol == 101 || symbol == 105 || symbol == 111 || symbol == 117 || symbol == 121) {
                counter++;
            }
        }
        System.out.println(counter);



    }


}

