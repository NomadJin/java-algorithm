package programmers.sorting.p01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 가장 큰 수
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[]{3, 30, 34, 5, 9};
        String[] strings = new String[numbers.length];
        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        answer = sb.toString();
        if (strings[0].equals("0")) {
            System.out.println("0");
        } else {
            System.out.println(answer);
        }

    }
}
