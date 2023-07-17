package linkedlist;

public class SLL {

    private Node head;
    private Node tail;
    private int size;

    public SLL(){
        this.size=0;
    }
    private class Node {

        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

    }
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

        //if list is empty, tail and head will point towards same guy
        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void insertLast(int data){

        if (tail==null){
            insertFirst(data);
            return;
        }

        Node node = new Node(data);
        tail.next = node;
        tail = node;

        size++;

    }

    public void insert(int data, int index){

        if (index==0){
            insertFirst(data);
            return;
        }

        if (index==size){
            insertLast(data);
            return;
        }

        Node temp = head;
        for(int i=0; i<index-1;i++){
            temp=temp.next;
        }

        Node newNode = new Node(data,temp.next);
        temp.next=newNode;

        size++;

    }

    public int deleteFirst(){

        int data = head.data;

        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return data;
    }

    public int deleteLast(){

        if (size<=1){
            deleteFirst();
        }
        int data = tail.data;

        //Node temp = head;
        Node temp = get(size-2);
//        for (int i=0; i<size-2;i++){
//            temp=temp.next;
//        }

        temp.next=null;
        tail=temp;
        size--;
        return data;
    }

    public int delete(int index){


        if (index==index-1){
            deleteLast();
        }
        if (index==0){
            deleteFirst();
        }

        Node delNode = get(index);
        Node prev = get(index-1);
        int data = delNode.data;

        prev.next = delNode.next;

        size--;
        return data;
    }
    public Node get(int index){
        Node node = head;

        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }

    }

    public Node find(int data){
        Node temp = head;
        while (temp!=null){
            if(temp.data==data){
                return temp;
            }
            temp=temp.next;

        }
        return null;
    }


}
