package inflearn.twoPinters2.p03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //슬라이딩 윈도우
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        int sum = 0;
        for(int i = 0 ; i < m ; i++) {
            sum += arr[i];
        }
        answer = sum;

        int lt = 0;
        int rt = m-1;

        for (int i = m; i < n; i++) {
            sum += (arr[i] - arr[i - m]);
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);

    }
}
