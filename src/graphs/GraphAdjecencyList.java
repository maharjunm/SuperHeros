package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GraphAdjecencyList {
    Map<Integer, ArrayList<Integer>> adjecencyList;

    GraphAdjecencyList(int vertices) {
        adjecencyList = new HashMap<>();
        for (int i = 1; i <= vertices; i++) {
            adjecencyList.put(i, new ArrayList<>());
        }
    }

    public void addVertices(int u, int v) {
        if (u >= adjecencyList.size() || v >= adjecencyList.size()) {
            return;
        }
        (adjecencyList.get(u)).add(v);
        (adjecencyList.get(v)).add(u);
    }

    public ArrayList<Integer> getNeighbours(int u) {
        return adjecencyList.get(u);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("Enter number of Edges: ");
        int edges = scanner.nextInt();
        GraphAdjecencyList graphAdjecencyList = new GraphAdjecencyList(number);
        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graphAdjecencyList.addVertices(u, v);
        }
        for (int i = 1; i < number; i++) {
            ArrayList<Integer> neighbours = graphAdjecencyList.getNeighbours(i);
            System.out.print((i) + " --> ");
            for (int j = 0; j < neighbours.size(); j++) {
                if (j != neighbours.size() - 1) {
                    System.out.print(neighbours.get(j) + "-->");
                }
            }
            System.out.println();
        }
    }
}
