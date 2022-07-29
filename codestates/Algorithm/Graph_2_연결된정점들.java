package codestates.Algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_2_연결된정점들 {

public static int connectdVertices(int[][] edges)
{
   int bigger = 0;

    for (int i = 0; i < edges.length; i++) {
        for (int j = 0; j < edges[i].length; j++)
        {
            if(bigger < edges[i][j])
                bigger = edges[i][j];
        }
    }
    int[][] adjArray = new int[bigger+1][bigger+1];
    for (int i = 0; i < edges.length; i++) {
        int from = edges[i][0];
        int to = edges[i][1];
        adjArray[from][to]=1;
        adjArray[to][from]=1;
    }
    boolean[] visited = new boolean[bigger+1];
    int count = 0;

    for(int vertex=0;vertex<visited.length;vertex++)
    {
        if(!visited[vertex])
        {
            count++;
            visited= bfs_array(adjArray,vertex,visited);
        }
    }
    return count;

}
public static boolean[] bfs_array(int[][] adjArray,int vertex,boolean[] visited)
{
    Queue<Integer> queue = new LinkedList<>();

    queue.add(vertex);
    visited[vertex]=true;
    while(!queue.isEmpty())
    {
        int cur = queue.poll();
        for (int i = 0; i <adjArray[cur].length ; i++) {
            if(adjArray[cur][i]==1 && !visited[i])
            {

                queue.add(i);
            visited[i]=true;
            }

        }
    }
    return visited;
}

    public static void main(String[] args) {
int[][] edges= {
        {0, 1},
        {2, 3},
        {3, 4},
        {3, 5},
};
        System.out.println(connectdVertices(edges));

    }
}
