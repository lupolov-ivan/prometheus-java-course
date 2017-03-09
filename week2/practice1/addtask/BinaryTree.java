package week2.practice1.addtask;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public boolean find(int key){
        return findNode(this.root, key);
    }

    private boolean findNode(Node node, int key){// нужно что-то поменять не работает
        if (node == null){
            return false;
        } else if (key == node.key){
            return true;
        } else if (key > node.key){
            findNode(node.right, key);
        } else if (key < node.key){
            findNode(node.left, key);
        }
        return false;
    }

    public boolean remove(int key) {
        return false;
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
