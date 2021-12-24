package inflearn.array.p07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr = new int[tc];
        for (int i = 0 ; i < tc; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        int answer = 0;
        for (int i = 0; i < tc; i++) {
            if(arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        System.out.println(answer);
    }
}
