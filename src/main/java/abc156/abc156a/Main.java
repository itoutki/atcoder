package abc156.abc156a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int R = scanner.nextInt();

        if (N >= 10) {
            System.out.println(R);
            return;
        }

        System.out.println(R + 100 * (10 - N));
    }
}
