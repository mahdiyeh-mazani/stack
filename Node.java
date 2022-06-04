package seri5;

public class Node<T> {
    T value;
    Node<T> last = null;

    public Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }
}
