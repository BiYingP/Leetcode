# Linked List Cycle

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

![image](image/image9.png)


To solve this problem, use ** Floyd Cycle Algorithm ** which states that

- Traverse linked list using two pointers

- Move one pointer(slow pointer) by one and another pointer(fast pointer) by two.

- If these pointers meet at the same node then there is a loop. If not, then linked list does not have a loop.



    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast){
                return true;
            }  
        }
        return false;
    }
