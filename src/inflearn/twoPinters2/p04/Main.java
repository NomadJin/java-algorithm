package inflearn.twoPinters2.p04;

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

        int answer = 0;
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == k) answer++;
            while(sum >= k){
                sum -= arr[lt];
                lt++;
                if(sum == k) answer++;
            }
        }

        System.out.println(answer);
    }
}
