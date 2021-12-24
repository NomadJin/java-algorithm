package interview.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.solution3(new int[]{1, 2, 3, 4, 5}));
    }

    /*
    가장 단순한 방법
    O(n2), O(1)
     */
    private boolean solution1(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 배열이 정렬되어 있다면? 정렬 이후 순회 O(NlogN), O(logN)
    private boolean solution2(int[] numbers) {
        Arrays.sort(numbers); // O(NlogN), O(logN)
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }
        return false;
    }

    //Set 을 사용한다. O(n), O(n)
    private boolean solution3(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
