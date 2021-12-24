package interview.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] result = threeSum.solution(new int[]{2, 3, 5, 7}, 10);
        System.out.println(Arrays.toString(result));
    }

    private int[] solution(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int numberToTarget = target - numbers[i] - numbers[j];
                if (map.containsKey(numberToTarget) && map.get(numberToTarget) != i) {
                    return new int[]{i, j, map.get(numberToTarget)};
                }
            }
        }
        return null;
    }
}
