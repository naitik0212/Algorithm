package graph;

import java.util.*;

// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.

// This class represents a directed graph using adjacency list
// representation

public class BreadthFirstSearch
{
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists

    // Constructor
    private BreadthFirstSearch(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    private void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    private void BFS(int s)
    {

        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            //If not visited, enqueue
            for (Integer n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // Driver method to
    public static void main(String args[])
    {
        BreadthFirstSearch g = new BreadthFirstSearch(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);
    }
}
// This code is referred from GeeksForGeeks
