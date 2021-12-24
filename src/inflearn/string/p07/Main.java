package inflearn.string.p07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "YES";
//        char[] charArray = str.toUpperCase().toCharArray();
//        int lt = 0;
//        int rt = str.length() - 1 ;
//        while (lt < rt) {
//            if(charArray[lt] == charArray[rt]) {
//                lt++;
//                rt--;
//            } else {
//                answer = "NO";
//                break;
//            }
//        }
//        System.out.println(answer);
        Main T = new Main();
        System.out.println(T.solution(str));

    }

    public String solution(String str) {
//        String answer = "YES";
//        str = str.toUpperCase();
//        int len = str.length();
//        for (int i = 0; i < len / 2; i++) {
//            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
//        }

        //StringBuilder 사용하여 체크
        String answer = "NO";
        String reverseStr = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(reverseStr)) answer = "YES";
        return answer;
    }
}
