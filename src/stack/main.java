package stack;

public class main {
    public static void main(String[] args){
        SlinkedStack<Integer> slist=new SlinkedStack<Integer>();
        slist.push(10);
        slist.push(20);
        slist.push(30);
        slist.push(40);
        slist.push(50);
        slist.push(60);
        System.out.println("top"+slist.top());
      while (!slist.isempty()) {
          System.out.println("remove"+slist.pop());
      }

arrystack<Integer> alist=new arrystack<Integer>(5);
      alist.push(10);
        alist.push(30);
        alist.push(50);
        alist.push(70);
        alist.push(90);
        System.out.println("top"+slist.top());
        while (!slist.isempty()) {
            System.out.println("remove"+slist.pop());
        }



    }}
