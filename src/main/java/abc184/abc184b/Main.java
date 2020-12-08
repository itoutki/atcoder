package abc184.abc184b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        char[] S = scanner.next().toCharArray();

        for (int i = 0 ; i < N ; i++) {
            if (S[i] == 'o') {
                X++;
            } else {
                X--;
                if (X < 0) X = 0;
            }
        }

        System.out.println(X);
    }
}
