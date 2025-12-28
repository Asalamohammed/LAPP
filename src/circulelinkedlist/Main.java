package circulelinkedlist;

public class Main {
    public static void main(String[] args) {
        circulelinkedlist<String> list=new circulelinkedlist<String>();
        circulelinkedlist<String> list2=new circulelinkedlist<String>();

        list.addfirst("asala");
        list.addfirst("shahd");
        list.addlast("mohammed");
        list.addlast("ali");
        list.addfirst("aseel");
        list.removefiest();
        list.removelast();
        list.display();


    }}
