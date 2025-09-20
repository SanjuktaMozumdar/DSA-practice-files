package Linked_List;

public class SLL {
    private Node head;
    private Node tail;
    private int length;

    // Default Constuctor
    public SLL() {

    }

    // Constructors
    public SLL(Integer value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public SLL(String value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    /* Functions */

    // Print LL
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Insert at first
    public void prependLL(Integer value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // Insert at last
    public void appendLL(Integer value) {
        Node newNode = new Node(value);
        // checking if LL is empty
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Insert at a particular node
    public boolean insert(int index, int value) {
        if (index < 0 || index > length)
            return false;
        if (index == 0) {
            prependLL(value);
            return true;
        }
        if (index == length) {
            appendLL(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = getValue(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }

    // Print length
    public int length() {
        return length;
    }

    // Remove from last
    public Node removeLast() {
        Node temp = head;
        Node pre = head;

        if (length == 0)
            return null;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;

    }

    // Remove First
    public Node removeFirst() {

        if (length == 0)
            return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0)
            tail = null;

        return temp;
    }

    // Remove at particular index
    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if (index == length-1) return removeLast();
        Node prev = getValue(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next= null;
        length--;
        return temp;
    }


    // get value by index
    public Node getValue(int index) {

        if (index < 0 || index >= length)
            return null;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // set value at a particular index
    public boolean setValue(int index, int value) {

        Node temp = getValue(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    // Reverse
    public void reverse(){
        Node before = null;
        Node temp = head;
        Node after = temp.next;

        head = tail;
        tail = temp;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next =before;
            before = temp;
            temp = after;
        }
    }
}
