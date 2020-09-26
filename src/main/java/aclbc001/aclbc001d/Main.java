package aclbc001.aclbc001d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long D = scanner.nextLong();

        if (C > B) {
            System.out.println("No");
            return;
        }
        if (A > D) {
            System.out.println("No");
            return;
        }

        System.out.println("Yes");
    }
}
