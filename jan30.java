class cnode {
    int data;
    cnode next;
}
class jan30 {
    public static void main(String[] args) {
        circularsingle obj=new circularsingle();
        obj.insertatbeg(10);
        obj.insertatbeg(20);
        obj.insertatbeg(30);
        obj.display();
        obj.insertatend(5);
        obj.insertatend(4);
        obj.display();
        obj.insertatposition(40, 3);
        obj.display();
        obj.deleteatbeg();
        obj.display();
        obj.deleteatend();
        obj.display();
        obj.deleteatposition(3);
        obj.display();
    }
}
class circularsingle {
    cnode head;
    cnode temp;
    void insertatbeg(int data) {
        cnode newnode=new cnode();
        newnode.data=data;
        if (head==null) {
            head=newnode;
            newnode.next=head;
            return;
        }
      temp=head;
        while (temp.next!=head) {
            temp=temp.next;
        }
        newnode.next=head;
        temp.next=newnode;
        head=newnode;
    }
    void insertatend(int data) {
        cnode nn=new cnode();
        nn.data=data;
        if (head==null) {
            head=nn;
            nn.next=head;
            return;
        }
         temp=head;
        while (temp.next!=head) {
            temp=temp.next;
        }
        temp.next=nn;
        nn.next=head;
    }
    void insertatposition(int data,int pos) {
        cnode newnode=new cnode();
        newnode.data=data;
        if (pos==1) {
            insertatbeg(data);
            return;
        }
         temp = head;
        for (int i=1;i<pos-1;i++) {
            temp=temp.next;
            if (temp==head) {
                System.out.println("Position out of range");
                return;
            }
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    void deleteatbeg() {
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next==head) {
            head=null;
            return;
        }
         temp=head;
        while (temp.next!=head) {
            temp=temp.next;
        }

        temp.next=head.next;
        head=head.next;
    }
    void deleteatend(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next==head) {
            head=null;
            return;
        }
            temp=head;
            while(temp.next.next!=head){
                temp=temp.next;
            }
            temp.next=head;
    }
    void deleteatposition(int pos){
        if(pos==1){
            deleteatbeg();
            return;
        }
        temp=head;
        for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;

    }
    void display() {
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
         temp=head;
        do {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        } while (temp!=head);
        System.out.println("head<_)");
    }
}
