package interview.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        int result = T.solution1(new int[]{1, 2, 2, 3, 4});
        System.out.println(result == 1);
    }

    /**
     * List 를 만들고 배열에 있는 숫자를 순회하면서 해당 숫자가 List에 들어있는지 확인한다.
     * List에 들어있으면 list에서 빼고 없으면 넣는다.
     * 시간 복잡도: O(n) * O(n) => O(n2)
     * 공간 복잡도:
     */
    private int solution1(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            if (list.contains(num)) {
                list.remove((Integer) num);
            } else {
                list.add(num);
            }
        }
        return list.get(0);
    }

    /**
     * Hashmap 을 사용
     * 시간 복잡도: O(n) + O(n) => O(n)
     * 공간 복잡도: O(n)
     */
    private int solution2(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : numbers) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return 0;
    }
}
