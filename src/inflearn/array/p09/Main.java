package inflearn.array.p09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[][] arr = new int[tc][tc];
        for (int i = 0; i < tc; i++) {
            for (int j = 0; j < tc; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for (int i = 0; i < tc; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < tc; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;

        for (int i = 0; i < tc; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][tc - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        System.out.println(answer);
    }
}
