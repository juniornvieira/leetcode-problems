public class RemoveDuplicatesFromSortedList {


    public static void main(String[] args) {
        ListNodes listNode =
                new ListNodes(1,
                        new ListNodes(1,
                                new ListNodes(2,
                                        new ListNodes(3,
                                                new ListNodes(3)
                                        )
                                )
                        )
                );

//        ListNodes listNode =
//                new ListNodes(0,
//                        new ListNodes(0,
//                                new ListNodes(0,
//                                        new ListNodes(3
//                                        )
//                                )
//                        )
//                );

        System.out.println(deleteDuplicates(listNode));
    }

    public static ListNodes deleteDuplicates(ListNodes head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNodes curNode=head , nextNode=head.next;
        while(nextNode!=null){
            if(curNode.val==nextNode.val){
                curNode.next=nextNode.next; //IMPORTANT: head value is just updated when cur and next is changed
            }else{
                curNode=curNode.next;
            }
            nextNode=nextNode.next;
        }

        return head;
    }
}


/**
 * Definition for singly-linked list.
 */
 class ListNodes {
    int val;
    ListNodes next;

    ListNodes() {
    }

    ListNodes(int val) {
        this.val = val;
    }

    ListNodes(int val, ListNodes next) {
        this.val = val;
        this.next = next;
    }
}



