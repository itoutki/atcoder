package abc183.abc183b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int gx = scanner.nextInt();
        int gy = scanner.nextInt();

        gy *= -1;

        double a = gy - sy;
        double c = sx * gy - gx * sy;

        System.out.println(c / a);
    }
}
