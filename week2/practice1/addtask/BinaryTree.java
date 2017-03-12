package week2.practice1.addtask;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public boolean find(int key){
        if (findNode(this.root, key) == null) {
            return false;
        }
        return true;
    }

    private Node findNode(Node node, int key){
        if (node == null){
            return null;
        } else if (key == node.key){
            return node;
        } else if (key > node.key){
            node = findNode(node.right, key);
        } else if (key < node.key){
            node = findNode(node.left, key);
        }
        return node;
    }

    public void add(int key){
        this.root = putNode(this.root, key);
    }

    private Node putNode(Node node, int key){
        if (node == null) {
            return new Node(key);
        }
        if (key < node.key) {
            node.left = putNode(node.left, key);
        }
        if (key > node.key){
            node.right = putNode(node.right, key);
        }
        if (key == node.key) {
            node.key = key;
        }
        return node;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
