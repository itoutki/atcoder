package abc003.abc003a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        double result = ((1 + N) / 2.0) * 10000;
        System.out.println(result);
    }
}
