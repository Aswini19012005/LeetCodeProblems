class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        Node curr = head;

        while (curr != null) {

            if (curr.child != null) {

                Node nextNode = curr.next;

                Node childHead = flatten(curr.child);

                curr.child = null;

                curr.next = childHead;
                childHead.prev = curr;

                Node tail = childHead;

                while (tail.next != null) {
                    tail = tail.next;
                }

                tail.next = nextNode;

                if (nextNode != null) {
                    nextNode.prev = tail;
                }
            }

            curr = curr.next;
        }

        return head;
    }
}