package inflearn.stackqueue2.p07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String c = sc.nextLine();

        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for (char x : s.toCharArray()) {
            queue.offer(x);
        }

        for (char x : c.toCharArray()) {
            if (queue.contains(x)) {
                if(queue.poll() != x) answer = "NO";
            }
        }

        if(!queue.isEmpty()) answer = "NO";

        System.out.println(answer);

    }
}
