package inflearn.hahamap2.p01;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char answer = 0;

        for(char x : str.toCharArray()) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for(char key : hashMap.keySet()) {
            if(hashMap.get(key) > max) {
                max = hashMap.get(key);
                answer = key;
            }

        }

        System.out.println(answer);

    }
}
