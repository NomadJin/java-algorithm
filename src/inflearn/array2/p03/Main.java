package inflearn.array2.p03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            bArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(aArr[i] == bArr[i]) {
                System.out.println("D");
            } else if((aArr[i] == 2 && bArr[i] == 1) || (aArr[i] == 3 && bArr[i] == 2) || (aArr[i] == 1 && bArr[i] == 3)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
