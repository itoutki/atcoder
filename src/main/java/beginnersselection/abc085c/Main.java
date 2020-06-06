package beginnersselection.abc085c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Y = scanner.nextInt();

        for (int i = 0 ; i <= N ; i++) {
            for ( int j = 0 ; j <= N - i ; j++) {
                int k = (Y - 10000 * i - 5000 * j) / 1000;
                if ( i + j + k == N) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}
