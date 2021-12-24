package inflearn.stackqueue2.p02;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = "";

        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }

        for(char x : stack) {
            System.out.print(x);
        }
    }
}
