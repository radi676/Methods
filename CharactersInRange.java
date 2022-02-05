package methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        printCharacterInRage(start, end);

    }

    public static void printCharacterInRage(char start, char end) {
        if (start > end) { //разменяме местата на старт и енд
            char temp = start;
            start = end;
            end = temp;
        }
        for (int i = start + 1; i < end; i++) {
            System.out.printf("%c ", i); //кастване на инт към чар
        }


    }
}
