package stack;

import java.util.*;


public class QueueUsingStacks {
    private static class myQueue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2= new Stack<>();

        static void enQ(int x) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(x);

            while (!s2.isEmpty())
            {
                s1.push(s2.pop());
            }

        }

        static int deQ()
        {
            if (s1.isEmpty())
            {
                System.out.println("Q is Empty");
                System.exit(0);
            }

            int x = s1.peek();
            s1.pop();
            return x;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        myQueue q = new myQueue();
        q.enQ(1);
        q.enQ(2);
        q.enQ(3);

        System.out.println(q.deQ());
        System.out.println(q.deQ());
        System.out.println(q.deQ());
    }
}
