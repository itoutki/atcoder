package abc151.abc151b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int M = scanner.nextInt();

        int total = 0;

        for (int i = 1 ; i <= N - 1 ; i++) {
            total += scanner.nextInt();
        }

        int diff = N * M - total;
        if (diff <= K) {
            System.out.println(Math.max(diff, 0));
        } else {
            System.out.println(-1);
        }
    }
}
