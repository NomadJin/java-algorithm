package programmers.hash.p04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        String[] genres = new String[] {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[] {500, 600, 150, 800, 2500};
        int[] result = T.solution(genres, plays);
    }

    private int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        ArrayList<Integer> answers = new ArrayList<>();
        ArrayList<String> al = new ArrayList<String>(hashMap.keySet());

        Collections.sort(al, (o1, o2)->(hashMap.get(o2).compareTo(hashMap.get(o1))));

        for (int i = 0; i < al.size(); i++) {
            String tmpGenres = al.get(i);
            int firstIdx = 0;
            int secondIdx = 0;
            int max = 0;
            for (int j = 0; j < genres.length; j++) {
                if(tmpGenres.equals(genres[j])) {
                    if(plays[j] > max) {
                        max = plays[j];
                        firstIdx = j;
                    }
                }
            }

            max = -1;
            for (int j = 0; j < genres.length; j++) {
                if(tmpGenres.equals(genres[j])) {
                    if(j != firstIdx && plays[j] > max) {
                        max = plays[j];
                        secondIdx = j;
                    }
                }
            }
            answers.add(firstIdx);
            if(max != -1) {
                answers.add(secondIdx);
            }
        }

        int[] answer = answers.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
