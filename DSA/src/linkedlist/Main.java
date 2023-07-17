package linkedlist;

import linkedlist.SLL;

public class Main {
    public static void main(String[] args) {


//        SLL list = new SLL();
//        list.insertFirst(4);
//        list.insertFirst(6);
//        list.insertFirst(10);
//
//        list.insertLast(24);
//        list.insert(55,3);
//
//    //    list.deleteFirst();
//    //    list.deleteLast();
//
//        list.delete(4);
//        list.display();

        DLL list = new DLL();
        list.insertFirst(11);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(3);
        list.insertLast(24);
        list.insert(100,2);

        list.display();
        System.out.println();
        list.displayReverse();

    }
}