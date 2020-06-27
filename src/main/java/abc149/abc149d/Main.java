package abc149.abc149d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int R = scanner.nextInt();
        int S = scanner.nextInt();
        int P = scanner.nextInt();

        char[] T = scanner.next().toCharArray();

        long score = 0L;
        for (int i = 0 ; i < K ; i++) {
            long r = 0L;
            long s = 0L;
            long p = 0L;
            for (int j = i ; j < N ; j += K) {
                if (T[j] == 'r') {
                    p += P;
                }
                if (T[j] == 's') {
                    r += R;
                }
                if (T[j] == 'p') {
                    s += S;
                }
            }

            score += Math.max(Math.max(r, s), p);
        }

        System.out.println(score);
    }
}
