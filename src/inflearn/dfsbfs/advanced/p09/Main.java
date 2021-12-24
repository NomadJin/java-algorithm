package inflearn.dfsbfs.advanced.p09;

import java.util.Scanner;

public class Main {
    private static int n, m;
    private static int[] combi;

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }

    public void DFS(int level, int start) {
        if(level == m) {
            for(int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for(int i = start ; i <= n ; i++) {
                combi[level] = i;
                DFS(level + 1, i + 1);
            }
        }
    }
}
