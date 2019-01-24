package Collections.LinkedList;

public class palindrome_LinkedList {

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
		/* The constructed linked list is:1:2:3:2:1*/
        node start = new node(1);
        start.next = new node(2);
        start.next.next = new node(3);
        start.next.next.next = new node(2);
        start.next.next.next.next = new node(1);

        System.out.println(isPalindrome(start));

    }

    private static boolean isPalindrome(node head) {
        if(head == null || head.next == null){
            return true;
        }

        node slow = head;
        node fast = head;
        node secondList = null;

        while(true) {
            fast = fast.next.next;
            if(fast == null){
                secondList = slow.next;
                slow = null;
                break;
            }
            if(fast.next == null) {
                secondList = slow.next.next;
                slow = null;
                break;
            }
            slow = slow.next;
        }

        node head_1 = head;
        node head_2 = reverse(secondList);

        while(head_1!=null && head_2!=null) {
            if(head_1.val != head_2.val){
                return false;
            }else{
                head_1 = head_1.next;
                head_2 = head_2.next;
            }
        }

        return true;
    }

    private static node reverse( node head) {
        node newHead = null;
        while(head != null) {
            node newNode = head.next;
            head.next = newHead;
            newHead = head;
            head = newNode;
        }
        return newHead;
    }
}
