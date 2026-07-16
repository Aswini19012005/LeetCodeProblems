/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(head==null ||right==left) return head;

       ListNode dummy=new ListNode(-1);
       dummy.next=head;

       ListNode prev=dummy;

       for(int i=1;i<left;i++){
        prev=prev.next;
       }
       ListNode temp=prev.next;

       for(int i=0;i<right-left;i++){
        ListNode fwd=temp.next;
        temp.next=fwd.next;
        fwd.next=prev.next;
        prev.next=fwd;
       }
       return dummy.next;
    }
}