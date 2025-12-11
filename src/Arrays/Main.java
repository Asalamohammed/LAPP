package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        Arrayss arr =new Arrayss();

            //int []numbers=new int[5];
        int []numbers={1,2,3,4,5};
        //numbers[3]=7;
      //  arr.reverse_traversal(numbers);
        //numbers[0]=8;
        // System.out.println(Arrays.toString(numbers));
        //System.out.println("please enter the"+numbers.length+" element");
       // numbers[0]= a.nextInt();
        //numbers[0]=1;
//arr.traversal2(numbers);
       // for(int i=0;i<numbers.length;i++)
           // numbers[i]=a.nextInt();
       // arr.update(numbers,7, 2) ;
       // arr.delete(numbers,2) ;
    // int result=arr.linearSreach(numbers,5);
     int result =arr.bainarySearch(numbers,0,numbers.length-1,9);
        if(result!=-1)
            System.out.println( "value at"+result);
        else
            System.out.println("value not found");

       // arr.traversal2(numbers);
        //numbers[0]=a.nextInt();
        int [] number= new int[5];
        //System.out.println(arr.toString(numbers));
       // int [] numbe ={1,2,3,4,5};
       // for (int i=0;i<numbe.length;i++);





    }
}