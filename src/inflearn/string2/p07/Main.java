package inflearn.string2.p07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = "YES";

//        char[] arr = str.toUpperCase().toCharArray();
//        int lt = 0;
//        int rt = str.length() - 1;
//
//        while (lt < rt) {
//            if (arr[lt] == arr[rt]) {
//                lt++;
//                rt--;
//            } else {
//                answer = "NO";
//                break;
//            }
//        }

        StringBuilder sb = new StringBuilder(str);
        String reversedString = sb.reverse().toString();
        if(!str.equalsIgnoreCase(reversedString)) answer = "NO";
        System.out.println(answer);
    }
}
