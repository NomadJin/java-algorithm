package inflearn.dfsbfs.advanced.p06;

import java.util.Scanner;

public class Main {
    private static int n, m;
    private static int[] pm, ch, arr;


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ch = new int[n];
        pm = new int[m];
        T.DFS(0);
    }

    public void DFS(int level) {
        if (level == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[level] = arr[i];
                    DFS(level + 1);
                    ch[i] = 0;
                }

            }
        }

    }
}
