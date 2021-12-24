package inflearn.dfsbfs.basic.p01;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);

    }

    //깊이 우선 탐색 -> 재귀함수
    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
//            System.out.print(n + " ");
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }
}
