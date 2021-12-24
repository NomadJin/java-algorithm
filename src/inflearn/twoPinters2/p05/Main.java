package inflearn.twoPinters2.p05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n / 2 + 1;
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = i + 1;
        }

        int answer = 0;
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < k; rt++) {
            sum += arr[rt];
            if(sum == n) answer++;
            while(sum >= n) {
                sum -= arr[lt];
                lt++;
                if(sum == n) answer++;
            }
        }

        System.out.println(answer);
    }
}
