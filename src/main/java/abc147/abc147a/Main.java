package abc147.abc147a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A1 = scanner.nextInt();
        int A2 = scanner.nextInt();
        int A3 = scanner.nextInt();

        if (A1 + A2 + A3 >= 22) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
    }
}
