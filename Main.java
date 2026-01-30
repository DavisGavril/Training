/*import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        prev=null;
        next=null;
    }
}
class doublelinkedlist{
    Node head=null;
    Node temp=null;
    void insertbeg(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        head.prev=nn;
        nn.next=head;
        head=nn;
    }
    void insertend(int data){
        Node nn=new Node(data);
        if(head==null){
            System.out.println("List is empty");
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nn;
        nn.prev=temp;
    }
    void insertatposition(int data,int pos){
        Node nn=new Node(data);
        if(pos==1){
            insertbeg(data);
            return;
        }
        Node newnode=new Node(data);
        temp=head;
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(head==null){
            System.out.println("Invalid position");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        newnode.prev=temp;
    }
    void deletebeg(){
        if(head==null){
            return;
        }
        head=head.next;
        head.prev=null;
    }
    void deleteend(){
        if(head==null){
            return;
        }
        temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }

    void display(){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    void backdisplay(){
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+"<-");
            temp=temp.prev;
        }
        System.out.println("Null");
    }
}
public class Main{
    public static void main(String[] args) {
        doublelinkedlist obj=new doublelinkedlist();
        obj.insertbeg(30);
        obj.insertbeg(20);
        obj.insertbeg(10);
        obj.display();
        obj.insertend(40);
        obj.insertend(50);
        obj.insertend(60);
        obj.display();
        obj.backdisplay();
        obj.insertatposition(70, 4);
        obj.deletebeg();
        obj.deleteend();
        obj.display();


    }

    public boolean sumnatural(int i) {
    }
}*/
