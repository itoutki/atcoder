package abc135.abc135b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] p = new int[N + 1];

        for (int i = 1 ; i <= N ; i++) {
            p[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 1 ; i <= N ; i++) {
            if (i != p[i]) count++;
        }

        if (count <= 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
