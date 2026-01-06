package stack;

public class arrystack<E> implements stack<E> {
private E arry[];
//int arr[]={3,4,5};
//    E arry[]=new [4];
    private static final int CAPCITY=1000;
    private int t=-1;

    public arrystack() {
this(CAPCITY);    }
    public arrystack(int c){
        arry=(E[])new Object[c];
    }


    @Override
    public boolean isempty() {
        //return t==-1;
        return size()==0;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E data) {
    if (size()==arry.length)
        System.out.println("stack is full");
    else {
        arry[++t]=data;
    }
    }

    @Override
    public E pop() {
      if ((isempty())) return null;
        E delete=arry[t];
        arry[t]=null;
        t--;
        return delete;
    }

    @Override
    public E top() {
         if (isempty())return null;
         return arry[t];
    }
}
