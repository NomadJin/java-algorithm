package inflearn.dfsbfs2.basic.p02;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(11);
    }

    private void DFS(int i) {
        if(i == 0) return;
        else {
            int res = i % 2;
            DFS(i/2);
            System.out.print(res + " ");
        }
    }
}
