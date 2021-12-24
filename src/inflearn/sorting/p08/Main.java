package inflearn.sorting.p08;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int answer = 0;
        int lt = 0;
        int rt = n - 1;
        while (lt <= rt) {
            int mid = lt + rt / 2;
            if(arr[mid] > k) {
                rt = mid + 1;
            } else if (arr[mid] < k) {
                lt = mid + 1;
            } else {
                answer = mid + 1;
                break;
            }
        }
        System.out.println(answer);

    }
}
