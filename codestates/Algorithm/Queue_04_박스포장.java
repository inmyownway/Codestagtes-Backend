package codestates.Algorithm;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_04_박스포장 {

    public static int paveBox(Integer[] boxes)
    {

        Queue<Integer> queue = new LinkedList<>();
        for(Integer i: boxes)
        {
            queue.offer(i);
        }
        if(queue.size()==1)
        {
            return 1;
        }
      System.out.println(queue);

        int max= 0;

        int count_max=0 ;

        while(!queue.isEmpty())
        {   int count =1;
            max = queue.poll(); //7
            if(queue.isEmpty()) break;

             System.out.println("max ="+ max);
            while(max >= queue.peek())
            {
                count+=1; // count = 4
                queue.poll();
                if(queue.isEmpty()) break;
            }
            if(count>count_max)
                count_max=count;

            System.out.println(count_max);
        }
        return count_max;
    }


    public static void main(String[] args)
    {
        Integer[] box = new Integer[]{1};

        System.out.println(paveBox(box));
    }



}

