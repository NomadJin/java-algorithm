package inflearn.array.p12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tc = sc.nextInt();
        int[][] arr = new int[tc][num];
        for (int i = 0; i < tc; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                int cnt = 0;
                for (int k = 0; k < tc; k++) {
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < num; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if(pi < pj) cnt++;
                }
                if (cnt == tc) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
