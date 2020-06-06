package abc003.abc003b;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        String T = scanner.next();

        char[] charS = S.toCharArray();
        char[] charT = T.toCharArray();
        List<Character> atcoder = Arrays.asList('a', 't', 'c', 'o', 'd', 'e', 'r', '@');
        for (int i = 0 ; i < S.length() ; i++) {
            if (charS[i] != '@' && charT[i] != '@' && charS[i] != charT[i]) {
                System.out.println("You will lose");
                return;
            }
            if (charS[i] == '@' && !atcoder.contains(charT[i])) {
                System.out.println("You will lose");
                return;
            }
            if (charT[i] == '@' && !atcoder.contains(charS[i])) {
                System.out.println("You will lose");
                return;
            }
        }

        System.out.println("You can win");
    }
}
