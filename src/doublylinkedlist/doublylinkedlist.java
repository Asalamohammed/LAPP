package doublylinkedlist;

import circulelinkedlist.circulelinkedlist;

public class doublylinkedlist<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public doublylinkedlist() {

        head = new Node(null, null, null);
        tail = new Node(head, null, null);
        head.setNext(tail);
    }
    public boolean isempty() {
            return size() == 0;
        }

    public int size() {

            return size;


    }
    public E getfirst(){
        if (isempty())return null;
        return head.getNext().getData();
    }
    public E getlist(){
        if (isempty())return null;
        return tail.getPrev().getData();
    }
    private void addbetween(Node<E>Left,E data,Node<E>Right){
        Node<E> newNode=new Node(Left,data,Right);
        Left.setNext(newNode);
        Right.setPrev(newNode);
        size++;

    }
    public void addfirst(E data){

        addbetween(head,data,head.getNext());
    }
    public void addlast(E data){

        addbetween(tail.getPrev(),data,tail);
    }
    private E remove(Node<E>deleteNode){
        if (isempty())return null;
        E delete=deleteNode.getData();
        Node<E> Left=deleteNode.getPrev();
        Node<E> Right=deleteNode.getNext();
        Left.setNext(Right);
        Right.setPrev(Left);
        size--;
        return delete;
    }
public E removefirst(){
        return remove(head.getNext());
}
    public E removelast(){
        return remove(tail.getPrev());
    }
    public void display(){
        Node<E> temp=head.getNext();
        System.out.println("null<--head<-->");
        while (temp!=tail);
        System.out.println(temp.getData()+"<---->");
        temp=temp.getNext();
    }
















class Node<E>{

        private  Node<E> prev;
        private  E data;
        private  Node<E> next;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
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
