package inflearn.dfsbfs2.basic.p08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    int answer = 0;
    int[] dis = { -1, 1, 5};
    int[] ch;
    Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(T.BFS(n, m));
    }

    private int BFS(int n, int m) {
        ch = new int[10001];
        ch[n] = 1;
        queue.offer(n);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0 ; i < len ; i++) {
                int x = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if(nx == m) return L;
                    if(nx >=1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }
}
