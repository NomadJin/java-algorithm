package inflearn.twoPointersSlidingWindow.p03;

import java.util.Scanner;

//Sliding window
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i =0 ; i < cnt ; i++) {
            sum += arr[i];
        }
        int answer = sum;

        for(int i = cnt ; i <= num - cnt ; i++) {
            sum = sum + arr[i] - arr[i - cnt];
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}
