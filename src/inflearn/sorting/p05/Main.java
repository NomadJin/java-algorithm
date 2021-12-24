package inflearn.sorting.p05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String answer = "U";

//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//
//        for(int x : arr) {
//            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
//            if(hashMap.get(x) > 1) {
//                answer = "D";
//            }
//        }

        Arrays.sort(arr); // 오름차순 정렬
        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) {
                answer = "D";
                break;
            }
        }

        System.out.println(answer);
    }
}
