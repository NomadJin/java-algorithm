package inflearn.stackqueue2.p04;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(x - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else {
                    stack.push(lt / rt);
                }
            }
        }
        answer = stack.get(0);
        System.out.println(answer);
    }
}
