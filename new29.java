/*class node{
int data;
node next;
node(int data){
    this.data=data;
    this.next=null;
}
}
class singlylinkedlist{
    node head=null;
    node temp=null;
    void insertatbeginning(int data){
        node newnode=new node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void insertatending(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void insertatposition(int data,int pos){
        if(pos==1){
            insertatbeginning(data);
            return;
        }
        node newnode=new node(data);
        temp=head;
        for(int i=1;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Invalid position");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }
}
void reverse(){
    node prev=null;
    node cur=head;
    node next=null;
    while(cur!=null){
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
    }
    head=prev;

}
void display(){
    node temp= head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("null");
}

void main() {
}*/
