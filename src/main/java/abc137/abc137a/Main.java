package abc137.abc137a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(Math.max(A + B, Math.max(A - B, A * B)));
    }
}
