public class MaxMinElementLL {
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

    public void MinMax(){
        int max=head.data,min=head.data;
        if(head==null){
            System.out.println("ll is empty");
            
        }
        else{
            Node current=head;
            while(current!=null){
                if(current.data<min){
                    min=current.data;
                }
                else if(current.data>max){
                    max=current.data;
                }
                current=current.next;
            }
            System.out.println();
            System.out.println("Min: "+min);
            System.out.println("Max: "+max);
        }
    }
    public static void main(String[] args) {
        MaxMinElementLL list=new MaxMinElementLL();
        list.create(1);
        list.create(2);
        list.create(3);
        list.display();
        list.MinMax();
    }
}
