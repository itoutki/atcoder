package abc128.abc128b;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Map<String, List<Integer>> pointMap = new HashMap<>();
        List<String> cities = new ArrayList<>();

        for (int i = 0 ; i < N ; i++) {
            String S = scanner.next();
            int p = scanner.nextInt();
            if(!cities.contains(S)) {
                cities.add(S);
            }
            List<Integer> city = pointMap.getOrDefault(S, new ArrayList<>());
            city.add(p);
            pointMap.put(S, city);
        }

        Collections.sort(cities);
        for (String city : cities) {
            List<Integer> points = pointMap.get(city);
            Collections.sort(points, Collections.reverseOrder());
            for (int p : points) {
                System.out.println(p);
            }
        }

    }
}
