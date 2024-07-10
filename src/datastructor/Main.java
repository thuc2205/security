package datastructor;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(5);
        myLinkedList.removeFirt();

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

//        System.out.println(myLinkedList.remove().value);
//        System.out.println(myLinkedList.remove().value);
//        System.out.println(myLinkedList.remove());
        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }
}


class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
    public void append(int value){
        Node node = new Node(value);
        if(length==0){
            head = node;
            tail = node;
        }else {
            tail.next = node;
            tail = node ;
        }
        length++;


    }
 public Node remove(){
     if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next !=null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length ==0){
            tail = null;
            head = null;
        }
        return temp;

    }

    public Node removeFirt(){
        if(length == 0) return  null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0) {
            tail =null;
        }
        return temp;
    }
}


