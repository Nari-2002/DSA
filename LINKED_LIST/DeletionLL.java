public class DeletionLL {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;

    public void create(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void deleteAtBegin(){
        if(head==null){
            System.out.println("LL is empty");
        }
        else{
            System.out.println(head.data+" is deleted");
            head=head.next;
        }
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("LL is empty");
        }
        else{
            Node temp=head;
            Node prev=head;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            System.out.println(temp.data+" is deleted");
            prev.next=null;

        }
    }
    public void deleteAtAnyPosition(int pos){
        if(head==null){
            System.out.println("LL is empty");
        }
        else if(pos==0){
            System.out.println(head.data+" is deleted");
            head=head.next;
        }
        else{
            Node temp=head,prev=head;
            for(int i=0;i<pos;i++){
                prev=temp;
                temp=temp.next;
            }
            System.out.println(temp.data+" is deleted");
            prev.next=temp.next;
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
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DeletionLL list=new DeletionLL();
        list.create(1);
        list.create(2);
        list.create(3);
        list.create(4);
        list.create(5);
        list.display();
        list.deleteAtBegin();
        list.display();
        list.deleteAtEnd();
        list.display();
        list.deleteAtAnyPosition(1);
        list.display();
    }

}
