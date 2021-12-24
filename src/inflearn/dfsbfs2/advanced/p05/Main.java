package inflearn.dfsbfs2.advanced.p05;

import java.util.Scanner;

public class Main {
    static int n, c;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        c = sc.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }

    private void DFS(int level, int sum, int[] arr) {
        if(sum > c) return;
        if(level >= answer) return;
        if(sum == c) {
            answer = Math.min(answer, level);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(level + 1, sum + arr[i], arr);
            }
        }
    }
}
