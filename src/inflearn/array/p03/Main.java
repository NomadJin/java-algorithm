package inflearn.array.p03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] aArr = new int[tc];
        int[] bArr = new int[tc];

        for (int i = 0; i < tc; i++) {
            aArr[i] = sc.nextInt();
        }

        for (int i = 0; i < tc; i++) {
            bArr[i] = sc.nextInt();
        }

        for (int i = 0; i < tc; i++) {
            if (aArr[i] == bArr[i]) {
                System.out.println("D");
            } else if ((aArr[i] == 1 && bArr[i] == 3) || (aArr[i] == 2 && bArr[i] == 1) || (aArr[i] == 3 && bArr[i] == 2)) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}
