package inflearn.array2.p12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tc = sc.nextInt();
        int[][] board = new int[tc][n];
        for (int i = 0; i < tc; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < tc; k++) {
                    int pi = 0;
                    int pj = 0;
                    for (int l = 0; l < n; l++) {
                        if(board[k][l] == i) pi = l;
                        if(board[k][l] == j) pj = l;
                    }
                    if(pi < pj) cnt++;
                }
                if (cnt == tc) answer++;
            }
        }

        System.out.println(answer);


    }
}
