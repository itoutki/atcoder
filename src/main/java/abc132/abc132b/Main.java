package abc132.abc132b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] p = new int[n];

        for (int i = 0 ; i < n ; i++) {
            p[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0 ; i < n - 2 ; i++) {
            if ((p[i] < p[i + 1] && p[i + 1] < p[i + 2])
                || (p[i + 2] < p[i + 1] && p[i + 1] < p[i])) {
                count++;
            }
        }

        System.out.println(count);
    }
}
