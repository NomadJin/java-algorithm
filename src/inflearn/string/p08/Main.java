package inflearn.string.p08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String answer = "NO";
        String reverseStr = new StringBuilder(str).reverse().toString();
        if(str.equals(reverseStr)) answer = "YES";
        System.out.println(answer);
    }
}
