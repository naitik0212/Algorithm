package stack;

import java.util.*;

class SortStack
{
    private static Stack<Integer> sortstack(Stack<Integer>
                                                    input)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            int tmp = input.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while(!tmpStack.isEmpty() && tmpStack.peek() < tmp)
            {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        s.add(34);
        s.add(3);
        s.add(31);
        s.add(2);
        s.add(-2);

        Stack<Integer> temp=sortstack(s);
        System.out.println("Sorted numbers are:");

        while (!temp.empty())
        {
            System.out.println(temp.pop()+" ");
        }
    }
}

//refereemce geeksforgeeks