package inflearn.stackqueue.p01;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else  {
                if(stack.isEmpty()) answer = "NO";
                else stack.pop();
            }
        }
        if(!stack.isEmpty()) answer = "NO";

        System.out.println(answer);
    }
}
