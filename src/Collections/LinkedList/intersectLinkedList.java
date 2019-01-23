package Collections.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class intersectLinkedList {

    static class node
    {
        int val;
        node next;

        node(int val)
        {
            this.val = val;
        }
    }

    public static void main(String[] args)
    {
		/* The constructed linked list is:1:2:3:2*/
        node l1 = new node(4);
        l1.next = new node(1);
        l1.next.next = new node(8);
        l1.next.next.next = new node(4);

        node l2 = new node(5);
        l2.next = new node(0);
        l2.next.next = new node(1);
        l2.next.next.next = l1.next.next;
        l2.next.next.next.next = l1.next.next.next;


        System.out.println(getIntersectionNode(l1,l2).val);

    }

    private static node getIntersectionNode(node headA, node headB) {

        if(headA==null || headB==null)
            return null;

        Set<node> set = new HashSet<>();

        node a = headA;
        node b = headB;

        while(a!=null) {
            set.add(a);
            a=a.next;
        }

//        System.out.println(set);

        while(b!=null)  {
//            System.out.println(b);

            if(set.contains(b)) {
                return b;
            }
            b = b.next;
        }
        return null;
    }

}
