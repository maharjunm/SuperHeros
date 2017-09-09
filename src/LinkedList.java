public class LinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node headNode = new Node(1);
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);
        headNode.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = third;

        Node node = headNode;
        Node fastNode = headNode;
        while (node != null && fastNode != null && fastNode.next != null) {
            if(node == fastNode) {
                System.out.println("having a loop");
            }
            System.out.println(node.data);
            System.out.println(fastNode.data + ", fast NOde");
            node = node.next;
            fastNode = fastNode.next.next;
        }
    }
}