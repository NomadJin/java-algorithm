package inflearn.sorting.p09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = lt + rt / 2;
            if(T.count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
    }

    public int count(int[] arr, int capacity) {
        int cnt = 1;
        int sum = 0;
        for(int x : arr) {
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }
}
