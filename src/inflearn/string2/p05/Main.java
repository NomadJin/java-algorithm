package inflearn.string2.p05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = arr.length - 1;
        while (lt < rt) {
            if(!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char temp = arr[rt];
                arr[rt] = arr[lt];
                arr[lt] = temp;
                lt++;
                rt--;
            }
        }
        String result = String.valueOf(arr);
        System.out.println(result);
    }
}
