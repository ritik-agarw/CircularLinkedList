package implementation;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        next = null; //If not defined it will by default be null.
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
