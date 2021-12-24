package inflearn.array2.p07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        int point = 0;

        for(int x : arr) {
            if(x == 1) {
                point++;
                answer += point;
            } else {
                point = 0;
            }

        }

        System.out.println(answer);

    }
}
