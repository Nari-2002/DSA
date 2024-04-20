public class MiddleElementLL {
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


    public void middleElement(){
            Node n1=head;
            Node n2=head;
            while(n2!=null && n2.next==null){
                n1=n1.next;
                n2=n2.next.next;
            }
            System.out.println("mid is : "+n1.data);
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
        MiddleElementLL list=new MiddleElementLL();
        list.create(1);
        list.create(2);
        list.create(3);
        list.display();
        list.middleElement();
    }

}
