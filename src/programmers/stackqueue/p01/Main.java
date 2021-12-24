package programmers.stackqueue.p01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        int[] result = T.solution(progresses, speeds);
    }

    private int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> answers = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.offer((int) Math.ceil(((double) (100 - progresses[i])) / speeds[i]));
        }

        int max = queue.poll();
        int stack = 1;

        for (int i = 1; i < progresses.length; i++) {
            if(max < queue.peek()) {
                max = queue.peek();
                answers.add(stack);
                stack = 0;
            }
            queue.poll();
            stack++;
        }
        answers.add(stack);

        System.out.println(answers);

        int[] answer = answers.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
