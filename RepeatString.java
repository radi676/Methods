import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int repetitions = Integer.parseInt(sc.nextLine());
        String result = repeat(s, repetitions);
        System.out.println(result);
    }

    public static String repeat(String s, int repetitions) {
        String[] repeatedWords = new String[repetitions];
        for (int i = 0; i < repeatedWords.length; i++) {
            repeatedWords[i] = s;
        }
        return String.join("", repeatedWords);
    }
}
