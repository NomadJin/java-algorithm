package inflearn.dfsbfs.advanced.p02;

import java.util.Scanner;

//부분집합 문제 연습
public class Main {
    private static int c, n = 0;
    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }

    public void DFS(int level, int sum, int[] arr) {
        if (sum > c) return;
        if (level == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level + 1, sum + arr[level], arr);
            DFS(level + 1, sum, arr);
        }
    }
}
