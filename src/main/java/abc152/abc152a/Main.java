package abc152.abc152a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (N == M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
