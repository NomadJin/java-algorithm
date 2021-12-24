package inflearn.sortingsearching.p05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //중복제거
        //HashMap 으로 해결이 가능하나, 정렬로도 가능하다. but 시간 복잡도 nlogn
        String answer = "U";

        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) answer = "D";
        }

        System.out.println(answer);

    }
}
