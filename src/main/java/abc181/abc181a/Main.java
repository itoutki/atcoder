package abc181.abc181a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N % 2 == 0) {
            System.out.println("White");
        } else {
            System.out.println("Black");
        }
    }
}
