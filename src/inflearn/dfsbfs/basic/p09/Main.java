package inflearn.dfsbfs.basic.p09;

public class Main {
    Node root;

    // Tree 말단노드까지의 가장 짧은 경로(DFS)
    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
    }

    public int DFS(int level, Node root) {
        if (root.lt == null && root.rt == null) return level;
        else {
            return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));
        }
    }

}

class Node {
    int data;
    Node rt, lt;

    public Node(int val) {
        data = val;
        rt = lt = null;
    }
}
