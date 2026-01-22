package Queue;

import Arrays.Arrayss;
public class arryqueue<E> implements queue<E> {
 private  E arr[] =(E[]) new Object[4];

 private static final int CAPICITY=1000;
 private int f=0;
 private int size;

 public arryqueue(int c){
     arr= (E[]) new Object[c];
     f =0;
     size=0;
 }
    @Override
    public boolean isempty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void enqueue(E data) {
    if (size()==arr.length){
        System.out.println("can not add queue is full");
        throw new IllegalStateException("CAN NOT ADD MORE IS FULL");

    }
 else {
      int av=(f+size)%arr.length;
      arr[av]=data;
      size++;

    }}

    @Override
    public E dequeue() {
       if (isempty())return null;
       E delete=arr[f];
       arr[f]=null;
       f=f+1;
       return delete;
    }

    @Override
    public E front() {
        return arr[f];
    }
}
