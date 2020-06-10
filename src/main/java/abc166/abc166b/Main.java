package abc166.abc166b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Set<Integer> set = new HashSet<>();

        for (int i = 0 ; i < K ; i++) {
            int d = scanner.nextInt();

            for (int j = 0 ; j < d ; j++) {
                int a = scanner.nextInt();
                set.add(a);
            }
        }

        System.out.println(N - set.size());
    }
}
