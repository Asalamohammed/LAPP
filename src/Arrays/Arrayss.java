package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Arrayss {


    public void reverse_traversal(int[] a) {
        System.out.println("the elements are:");
        for (int i = a.length - 1; i >= 0; i--)
            System.out.println("index[" + i + "]=" + a[i]);
    }

    public void traversal2(int[] a) {
        for (int e : a)
            System.out.println(e);
    }

    public void input(int[] a) {
        System.out.println("please enter " + a.length + "element");

        for (int i = 0; i < a.length; i++) ;


    }


    public void update(int[] a, int index, int nvalue) {
        if (index < 0 || index >= a.length)
            System.out.println(" index not found ");
        else
            a[index] = nvalue;
    }


    public void delete(int[] a, int index) {
        if (index < 0 || index >= a.length)
            System.out.println(" index not found ");
        else
            a[index] = 0;
    }

    public int linearsreach(int[] a, int svalue) {
        for (int i=0;i<a.length;i++){
            if (svalue == a[i])
                return i;
        }
        return -1;
    }


        public int bainarySearch ( int[] a, int findex, int lindex, int svalue){
            while (findex <= lindex) {
                int mid = (findex + lindex) / 2;
                System.out.println("mid" + mid);
                if (svalue == a[mid])
                    return mid;
                if (svalue >= a[mid])
                    findex = mid + 1;
                if (svalue <= a[mid])
                    findex = mid - 1;


            }
            return -1;
        }}


