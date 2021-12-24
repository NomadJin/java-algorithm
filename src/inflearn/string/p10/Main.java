package inflearn.string.p10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        char[] chars = str.toCharArray();
        int len = chars.length;
        int distance = 1000;
        int[] answers = new int[chars.length];
        answers[0] = distance;
        //왼쪽에서 오른쪽으로
        for (int i = 0; i < len; i++) {
            if (chars[i] == ch) {
                distance = 0;
            } else {
                distance++;
            }
            answers[i] = distance;
        }
        //오른쪽에서 왼쪽으로
        distance = 1000;
        for (int i = len - 1; i >= 0; i--) {
            if (chars[i] == ch) {
                distance = 0;
            } else {
                distance++;
//                if (answers[i] > distance) {
//                    answers[i] = distance;
//                }
                answers[i] = Math.min(answers[i], distance);
            }
        }

        for (int i = 0; i < answers.length; i++) {
            if(i == 0) System.out.print(answers[i]);
            else System.out.print(" " + answers[i]);
        }
    }
}
