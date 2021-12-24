package inflearn.array.p05;

import java.util.Scanner;

//소수 구하기(에라토스테네스 체)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        int[] ch = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            if (ch[i] == 0) {
                answer++;
                // i의 배수를 체크한다.
                for (int j = i; j <= num; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }
}
