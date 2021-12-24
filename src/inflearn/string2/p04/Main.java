package inflearn.string2.p04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Main T = new Main();
        String[] result = T.solution(arr, n);

        for(String s : result) {
            System.out.println(s);
        }
    }

    private String[] solution(String[] arr, int n) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            answer[i] = String.valueOf(sb.reverse());
        }
        return answer;
    }
}
