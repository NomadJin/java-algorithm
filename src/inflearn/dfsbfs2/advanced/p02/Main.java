package inflearn.dfsbfs2.advanced.p02;

import java.util.Scanner;

public class Main {

    static int n;
    static int total;
    static int answer;
    static int[] arr;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        total = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }

    private void DFS(int level, int sum, int[] arr) {
        if(sum > total) return;
        if(level == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level + 1, sum + arr[level], arr);
            DFS(level + 1, sum, arr);
        }
    }
}
