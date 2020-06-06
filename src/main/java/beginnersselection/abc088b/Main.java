package beginnersselection.abc088b;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Integer[] a = new Integer[N];

        for (int i = 0 ; i < N ; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());
        int alice = 0;
        int bob = 0;
        for (int i = 1 ; i <= N ; i++) {
            if (i % 2 != 0) {
                alice += a[i - 1];
            } else {
                bob += a[i - 1];
            }
        }

        System.out.println(alice - bob);
    }
}
