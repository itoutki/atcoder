package abc150.abc150c;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int P = 0;

        for (int i = 0 ; i < N ; i++) {
            P *= 10;
            P += scanner.nextInt();
        }

        int Q = 0;
        for (int i = 0 ; i < N ; i++) {
            Q *= 10;
            Q += scanner.nextInt();
        }

        System.out.println(P);
        System.out.println(Q);
    }
}
