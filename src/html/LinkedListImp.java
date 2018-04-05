package html;

public class LinkedListImp {
    LinkedListImp node;
    int data;

    public LinkedListImp(LinkedListImp node, int data) {
        this.node = node;
        this.data = data;
    }

    public void add(LinkedListImp node) {
        node.node = node;
    }
    public int getData() {
        return data;
    }
}
