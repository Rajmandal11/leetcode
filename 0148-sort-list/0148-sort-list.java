import java.util.*;

class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;

        // 1. Copy all values into an ArrayList
        List<Integer> values = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        // 2. Sort the list using Java's built-in sort
        Collections.sort(values);

        // 3. Put the sorted values back into the linked list
        curr = head;
        for (int val : values) {
            curr.val = val;
            curr = curr.next;
        }

        return head;
    }
}
