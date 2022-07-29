package codestates.Algorithm;

import java.util.ArrayList;
import java.util.Stack;
//   {"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
// prev ->
// current -> B
// next -> C

public class Stack_03_브라우저뒤로가기앞으로가기 {
    public static class Solution {
        public ArrayList<Stack> browserStack(String[] actions, String start) {
            Stack<String> prevStack = new Stack<>();
            Stack<String> nextStack = new Stack<>();
            Stack<String> current = new Stack<>();
            ArrayList<Stack> result = new ArrayList<>();

            current.add(start);

            for (String action : actions)
            {
                if (action == "1" && !(nextStack.isEmpty())) {
                    prevStack.push(current.pop());
                    current.push(nextStack.pop());


                    // pre -> A B
                    // Currnet -> D
                    // Next ->
                } else if (action == "-1" && !(prevStack.isEmpty())) {

                    nextStack.add(current.pop());
                    current.push(prevStack.pop());

                }
                else if (action == "1" || action == "-1")
                {

                }
                else
                {
                    
                    prevStack.add(current.pop());
                    current.add(action);
                    nextStack.clear();
                }
            }
            result.add(prevStack);
            result.add(current);
            result.add(nextStack);
            return result;
        }


    }
}

