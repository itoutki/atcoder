package abc154.abc154b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        System.out.println(S.replaceAll(".", "x"));
    }
}
