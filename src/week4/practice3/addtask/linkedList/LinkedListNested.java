package src.week4.practice3.addtask.linkedList;

public class LinkedListNested {

    class Node {
        private Node next;
        private Integer data;
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedListNested() {

    }

    public void add(Integer data) { // добавление в конец списка

        Node n = new Node();
        n.data = data;
        if (head == null) {
            head = n;
            tail = n;
            size++;
        } else {
            tail.next = n;
            tail = n;
            size++;
        }
    }

    public Integer get(int index) {
        Node tmp = null;
        Node h = head;

        if((index >= size)||(size == 0)||(index < 0)){
            return null;
        }
        for (int i = 0; i < index; i++) {
            tmp = h.next;
            h = tmp;
        }
        return h.data;
    }

    public boolean delete(int index) {
        Node tmp = null;
        Node h = head;
        if((index >= size)||(size == 0)||(index < 0)){
            return false;
        }
        if(index == 0) {        // случай если удаляемый элемент первый...
            if(size == 1) {     // случай если елемент единственный...
                head = null;
                tail = null;
                size--;
                return true;
            }
            tmp = h.next;
            h = tmp.next;
            head.next = h;
            head = tmp;
            size--;
            return true;
        }
        for (int i = 0; i < index - 1; i++) { // находим узел идущий перед удаляемым
            tmp = h.next;
            h = tmp;
        }
        tmp = h.next.next; // получаем узел следующий после удалеяемого
        h.next = tmp;              // присваеваем его ссылке на следующий узел узла идущего перед удаляемым
        size--;
        return true;
    }

    public int size() {
        return size;
    }
}
