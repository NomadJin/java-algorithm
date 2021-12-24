package inflearn.string2.p11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int cnt = 1;
        String answer = "";
        answer += arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i]) {
                cnt++;
            } else {
                if(cnt != 1) {
                    answer += cnt;
                    cnt = 1;
                }
                answer += arr[i];
            }
            if(i == arr.length -1) {
                if(cnt != 1) answer += cnt;
            }
        }
        System.out.println(answer);
    }
}
