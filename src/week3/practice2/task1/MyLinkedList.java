package src.week3.practice2.task1;

public class MyLinkedList {

    private Node head;
    private int size = 0;

    public MyLinkedList() {

    }

    public void add(Integer data) { // добавление в конец списка

        Node n = new Node(data);

        if (head == null) {
            head = n;
            size++;
        } else {
            head.setNext(n);
            head = n;
            size++;
        }
    }

    public Integer get(int index) {
        if((index >= size)||(size == 0)){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0) {
            return head.getData();
        }

        for (int i = 1; i < size; i++) {
            head = head.getNext();
            if(i == index) {
                return head.getData();
            }
        }
        return null;
    }

    public boolean delete(int index) {
        return false;
    }

    public int size() {
        return size;
    }

    public Node test() {
        return head;
    }
}
