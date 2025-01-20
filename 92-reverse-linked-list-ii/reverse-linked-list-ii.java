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
        //for cases where the list is to remain untouched
        if(head == null || left == right){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode previous = dummy;

        for(int i = 0; i < left - 1; i++){
            previous = previous.next;
        }

        ListNode start = previous.next;
        ListNode nextNode = start.next;

        for(int i = left; i < right; i++){
            start.next = nextNode.next;
            nextNode.next = previous.next;
            previous.next = nextNode;

            nextNode = start.next;
        }


       return dummy.next;
    }
}