package inflearn.string2.p10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        int len = str.length();
        int dis = 1000;
        int[] answer = new int[str.length()];
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t) {
                dis = 0;
            } else {
                dis++;
            }
            answer[i] = dis;
        }
        dis = 1000;
        for (int i = len - 1; i >= 0 ; i--) {
            if(str.charAt(i) == t) {
                dis = 0;
            } else {
                dis++;
            }
            if(answer[i] > dis) answer[i] = dis;
        }

        System.out.println(Arrays.toString(answer));
    }
}
