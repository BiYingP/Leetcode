Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list

Example 1

Input: Head = [1,2,3,4,5]
Output: [5,4,3,2,1]

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }


    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        // ListNode cur = head;
        
        while(head != null){
            ListNode next_node = head.next;
            head.next = pre;
            pre = head;
            head = next_node;
        }
        
        // ListNode res = new ListNode();
        return pre;
        
    }
