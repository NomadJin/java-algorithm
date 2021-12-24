package inflearn.string.p02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(T.transCharacter(str));
    }

    public String transCharacter(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
//            if (Character.isUpperCase(x)) answer += Character.toLowerCase(x);
//            else answer += Character.toUpperCase(x);
            //ASCII 넘버로 확인....65 ~ 90(대문자) 97 ~ 122(소문자)
            if (x >= 65 && x <= 90) answer += Character.toString(x+32);
            else answer += Character.toString(x-32);
        }
        return answer;
    }
}
