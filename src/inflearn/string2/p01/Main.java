package inflearn.string2.p01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        str = str.toUpperCase();
        char t = Character.toUpperCase(c);
        int answer = 0;
        for(char x : str.toCharArray()) {
            if(x == t) answer++;
        }
        System.out.println(answer);
    }
}
