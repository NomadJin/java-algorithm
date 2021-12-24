package inflearn.dfsbfs.advanced.p05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static int n, c;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        c = sc.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }

    public void DFS(int level, int sum, Integer[] arr) {
        if (sum > c) return;
        if (level >= answer) return;
        if (sum == c) {
            answer = Math.min(answer, level);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(level + 1, sum + arr[i], arr);
            }
        }
    }

}
