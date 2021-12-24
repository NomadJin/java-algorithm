package inflearn.string.p11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        String answer = "";

//        char tmpStr = 0;
//        int count = 1;
//
//        for (int i = 0 ; i < chars.length ; i++ ) {
//            if(chars[i] != tmpStr) {
//                if(tmpStr != 0) {
//                    if(count == 1) {
//                        answer += tmpStr;
//                    } else {
//                        answer += (tmpStr + String.valueOf(count));
//                    }
//                }
//                tmpStr = chars[i];
//                count = 1;
//            } else {
//                count++;
//            }
//            if (i == chars.length - 1) {
//                if(count == 1) {
//                    answer += tmpStr;
//                } else {
//                    answer += (tmpStr + String.valueOf(count));
//                }
//            }
//        }

        str = str + " ";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                answer += str.charAt(i);
                if(count > 1) answer += String.valueOf(count);
                count = 1;
            }
        }
        System.out.println(answer);
    }
}
