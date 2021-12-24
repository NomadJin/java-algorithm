package inflearn.string.p04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        String[] str = new String[tc];
        for (int i = 0; i < tc; i++) {
            str[i] = sc.next();
        }
        for (String x : str) {
            T.solution(x);
        }
    }

    public void solution(String str) {
//        StringBuilder tmp = new StringBuilder(str);
//        System.out.println(tmp.reverse());
        //직접 뒤집기
        char[] s = str.toCharArray();
        //첫번째문자 inflearn.array index
        int lt = 0;
        //마지막문자 inflearn.array index
        int rt = s.length - 1;

        while (lt < rt) {
            char tmp = s[lt];
            s[lt] = s[rt];
            s[rt] = tmp;
            lt++;
            rt--;
        }
        String tmp = String.valueOf(s);
        System.out.println(tmp);
    }
}
