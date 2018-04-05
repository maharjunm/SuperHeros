package graphs;

import java.lang.reflect.Array;
import java.util.*;

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
        graphAdjecencyList.DFS(1);
//        for (int i = 1; i < number; i++) {
//            ArrayList<Integer> neighbours = graphAdjecencyList.getNeighbours(i);
//            System.out.printFields((i) + " --> ");
//            for (int j = 0; j < neighbours.size(); j++) {
//                if (j != neighbours.size() - 1) {
//                    System.out.printFields(neighbours.get(j) + "-->");
//                }
//            }
//            System.out.println();
//        }
    }

    public void DFS(int vertex) {
        Vector<Boolean> visited = new Vector<>();
        for (int i = 0; i < adjecencyList.size(); i++) {
            visited.add(false);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);
        while (stack.empty() == false) {
            vertex = stack.peek();
            stack.pop();
            if (visited.get(vertex) == false) {
                System.out.println(vertex);
                visited.set(vertex, true);
            }
            ArrayList<Integer> arrayList = getNeighbours(vertex);
            for (int i = 0; i < arrayList.size(); i++) {
                if (!visited.get(arrayList.get(i))) {
                    stack.push(arrayList.get(i));
                    vertex = arrayList.get(i);

                }
            }
        }
    }

    public void BFS(int v) {
        Vector<Boolean> vector = new Vector<>();
        for(int i=0;i<adjecencyList.size();i++) {
            vector.add(false);
        }
    }
}
