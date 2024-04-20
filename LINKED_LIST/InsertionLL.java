public class InsertionLL {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;

    public void insertBegin(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertEnd(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
        }

        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }
    }
    public void insertAtAnyPosition(int data,int pos){
        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
        }
        else if(pos==0){
            newnode.next=head;
            head=newnode;
        }
        else{
            Node current=head;
            for(int i=0;i<pos-1;i++){
                current=current.next;
            }
            newnode.next=current.next;
            current.next=newnode;
        }
    }
    public void display(){
        if(head==null){
            System.out.println("ll is empty");
            
        }
        else{
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" -> ");
                current=current.next;
            }
        }
    }
    public static void main(String[] args) {
        InsertionLL list=new InsertionLL();
        list.insertEnd(1);
        list.insertEnd(2);
        list.insertAtAnyPosition(4,1);
        list.insertAtAnyPosition(5,3);
        list.display();
    }

}
