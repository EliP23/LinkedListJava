import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.add(5);
        head.add(9);
        head.add(23);
        head.add(45);
        head.printList(head);
        System.out.println();
        head.remove(45);
        head.printList(head);
    }
}