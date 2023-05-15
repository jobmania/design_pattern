package chapter02.ch05;

import chapter02.ch03.MyLinkedList;
import chapter02.ch03.MyListNode;

interface IQueue{
    public void enQueue(String data);
    public String deQueue();
    public void printAll();
}



public class MyListQueue extends MyLinkedList implements IQueue {

    MyListNode front;
    MyListNode rear;

    public MyListQueue() {
        this.front = null;
        this.rear = null;
    }



    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if(isEmpty()){
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }else {
            newNode = addElement(data);
            rear = newNode;
        }

        System.out.println(newNode.getData() +" add completed");

    }

    @Override
    public String deQueue() {
        if(isEmpty()){
            System.out.println(" list empty");
            return null;
        }

        String data = front.getData();
        front = front.next;
        if(front == null){
            rear = null;
        }
        return data;
    }

    @Override
    public void printAll() {
        if(isEmpty()){
            System.out.println(" list empty");
            return;
        }
        MyListNode temp = front;
        while (temp!=null){
            System.out.print(temp.getData() + ",");
            temp = temp.next;
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        return front == null && rear == null;
    }
}
