package inflearn.string.p12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strCount = sc.nextInt();
        String encrypted = sc.next();
        String answer = "";
//        String[] encArr = new String[strCount];
//        for (int i = 0; i < strCount; i++) {
//            encArr[i] = encrypted.substring(i * 7, (i + 1) * 7);
//        }
//
//        for (String str : encArr) {
//            str = str.replace("#", "1").replace("*", "0");
//            int decimal = Integer.parseInt(str, 2);
//            answer += Character.toString(decimal);
//        }
        for (int i = 0 ; i < strCount ; i++) {
            String tmp = encrypted.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(tmp, 2);
            answer += (char)(num);
            encrypted = encrypted.substring(7);
        }
        System.out.println(answer);
    }
}
