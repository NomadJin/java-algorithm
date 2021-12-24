package inflearn.hashmap.p04;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String k = sc.nextLine();

        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for (char x : k.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }
        int len = k.length() - 1;
        for (int i = 0; i < len; i++) {
            am.put(str.charAt(i), am.getOrDefault(str.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = len; rt < str.length(); rt++) {
            am.put(str.charAt(rt), am.getOrDefault(str.charAt(rt), 0) + 1);
            if (am.equals(bm)) answer++;
            am.put(str.charAt(lt), am.get(str.charAt(lt)) - 1);
            if (am.get(str.charAt(lt)) == 0) am.remove(str.charAt(lt));
            lt++;
        }
        System.out.println(answer);
    }
}
