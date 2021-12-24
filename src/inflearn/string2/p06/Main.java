package inflearn.string2.p06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = "";
//        for (int i = 0; i < str.length(); i++) {
//            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
//        }

        char[] arr = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (char x : arr) {
            set.add(x);
        }

        for(Character c : set) {
            System.out.print(c);
        }

    }
}
