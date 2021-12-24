package inflearn.dfsbfs2.basic.p03;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        System.out.println(T.DFS(5));
    }

    private int DFS(int i) {
        if (i == 1) return 1;
        else return i * DFS(i - 1);
    }

}
