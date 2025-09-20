package Linked_List;

// <T> -> genrics. Can define T = data type while defination 
public class Node<T> {
    T value;
    Node next;

    Node(T value){
        this.value = value;
    }
}
