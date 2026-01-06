package stack;
import singlylinkedlist.singlylinedlist;
public class SlinkedStack<E> implements stack<E>{

    singlylinedlist<E> list=new singlylinedlist<E>();

    @Override
    public boolean isempty() {
        return list.isempty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(E data) {
      list.addfrist(data);
    }

    @Override
    public E pop() {
        return list.removefirst();
    }

    @Override
    public E top() {
        return list.getfirst();

    }

    public void display () {
        list.display2();
    }
}
