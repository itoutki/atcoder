package abc146.abc146c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long X = scanner.nextLong();

        long min = 0L;
        long max = 1000000000L + 1L;

        while (max - min > 1) {
            long mid = (min + max) / 2;

            long d = String.valueOf(mid).length();
            long cost = A * mid + B * d;
            if (cost <= X) {
                min = mid;
            } else {
                max = mid;
            }
        }

        System.out.println(min);
    }
}
