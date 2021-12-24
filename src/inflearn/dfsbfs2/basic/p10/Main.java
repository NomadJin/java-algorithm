package inflearn.dfsbfs2.basic.p10;

import java.awt.geom.QuadCurve2D;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    Node root;
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));

    }

    private int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                if(cur.lt == null && cur.rt == null) {
                    return L;
                }
                if(cur.lt != null) queue.offer(cur.lt);
                if(cur.rt != null) queue.offer(cur.rt);
            }
            L++;
        }
        return 0;
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
