package inflearn.array2.p05;

import java.util.Scanner;

//에라토스테네스 체
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        // i 를 숫자와 동일하게
        int[] check = new int[n + 1];
        for (int i = 2; i < n; i++) {
            if (check[i] == 0) {
                answer++;
                for (int j = i; j < n; j = j + i) {
                    check[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }
}
