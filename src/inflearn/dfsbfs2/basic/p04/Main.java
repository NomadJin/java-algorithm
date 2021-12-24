package inflearn.dfsbfs2.basic.p04;

public class Main {
    static int[] fib;

    public static void main(String[] args) {
        Main T = new Main();
//        System.out.println(T.DFS(6));
        int n = 10;
        fib = new int[n+1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fib[i] + " ");
        }
    }


    private int DFS(int i) {
        if(fib[i] > 0) {
            return fib[i];
        }
        if(i == 1) return fib[i] = 1;
        else if(i == 2) return fib[i] = 1;
        else return fib[i] = DFS(i - 2) + DFS(i - 1);
    }
}
