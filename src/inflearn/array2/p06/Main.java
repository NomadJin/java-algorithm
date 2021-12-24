package inflearn.array2.p06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> answer = new ArrayList<>();

        Main T = new Main();
        T.isPrime(n);

        for (int i = 0; i < n; i++) {
            int reversedInt = T.reverseInt(arr[i]);
            System.out.println(reversedInt);
            if(T.isPrime(reversedInt)) answer.add(reversedInt);
        }

        for(int x : answer) {
            System.out.print(x + " ");
        }
    }

    private boolean isPrime(int n) {
        if(n == 1) return false;
        for (int i = 2; i < n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    private int reverseInt(int n) {
        int tmp = n;
        int result = 0;
        while (tmp > 0) {
            int rest = tmp % 10;
            result = result * 10 + rest;
            tmp = tmp / 10;
        }
        return result;
    }
}
