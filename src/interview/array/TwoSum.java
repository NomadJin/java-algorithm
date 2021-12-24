package interview.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.solution2(new int[]{2, 3, 5, 7}, 9);
        System.out.println(Arrays.toString(result));
    }

    private int[] solution2(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
           map.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if(map.containsKey(numberToFind) && map.get(numberToFind) != i) {
                return new int[] {i, map.get(numberToFind)};
            }
        }
        return null;
    }

    //가장 간단하게 구현, O(n2), O(1)
    private int[] solution1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


}
