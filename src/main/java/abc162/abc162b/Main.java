package abc162.abc162b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long sum = 0;
        for (int i = 1 ; i <= N ; i++) {
            if ( i % 3 != 0 && i % 5 != 0) {
                sum+= i;
            }
        }

        System.out.println(sum);
    }
}
