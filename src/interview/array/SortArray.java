package interview.array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        int[] result = sortArray.solution(new int[] {2, 4, 1, 5, 6, 9});
        System.out.println(Arrays.toString(result));
    }

    private int[] solution(int[] numbers) {
        boolean[] booleans = new boolean[100];
        for(int num : numbers) {
            booleans[num] = true;
        }
        
        int index = 0;
        for (int i = 0; i < booleans.length; i++) {
            if(booleans[i]) {
                numbers[index++] = i;
            }
        }

        return numbers;
        
    }
}
