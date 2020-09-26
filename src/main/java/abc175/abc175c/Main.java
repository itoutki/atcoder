package abc175.abc175c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long X = scanner.nextLong();
        long K = scanner.nextLong();
        long D = scanner.nextLong();

        long prev = X;
        long current = X;
        for (int i = 0 ; i < K ; i++) {
            prev = current;
            if (current < 0) {
                current += D;
            } else {
                current -= D;
            }

            if (Math.abs(current) > Math.abs(prev)) {
            }
        }
    }
}
