package inflearn.dfsbfs.basic.p06;

public class Main {
    static int n;
    static int[] ch;
    public void DFS(int L) {
        if(L == n + 1) {
            String tmp = "";
            for(int i = 1 ; i <= n ; i++) {
                if(ch[i] == 1) tmp += (i + " ");
            }
            if(tmp.length() > 0) System.out.println(tmp);
        } else {
            //왼쪽을 뻗는 DFS
            ch[L] = 1;
            DFS(L+1);
            //오른쪽으로 뻗는 DFS
            ch[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        n = 3;
        ch = new int[n+1];
        T.DFS(1);
    }
}

//class Node {
//    int data;
//    int lt, rt;
//    public Node(int root) {
//        data = root;
//        lt = rt = null;
//    }
//}
