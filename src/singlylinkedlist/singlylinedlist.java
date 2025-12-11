package singlylinkedlist;

import org.w3c.dom.Node;

public class singlylinedlist<E> {
    private Node<E> head = null;
    private Node<E> tail =null;
    private int size =0;
    public int size(){
        return size;
    }

    public boolean isempty() {
        return size()==0;
    }
    public void addfrist(E data){
        Node<E> nNode = new Node(data,head);
        head=nNode;
        if (isempty())
            tail=head;
        size++;
    }
    public E getfirst(){
        if (isempty()) return null;
        return head.getData();


    }
    public E removefirst(){
        if (isempty())return null;
        E delete= head.getData();
        head=head.getNext();
        size--;
        if (isempty())
            tail=head;
        return delete;
    }


    public void addlast(E data){
        Node<E> newnode=new Node(data,null);
        if (isempty())
            head=newnode;
        else
            tail.setNext(newnode);
        tail=newnode;
        size++;
    }
    public E getlast() {
        if (isempty()) return null;
        return tail.getData();
    }


        public void display () {
            Node<E> temp = head;
            while (temp != null)
                System.out.println(temp.getData() + "----->");
            temp = temp.getNext();
            System.out.println("null");
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
