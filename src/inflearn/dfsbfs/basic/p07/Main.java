package inflearn.dfsbfs.basic.p07;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    //이진트리 순회
    //넓이우선탐색 : 레벨 탐색
    //큐를 사용
    Node root;

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(level + " : ");
            for(int i = 0 ; i < len; i++) {
                Node cur = queue.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) {
                   queue.offer(cur.lt);
                }
                if(cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }
            level++;
            System.out.println();
        }
    }


}

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
