package beginnersselection.abc086c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] t = new int[N + 1];
        int[] x = new int[N + 1];
        int[] y = new int[N + 1];
        t[0] = 0;
        x[0] = 0;
        y[0] = 0;

        for (int i = 1 ; i <= N ; i++) {
            t[i] = scanner.nextInt();
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();

            int dt = t[i] - t[i - 1];
            int dist = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
            if (dt < dist || (dt - dist) % 2 != 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
