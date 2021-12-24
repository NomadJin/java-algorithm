package inflearn.string.p09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
//        String answer = "";
//        for (char x : chars) {
//            if (x >= 48 && x <= 57) {
//                answer += x;
//            }
//        }
//        System.out.println(Integer.parseInt(answer));

        int answer = 0;
        for (char x : chars) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }
        System.out.println(answer);
    }
}
