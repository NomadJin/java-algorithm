package inflearn.stackqueue2.p03;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            int idx = arr[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if(board[j][idx] != 0) {
                    int tmp = board[j][idx];
                    board[j][idx] = 0;
                    if(!stack.isEmpty() && stack.peek() == tmp) {
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}
