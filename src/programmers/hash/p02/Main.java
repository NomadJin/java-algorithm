package programmers.hash.p02;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        String[] phoneBook = new String[]{
                "119", "97674223", "1195524421", "832"
        };
        boolean result = T.solution(phoneBook);
        System.out.println(result);

    }

    private boolean solution(String[] phone_book) {
        boolean answer = true;

//        HashMap<String, Integer> hashMap = new HashMap<>();
//
//        for(String pb : phoneBook) {
//            hashMap.put(pb, hashMap.getOrDefault(pb, 0) + 1);
//        }
//
//        for(String pb : phoneBook) {
//            for(String key : hashMap.keySet()) {
//                if(key.startsWith(pb) && !key.equals(pb)){
//                    answer = false;
//                }
//            }
//        }

//        for (int i = 0; i < phone_book.length - 1; i++) {
//            for (int j = i+1; j < phone_book.length; j++) {
//                if(phone_book[i].startsWith(phone_book[j])) answer = false;
//                if(phone_book[j].startsWith(phone_book[i])) answer = false;
//            }
//        }

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
