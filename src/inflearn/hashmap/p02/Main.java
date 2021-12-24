package inflearn.hashmap.p02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x: str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        String answer = "YES";
        for(char x: str2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0)  answer = "NO";
            map.put(x, map.get(x) - 1);
        }
        System.out.println(answer);
    }
}
