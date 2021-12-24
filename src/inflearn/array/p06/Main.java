package inflearn.array.p06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr = new int[tc];
        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < tc; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(T.isPrime(res)) answer.add(res);
        }

        for(int x : answer) {
            System.out.print(x + " ");
        }
    }

    public boolean isPrime(int num) {
        if(num == 1) return  false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
