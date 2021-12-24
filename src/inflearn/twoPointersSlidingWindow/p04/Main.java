package inflearn.twoPointersSlidingWindow.p04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        int sum = 0;
        int lt = 0;
        for (int rt = 0 ; rt < num ; rt++) {
           sum += arr[rt];
           if(sum == m) answer++;
           while (sum >= m) {
               sum -= arr[lt];
               lt++;
               if(sum == m) answer++;
           }
        }
        System.out.println(answer);

    }
}
