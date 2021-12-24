package inflearn.twoPointersSlidingWindow.p02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int an = sc.nextInt();
        int[] aArr = new int[an];
        for(int i = 0 ; i < an ; i++) {
            aArr[i] = sc.nextInt();
        }
        int bn = sc.nextInt();
        int[] bArr = new int[bn];
        for(int i = 0 ; i < bn ; i++) {
            bArr[i] = sc.nextInt();
        }
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        int p1  = 0, p2 = 0;
        while (p1 < an && p2 < bn) {
            if(aArr[p1] == bArr[p2]) {
                answer.add(aArr[p1]);
                p1++;
                p2++;
            } else if (aArr[p1] < bArr[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
}
