package inflearn.array.p04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        ArrayList<Integer> answer = new ArrayList<>();
//        answer.add(1);
//        for (int i = 1; i < tc; i++) {
//            int sum = a + b;
//            answer.add(sum);
//            a = b;
//            b = sum;
//        }

        int[] answer = new int[tc];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < tc; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
