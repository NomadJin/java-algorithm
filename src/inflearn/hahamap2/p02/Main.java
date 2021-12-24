package inflearn.hahamap2.p02;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String answer = "YES";

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char x : a.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        for (char x : b.toCharArray()) {
            if (!hashMap.containsKey(x) || hashMap.get(x) == 0) answer = "NO";
            hashMap.put(x, hashMap.get(x) - 1);
        }


        System.out.println(answer);
    }
}
