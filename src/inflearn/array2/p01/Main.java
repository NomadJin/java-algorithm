package inflearn.array2.p01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
}
