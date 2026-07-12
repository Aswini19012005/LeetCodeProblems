/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *////done
class Solution {
    public static ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode fwd=null,prev=null;
        while(temp!=null){
            fwd=temp.next;
            temp.next=prev;
            prev=temp;
            temp=fwd;
        }
        return prev;
    }
    public static boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;

        ListNode slow=head,fast=head;
        while(fast.next!=null &&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head2=reverse(head2);

        ListNode i=head,j=head2;
        while(j!=null){
            if(i.val!=j.val) return false;

            i=i.next;
            j=j.next;
        }
        return true;
    }
}