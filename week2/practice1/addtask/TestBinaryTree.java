package prometeus.week2.practice1.addtask;

public class TestBinaryTree {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(31);
        tree.add(2);
        tree.add(5);
        tree.add(0);
        tree.add(-10);
        tree.add(-2);

        System.out.println(tree.find(2));
    }
}
