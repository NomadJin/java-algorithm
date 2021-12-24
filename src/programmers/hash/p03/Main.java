package programmers.hash.p03;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        String[][] clothes = new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int result = T.solution(clothes);
        System.out.println(result);
    }

    private int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        for(int value : hashMap.values()) {
            answer *= (value + 1);
        }

        return answer - 1;
    }
}
