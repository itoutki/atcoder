package arc106.arc106b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] a = new int[N + 1];
        int[] b = new int[N + 1];
        int[] c = new int[M];
        int[] d = new int[M];

        for (int i = 1 ; i <= N ; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 1 ; i <= N ; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < M ; i++) {
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }

        boolean[] flag = new boolean[N + 1];

        List<List<Integer>> groups = new ArrayList<>();

        for (int i = 1 ; i < N ; i++) {
            if (flag[i]) {
                List<Integer> g = new ArrayList<>();
                g.add(i);
                for (int j = 0 ; j < M ; j++) {

                }
            }
        }

    }
}
