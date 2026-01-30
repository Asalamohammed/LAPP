package Graph;

import Assignment1.singleLinkedList;
import singlyLinkedList.singlyLinkedList;

public class AdjacencyList {
    private singlyLinkedList<Integer>[]adjlist;
    private int vertices;
    private int edges;

    public AdjacencyList(int nodes ) {
        adjlist=new singleLinkedList.singlyLinkedList[nodes];
        vertices=nodes;
        edges=0;
        for (int v=0; v<adjlist.length;v++){
            adjlist[v]=new singlyLinkedList<Integer>();

        }
    }


    public void addedges(int from, int to){
        adjlist[from].addLast(to);
        adjlist[to].addLast(from);  // deleting this line will turn  the  undirect graph into  direct graph
        edges++;
    }


    public void display(){
        System.out.println(vertices +" V " +edges+ "E :");
        for (int v=0; v<vertices; v++){
            System.out.print(v+": ");
            adjlist[v].display();

        }



    }








}