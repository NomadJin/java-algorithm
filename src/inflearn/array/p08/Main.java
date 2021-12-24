package inflearn.array.p08;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr = new int[tc];
        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();
        }
        int rank = 1;
        ArrayList<Integer> answers = new ArrayList<>();
        for (int i = 0; i < tc; i++) {
            for (int j = 0; j < tc ; j++) {
                if(arr[i] < arr[j]) {
                    rank++;
                }
            }
            answers.add(rank);
            rank = 1;
        }
        for (int answer : answers) {
            System.out.print(answer + " ");
        };
    }
}