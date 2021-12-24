package inflearn.stackqueue.p07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine();
        String plan = sc.nextLine();

        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for(char x : sub.toCharArray()) {
            queue.offer(x);
        }

        for(char x : plan.toCharArray()) {
            if(queue.contains(x)) {
                if(queue.poll() != x) answer = "NO";
            }
        }
        if(!queue.isEmpty()) answer = "NO";
        System.out.println(answer);
    }
}
