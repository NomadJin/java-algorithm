package programmers.hash.p01;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        String[] participant = new String[] {"leo", "kiki", "eden"};
        String[] completion = new String[] {"eden", "kiki"};
        String result = T.solution(participant, completion);
        System.out.println(result);
    }

    private String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> hashMap = new HashMap();

        for(String s : participant) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            //vaule 1 이상 이면 다운
            if(hashMap.get(s) > 1) {
                hashMap.put(s, hashMap.get(s) - 1);
            } else {
                hashMap.remove(s);
            }
        }

        for(String key: hashMap.keySet()) {
            if(hashMap.get(key) != 0) {
                answer = key;
            }
        }

        return answer;

    }


}
