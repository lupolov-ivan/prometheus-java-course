package src.week3.practice2.task1;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    public MyLinkedList() {

    }

    public void add(Integer data) { // добавление в конец списка

        Node n = new Node(data);

        if (head == null) {
            head = n;
            tail = n;
            size++;
        } else {
            tail.setNext(n);
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
            tmp = h.getNext();
            h = tmp;
        }
        return h.getData();
    }

    public boolean delete(int index) {
        Node tmp = null;
        Node h = head;
        if((index >= size)||(size == 0)||(index < 0)){
            return false;
        }
        if(index == 0) {        // случай если удаляемый элемент первый
            tmp = h.getNext();
            h = tmp.getNext();
            head.setNext(h);
            head = tmp;
            size--;
            return true;
        }
        for (int i = 0; i < index - 1; i++) { // находим узел идущий перед удаляемым
            tmp = h.getNext();
            h = tmp;
        }
        tmp = h.getNext().getNext(); // получаем узел следующий после удалеяемого
        h.setNext(tmp);              // присваеваем его ссылке на следующий узел узла идущего перед удаляемым
        size--;
        return true;
    }

    public int size() {
        return size;
    }

    public Node test() {
        return head;
    }
}
