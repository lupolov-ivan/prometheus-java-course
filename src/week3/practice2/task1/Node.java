package src.week3.practice2.task1;

public class Node {

    private Node next;
    private Integer data;

    public Node(){

    }

    public Node(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
}
