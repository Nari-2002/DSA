class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class RemoveLoopLL {
    
    

    @SuppressWarnings("unused")
    public void create(int data){
        Node newnode=new Node(data);
    }
    public void display(Node head){
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
    public void removeloop(Node head){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                Node temp=slow;
                Node start=head;
                while(temp.next!=start.next){
                    temp=temp.next;
                    start=start.next;
                }
                temp.next=null;
            }
        }
    }
    public static void main(String[] args) {
        RemoveLoopLL list=new RemoveLoopLL();
        Node head=new Node(12);
        head.next=new Node(20);
        head.next.next=new Node(35);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(15);
        //loop creation
        head.next.next.next.next.next=head.next.next;
        
        list.removeloop(head);
        System.out.println();
        list.display(head);


    }
}
