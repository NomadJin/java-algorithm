package inflearn.string2.p03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = "";
        int max = Integer.MIN_VALUE;
        for(String s : str.split(" ")) {
            int len = s.length();
            if(len > max) {
                max = len;
                answer = s;
            }
        }
        System.out.println(answer);
    }
}
