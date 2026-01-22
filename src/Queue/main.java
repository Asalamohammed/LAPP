package Queue;

public class main {

    public static void main(String[] args) {


        linkedqueue <Integer> lqueue=new linkedqueue <Integer>();
        lqueue.enqueue(1);
        lqueue.enqueue(2);
        lqueue.enqueue(3);
        lqueue.enqueue(4);
        System.out.println("the frisy elemnt"+lqueue.front());
        while (!lqueue.isempty()){
            System.out.println("elemnt removed"+lqueue.dequeue());
        }

    }

    }
