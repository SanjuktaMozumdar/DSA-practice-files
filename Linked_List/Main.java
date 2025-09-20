package Linked_List;

public class Main {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.appendLL(40);
        sll.appendLL(23);
        sll.appendLL(72);
        sll.appendLL(8);
        sll.printList();
        sll.setValue(0,3);
        sll.insert(1,9);
        sll.reverse();
        sll.printList();
        //System.out.println("Length = " + sll.length());
        //System.out.println(sll.getValue(2).value);
        
    }
    
}
