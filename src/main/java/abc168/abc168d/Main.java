package abc168.abc168d;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] A = new int[M + 1];
        int[] B = new int[M + 1];
        Map<Integer, Set<Integer>> connections = new HashMap<>();

        for (int i = 1 ; i <= M ; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();

            Set<Integer> a = connections.getOrDefault(A[i], new HashSet<>());
            a.add(B[i]);
            Set<Integer> b = connections.getOrDefault(B[i], new HashSet<>());
            b.add(A[i]);
        }

    }
}
