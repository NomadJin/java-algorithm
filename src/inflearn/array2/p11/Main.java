package inflearn.array2.p11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grade = 6;
        int[][] board = new int[n+1][grade];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < grade; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n ; j++) {
                for (int k = 1; k < grade; k++) {
                    if(board[i][k] == board[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
