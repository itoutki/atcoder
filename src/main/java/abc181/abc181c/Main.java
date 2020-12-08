package abc181.abc181c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0 ; i < N ; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < N ; i++) {
            for (int j = i + 1 ; j < N ; j++) {
                int a = y[j] - y[i];
                int b = x[i] - x[j];
                int c = x[j] * y[i] - x[i] * y[j];

                for (int k = j + 1 ; k < N ; k++) {
                    if (a * x[k] + b * y[k] + c == 0) {
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }

        System.out.println("No");
    }
}
