package inflearn.dfsbfs2.basic.p01;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);
    }

    public void DFS(int n){
        if(n == 0) return;
        else {
            // System.out.print(n);
            DFS(n-1);
            System.out.print(n + " ");
        }
    }
}
