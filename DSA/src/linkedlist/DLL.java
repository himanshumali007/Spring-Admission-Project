package linkedlist;

public class DLL{

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
    }
    private class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int data){

//        Node node = new Node(data);
//        node.next=head;
//        node.prev=null;
//        if (head!= null) {
//            head.prev = node;
//        }
//        if (tail==null){
//            tail=head;
//        }
//        head=node;
//        size++;

        Node node = new Node(data);
        if (head==null){
            head=node;
            tail=node;
            size++;
            return;
        }

        node.next=head;
        head.prev=node;
        head=node;
        size++;

    }

    public void insertLast(int data){

        if (tail==null){
            insertFirst(data);
            return;
        }

        Node node = new Node(data);
        tail.next = node;
        node.prev=tail;
        tail=node;
        size++;
    }

    public void insert(int data,int index){

        if (index==0){
            insertFirst(data);
            return;
        }
        if (index==size){
            insertLast(data);
            return;
        }

        Node node = head;
        for (int i = 0; i<index-1;i++){
            node=node.next;
        }

        Node newNode = new Node(data);
        newNode.next = node.next;
        newNode.prev = node;
        node.next.prev=newNode;
        node.next=newNode;

        size++;


    }

    public void display(){
        Node node = head;

        while (node!=null) {
            System.out.print(node.data + " <-> ");
            node = node.next;
        }
        //System.out.println(" ||| "+tail.data);
        //System.out.println(head.next.data);
        //System.out.println(head.data);
    }

    public void displayReverse(){
        Node node = tail;
        while (node!=null){
            System.out.print(node.data + " <-> ");
            node=node.prev;
        }
    }

}
