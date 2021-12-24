package inflearn.dfsbfs.basic.p13;

import java.util.ArrayList;
import java.util.Scanner;

//graph(이차원 배열) 로 경로 탐색을 할 경우 메모리 시간복잡도 면에서 비효율적이다.
public class Main {
    private static int n, m, answer = 0;
    private static ArrayList<ArrayList<Integer>> graph;
    private static int[] ch;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }

    public void DFS(int v) {
        if (v == n) answer++;
        else {
//            for (int i = 1; i <= n; i++) {
//                if (ch[i] == 0) {
//                    ch[i] = 1;
//                    DFS(i);
//                    ch[i] = 0;
//                }
//            }
            for (int nv : graph.get(v)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }
}
