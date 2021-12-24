package inflearn.dfsbfs.basic.p03;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        System.out.println(T.DFS(5));
    }

    public int DFS(int n) {
        if(n == 1) return 1;
        else {
            return n * DFS(n - 1);
        }
    }
}
