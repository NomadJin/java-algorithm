package inflearn.array2.p02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = 1;
        int mh = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > mh) {
                answer++;
                mh = arr[i];
            }
        }
        System.out.println(answer);
    }
}
