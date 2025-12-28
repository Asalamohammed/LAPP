package circulelinkedlist;

import org.w3c.dom.Node;
import singlylinkedlist.singlylinedlist;

public class circulelinkedlist<E> {
    private Node<E> tail = null;
    private int size = 0;

    public boolean isempty() {
        return size() == 0;
    }

    public int size() {

        return size;
    }

    public circulelinkedlist() {
        tail = null;
        size = 0;
    }

    public void addfirst(E data) {
        if (isempty()) {
            Node<E> newnode = new Node(data, null);
            tail = newnode;
            newnode.setNext(tail);
        } else {
            Node<E> newNode = new Node(data, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    public void addlast(E data) {

        addfirst(data);
        tail = tail.getNext();
    }

    public E getfirst() {
        return tail.getNext().getData();
    }

public E getlast(){
        return  tail.getData();}


    public E removefiest() {
        if (isempty()) return null;
        E delete = tail.getNext().getData();
        if (tail == tail.getNext()) {
            tail = null;
        } else {
            tail.setNext(tail.getNext().getNext());
        }
        size--;
        return delete;
    }

    public E removelast() {
        if (isempty()) return null;
        E delete = tail.getData();
        if (tail == tail.getNext()) {
            tail = null;
        } else {
            Node<E> temp = tail.getNext();
            while (temp.getNext() != tail) {
                temp = temp.getNext();

            }
            temp.setNext(tail.getNext());
            tail = temp;
        }
        size--;
        return delete;
    }
    public void display(){
        System.out.println("the element or the list are :");
        Node<E>temp=tail.getNext();
        do {
            System.out.println(temp.getData()+"--->");
            temp=temp.getNext();

        }
        while (temp!=tail.getNext());
        System.out.println("go first ("+temp.getData()+")");
    }

        class Node<E> {
            private E data;
            public Node<E> next;

            public Node(E data, Node<E> next) {
                this.data = data;
                this.next = next;

            }

            public E getData() {
                return data;
            }

            public void setData(E data) {
                this.data = data;
            }

            public Node<E> getNext() {
                return next;
            }

            public void setNext(Node<E> next) {
                this.next = next;
            }
        }

    }