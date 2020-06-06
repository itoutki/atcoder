package beginnersselection.abc083b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int result = 0;
        for (int i = 1 ; i <= N ; i++) {
            int n = i;
            int sum = 0;
            while(n != 0) {
                sum += n % 10;
                n = n / 10;
            }
            if (A <= sum && sum <= B) result += i;
        }

        System.out.println(result);
    }
}
