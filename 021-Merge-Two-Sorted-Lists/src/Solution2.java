public class Solution2 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            node = new ListNode(l1.val);
            l1 = l1.next;
            node.next = mergeTwoLists(l1, l2);
        } else {
            node = new ListNode(l2.val);
            l2 = l2.next;
            node.next = mergeTwoLists(l1, l2);
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(4);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(4);
        ListNode ret = new Solution().mergeTwoLists(node, node2);
        while (ret != null) {
            System.out.println(ret.val);
            ret = ret.next;
        }
    }
}
