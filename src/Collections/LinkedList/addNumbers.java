package Collections.LinkedList;



public class addNumbers {
     static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode p = ans;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if(l1 != null) {
                sum = sum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                sum = sum + l2.val;
                l2 = l2.next;
            }
            sum = sum + carry;
            p.next = new ListNode (sum % 10);
            p = p.next;
            carry = sum/10;
        }
    return ans.next;
    }

    public static void main(String[] args) {
		/* The constructed linked list is:
		10->12->11->11->12*/
        ListNode start = new ListNode(1);
        start.next = new ListNode(2);
        start.next.next = new ListNode(3);

        ListNode second = new ListNode(5);
        second.next = new ListNode(6);
        second.next.next = new ListNode(7);

       addTwoNumbers(start,second);
    }
}
