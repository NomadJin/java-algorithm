package inflearn.array.p02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr = new int[tc];
        int answer = 1;
        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();
        }
        int maxHeight = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxHeight) {
                maxHeight = arr[i];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
