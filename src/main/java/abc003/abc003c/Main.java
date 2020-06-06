package abc003.abc003c;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] R = new int[N];

        for (int i = 0 ; i < N ; i++) {
            R[i] = scanner.nextInt();
        }

        Arrays.sort(R);
        double score = 0.0;
        for ( int i = N - K ; i < N ; i++) {
            score = (score + R[i]) / 2.0;
        }

        System.out.println(score);
    }
}
