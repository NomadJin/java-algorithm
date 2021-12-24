package programmers.sorting.p02;

import java.util.Arrays;

// K번째 수
public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Main T = new Main();
        int[] result = T.solution(array, commands);
        for(int x: result) {
            System.out.print(x + " ");
        }
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            for (int j = 0; j < 3; j++) {
                //commands[i][0] -> commands[i][1] 자르기
                //commnans[i][2] 번째 숫자 찾아서 answer[i] 에 추가;
                int st = commands[i][0]; //2
                int end = commands[i][1]; //5
                int point = commands[i][2] - 1;
//                int tmp[] = Arrays.copyOfRange(array, st, end);
                int length = end - st + 1;
                int tmp[] = new int[length];
                int idx = 0;
                for (int k = st - 1; k < end; k++) {
                    tmp[idx++] = array[k];
                }

                Arrays.sort(tmp);
                answer[i] = tmp[point];
            }
        }

        return answer;
    }
}
