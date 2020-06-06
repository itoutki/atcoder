package beginnersselection.abc087b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int X = scanner.nextInt();

        int count = 0;
        for (int i = 0 ; i <= A ; i++) {
            for (int j = 0 ; j <= B ; j++) {
                int c = (X - 500 * i - 100 * j) / 50;
                if ( 0 <= c && c <= C) count++;
            }
        }

        System.out.println(count);
    }
}
