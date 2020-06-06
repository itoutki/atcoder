package beginnersselection.abc081b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
//        int[] ints = new int[N];
//        int max = Integer.MAX_VALUE;
//        for (int i = 0 ; i < N ; i++) {
//            ints[i] = scanner.nextInt();
//            int cnt = 0;
//            while(ints[i] % 2 == 0) {
//                ints[i] = ints[i] / 2;
//                cnt++;
//            }
//            max = Math.min(max, cnt);
//        }
//
//        System.out.println(max);

        int result = 0;
        for (int i = 0 ; i < N ; i++) {
            result |= scanner.nextInt();
        }
        System.out.println(Integer.numberOfTrailingZeros(result));

    }
}
