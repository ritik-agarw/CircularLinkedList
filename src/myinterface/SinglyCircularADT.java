package myinterface;

public interface SinglyCircularADT {
    void addFirst(int element);
    int removeFirst();
    void addLast(int element);
    int size();
    boolean isEmpty();
    void traverse();
    int sizeByTraversing();
}
