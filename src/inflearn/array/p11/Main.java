package inflearn.array.p11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int grade = 6;
        int[][] arr = new int[num + 1][grade];
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < grade; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= num; i++) {
            int cnt = 0;
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k < grade; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        System.out.println(answer);
    }
}
