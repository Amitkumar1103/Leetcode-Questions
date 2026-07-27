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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left,right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val<list2.val){
                tail.next = list1;
                list1=list1.next;
            }else{
                tail.next = list2;
                list2=list2.next;
            }
            tail =tail.next;
        }

        if(list1 != null) {
            tail.next = list1;
        }else{
            tail.next = list2;
        }
        return dummy.next;
    }

    public ListNode middleNode(ListNode head) {
        ListNode prev = null;
        ListNode s=head;
        ListNode f= head;

        while(f!=null&&f.next!= null){
            prev = s;
            s=s.next;
            f=f.next.next;
        }
        prev.next = null;
        return s;
    }
}