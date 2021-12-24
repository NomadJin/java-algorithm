package inflearn.string2.p12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String e = sc.next();
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = e.substring(0, 7).replace("#", "1").replace("*", "0");
            int tmpInt = Integer.parseInt(tmp, 2);
            answer += (char)(tmpInt);
            e = e.substring(7);
        }
        System.out.println(answer);
    }
}
