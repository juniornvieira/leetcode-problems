import java.util.Arrays;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode listNode =
            new ListNode(1,
                new ListNode(2,
                    new ListNode(6,
                        new ListNode(3,
                            new ListNode(4,
                                new ListNode(5,
                                    new ListNode(6
                                    )
                                )
                            )
                        )
                    )
                )
            );
        removeElements(listNode, 6);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                // Here cannot move cur to cur.next as we need to validate the next node.
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
  }
}