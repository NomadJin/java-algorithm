package programmers.search.p01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        int[] answers = new int[]{1,3,2,4,2};
        int[] result = T.solution(answers);
        for(int x : result) {
            System.out.print(x + " ");
        }
    }

    private int[] solution(int[] answers) {

        int[] student1 = new int[]{1, 2, 3, 4, 5};
        int[] student2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        ArrayList<Student> studentArrayList = new ArrayList<>();

        int point1 = 0;
        int point2 = 0;
        int point3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == student1[i % 5]) {
                point1++;
            }
            if(answers[i] == student2[i % 8]) {
                point2++;
            }
            if(answers[i] == student3[i % 10]) {
                point3++;
            }
        }
        int max = Math.max(point1, Math.max(point2, point3));
        if(point1 == max) {
            studentArrayList.add(new Student(1,point1));
        }
        if(point2 == max) {
            studentArrayList.add(new Student(2,point2));
        }
        if(point3 == max) {
            studentArrayList.add(new Student(3,point3));
        }

        Collections.sort(studentArrayList);

        int[] answer = new int[studentArrayList.size()];
        for (int i = 0; i < studentArrayList.size(); i++) {
            answer[i] = studentArrayList.get(i).index;
        }

        return answer;

//        int[] scores = new int[3];
//        for (int i = 0; i < answers.length; i++) {
//            if(student1[i % student1.length] == answers[i]) scores[0]++;
//            if(student2[i % student2.length] == answers[i]) scores[1]++;
//            if(student3[i % student3.length] == answers[i]) scores[2]++;
//        }
//
//        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
//        ArrayList<Integer> list = new ArrayList<>();
//        if(max == scores[0]) list.add(1);
//        if(max == )

    }
}

class Student implements Comparable<Student> {
    int index;
    int point;

    public Student(int index, int point) {
        this.index = index;
        this.point = point;
    }

    @Override
    public int compareTo(Student o) {
        if(this.point == o.point) {
            return  this.index - o.index;
        }
        return this.point - o.point;
    }
}
