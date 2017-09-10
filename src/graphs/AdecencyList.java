package graphs;

import html.LinkedListImp;

import java.util.Scanner;

public class AdecencyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String[] list = new String[length];
        int count =0;
        for(int i =0;i<length;i++) {
            list[count++] = scanner.nextLine();
        }
        Node[] adjecencyList = new Node[length+1];
        for (int i = 1; i < adjecencyList.length; i++) {
            adjecencyList[i] = new Node(i);
        }
        for (int i = 0; i < list.length; i++) {
            String[] array = list[i].split(" ");
            int index1 = Integer.parseInt(array[0]);
            int index2 = Integer.parseInt(array[1]);
            Node node1 = adjecencyList[index1];
            Node node2 = adjecencyList[index2];

            while ((node1.next != null)) {
                node1 = node1.next;
            }
            node1.next = new Node(index2);
            while ((node2.next != null)) {
                node2 = node2.next;
            }
            node2.next = new Node(index1);
        }
        for(int i=1;i<adjecencyList.length-1;i++) {
            Node indexedNode = adjecencyList[i];
            String string = "";
            while(indexedNode != null) {
                string += indexedNode.data + " -> ";
                indexedNode = indexedNode.next;
            }
            System.out.println(string.substring(0,string.length()-4));
        }
    }

    public static void printLink(Node node) {
        while (node != null) {
            System.out.print(node.data + "--->");
            node = node.next;
        }
        System.out.println();
    }
}
