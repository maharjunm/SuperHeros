package linkedlist;

public class LinkedList {
    static class Node {
        Node next;
        int data;
        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.root = new Node(1);
        linkedList.addElement(2);
        linkedList.printNodes(linkedList.root);
    }

    public void printNodes(Node node) {
        while(node!=null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void addElement(int number) {
        Node node = new Node(number);
        if(root == null) {
            root = node;
        }
        Node lastNode = root;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = node;
    }
}
