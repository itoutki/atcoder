package abc181.abc181b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        long answer = 0;

        for (long i = 0 ; i < N ; i++) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();

            long d = B - A + 1;
            answer += d * A;
            answer += d * (d - 1) / 2;
        }

        System.out.println(answer);
    }
}
