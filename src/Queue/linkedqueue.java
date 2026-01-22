package Queue;
import singlylinkedlist.singlylinedlist;
public class linkedqueue <E> implements queue<E>{
    singlylinedlist<E> slist=new  singlylinedlist<E>();
    @Override
    public boolean isempty() {
        return slist.isempty() ;
    }

    @Override
    public int size() {
        return slist.size();
    }

    @Override
    public void enqueue(E data) {
slist.addlast(data);
    }

    @Override
    public E dequeue() {
        return slist.removefirst();
    }

    @Override
    public E front() {
        return slist.getfirst();
    }
}
