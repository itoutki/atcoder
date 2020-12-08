package abc183.abc183c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long K = scanner.nextLong();

        long[][] T = new long[N][N];

        for (int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < N ; j++) {
                T[i][j] = scanner.nextLong();
            }
        }
    }
}
