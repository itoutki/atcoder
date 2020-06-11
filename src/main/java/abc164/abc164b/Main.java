package abc164.abc164b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        int count = 0;
        while (A > 0 && C > 0) {
            if (count % 2 == 0) {
                C = C - B;
            } else {
                A = A - D;
            }
            count++;
        }

        if (A <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
