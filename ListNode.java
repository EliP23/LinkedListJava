public class ListNode {
    int value;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.value = val;
    }
    ListNode(int val, ListNode passedNode){
        this.value = val;
        this.next = passedNode;
    }

    public void add(int value){
        ListNode current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(value);
    }
    public void printList(ListNode passedNode){
        ListNode current = this;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
    public void remove(int val){
        ListNode current = this;
        while (current.next != null) {
            if (current.next.value == val) {
                ListNode dummyNode = current.next;
                dummyNode = dummyNode.next;
                current.next = dummyNode;
                break;
            }
            current = current.next;
        }
    }
}