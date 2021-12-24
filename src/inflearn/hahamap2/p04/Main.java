package inflearn.hahamap2.p04;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        Main T = new Main();

        int answer = 0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        char[] tArr = t.toCharArray();
        for (char x : tArr) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        int sLength = s.length();
        int k = t.length();
        char[] sArr = s.toCharArray();


        for (int i = 0; i < k - 1; i++) {
            am.put(sArr[i], am.getOrDefault(sArr[i], 0) + 1);
        }

        int lt = 0;
        for (int i = k - 1; i < sLength; i++) {
            am.put(sArr[i], am.getOrDefault(sArr[i], 0) + 1);
            if (am.equals(bm)) answer++;
            am.put(sArr[lt], am.get(sArr[lt]) - 1);
            if (am.get(sArr[lt]) == 0) am.remove(sArr[lt]);
            lt++;
        }
        System.out.println(answer);
    }

}
