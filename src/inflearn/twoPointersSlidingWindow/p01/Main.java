package inflearn.twoPointersSlidingWindow.p01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Two pointer 알고리즘 활용 가능한지
        //정렬한다고 했을 때 시간 복잡도 O(n log n)
        Scanner sc = new Scanner(System.in);
        int an = sc.nextInt();
        int[] aArr = new int[an];
        for (int i = 0; i < an; i++) {
            aArr[i] = sc.nextInt();
        }
        int bn = sc.nextInt();
        int[] bArr = new int[bn];
        for (int i = 0; i < bn; i++) {
            bArr[i] = sc.nextInt();
        }
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < an && p2 < bn) {
            if (aArr[p1] < bArr[p2]) {
                answer.add(aArr[p1]);
                p1++;
            } else {
                answer.add(bArr[p2]);
                p2++;
            }
        }
        while (p1 < an) {
            answer.add(aArr[p1++]);
        }
        while (p2 < bn) {
            answer.add(bArr[p2++]);
        }
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}
