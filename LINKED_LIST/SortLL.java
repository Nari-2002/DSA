public class SortLL {
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
    public void sort(){
        Node ptr=head;
        Node idx=null;
        while(ptr!=null){
            idx=ptr.next;
            while(idx!=null){
                if(ptr.data>idx.data){
                    int temp=ptr.data;
                    ptr.data=idx.data;
                    idx.data=temp;
                }
                idx=idx.next;
            }
            ptr=ptr.next;
        }
    }
    public static void main(String[] args) {
        SortLL list=new SortLL();
        list.create(5);
        list.create(2);
        list.create(7);
        list.create(1);
        list.display();
        list.sort();
        list.display();
    }
}
