package abc147.abc147c;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Map<Integer, Map<Integer, Integer>> comments = new HashMap<>();

        for (int i = 0 ; i < N ; i++) {
            int A = scanner.nextInt();
            Map<Integer, Integer> comment = new HashMap<>();

            for (int j = 0 ; j < A ; j++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                comment.put(x, y);
            }

            comments.put(i + 1, comment);
        }

        for (int i = 0 ; i < 1 << N ; i++) {
            for (int j = 0 ; j < N ; j++) {
                if ((1 & (i >> j)) == 1) {
                }
            }
            System.out.println(Integer.toString(i, 2));
        }
    }
}
