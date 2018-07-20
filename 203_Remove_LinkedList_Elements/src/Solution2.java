class Solution2 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNoe = prev.next;
                prev.next = delNoe.next;
                delNoe.next = null;
            } else {
                prev = prev.next;
            }
        }

        return dummyHead.next;
    }
}