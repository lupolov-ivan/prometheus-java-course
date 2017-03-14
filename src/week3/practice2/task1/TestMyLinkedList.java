package src.week3.practice2.task1;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.get(1));
    }
}
