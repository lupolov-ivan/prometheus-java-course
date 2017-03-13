package src.week3.practice2.task1;

public class MyLinkedList {

    public Node head;
    public Node tail;

    public MyLinkedList() {

    }

    public void add(Integer data) { // добавление в конец списка

        Node n = new Node(data);

        if (tail == null) {
            head = n;
            tail = n;
        } else {
            tail.setNext(n);
            tail = n;
        }
    }

    public Integer get(int index) {
        int i = 0;
        if (head != null) {
            if (index == 0) {
                return head.getData();
            }
            while (head.getNext() != null) {
                head = head.getNext();
                i++;
                if (index == i) {
                    return head.getData();
                }
            }
        }
        return null;
    }

    public boolean delete(int index) {
        return false;
    }

    public int size() {
        int count = 0;
        if (head != null) {
            count++;
            while (head.getNext() != null) {
                count++;
                head = head.getNext();
            }
        } else {
            return 0;
        }
        return count;
    }
}
