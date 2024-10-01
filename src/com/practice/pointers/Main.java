package com.practice.pointers;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person("Victor", 22);
//        Person p2 = new Person("Laura", 24);
//        Person p3 = new Person("Paula", 28);
//        Person p4 = new Person("Ana", 32);
//
//        p1.setName("Victor", "Juan");


        // Testing pointers
        /*
        * p3 = p1;
        * p4 = p3;
        * p1 = p2;
        */

//        System.out.println("\n" + p1);
//        System.out.println("\n" + p2);
//        System.out.println("\n" + p3);
//        System.out.println("\n" + p4);
//
//        System.out.println("\n" + p3.getName() + "\n");
//        System.out.println(
//                """
//                ------------------------------
//
//                Practice Pointers Exercise:
//                """
//        );

        // Practice Pointers Exercise;

        /*
        Person charo = new Person("Charo", 40);
        Person raul = new Person("Raul", 45);
        Person pepe = new Person("Pepe", 45);

        charo.setToldTo(raul);
        raul.setToldTo(pepe);

        System.out.println(charo.getToldTo());
        System.out.println(raul.getToldTo());
        System.out.println(pepe.getToldTo() + "\n");

        System.out.println(charo + "\n");
        System.out.println(raul + "\n");
        System.out.println(pepe + "\n");
        */

        /*Nodes*/
//        Node p = new Node(10);
//        Node q = new Node(20);
//        Node r = new Node(30);
//
//        p.setNext(q);
//        q.setNext(r);
//        r.setNext(new Node(40));
//
//        System.out.println(p);
//        System.out.println(q);
//        System.out.println(r);
//        System.out.println(r.getNext());

        /*Linked Lists*/

//        LinkedList l = new LinkedList();
//        l.add(10);
//        l.add(20);
//        l.add(30);
//        l.add(40);
//        l.add(50);
//        l.add(60);
//        l.add(120);
//
//        System.out.println("Hello");
//        l.print();
//
//        System.out.println("Sum: " + l.sum());
//        System.out.println("Get(0): " + l.getIndex(0));
//        System.out.println("Get(2): " + l.getIndex(2));
//        System.out.println("Get(3): " + l.getIndex(3));
//        System.out.println("Get(4): " + l.getIndex(4));
//        System.out.println("GetSize2: " + l.getSize2());
//        System.out.println("GetIndex: " + l.getIndexByValue(50));
//        System.out.println("GetMax: " + l.getMax());
//        System.out.println("GetFrequency: " + l.getFrequency(10));
//
//
//        l.swap(1,6);
//        l.print();

        /* Double LinkedLists */
        DoubleNode p = new DoubleNode(10);
        DoubleNode q = new DoubleNode(20);
        DoubleNode r = new DoubleNode(30);

        p.setNext(q);
        q.setNext(r);

        q.setPrev(p);
        r.setPrev(q);
        r.setNext(new DoubleNode(40));

        r.getNext().setPrev(r);

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(r.getNext());

        DoubleLinkedList dl = new DoubleLinkedList();

        dl.add(15, 25, 35, 45, 55, 65);

        dl.print();

    }
}