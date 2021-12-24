package programmers.stackqueue.p02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        int[] priorities = new int[] {1, 1, 9, 1, 1, 1};
        int location = 0;
        int result = T.solution(priorities, location);
        System.out.println(result);

    }

    private int solution(int[] priorities, int location) {
        int answer = 1;

        Queue<Printer> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            priorityQueue.offer(priorities[i]);
            queue.offer(new Printer(i, priorities[i]));
        }

        while(true) {
            Printer tmp = queue.peek();
            int priority = tmp.priority;
            int highestPriority = priorityQueue.peek();

            if(priority == highestPriority) {
                if(tmp.id == location) {
                    return answer;
                }
                queue.poll();
                priorityQueue.poll();
                answer++;
            } else {
                queue.offer(queue.poll());
            }
        }
    }
}

class Printer {
    int id;
    int priority;

    public Printer(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
