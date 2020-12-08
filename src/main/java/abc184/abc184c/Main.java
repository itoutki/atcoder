package abc184.abc184c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long r1 = scanner.nextLong();
        long c1 = scanner.nextLong();
        long r2 = scanner.nextLong();
        long c2 = scanner.nextLong();

        r2 = r2 - r1;
        c2 = c2 - c1;
        r1 = 0;
        c1 = 0;

        if (r1 == r2 && c1 == c2) {
            System.out.println(0);
            return;
        }

        if (r1 + c1 == r2 + c2 || r1 - c1 == r2 - c2 || Math.abs(r1 - r2) + Math.abs(c1 - c2) <= 3) {
            System.out.println(1);
            return;
        }

        if ((r1 + c1) % 2 == (r2 + c2) % 2 || Math.abs(r2 + c2) <= 3 || Math.abs(r2 - c2) <= 3) {
            System.out.println(2);
            return;
        }

        System.out.println(3);
    }
}
