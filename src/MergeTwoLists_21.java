public class MergeTwoLists_21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        while(l1!=null && l2!=null)
        {
            if(l1.val<=l2.val)
            {
                cur.next = l1;
                l1 = l1.next;

            }
            else
            {
                cur.next = l2;
                l2 = l2.next;
            }

            cur = cur.next;
        }
        while(l1!=null)
        {
            cur.next=l1;
            l1 = l1.next;
            cur = cur.next;
        }

        while(l2!=null)
        {
            cur.next=l2;
            l2 = l2.next;
            cur = cur.next;
        }

        return res.next;

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x)
        {
            val = x;
        }
    }
}
