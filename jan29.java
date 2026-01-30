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
        void deleteatbeginning(){
         if(head==null){
             System.out.println("There is no list");
             return;
         }
         head=head.next;
        }
        void deleteatend(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        }
        void deleteatposition(int pos){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(pos==1){
            deleteatbeginning();
            return;
        }
         temp=head;
         for(int i=1;i<pos-1 && temp.next!=null;i++){
             temp=temp.next;
         }
         if(temp==null||temp.next==null) {
             System.out.println("Invalid position");
             return;
         }
         temp.next=temp.next.next;
        }
        int count() {
        if(head==null){
            return 0;
        }
        int c=1;
       node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            c++;
        }
        return c;
    }
    void middlenode(){
        if(head==null){
            System.out.println("list does not exist");
            return;
        }
        int len=count();
        float mid=len/2.0f;
        mid=Math.round(mid);
        System.out.println("THE MIDDLE ELEMENT POSITION is:"+mid);
        temp=head;
        for(int i=1;i<(int)mid;i++){
            temp=temp.next;
        }
        System.out.println("THE MIDDLE VALUE IS:"+temp.data);
    }
    void midforts(){
        if(head==null){
            System.out.println("List is does not exsist");
            return;
        }
        node fast=head;
        node slow=head;
        while (fast.next != null && fast != null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println("FROIST MID VALUE IS:"+slow.data);
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
    }
    class jan29{
    public static void main(String []args){
        singlylinkedlist obj=new singlylinkedlist();
        obj.insertatbeginning(10);
        obj.insertatbeginning(20);
        obj.insertatbeginning(30);
        obj.insertatending(40);
        obj.insertatending(50);
        System.out.println();
        obj.display();
        obj.insertatposition(60,3);
        System.out.println();
        obj.display();
        obj.deleteatbeginning();
        System.out.println();
        obj.display();
        obj.deleteatend();
        System.out.println();
        obj.display();
        obj.deleteatposition(3);
        System.out.println();
        obj.display();
        System.out.println();
        System.out.println("TOTAL NUMBER OF NODES PRESENT : "+obj.count());
        obj.middlenode();
        obj.midforts();
        obj.reverse();
        System.out.println();
        obj.display();


    }
    }*/

