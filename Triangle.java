import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        for (int length = 1; length <= numbers; length++) {
            increasingNumbers(length);
        }

        for (int length = numbers - 1; length > 0; length--) {
            increasingNumbers(length);
        }
    }

    private static void increasingNumbers(int numbers) {
        for (int i = 1; i <= numbers; i++) {
            System.out.print(i);
            if (i < numbers) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

