package doublylinkedlist;

public class main {
    public static void main(String[] args) {
        doublylinkedlist<Integer>dlist=new doublylinkedlist<Integer>();
        dlist.addfirst(3);
        dlist.addfirst(6);
        dlist.addlast(3);
        dlist.addlast(4);
        dlist.removefirst();
        dlist.removelast();
        dlist.display();
    }
}
