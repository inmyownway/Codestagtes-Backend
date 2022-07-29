package codestates.Algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_11_인접행렬찾기 {
    public static boolean getDirections(int[][] matrix, int from, int to) {

        Queue<Integer> queue = new LinkedList<>();

        boolean[] isVisited = new boolean[matrix.length];

        queue.add(from);
        isVisited[from]=true;

        while(true)
        {  System.out.println(queue);
            if(queue.isEmpty())
                return false;

            int now = queue.poll();

            if(matrix[now][to]==1)
                return true;

            for (int i = 0; i < matrix[now].length; i++)
            {
                if(matrix[now][i] == 1 && isVisited[i] == false )
                {
                    queue.add(i);
                    isVisited[now]=true;
                }
            }


        }


    }
    public static void main(String[] args) {
// 0->3   queue 1
//
        int[][] matrix = {{0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {0, 1, 0, 0}};


        System.out.println(getDirections(matrix,0,3));
    }

}
