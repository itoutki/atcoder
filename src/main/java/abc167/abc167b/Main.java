package abc167.abc167b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        if (K <= A) {
            System.out.println(K);
        } else if (K <= A + B) {
            System.out.println(A);
        } else {
            System.out.println(A - (K - A - B));
        }
    }
}
