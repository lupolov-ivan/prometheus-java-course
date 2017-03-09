package week2.practice1.addtask;

public class Node {
    public int key;
    public Node left;
    public Node right;
    public Node parent;

    public Node (int key){
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
