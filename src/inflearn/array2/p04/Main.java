package inflearn.array2.p04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> answer = new ArrayList<>();
        answer.add(1);

        for (int i = 1; i < n; i++) {
            if(i == 1) {
                answer.add(i);
            } else {
                answer.add(answer.get(i-2) + answer.get(i-1));
            }
        }

        for(int x: answer) {
            System.out.print(x + " ");
        }
    }
}
