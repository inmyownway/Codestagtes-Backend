package codestates.Algorithm;

import java.util.*;

public class Queue_Advanced_05_프린터 {
    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {

     int count =1;
     int size = documents.length;
     int i= 0;

     Queue<Integer> queue = new LinkedList<>();
        for(int z=0;z<bufferSize;z++)
        {
            queue.offer(0);
        }

        while(i<size)
        { System.out.println("count: "+count);
          queue.poll();

          int sum= queue.stream().reduce(0,Integer::sum)+documents[i];
          if(sum<=capacities)
          {
              queue.offer(documents[i]);
              i++;
          }

          else
          {
              queue.offer(0);
          }
          count++;
            System.out.println(queue);
        }
        return count+bufferSize-1;

    }
    public static void main(String[] args)
    {
        int[] documents = new int[]{7, 4, 5, 6};

        System.out.println(queuePrinter(2,10,documents));
    }
}
