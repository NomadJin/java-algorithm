package inflearn.dfsbfs2.advanced.p03;

import java.util.Scanner;

public class Main {

    static int n;
    static int t;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }

    private void DFS(int level, int sum, int time, int[] a, int[] b) {
        if(time > t) return;
        if(level == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level + 1, sum + a[level], time + b[level], a, b);
            DFS(level + 1, sum, time, a, b);
        }
    }
}
