/*
    给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
    你可以假设除了数字 0 之外，这两个数字都不会以零开头。

    示例：

    输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    输出：7 -> 0 -> 8
    原因：342 + 465 = 807

    考虑点：两个链表不一样长，最后存在单独的进位
 */

public class AddTwoNumbers_2 {

    public static void Main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode r1 = addTwoNumbers(l1,l2);
        while(r1!=null) {
            System.out.print(r1.val + " ");
            r1 = r1.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode cur = new ListNode(-1);
        ListNode re = cur;
        int carry = 0;

        while(l1!=null || l2!=null)
        {
            int val1 = l1 == null?0:l1.val;
            int val2 = l2 == null?0:l2.val;


            cur.next = new ListNode((val1+val2+carry)%10);
            carry = (val1+val2+carry)/10;
            cur = cur.next;

            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;

        }
        if(carry==1)
            cur.next = new ListNode(1);


        return re.next;
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
