package inflearn.sortingsearching.p01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        //선택정렬 오름차순
        for (int i = 0 ; i < n ; i++) {
            int idx = i;
            for(int j = i + 1 ; j < n ; j++) {
                if(arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            //System.out.println("idx: " + idx);
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
