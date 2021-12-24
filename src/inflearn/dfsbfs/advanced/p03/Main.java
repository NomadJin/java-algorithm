package inflearn.dfsbfs.advanced.p03;

import java.util.Scanner;

//최대 점수 구하기(DFS)
public class Main {
    private static int n, m;
    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);

    }

    public void DFS(int level, int sum, int time, int[] ps, int[] pt) {
        if (time > m) return;
        if (level == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level + 1, sum + ps[level], time + pt[level], ps, pt);
            DFS(level + 1, sum, time, ps, pt);
        }
    }
}
