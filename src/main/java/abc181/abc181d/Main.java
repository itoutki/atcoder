package abc181.abc181d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();

        int[] c = new int[10];

        for (int i = 0 ; i < S.length ; i++) {
            c[Character.getNumericValue(S[i])]++;
        }

        for (int i = 8 ; i < 1000 ; i+= 8) {
            char[] ds = String.valueOf(i).toCharArray();
            int[] dc = new int[10];
            for (int j = 0 ; j < ds.length ; j++) {
                dc[Character.getNumericValue(ds[j])]++;
            }

            boolean flag = true;
            for (int k = 0 ; k <= 9 ; k++) {
                if (c[k] < dc[k]) flag = false;
            }

            if (flag) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }
}
