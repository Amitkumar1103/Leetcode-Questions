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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        

        while(present != null){

            ListNode next = present.next;//next =2

            present.next = prev;//1->null 1 point changed to null
            prev = present;//prev ->1
            present = next;//present ->2
            // if(next != null){
            //     next=next.next;
            // }
        }
        return prev;
    }
}